public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad("mayor");
        persona.setNombre("Paco");
        persona.setTelefono("movil");
        Cliente cliente = new Cliente();
        cliente.setCredito("Positivo");
        Trabajador trabajador = new Trabajador();
        trabajador.setSalario("alto");

        System.out.println(persona.getEdad());
        System.out.println(persona.getNombre());
        System.out.println(persona.getTelefono());
        System.out.println(cliente.getCredito());
        System.out.println(trabajador.getSalario());

    }
}

class Persona{
    String edad;
    String nombre;
    String telefono;


    public String getEdad(){
        return this.edad;
    }
    public void setEdad(String edad) {
        this.edad = edad;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTelefono(){
        return this.telefono;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
}
class Cliente extends Persona{
    String credito;
    public String getCredito(){
        return this.credito;
    }
    public void setCredito(String credito){
        this.credito = credito;
    }

}
class Trabajador extends Persona{
    String salario;
    public String getSalario(){
        return this.salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }
}