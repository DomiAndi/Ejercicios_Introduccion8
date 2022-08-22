public class Main {
    public static void main(String[] args) {
        //Crear clase Persona.
        //Crear variables las privadas edad, nombre y telefono de la clase Persona.
        //Crear gets y sets de cada propiedad.
        //Crear un objeto persona en el main.
        //Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.

       Persona persona = new Persona();
       persona.setNombre("Andrea");
       System.out.println("Mi nombre es: " + persona.getNombre());
       persona.setEdad(30);
       System.out.println("Mi edad es: " + persona.getEdad());
       persona.setTelefono(2059841);
       System.out.println("Mi telefono es: " + persona.getTelefono());


    }
}

class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

    public int getEdad(){
        return this.edad;
    }

    public String getNombre(){
        return  this.nombre;
    }

    public int getTelefono(){
        return  this.telefono;
    }

}
