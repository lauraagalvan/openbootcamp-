package Smart;

public class SmartPhone extends SmartDevice{

    String pantalla;


    public SmartPhone(){
        super();
    }

    public SmartPhone(String fabricante, String modelo, Double precio, int duracion, String pantalla) {
        super(fabricante, modelo, precio, duracion);
        this.pantalla = pantalla;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "pantalla='" + pantalla + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                ", duracion=" + duracion +
                '}';
    }
}
