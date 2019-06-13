/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icontrollers;

import java.util.List;
import models.OvertimeType;

/**
 *
 * @author Sekar Ayu Safitri
 */
public interface IOvertimeTypeController {

    public List<OvertimeType> getAll();

    public OvertimeType getById(String id);

    public List<OvertimeType> search(Object keyword);

    public String save(String id, String name, String minHour, String salary);

    public String delete(String id);
}
