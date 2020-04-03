/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alumno;

/**
 *
 * @author Juan Godoy
 */
public class Vendedor extends Personas{
    public Vendedor (String Nombre,String Apellido,int Edad){
        super(Nombre,Apellido,Edad);
    }

    @Override
    public void mostrarNombre() {
         System.out.println(getNombre());

    }
    public void mostrarApellido() {
       System.out.println(getApellido());
    }

    
    public void mostrarEdad() {
       System.out.println(getEdad());
    }
    
}
