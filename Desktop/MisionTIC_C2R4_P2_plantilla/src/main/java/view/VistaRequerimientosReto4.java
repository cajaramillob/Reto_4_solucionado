package view;

import controller.ControladorRequerimientosReto4;
import model.vo.LiderCiudad;
import model.vo.SumaProveedor;
import model.vo.ProyectoCiudad;

import java.sql.SQLException;
import java.util.ArrayList;

public class VistaRequerimientosReto4 {

    public static ControladorRequerimientosReto4 controlador = new ControladorRequerimientosReto4();

           
    
    public static void requerimiento1() {

    System.out.println("-----Proyecto Ciudad-------");
    
    try {
        ArrayList<ProyectoCiudad> proyectos = controlador.consultarProyectoCiudad();
System.out.println("Constructora Fecha_Inicio Clasificación");


for (ProyectoCiudad proyectoCiudad : proyectos) {

    System.out.printf("%s %s %s %n",
    proyectoCiudad.getConstructora(), proyectoCiudad.getFecha_Inicio(), proyectoCiudad.getClasificacion());
 
    }
        
    } catch (Exception e) {
        //TODO: handle exception
    }

    }

    public static void requerimiento3() {

        
    }

    public static void requerimiento4() {

        

    }

}
