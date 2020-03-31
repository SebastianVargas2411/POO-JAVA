
package ClasesyObjetos;

public class Persona {
    //atributos
    String nombre;
    int edad;
    
    //metodo constructor
    public Persona(String nombre, int edad){
        this.nombre = nombre; //this para decir cual es atributo
        this.edad = edad; // el que no tiene this es el parametro osea el valor a asignarle al atributo     
    }
    
    public void mostrarDatos(){
        System.out.println("El nombre es: "+nombre);
        System.out.println("La edad es: "+edad);
    }
    
    
}
