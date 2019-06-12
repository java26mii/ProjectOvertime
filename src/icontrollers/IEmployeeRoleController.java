

package icontrollers;

import java.util.List;
import models.EmployeeRole;
import models.Account_;

/**
 *
 * @author ASUS
 */
public interface IEmployeeRoleController {
    public List<EmployeeRole> getAll();

    public EmployeeRole getById(String id);

    public List<EmployeeRole> search(Object keyword);

    public String save(String id, String role, String employee);
    
    public String delete(String id);
}
