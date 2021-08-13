package model.vo;

public class ProyectoCiudad {

private String Constructora, Fecha_Inicio, Clasificacion;

public ProyectoCiudad(String constructora, String fecha_Inicio, String clasificacion) {
    Constructora = constructora;
    Fecha_Inicio = fecha_Inicio;
    Clasificacion = clasificacion;
}
public ProyectoCiudad (){

}
public String getConstructora() {
    return Constructora;
}
public void setConstructora(String constructora) {
    Constructora = constructora;
}
public String getFecha_Inicio() {
    return Fecha_Inicio;
}
public void setFecha_Inicio(String fecha_Inicio) {
    Fecha_Inicio = fecha_Inicio;
}
public String getClasificacion() {
    return Clasificacion;
}
public void setClasificacion(String clasificacion) {
    Clasificacion = clasificacion;
}
    
}
