package app.salmontt.data;

import app.salmontt.model.CentroCultivo;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    // Clase encargada de leer los datos desde el archivo y crear la colección de objetos
    public class GestorDatos {

        // Nombre del archivo de datos
        private static final String NOMBRE_ARCHIVO = "src/main/resources/centros.txt";

        /**
         * Lee el archivo, crea objetos CentroCultivo y los almacena en una lista.
         * * @return Una lista de objetos CentroCultivo.
         */
        public List<CentroCultivo> cargarCentrosDeCultivo() {
            // Inicializa un ArrayList para almacenar los objetos CentroCultivo
            List<CentroCultivo> centros = new ArrayList<>();
            File archivo = new File(NOMBRE_ARCHIVO);

            // Uso de try-with-resources para asegurar que el Scanner se cierre
            try (Scanner scanner = new Scanner(archivo)) {
                // Lee el archivo línea por línea
                while (scanner.hasNextLine()) {
                    String linea = scanner.nextLine();

                    // Omite líneas vacías
                    if (linea.trim().isEmpty()) {
                        continue;
                    }

                    // Separa los datos usando el punto y coma como delimitador
                    String[] datos = linea.split(";");

                    // Asegura que la línea tenga el número correcto de campos
                    if (datos.length == 3) {
                        try {
                            // Extrae y convierte los datos
                            String nombre = datos[0].trim();
                            String ubicacion = datos[1].trim();
                            // Convierte la producción a entero
                            int produccionAnualKg = Integer.parseInt(datos[2].trim());

                            // Crea un nuevo objeto CentroCultivo
                            CentroCultivo centro = new CentroCultivo(nombre, ubicacion, produccionAnualKg);

                            // Almacena el objeto en el ArrayList
                            centros.add(centro);
                        } catch (NumberFormatException e) {
                            System.out.println("Error: Formato de número inválido en la línea: " + linea);
                        }
                    } else {
                        System.out.println("Error: Línea con formato incorrecto (campos insuficientes/excesivos): " + linea);
                    }
                }
            } catch (FileNotFoundException e) {
                // Maneja el caso en que el archivo no se encuentre
                System.out.println("Error al cargar datos: Archivo " + NOMBRE_ARCHIVO + " no encontrado.");
                e.printStackTrace();
            }

            return centros;
        }
    }