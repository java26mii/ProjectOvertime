/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.GeneralDAO;
import icontrollers.IRoleController;
import java.util.List;
import models.Role;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author ASUS
 */
public class RoleController implements IRoleController {

    private GeneralDAO<Role> gdao;

    public RoleController(SessionFactory factory) {
        gdao = new GeneralDAO(factory, Role.class);
    }

    @Override
    public List<Role> getAll() {
        return gdao.getData("");
    }

    @Override
    public Role getById(String id) {
        return gdao.getById(id);
    }

    @Override
    public List<Role> search(Object keyword) {
        return gdao.getData(keyword);
    }

    @Override
    public String save(String id, String name) {
        String result = "";
        Role job = new Role(Long.parseLong(id), name);
        if (gdao.saveOrDelete(job, false)) {
            result = "Success";
        } else {
            result = "Failed";
        }
        return result;
    }

    @Override
    public String delete(String id) {
      String result = "Failed";
        if (gdao.saveOrDelete(new Role(Long.parseLong(id)), true)) {
            result = "Success";
        }
        return result;
    }
}
