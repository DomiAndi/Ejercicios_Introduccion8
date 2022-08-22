public class Main {
    public static void main(String[] args) {
        //Crear clase Persona.
        //Crear variables las privadas edad, nombre y telefono de la clase Persona.
        //Crear gets y sets de cada propiedad.
        //Crear un objeto persona en el main.
        //Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.
       Persona persona = new Persona();

       persona.setEdad("30 Años");
       persona.setNombre("Andrea");
       persona.setTelefono("2059841");

       String edad = persona.getEdad();
       System.out.println(edad);

       String nombre = persona.getNombre();
       System.out.println(nombre);

       String telefono = persona.getTelefono();
       System.out.println(telefono);
    }
}

class Persona{
    private String edad;
    private String nombre;
    private String telefono;

    public void setEdad(String edad){
        this.edad = edad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public String getEdad(){
        return this.edad;
    }

    public String getNombre(){
        return  this.nombre;
    }

    public String getTelefono(){
        return  this.telefono;
    }

}
