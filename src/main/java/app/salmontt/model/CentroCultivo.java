package app.salmontt.model;

/**
 * Representa un Centro de Cultivo con sus datos principales.
 */
public class CentroCultivo extends Entidad{
    private String ubicacion;

    public CentroCultivo(String id, String nombre, String ubicacion) {
        super(id, nombre);
        this.ubicacion = ubicacion;
    }
    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    @Override
    public void mostrarResumen() {
        System.out.println("Centro de Cultivo - ID: " + id + ", Nombre: " + nombre + ", Ubicación: " + ubicacion);
    }
}