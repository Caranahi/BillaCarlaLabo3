import java.util.List;

public class ProductosInformaticos {
    List<Notebook> notebooks;
    List<Impresora> impresoras;

    public List<Notebook> getNotebooks() {
        return notebooks;
    }

    public void setNotebooks(List<Notebook> notebooks) {
        this.notebooks = notebooks;
    }

    public List<Impresora> getImpresoras() {
        return impresoras;
    }

    public void setImpresoras(List<Impresora> impresoras) {
        this.impresoras = impresoras;
    }

    public ProductosInformaticos(List<Notebook> notebooks, List<Impresora> impresoras) {
        this.notebooks = notebooks;
        this.impresoras = impresoras;
    }

}
