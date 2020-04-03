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
public abstract class Personas {
    String Apellido;
    String Nombre;
    int Edad;
    public Personas(String Nombre,String Apellido,int Edad){
        setNombre(Nombre);
        setApellido(Apellido);
        setEdad(Edad);
    }
    //metodo get y get
     public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }
    
   public String getApellido() {
        return Apellido;
    }
    public void setApellido(String apellido) {
        this.Apellido =apellido;
    }
    public int  getEdad() {
        return Edad;
    }
    public void setEdad(int  edad) {
        this.Edad =edad;
    }
    public abstract void mostrarNombre();
    public abstract void mostrarApellido();
    public abstract void mostrarEdad();
    public String toString(){
        return "Nombre:"+getNombre()+ "\tApellido:"+getApellido()+"\tEdad:"+getEdad();
    }
    }
    
    

