/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploempleado;

import com.theopentutorials.jdbc.dao.EmployeeDAO;
import demo.demo1;
import java.sql.SQLException;

/**
 *
 * @author Fabian
 */
public class EjemploEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        EmployeeDAO empDAO = new EmployeeDAO();
        demo1 dem = new demo1();
        dem.demo1();
    }
}
