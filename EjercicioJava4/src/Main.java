import Smart.SmartPhone;
import Smart.SmartWatch;

public class Main {
    public static void main(String[] args){

        SmartPhone smartPhone = new SmartPhone("Xiaomi","Redmi", 325.99, 2, "oled");

        SmartWatch smartWatch = new SmartWatch("Samsung", "buds", 40.95, 1, "metal");

        System.out.println("El smatphone es: " + smartPhone + "nEl smartwatch es: " + smartWatch);
    }
}