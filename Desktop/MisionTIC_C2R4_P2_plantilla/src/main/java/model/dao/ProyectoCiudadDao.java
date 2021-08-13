package model.dao;

//Estructura de datos
import java.util.ArrayList;

//Librerías para SQL y Base de Datos
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//Clase para conexión
import util.JDBCUtilities;

//Encapsulamiento de los datos
import model.vo.ProyectoCiudad;

public class ProyectoCiudadDao {

    public ArrayList<ProyectoCiudad> rankingProyectosCiudad() throws SQLException {
        ArrayList<ProyectoCiudad> resultado = new ArrayList<ProyectoCiudad>();
        Connection conection = null; 
        try {
            conection = JDBCUtilities.getConnection();

            String consulta =   "SELECT  Constructora, "+
                                "Fecha_Inicio, "+
                                "Clasificacion "+
                                "FROM Proyecto "+
                                "WHERE Ciudad = 'Pereira'";

        //Se contruye el objeto que realizará la consulta.

        PreparedStatement statement = conection.prepareStatement(consulta);
        ResultSet resultSet = statement.executeQuery();
        
        while(resultSet.next()){
            ProyectoCiudad proyectoCiudad = new ProyectoCiudad();
            proyectoCiudad.setClasificacion(resultSet.getString("Clasificacion"));
            proyectoCiudad.setFecha_Inicio(resultSet.getString("Fecha_Inicio"));
            proyectoCiudad.setConstructora(resultSet.getString("Constructora"));

            resultado.add(proyectoCiudad);
                    
        }
resultSet.close();
statement.close();
        }
catch(SQLException e){

    System.err.println("Error Consulta Proyecto Ciudad " + e);

}
finally {
    if (conection != null){
        conection.close();
    }
}
        return resultado;       
        
    }  


    
}