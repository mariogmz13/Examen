/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.sql.Date;

/**
 *
 * @author mega0
 */
public class Empleado {

    static int id;
    static String nombre;
    static String apellidoP;
    static String apellidoM;
    static String rfc;
    static Date nacimiento;
    static String tipoEmpleado;
    static int salarioHora;
    static int horaTrabajoSemana;
    
    public static int getId() {
        return id;
    }

    public static String getNombre() {
        return nombre;
    }

    public static String getApellidoP() {
        return apellidoP;
    }

    public static String getApellidoM() {
        return apellidoM;
    }

    public static String getRfc() {
        return rfc;
    }

    public static Date getNacimiento() {
        return nacimiento;
    }

    public static String getTipoEmpleado() {
        return tipoEmpleado;
    }

    public static int getSalarioHora() {
        return salarioHora;
    }

    public static int getHoraTrabajoSemana() {
        return horaTrabajoSemana;
    }
    
}
