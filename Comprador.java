public class Comprador {
    private String Nombre;
    private String Correo;
    private float PresupuestoDisponible;

    // Contructor para el comprador
    public Comprador(String Nombre, String Correo, float PresupuestoDisponible) {
        this.Nombre = Nombre;
        this.Correo = Correo;
        this.PresupuestoDisponible = PresupuestoDisponible;
    }

    // Getters
    public String getNombre() {
        return Nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public float getPresupuestoDisponible() {
        return PresupuestoDisponible;
    }

    // Metodo para restar del presupuesto la cantidad de tickets comprados.
    public void cobroPresupuesto(double Cantidad) {
        this.PresupuestoDisponible -= Cantidad;
    }
}
