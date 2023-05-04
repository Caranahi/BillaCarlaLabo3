import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private ArrayList<ElementosDeOficina> totalDeProductos;

    public Tienda() {
        this.totalDeProductos = new ArrayList<>();
    }

    public ArrayList<ElementosDeOficina> getTotalDeProductos() {
        return totalDeProductos;
    }

    public void setTotalDeProductos(ArrayList<ElementosDeOficina> totalDeProductos) {
        this.totalDeProductos = totalDeProductos;
    }


    public void agregarProducto(ElementosDeOficina producto) {

        totalDeProductos.add(producto);
    }


    public void listarProducts(ArrayList totalDeProductos) {
        int i;
        for (i = 0; i < totalDeProductos.size(); i++) {
            System.out.println(totalDeProductos.get(i).toString());
        }
    }


    public void aplicarAumento(){
        for(int i = 0; i<this.totalDeProductos.size();i++) {
            if (this.totalDeProductos.get(i) instanceof Silla) {
                ((Silla) this.totalDeProductos.get(i)).aumentarProducto();
            } else if (this.totalDeProductos.get(i) instanceof Escritorio) {
                ((Escritorio) this.totalDeProductos.get(i)).aumentarProducto();
            } else if (this.totalDeProductos.get(i) instanceof Impresora) {
                ((Impresora) this.totalDeProductos.get(i)).aumentarProducto();
            } else if (this.totalDeProductos.get(i) instanceof Notebook) {
                ((Notebook) this.totalDeProductos.get(i)).aumentarProducto();
            }

        }
        }
}
