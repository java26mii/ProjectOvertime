
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

    public String save(String id, String name, String minHour, String isDelete, String maxHour, String param1Hour, String paramNextHour );

    public String delete(String id);
}
