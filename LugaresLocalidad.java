public class Localidad {
    private String Nombre;
    private float Precio;
    private int Disponibilidad;

    // Constructor de las loaclidades
    public Localidad(String Nombre, float Precio, int Disponibilidad) {
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.Disponibilidad = Disponibilidad;
    }

    // Getters, en este caso no hay setters ya que la informacion de las localidades
    // no va a ser editada.
    public String getNombre() {
        return Nombre;
    }

    public String getPrecio() {
        return Precio;
    }

    public String getDisponibilidad() {
        return Disponibilidad;
    }

    // Metodo para verificar la disponibilidad de los bolestos en las localidades.
    public boolean BoletosDisponibles(int Cantidad) {
        if (Disponibilidad >= Cantidad) {
            this.Disponibilidad -= Cantidad;
            return true;
        }
        return false;
    }
}
