import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Tienda tiendita = new Tienda();

        Impresora impresora1 = new Impresora("raptor", 10, 2500);
        Impresora impresora2 = new Impresora("raptorX", 12, 2400);
        Notebook notebook1 = new Notebook("rex12", 5, 1020);
        Notebook notebook2 = new Notebook("rex312", 6, 3500);
        Silla silla1 = new Silla("Gamer", 7, 3240);
        Silla silla2 = new Silla("Gamer2", 3, 3500);
        Escritorio escritorio1 = new Escritorio("Gamer", 8, 200, 60, 80);
        Escritorio escritorio2 = new Escritorio("Gamer2", 8, 230, 70, 90);

        tiendita.agregarProducto(impresora1);
        tiendita.agregarProducto(impresora2);
        tiendita.agregarProducto(notebook1);
        tiendita.agregarProducto(notebook2);
        tiendita.agregarProducto(silla1);
        tiendita.agregarProducto(silla2);
        tiendita.agregarProducto(escritorio1);
        tiendita.agregarProducto(escritorio2);

        tiendita.listarProducts(tiendita.getTotalDeProductos());

        Scanner descuento = new Scanner(System.in);
        System.out.println(" Ingrese el descuento que le quiere aplicar a la Silla " ); //3240$
        int aplica = descuento.nextInt();
        System.out.println("Silla1 con descuento:" + silla1.descuentoEspecial(silla1.getPrecio(),aplica));

        Scanner descuento2 = new Scanner(System.in);
        System.out.println(" Ingrese el descuento que le quiere aplicar al Escritorio " ); //200 $
        int aplica2 = descuento2.nextInt();
        System.out.println("Escritorio1 con descuento:" + silla1.descuentoEspecial(escritorio1.getPrecio(),aplica2));



            Scanner decision = new Scanner(System.in);
            System.out.println(" Desea Aumentar los productos? ");
            String decide = decision.nextLine();
            if(decide.equals("si"))
            {
                System.out.println("Se modifico Exitosamente:)" );
                tiendita.aplicarAumento();
                tiendita.listarProducts(tiendita.getTotalDeProductos());

            }else {
                System.out.println("No se hizo ninguna modificacion chao :)" );
            }



        }

    }
