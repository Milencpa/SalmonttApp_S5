package app.salmontt.model;

/**
 * Representa un Centro de Cultivo con sus datos principales.
 */
public class CentroCultivo {
    // Atributos
    private String nombre;
    private String ubicacion;
    private int produccionAnualKg; // Producción en Kilogramos

    // Constructor
    public CentroCultivo(String nombre, String ubicacion, int produccionAnualKg) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.produccionAnualKg = produccionAnualKg;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public int getProduccionAnualKg() {
        return produccionAnualKg;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setProduccionAnualKg(int produccionAnualKg) {
        this.produccionAnualKg = produccionAnualKg;
    }

    /**
     * Retorna una representación en String del objeto.
     */
    @Override
    public String toString() {
        return "CentroCultivo{" +
                "nombre='" + nombre + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", produccionAnualKg=" + produccionAnualKg + " kg" +
                '}';
    }
}