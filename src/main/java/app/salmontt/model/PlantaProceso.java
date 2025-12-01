package app.salmontt.model;

public class PlantaProceso extends UnidadOperativa{
    private String capacidadProceso;

    public PlantaProceso(String nombre, String comuna, String capacidadProceso) {
        super(nombre, comuna);
        this.capacidadProceso = capacidadProceso;
    }

    public String getCapacidadProceso() {
        return capacidadProceso;
    }

    public void setCapacidadProceso(String capacidadProceso) {
        this.capacidadProceso = capacidadProceso;
    }

    @Override
    public String toString() {
        return "PlantaProceso{" +
                "nombre='" + getNombre() + '\'' +
                ", comuna='" + getComuna() + '\'' +
                "capacidadProceso='" + capacidadProceso + '\'' +
                '}';
    }
}
