public class Notebook extends ElementosDeOficina implements IAumentoDeProductos{

    private String memoria;
    static final String nombreFabricante= "Samsung";

    public Notebook(String nombre, int stock, float precio) {
        super(nombre, stock, precio);
        this.memoria =memoria;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }
    @Override
    public float aumentarProducto() {
        int aumento= 20;
        float aumentar= (this.Precio* aumento)/100;
        return this.Precio= this.Precio + aumentar;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "memoria='" + memoria + '\'' +
                ", nombre='" + nombre + '\'' +
                ", Stock=" + Stock +
                ", Precio=" + Precio +
                '}';
    }
}
