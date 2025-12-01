package app.salmontt.data;


import app.salmontt.model.PlantaProceso;
import app.salmontt.model.UnidadOperativa;
import app.salmontt.model.CentroCultivo;

public class GestorUnidades {

    public static UnidadOperativa [] getUnidades() {
        return crearUnidades();
    }

    public static UnidadOperativa[] crearUnidades() {
        UnidadOperativa cc1 = new CentroCultivo("Centro A", "Comuna A", 5000);
        UnidadOperativa cc2 = new CentroCultivo("Centro B", "Comuna B", 800);

        UnidadOperativa pp1 = new PlantaProceso("Planta X", "Comuna X", "2000 kg/día");
        UnidadOperativa pp2 = new PlantaProceso("Planta Y", "Comuna Y", "1500 kg/día");

        return new UnidadOperativa[]{cc1, cc2, pp1, pp2};
    }


}
