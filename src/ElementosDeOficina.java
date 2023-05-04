public abstract class ElementosDeOficina {
    protected String nombre;
    protected int Stock;
    protected float Precio;

    public ElementosDeOficina(String nombre, int stock, float precio) {
        this.nombre = nombre;
        Stock = stock;
        Precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int stock) {
        Stock = stock;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float precio) {
        Precio = precio;
    }
}
