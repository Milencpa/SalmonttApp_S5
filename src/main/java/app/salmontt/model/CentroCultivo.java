package app.salmontt.model;

/**
 * Representa un Centro de Cultivo con sus datos principales.
 */
public class CentroCultivo {
    // Atributos
    private String nombreCentro;
    private String ubicacion;
    private int produccionAnualKg;
    private Persona encargado;

    // Constructor
    public CentroCultivo(String nombreCentro, String ubicacion, int produccionAnualKg, Persona encargado) {
        this.nombreCentro = nombreCentro;
        this.ubicacion = ubicacion;
        this.setProduccionAnualKg(produccionAnualKg);
        this.encargado = encargado;
    }

    // Getters
    public String getNombre() {
        return nombreCentro;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public int getProduccionAnualKg() {
        return produccionAnualKg;
    }

    public Persona getEncargado() {
        return encargado;
    }

    // Setters
    public void setNombre(String nombreCentro) {
        this.nombreCentro = nombreCentro;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setProduccionAnualKg(int produccionAnualKg) {
        if (produccionAnualKg < 0) {
                throw new IllegalArgumentException("La producción anual no puede ser negativa.");
            }
        this.produccionAnualKg = produccionAnualKg;
        }


    public void setEncargado(Persona encargado) {
        this.encargado = encargado;
    }

    /**
     * Retorna una representación en String del objeto.
     */
    @Override
    public String toString() {
        return "CENTRO DE CULTIVO= " +
                "Nombre: " + nombreCentro +
                ", Ubicacion: " + ubicacion +
                ", Produccion Anual (Kg): " + produccionAnualKg +
                ", Encargado: [" + encargado + "].";
    }
}