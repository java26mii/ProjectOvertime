/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icontrollers;

import java.util.List;
import models.EmployeeJob;

/**
 *
 * @author Sekar Ayu Safitri
 */
public interface IEmployeeJobController {

    public List<EmployeeJob> getAll();

    public EmployeeJob getById(String id);

    public List<EmployeeJob> search(Object keyword);

    public String save(String id);

    public String delete(String id);
}
