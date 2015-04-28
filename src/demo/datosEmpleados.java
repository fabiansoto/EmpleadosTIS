/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

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
import java.util.logging.Level;
import java.util.logging.Logger;
 
public class datosEmpleados implements ActionListener{//implementando el listener de eventos
 
    JButton bt1;//creando variables globales de los botones
    JLabel jl1, jl2, jl3, jl4, jl5, jl6, jl7, jl8, jl9, jl10, jl11, year, month, day;//creando variables globales para las etiquetas
    JTextField jt1, jt2, jt3, jt4, jt5, yearT, monthT, dayT;//creando variables globales para los campos de texto
    JFrame jf = new JFrame("Formulario de empleados");//creacion de ventana con el titulo
 
    public datosEmpleados(){//constructor de la clase        
 
        jf.setLayout(new GridLayout(11,2));//Configurar como se dispondra el espacio del jframe
        Dimension d = new Dimension();//objeto para obtener el ancho de la pantalla
 
        //Instanciando etiquetas
        jl1 = new JLabel("ID empleado");
        jl2 = new JLabel("Nombre");
        jl3 = new JLabel("Fecha");
        year = new JLabel("Año");
        month = new JLabel("Mes");
        day = new JLabel("Día");
        jl4 = new JLabel("Salario");
        jl5 = new JLabel("ID departamento");
        jl6 = new JLabel("");
        jl7 = new JLabel("");
        jl8 = new JLabel("");
        jl9 = new JLabel("");
        jl10 = new JLabel("");
        jl11 = new JLabel("");
        
 
        //Instanciando cuadros de texto
        jt1 = new JTextField(10);
        jt2 = new JTextField(100);
        jt3 = new JTextField(30);
        yearT = new JTextField(30);
        monthT = new JTextField(30);
        dayT = new JTextField(30);
        jt4 = new JTextField(10000);
        jt5 = new JTextField(10);
 
        //Instanciando boton con texto
        bt1 = new JButton("Enviar");
 
        //añadiendo objetos a la ventana
        jf.add(jl1); jf.add(jt1); jf.add(jl2); jf.add(jt2);
        jf.add(jl10);jf.add(jl11);
        jf.add(jl3); jf.add(jl7);jf.add(year); jf.add(yearT); jf.add(month); jf.add(monthT); jf.add(day); jf.add(dayT);
        jf.add(jl8);jf.add(jl9);
        jf.add(jl4); jf.add(jt4); jf.add(jl5); jf.add(jt5);
        jf.add(jl6); jf.add(bt1);
 
        //margenes para texto en boton
        bt1.setMargin(new Insets(1, 5, 1, 5));
 
        //añadiendo el listener a los botones para manipular los eventos del click
        bt1.addActionListener(this);        
 
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//finaliza el programa cuando se da click en la X        
        jf.setResizable(false);//para configurar si se redimensiona la ventana
        jf.setLocation((int) ((d.getWidth()/2)+290), 50);//para ubicar inicialmente donde se muestra la ventana (x, y)
        jf.setSize(400, 250);//configurando tamaño de la ventana (ancho, alto)
        jf.setVisible(true);//configurando visualización de la venta
    }
 
    public static void main(String[] args) {        
        datosEmpleados gj = new datosEmpleados();//uso de constructor para la ventana
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {//sobreescribimos el metodo del listener
        
        Employee emp = new Employee();
        EmployeeDAO empDAO = new EmployeeDAO();
        int ID1, ID2, salario, año, mes, dia;
        String name;
        //variables que almacenaran los numeros de los campos de texto
 
        if(e.getSource()==bt1){//podemos comparar por el contenido del boton
 
            //Los campos de texto son de tipo string, asi que tomamos la cadena con el metodo .getText()
            //y lo almacenamos en la variable.
            ID1 = Integer.parseInt(jt1.getText());
            name = jt2.getText();
            año = Integer.parseInt(yearT.getText());
            mes = Integer.parseInt(monthT.getText());
            dia = Integer.parseInt(dayT.getText());
            salario = Integer.parseInt(jt4.getText());
            ID2 = Integer.parseInt(jt5.getText());
            año = año - 1900;
            
            emp.setEmpId(ID1);
            emp.setEmpName(name);
            emp.setDob(new Date (año, mes - 1, dia));
            System.out.println(emp.getDob());
            emp.setSalary(salario);
            emp.setDeptId(ID2);
            try {
                empDAO.insertEmployee(emp);
                
     
                //nr = n1 + n2; //realizamos la operacion
     
               // anteponemos una cadena vacia y concatenamos el resultado*/
                // anteponemos una cadena vacia y concatenamos el resultado*/
            } catch (SQLException ex) {
                Logger.getLogger(datosEmpleados.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        
    }
}
