/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icontrollers;

import java.util.List;
import models.Status;

/**
 *
 * @author Sekar Ayu Safitri
 */
public interface IStatusController {

    public List<Status> getAll();

    public Status getById(String id);

    public List<Status> search(Object keyword);

    public String save(String id, String name);

    public String delete(String id);
}
