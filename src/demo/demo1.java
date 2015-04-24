/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import com.theopentutorials.jdbc.dao.EmployeeDAO;
import com.theopentutorials.jdbc.db.ConnectionFactory;
import com.theopentutorials.jdbc.db.DbUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import com.theopentutorials.jdbc.db.ConnectionFactory;
import com.theopentutorials.jdbc.db.DbUtil;
import com.theopentutorials.jdbc.to.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Fabian
 */
public class demo1 {
    
    Employee emp = new Employee();
    EmployeeDAO empDAO = new EmployeeDAO();
    SimpleDateFormat dateformatyyyyMMdd = new SimpleDateFormat("yyyyMMdd");
    private Connection connection;
    private Statement statement;
    
    
    public void demo1() throws SQLException {    
    emp.setEmpId(1);
    emp.setEmpName("Ricardo");
    emp.setDob(new Date (1995, 04, 12));
    emp.setSalary(25000);
    emp.setDeptId(1);
    empDAO.insertEmployee(emp);
     
     /*String query = "INSERT INTO empleado" +
    			 "VALUES ("
    			 + Integer.toString(emp.getEmpId()) +","    
    			 + emp.getEmpName() +","
    			 + dateformatyyyyMMdd.format(emp.getDob()) +","
    			 + Double.toString(emp.getSalary()) +","
    			 + Integer.toString(emp.getDeptId()) 
    			 + ")"
    			;	
        ResultSet rs = null;
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.createStatement();
            
            // Insert and update
            //
            statement.executeUpdate(query); 
            
        } finally {
            DbUtil.close(rs);
            DbUtil.close(statement);
            DbUtil.close(connection);
        }   */    
    }
    
    
    
    
    
        
      /*  EmployeeDAO empDAO = new EmployeeDAO();
        Employee empleado = null;
        List<Employee> list;

    public demo1() throws SQLException {
        this.list = empDAO.getEmployees();
    } */
}
