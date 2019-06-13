/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.GeneralDAO;
import icontrollers.IEmployeeRoleController;
import java.util.List;
import models.EmployeeRole;
import org.hibernate.SessionFactory;

/**
 *
 * @author Sekar Ayu Safitri
 */
public class EmployeeRoleController implements IEmployeeRoleController{
    
     private GeneralDAO<EmployeeRole> gdao;

    public EmployeeRoleController(SessionFactory factory) {
        gdao = new GeneralDAO(factory, EmployeeRole.class);
    }

    @Override
    public List<EmployeeRole> getAll() {
        return gdao.getData("");
    }

    @Override
    public EmployeeRole getById(String id) {
        return gdao.getById(id);
    }

    @Override
    public List<EmployeeRole> search(Object keyword) {
        return gdao.getData(keyword);
    }

    @Override
    public String save(String id) {
        String result = "";
        EmployeeRole employeeRole = new EmployeeRole(Long.parseLong(id));
        if (gdao.saveOrDelete(employeeRole, false)) {
            result = "Success";
        } else {
            result = "Failed";
        }
        return result;
    }

    @Override
    public String delete(String id) {
        String result = "Failed";
        if (gdao.saveOrDelete(new EmployeeRole(Long.parseLong(id)), true)) {
            result = "Success";
        }
        return result;
    }
}
