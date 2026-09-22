package Entidades;

public class Trabajador extends Persona{
    
    private String cargo;
    private float sueldo;

    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public float getSueldo() {
        return sueldo;
    }
    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public Trabajador() {
        this.cargo = "";
        this.sueldo = 0;
    }

    public Trabajador(String cedula, String nombre, String apellido, char sexo, int edad, String cargo, float sueldo) {
        super(cedula, nombre, apellido, sexo, edad);
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public Trabajador(Trabajador t) {
        super(t.getCedula(), t.getNombre(), t.getApellido(), t.getSexo(), t.getEdad());
        this.cargo = t.cargo;
        this.sueldo = t.sueldo;
    }
    
    @Override
    public String toString() {
        return (super.toString() + "\t\t\t\t" + cargo + "\t\t$" + sueldo);
    }

}