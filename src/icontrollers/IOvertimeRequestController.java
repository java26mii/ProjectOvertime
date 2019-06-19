/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icontrollers;

import java.util.List;
import models.OvertimeRequest;

/**
 *
 * @author Sekar Ayu Safitri
 */
public interface IOvertimeRequestController {

    public List<OvertimeRequest> getAll();

    public OvertimeRequest getById(String id);

    public List<OvertimeRequest> search(Object keyword);

    public String save(String id, String startTime, String endTime, String activity, String reqDate, String type, String oSalary, String Doc, String isDelete);

    public String delete(String id);
}
