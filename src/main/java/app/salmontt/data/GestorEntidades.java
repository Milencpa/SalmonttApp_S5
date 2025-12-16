package app.salmontt.data;

import java.util.ArrayList;

import app.salmontt.model.*;

public class GestorEntidades {

  private ArrayList<Registrable> entidades;

    public GestorEntidades() {
   entidades = new ArrayList<>();
  }

  //Agregar una nueva entidad a la colección
  public void agregarEntidad (Registrable entidad) {
      entidades.add(entidad);
  }

  //Recorrer La colección y mostrar el resumen de cada entidad
  public void mostrarResumenEntidades() {
        for (Registrable entidad : entidades) {
            entidad.mostrarResumen();

            if (entidad instanceof PlantaProceso planta) {
                System.out.println("Capacidad Diaria (toneladas): " + planta.getCapacidadDiariaToneladas());
            } else if (entidad instanceof CentroCultivo centro) {
                System.out.println("Ubicación: " + centro.getUbicacion());
            } else if (entidad instanceof Proveedor proveedor) {
                System.out.println("Rubro: " + proveedor.getRubro());
            }
            System.out.println("-----------------------------");
        }
        }
    }