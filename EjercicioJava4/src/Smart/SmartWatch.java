package Smart;

public class SmartWatch extends SmartDevice{

    String correa;

    public SmartWatch(){
        super();
    }

    public SmartWatch(String fabricante, String modelo, Double precio, int duracion, String correa) {
        super(fabricante, modelo, precio, duracion);
        this.correa = correa;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "correa='" + correa + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                ", duracion=" + duracion +
                '}';
    }
}
