/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.GeneralDAO;
import icontrollers.IStatusController;
import java.util.List;
import models.Status;
import org.hibernate.SessionFactory;

/**
 *
 * @author Sekar Ayu Safitri
 */
public class StatusController implements IStatusController{
    
    private GeneralDAO<Status> gdao;

    public StatusController(SessionFactory factory) {
        gdao = new GeneralDAO(factory, Status.class);
    }

    @Override
    public List<Status> getAll() {
        return gdao.getData("");
    }

    @Override
    public Status getById(String id) {
        return gdao.getById(id);
    }

    @Override
    public List<Status> search(Object keyword) {
        return gdao.getData(keyword);
    }

    @Override
    public String save(String id, String name, String isDelete) {
        String result = "";
        Status status = new Status(Long.parseLong(id), name, isDelete.charAt(0));
        if (gdao.saveOrDelete(status, false)) {
            result = "Success";
        } else {
            result = "Failed";
        }
        return result;
    }

    @Override
    public String delete(String id) {
        String result = "Failed";
        if (gdao.saveOrDelete(new Status(Long.parseLong(id)), true)) {
            result = "Success";
        }
        return result;
    }
}
