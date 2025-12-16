package app.salmontt.model;

public class PlantaProceso extends Entidad {
    private int capacidadDiariaToneladas;

    public PlantaProceso(String id, String nombre, String ubicacion, int capacidadDiariaToneladas) {
        super(id, nombre);
        this.capacidadDiariaToneladas = capacidadDiariaToneladas;
    }

    public int getCapacidadDiariaToneladas() {
        return capacidadDiariaToneladas;
    }

    public void setCapacidadDiariaToneladas(int capacidadDiariaToneladas) {
        this.capacidadDiariaToneladas = capacidadDiariaToneladas;
    }

    @Override
    public void mostrarResumen() {
        System.out.println("Planta de Proceso - ID: " + id + ", Nombre: " + nombre + ", Capacidad Diaria (toneladas): " + capacidadDiariaToneladas);
    }
}