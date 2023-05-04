public class Impresora extends ElementosDeOficina implements IDescuentosEspeciales, IAumentoDeProductos {

    public static final int cantDeimpresiones= 100;
    static final String nombreFabricante= "Samsung";

    public Impresora(String nombre, int stock, float precio) {
        super(nombre, stock, precio);
    }

    @Override
    public float descuentoEspecial(float precio, int descuento) {
        float descontar= (precio* descuento) /100;
        return precio - descontar;
    }

    @Override
    public float aumentarProducto() {
        int aumento= 15;
        float aumentar= (this.Precio* aumento)/100;
        return this.Precio= this.Precio + aumentar;
    }

    @Override
    public String toString() {
        return "Impresora{" +
                "nombre='" + nombre + '\'' +
                ", Stock=" + Stock +
                ", Precio=" + Precio +
                '}';
    }
}
