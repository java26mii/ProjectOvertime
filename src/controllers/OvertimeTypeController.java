/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.GeneralDAO;
import icontrollers.IOvertimeTypeController;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import models.OvertimeType;
import org.hibernate.SessionFactory;

/**
 *
 * @author Sekar Ayu Safitri
 */
public class OvertimeTypeController implements IOvertimeTypeController {

    private GeneralDAO<OvertimeType> gdao;

    public OvertimeTypeController(SessionFactory factory) {
        gdao = new GeneralDAO(factory, OvertimeType.class);
    }

    @Override
    public List<OvertimeType> getAll() {
        return gdao.getData("");
    }

    @Override
    public OvertimeType getById(String id) {
        return gdao.getById(id);
    }

    @Override
    public List<OvertimeType> search(Object keyword) {
        return gdao.getData(keyword);
    }

    @Override
    public String save(String id, String name, String minHour, String isDelete, String maxHour) {
        String result = "";
        OvertimeType overtimeType = new OvertimeType(Long.parseLong(id), name, new Short(minHour), isDelete.charAt(0), new Short(maxHour));
        if (gdao.saveOrDelete(overtimeType, false)) {
            result = "Success";
        } else {
            result = "Failed";
        }
        return result;
    }

    @Override
    public String delete(String id) {
        String result = "Failed";
        if (gdao.saveOrDelete(new OvertimeType(Long.parseLong(id)), true)) {
            result = "Success";
        }
        return result;
    }
}
