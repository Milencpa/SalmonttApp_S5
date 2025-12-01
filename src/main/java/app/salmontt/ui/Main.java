package app.salmontt.ui;

import app.salmontt.data.GestorUnidades;
import app.salmontt.model.CentroCultivo;
import app.salmontt.model.UnidadOperativa;

// Clase principal que ejecuta la aplicación
public class Main {
    public static void main(String[] args) {
        UnidadOperativa[] unidades = GestorUnidades.getUnidades();

        System.out.println("\n..: Unidades Operativas :..\n");
        for (UnidadOperativa unidad : unidades) {
            System.out.println(unidad.toString());
        }
    }
}