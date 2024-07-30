import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static void mostrarMenu() {
        System.out.println("1. Agregar a un nuevo comprador");
        System.out.println("2. Comprar boletos");
        System.out.println("3. Consultar disponibilidad de las localidades");
        System.out.println("4. Generar reporte de la suma de todas la ventas");

        public static void main(String[] args)
    {
     

    
        List<Localidad> Localidades = new ArrayList<>();

        Localidades.add(new Localidad("VIP", 150.0, 100));
        Localidades.add(new Localidad("General", 50.0, 500));
        BasedeDatos.Concierto("Gran Concierto", "2024-08-15", Localidades);

        Scanner Scan = new Scanner(System.in);
        int op;


        do
        {
            mostrarMenu();
            op = Scan.nextInt()
            Scan.nextLine();

            switch(op)
            {
                case 1:
                    System.out.print("El nombre del comprador es: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Email del comprador: ");
                    String email = scanner.nextLine();
                    System.out.print("Presupuesto  para los tickets del comprador: ");
                    double presupuesto = scanner.nextDouble();
                    scanner.nextLine();
                    sistema.agregarComprador(Nombre, Correo, Presupuesto);
                
                case 2:
                    System.out.print("Nombre del comprador: ");
                    String nombreComprador = scanner.nextLine();
                    Comprador comprador = sistema.getCompradores().stream()
                    .filter(c -> c.getNombre().equals(nombreComprador))
                    .findFirst()
                    .orElse(null);
                    if (comprador != null)
                    {
                        System.out.print("Nombre de la localidad: ");
                        String nombreLocalidad = scanner.nextLine();
                        Localidad localidad = sistema.getConcierto().getLocalidades().stream()
                        .filter(l -> l.getNombre().equals(nombreLocalidad))
                        .findFirst()
                        .orElse(null);
                        if (localidad != null) {
                            System.out.print("Cantidad de boletos: ");
                            int cantidad = scanner.nextInt();
                            scanner.nextLine();
                            if (sistema.comprarBoletos(Comprador, Localidad, Cantidad)) {
                                System.out.println("Compra exitosa! Gracias por apoyar el negocio!");
                            }
                            else {
                                System.out.println("Error en la compra no hay fondos suficientes.");
                            }
                        }
                        else {
                            System.out.println("Localidad no dismponible ya que no es una de las posibles localidades.");
                        }
                    }
                    else{
                        System.out.println("El nombre del comrpador no es ninguno ya conocido.");
                    }
                
                case 3:
                BasedeDatos.numeroDisponibilidad();

                case 4:
                BasedeDatos.sumaVentas();

                case 5:
                System.out.println("A peticion del usuario, saliendo del sistema.");
                
                default:
                System.out.println("Opción no válida. Escoge una de las 5 opciones disponibles por favor.");
            }
        }
    }

}

    
 
