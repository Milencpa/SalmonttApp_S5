package app.salmontt.ui;

import app.salmontt.data.GestorDatos;
import app.salmontt.model.CentroCultivo;

import java.util.ArrayList;
import java.util.List;

// Clase principal que ejecuta la aplicación
public class Main {
    public static void main(String[] args) {
        System.out.println("..: SalmonttApp - Gestión de Centros de Cultivo :..");

        // Carga de datos
        GestorDatos gestor = new GestorDatos();
        List<CentroCultivo> centrosDeCultivo = gestor.cargarCentrosDeCultivo();

        System.out.println("1. Todos los Centros de Cultivo Cargados (" + centrosDeCultivo.size() + " elementos) ---");

        // Muestra todos los elementos de la colección (recorrido)
        for (CentroCultivo centro : centrosDeCultivo) {
            System.out.println(centro);
        }

        System.out.println("2. Centros con Producción Alta (Filtro: > 1000 kg) ---");


        // Nueva lista para almacenar los resultados del filtro
        List<CentroCultivo> centrosAltaProduccion = filtrarPorProduccion(centrosDeCultivo, 1000);

        // Imprime los resultados filtrados
        if (centrosAltaProduccion.isEmpty()) {
            System.out.println("No se encontraron centros que cumplan con la condición.");
        } else {
            for (CentroCultivo centro : centrosAltaProduccion) {
                System.out.println(centro);
            }
        }

        System.out.println("Proceso finalizado");
    }

    /**
     * Filtra una lista de CentrosCultivo basándose en una producción mínima
     * * @param centros La lista original de centros.
     * @param produccionMinima La producción mínima para el filtro (en kg)
     * @return Una nueva lista con los centros que cumplen la condición
     */
    public static List<CentroCultivo> filtrarPorProduccion(List<CentroCultivo> centros, int produccionMinima) {
        // Inicializa la lista que contendrá los resultados filtrados
        List<CentroCultivo> filtrados = new ArrayList<>();

        // Recorre la lista de centros
        for (CentroCultivo centro : centros) {
            // Aplica la condición de filtro (producción > produccionMinima)
            if (centro.getProduccionAnualKg() > produccionMinima) {
                // Si cumple la condición, añade el objeto a la lista de filtrados
                filtrados.add(centro);
            }
        }
        return filtrados;
    }
}