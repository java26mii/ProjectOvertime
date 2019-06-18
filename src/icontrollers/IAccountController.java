/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icontrollers;

import java.util.List;
import models.Account;
import models.Employee;

/**
 *
 * @author HP
 */
public interface IAccountController {
    public List<Account> getAll();
    
    public Account getById(String id);

    public List<Account> search(Object keyword);
   
    public String register (String id, String username, String password, String isDelete);
    
    public String login(String username, String password);
    
    public Account getAccount(String username);
    
    public Employee getEmployee(String email);
}
