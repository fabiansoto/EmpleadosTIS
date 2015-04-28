/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import com.theopentutorials.jdbc.dao.EmployeeDAO;
import com.theopentutorials.jdbc.db.ConnectionFactory;
import com.theopentutorials.jdbc.db.DbUtil;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.WindowConstants;

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
    emp.setDob(new Date (95, 03 - 1, 12));
    System.out.println(emp.getDob());
    emp.setSalary(25000);
    emp.setDeptId(1);
    empDAO.insertEmployee(emp);
    
    emp.setEmpId(2);
    emp.setEmpName("Andres");
    emp.setDob(new Date (67, 07 - 1, 11));
    System.out.println(emp.getDob());
    emp.setSalary(25600);
    emp.setDeptId(2);
    empDAO.insertEmployee(emp);
    
    emp.setEmpId(3);
    emp.setEmpName("Maria");
    emp.setDob(new Date (82, 02 - 1, 14));
    System.out.println(emp.getDob());
    emp.setSalary(13700);
    emp.setDeptId(1);
    empDAO.insertEmployee(emp);
    
    emp.setEmpId(4);
    emp.setEmpName("Josefa");
    emp.setDob(new Date (69, 06 - 1, 01));
    System.out.println(emp.getDob());
    emp.setSalary(21000);
    emp.setDeptId(3);
    empDAO.insertEmployee(emp);
    
    emp.setEmpId(5);
    emp.setEmpName("Renato");
    emp.setDob(new Date (73, 9 - 1, 21));
    System.out.println(emp.getDob());
    emp.setSalary(23000);
    emp.setDeptId(3);
    empDAO.insertEmployee(emp);
    
    emp.setEmpId(6);
    emp.setEmpName("Ramiro");
    emp.setDob(new Date (71, 07 - 1, 23));
    System.out.println(emp.getDob());
    emp.setSalary(17500);
    emp.setDeptId(4);
    empDAO.insertEmployee(emp);
    
    emp.setEmpId(7);
    emp.setEmpName("Elizabeth");
    emp.setDob(new Date (71, 8 - 1, 11));
    System.out.println(emp.getDob());
    emp.setSalary(19700);
    emp.setDeptId(5);
    empDAO.insertEmployee(emp);
    
    emp.setEmpId(8);
    emp.setEmpName("Aurora");
    emp.setDob(new Date (69, 01 - 1, 23));
    System.out.println(emp.getDob());
    emp.setSalary(21200);
    emp.setDeptId(6);
    empDAO.insertEmployee(emp);
    
    emp.setEmpId(9);
    emp.setEmpName("Stephanie");
    emp.setDob(new Date (91, 01 - 1, 10));
    System.out.println(emp.getDob());
    emp.setSalary(19700);
    emp.setDeptId(5);
    empDAO.insertEmployee(emp);
    
    emp.setEmpId(20);
    emp.setEmpName("Yolanda");
    emp.setDob(new Date (73, 03 - 1, 30));
    System.out.println(emp.getDob());
    emp.setSalary(14200);
    emp.setDeptId(4);
    empDAO.insertEmployee(emp);
    
    }
}
