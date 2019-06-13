/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.GeneralDAO;
import icontrollers.IOvertimeRequestController;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import models.OvertimeRequest;
import org.hibernate.SessionFactory;

/**
 *
 * @author Sekar Ayu Safitri
 */
public class OvertimeRequestController implements IOvertimeRequestController {

    Date date = new Date(); // this object contains the current date value 
    SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
    
    private GeneralDAO<OvertimeRequest> gdao;

    public OvertimeRequestController(SessionFactory factory) {
        gdao = new GeneralDAO(factory, OvertimeRequest.class);
    }

    @Override
    public List<OvertimeRequest> getAll() {
        return gdao.getData("");
    }

    @Override
    public OvertimeRequest getById(String id) {
        return gdao.getById(id);
    }

    @Override
    public List<OvertimeRequest> search(Object keyword) {
        return gdao.getData(keyword);
    }

    @Override
    public String save(String id, String reqDate, String startTime, String endTime, String activity) {
        String result = "";
        OvertimeRequest overtimeRequest = new OvertimeRequest(Long.parseLong(id), new java.sql.Date(date.getTime()), new java.sql.Date(date.getTime()),  new java.sql.Date(date.getTime()), activity);
        if (gdao.saveOrDelete(overtimeRequest, false)) {
            result = "Success";
        } else {
            result = "Failed";
        }
        return result;
    }

    @Override
    public String delete(String id) {
      String result = "Failed";
        if (gdao.saveOrDelete(new OvertimeRequest(Long.parseLong(id)), true)) {
            result = "Success";
        }
        return result;
    }
}
