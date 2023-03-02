import java.nio.channels.ClosedChannelException;

public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.Ponerpuerta();
        System.out.println(miCoche.puerta);
    }
}

class Coche{
    public int puerta =0;

    public void Ponerpuerta(){
        this.puerta++;
    }
}


public class Main {
    public static void main(String[] args) {
        int resultado;
        resultado = suma(10, 30,50);

        System.out.println(resultado);
    }

    public static int suma(int a, int b, int c) {
        return a +b +c;
    }
}
