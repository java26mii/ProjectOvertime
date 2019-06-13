/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icontrollers;

import java.util.List;
import models.EmployeeRole;

/**
 *
 * @author Sekar Ayu Safitri
 */
public interface IEmployeeRoleController {

    public List<EmployeeRole> getAll();

    public EmployeeRole getById(String id);

    public List<EmployeeRole> search(Object keyword);

    public String save(String id);

    public String delete(String id);
}
