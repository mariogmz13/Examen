/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import com.mycompany.examen.SQLConnection;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author mega0
 */
public class DataEmpleado {

    Connection con = SQLConnection.conectarBD();
    ResultSet rs;
    PreparedStatement ps;
//    ResultSet datos = null;
    CallableStatement cs;

    public ResultSet listarEmpleados() {
        try {
            ps = con.prepareStatement("select e.nombre[Nombre], e.apellidoPaterno[Apellido P], e.apellidoMaterno[Apellido M], e.rfc[RFC], e.fechaNacimiento[Nacimiento], e.tipoEmpleado[idTipo], tp.nombre[Tipo Empleado], e.salarioHora[Salario/Hora], e.horasSemana[Horas/Semana]  from empleado as e\n"
                    + "inner join tipoEmpleado as tp \n"
                    + "on tp.id = tipoEmpleado");
            rs = ps.executeQuery();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rs;
    }
    
    
            
    public ResultSet rfcRegistrado( String rfc) {
        try {
            ps = con.prepareStatement("select *  from empleado where rfc = '"+rfc+"'");
            rs = ps.executeQuery();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rs;
    }
    
    public ResultSet listarTipoEmpleados() {
        try {
            ps = con.prepareStatement("select id, nombre from tipoEmpleado");
            rs = ps.executeQuery();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rs;
    }

    public boolean create(String nombre, String apellidoP, String apellidoM, String rfc, String nacimiento, int tipoEmpleado, String salario, String horasSemana) {
        try {
            ps = con.prepareStatement("insert into empleado (nombre, apellidoPaterno, apellidoMaterno, rfc, fechaNacimiento, tipoEmpleado, salarioHora, horasSemana) values ('" + nombre + "','" + apellidoP + "','" + apellidoM + "','" + rfc + "','" + nacimiento + "'," + tipoEmpleado + ",'" + salario + "','" + horasSemana + "')");
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return false;
    }

    public boolean update(String nombre, String apellidoP, String apellidoM, String rfc, String nacimiento, int tipoEmpleado, String salario, String horasSemana) {
        try {
            ps = con.prepareStatement("update empleado set nombre = '"+nombre+"', apellidoPaterno = '"+apellidoP+"', apellidoMaterno = '"+apellidoM+"', rfc = '"+rfc+"', fechaNacimiento = '"+nacimiento+"', tipoEmpleado = "+tipoEmpleado+", salarioHora = "+salario+", horasSemana = "+horasSemana+"\n"
                    + "where rfc = '"+rfc+"'");
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return false;
    }

    public boolean delete(String rfc) {
        try {
            ps = con.prepareStatement("delete from empleado where rfc = '" + rfc + "'");
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return false;
    }

    public boolean cerrarConexion() {
        try {
            con.close();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return false;
    }
}
