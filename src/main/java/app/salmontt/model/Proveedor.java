package app.salmontt.model;

public class Proveedor extends Entidad {
    private String rubro;

    public Proveedor(String id, String nombre, String rubro) {
        super(id, nombre);
        this.rubro = rubro;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    @Override
    public void mostrarResumen() {
        System.out.println("Proveedor ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Rubro: " + rubro);
    }
}
