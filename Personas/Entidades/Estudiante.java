package Entidades;

public class Estudiante extends Persona {
    
    private String escuela;
    private String semestre;
    
    public String getEscuela() {
        return escuela;
    }
    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }
    public String getSemestre() {
        return semestre;
    }
    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public Estudiante(String escuela, String semestre) {
        setEscuela("");
        setSemestre("");
    }

    public Estudiante(String cedula, String nombre, String apellido, char sexo, int edad, String escuela,
            String semestre) {
        super(cedula, nombre, apellido, sexo, edad);
        setEscuela(escuela);
        setSemestre(semestre);
    }

    public Estudiante(Estudiante e) {
        super(e.getCedula(), e.getNombre(), e.getApellido(), e.getSexo(), e.getEdad());
        setEscuela(e.getEscuela());
        setSemestre(e.getSemestre());
    }
    @Override
    public String toString() {
        return (super.toString() + "\t" + getEscuela() + "\t" + getSemestre());
    }

    

}
