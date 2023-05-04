import java.util.Random;

public class Silla extends ElementosDeOficina implements IDescuentosEspeciales, IAumentoDeProductos{
    private boolean ruedas;


    public Silla(String nombre, int stock, float precio) {
        super(nombre, stock, precio);
        Random rdm= new Random();
        this.ruedas= rdm.nextBoolean();
    }

    @Override
    public float descuentoEspecial(float precio, int descuento) {
        float descontar= (precio* descuento) /100;
        return precio - descontar;
    }
    @Override
    public float aumentarProducto() {
        int aumento = 5;
        float aumentar= (this.Precio* aumento)/100;
        return this.Precio = this.Precio+ aumentar;
    }

    @Override
    public String toString() {
        return "Silla{" +
                "ruedas=" + ruedas +
                ", nombre='" + nombre + '\'' +
                ", Stock=" + Stock +
                ", Precio=" + Precio +
                '}';
    }
}
