public class Boleto {
    private String Entrada;
    private Localidad Localidad;
    private Comprador Comprador;

    // Este es con contructor que se utiliza para crear la entrada junto con la
    // informacion de la misma,
    // en este caso en numero de entrada la localidad de la misma y el nombre del
    // comprador.

    public Entrada(String Entrada, Localidad Localidad, Comprador Comprador)
    {
        this.Entrada = Entrada;
        this.Localidad = Localidad;
        this.Comprador = Comprador;
    }

    // Setter y Getters de la Entrada
    public String getEntrada() {
        return Entrada;
    }

    public void setEntrada(String Entrada) {
        this.Entrada = Entrada;
    }

    // Setter y Getters de la Localidad
    public Localidad getLocalidad() {
        return Localidad;
    }

    public void setLocalidad(Localidad Localidad) {
        this.Localidad = Localidad;
    }

    // Setter y Getters del Comprador
    public Comprador getComprador() {
        return Comprador;
    }

    public void setComprador(Comprador Comprador) {
        this.Comprador = Comprador;
    }
}
