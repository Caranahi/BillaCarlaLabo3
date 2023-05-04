public class Escritorio extends ElementosDeOficina implements IAumentoDeProductos {

    private int ancho;
    private int largo;


    public Escritorio(String nombre, int stock, float precio, int ancho, int largo) {
        super(nombre, stock, precio);
        this.ancho= ancho;
        this.largo= largo;
    }
    @Override
    public float aumentarProducto() {
        int aumento =10;
        float aumentar= (this.Precio* aumento)/100;
        return this.Precio =this.Precio+ aumentar;
    }

    @Override
    public String toString() {
        return "Escritorio{" +
                "ancho=" + ancho +
                ", largo=" + largo +
                ", nombre='" + nombre + '\'' +
                ", Stock=" + Stock +
                ", Precio=" + Precio +
                '}';
    }
}
