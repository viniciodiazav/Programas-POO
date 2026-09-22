package Entidades;

public class Persona {
    
    protected String cedula;
    private String nombre;
    private String apellido;
    private char sexo;
    private int edad;

    public Persona(String cedula, String nombre, String apellido, char sexo, int edad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.edad = edad;
    }

    public Persona() {}

    @Override
    public String toString() {
        return (cedula + "\t" + nombre + "\t" + apellido + "\t\t" + sexo + "\t" + edad);
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

            

}