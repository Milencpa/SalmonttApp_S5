package app.salmontt.model;

/**
 * Representa un Centro de Cultivo con sus datos principales.
 */
public class CentroCultivo extends UnidadOperativa{
    private int produccionAnualKg;

    public CentroCultivo(String nombre, String comuna, int produccionAnualKg) {
        super(nombre, comuna);
        this.produccionAnualKg = produccionAnualKg;
    }

    public int getProduccionAnualKg() {
        return produccionAnualKg;
    }

    public void setProduccionAnualKg(int produccionAnualKg) {
        this.produccionAnualKg = produccionAnualKg;
    }

    @Override
    public String toString() {
        return "CentroCultivo{" +
                "nombre='" + getNombre() + '\'' +
                ", comuna='" + getComuna() + '\'' +
                "produccionAnualKg=" + produccionAnualKg +
                '}';
    }
}