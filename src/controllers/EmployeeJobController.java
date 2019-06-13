/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.GeneralDAO;
import icontrollers.IEmployeeJobController;
import java.util.List;
import models.EmployeeJob;
import org.hibernate.SessionFactory;

/**
 *
 * @author Sekar Ayu Safitri
 */
public class EmployeeJobController implements IEmployeeJobController{
    
    private GeneralDAO<EmployeeJob> gdao;

    public EmployeeJobController(SessionFactory factory) {
        gdao = new GeneralDAO(factory, EmployeeJob.class);
    }

    @Override
    public List<EmployeeJob> getAll() {
        return gdao.getData("");
    }

    @Override
    public EmployeeJob getById(String id) {
        return gdao.getById(id);
    }

    @Override
    public List<EmployeeJob> search(Object keyword) {
        return gdao.getData(keyword);
    }

    @Override
    public String save(String id) {
        String result = "";
        EmployeeJob employeeJob = new EmployeeJob(Long.parseLong(id));
        if (gdao.saveOrDelete(employeeJob, false)) {
            result = "Success";
        } else {
            result = "Failed";
        }
        return result;
    }

    @Override
    public String delete(String id) {
        String result = "Failed";
        if (gdao.saveOrDelete(new EmployeeJob(Long.parseLong(id)), true)) {
            result = "Success";
        }
        return result;
    }
}
