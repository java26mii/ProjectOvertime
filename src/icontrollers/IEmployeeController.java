/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icontrollers;

import java.util.List;
import models.Employee;

/**
 *
 * @author ASUS
 */
public interface IEmployeeController {

    public List<Employee> getAll();

    public Employee getById(String id);

    public List<Employee> search(Object keyword);

    public String save(String id, String firstName, String lastName,String email, String phoneNumber, String manager, String isDelete);

    public String delete(String id);
}
