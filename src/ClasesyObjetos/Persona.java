
package ClasesyObjetos;

public class Persona {
    //atributos
    String nombre;
    int edad;
    String identificacion;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String identificacion) {
        this.identificacion = identificacion;
    }
    //En la sobrecarga de metodos java diferencia el mismo metodo por el tipo de dato
    public void correr(){
        System.out.println("soy"+nombre+"tengo"+edad+"años y corro maraton");    
    }
    
    public void correr(int km){
        System.out.println("He corrido"+km+"kilometros");
    
    }
    
            
         
    
    
    
    
}
