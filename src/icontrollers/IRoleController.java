/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icontrollers;

import java.util.List;
import models.Role;

/**
 *
 * @author HP
 */
public interface IRoleController {

    public Role getById(String id);

    public List<Role> getAll();

    public List<Role> search(Object keyword);

    public String save(String id, String name);

    public String delete(String id);

}
