import java.util.List;

public class Muebles {
    List<Silla> sillas;
    List<Escritorio> escritorios;

    public Muebles(List<Silla> sillas, List<Escritorio> escritorios) {
        this.sillas = sillas;
        this.escritorios = escritorios;
    }

    public List<Silla> getSillas() {
        return sillas;
    }

    public void setSillas(List<Silla> sillas) {
        this.sillas = sillas;
    }

    public List<Escritorio> getEscritorios() {
        return escritorios;
    }

    public void setEscritorios(List<Escritorio> escritorios) {
        this.escritorios = escritorios;
    }
}
