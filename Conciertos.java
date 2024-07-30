import java.util.List;

public class Conciertos {
    private String Nombre;
    private String Fecha;
    private List<Localidad> Localidades;

    // Constructor para cada nuevo tipo de concierto
    public Concierto(String Nombre, String Fecha, List<Localidad> Localidades)
    {
        this.Nombre = Nombre;
        this.Fecha = Fecha;
        this.Localidades = Localidades;
    }

    // Setters y getters
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public List<Localidade> getLocalidad() {
        return Localidades;
    }

    public void setLocalidades(List<Localidad> Localidades) {
        this.Localidades = Localidades;
    }

    // Metodo para consultar disponibilidad.
    public int numeroDisponibilidad() {
        int Disponibilidad = 0;
        for (Localidad Localidad : Localidades) {
            Disponibilidad += localidad.getDisponibles();
        }
        System.out.println("Total disponibilidad: " + Disponibilidad);
        return Disponibilidad;
    }

    // Metodo para acumular el total de ventas.
    public double sumaVentas() {
        double totalCaja = 0.0;
        for (Localidad localidad : Localidades) {
            totalCaja += localidad.getPrecio() * (localidad.getDisponibles() - localidad.getDisponibles());
        }
        System.out.println("Total en caja: " + totalCaja);
        return totalCaja;
    }
}
