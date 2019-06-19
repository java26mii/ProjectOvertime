/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.GeneralDAO;
import icontrollers.IAccountController;
import idaos.IGeneralDAO;
import java.util.List;
import models.Account;
import models.Employee;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import tools.BCrypt;
import tools.HibernateUtil;

/**
 *
 * @author HP
 */
public class AccountController implements IAccountController {

    private GeneralDAO<Account> gdao;
    private Session session;
    
    private Transaction transaction;
    SessionFactory factory = HibernateUtil.getSessionFactory();

    public AccountController(SessionFactory factory) {
        gdao = new GeneralDAO(factory, Account.class);
    }
    
    @Override
    public List<Account> getAll() {
        return gdao.getData("");
    }

    @Override
    public Account getById(String id) {
        return gdao.getById(new Long(id));
    }

    @Override
    public List<Account> search(Object keyword) {
        return gdao.getData(keyword);
    }

    public String hash(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }

    @Override
    public String register(String id, String username, String password, String isDelete) {
        String result = "";
        String pass = hash(password);
        Account account = new Account(Long.parseLong(id), username, pass, isDelete.charAt(0));
        if (gdao.saveOrDelete(account, false)) {
            result = "Success";
        } else {
            result = "Failed";
        }
        return result;
    }

    @Override
    public String login(String username, String password) {
                String result = "NO such account";
        String hashed = "";
        if (!username.contains("@")) {
            Account account = gdao.getAccount(username);
            if (account != null) {
                
                hashed = String.valueOf(account.getPassword());

                boolean cekPassword = BCrypt.checkpw(password, hashed);

                if (cekPassword) {
                    result = "Login Success";
                } else {
                    result = "Wrong Password";
                }

            } else {
                result = "Username is wrong";
            }

        } else {
            Employee employee = gdao.getEmployee(username);
            if (employee != null) {
                Account account = gdao.getById(employee.getId());
                hashed = String.valueOf(account.getPassword());

                boolean cekPassword = BCrypt.checkpw(password, hashed);

                if (cekPassword) {
                    result = "Login Success";
                } else {
                    result = "Wrong Password";
                }

            } else {
                result = "Email is wrong";
            }

        }

        return result;
    }
   
    @Override
    public Account getAccount(String username) {
        return gdao.getAccount(username);
    }

    @Override
    public Employee getEmployee(String email) {
        return gdao.getEmployee(email);
    }
}
