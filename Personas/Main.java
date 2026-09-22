import Entidades.*;

public class Main {
   
    public static void main(String[] args) {
        int MAX = 10;
        int n = 0;

        Persona p[] = new Persona[MAX];

        p[n++] = new Persona("0546987432", "Ernesto", "Lopes", 'M', 21);
        p[n++] = new Persona("0217745771", "Sahara", "Diaz", 'F', 19);

        p[n++] = new Estudiante("0546932254", "Jimena", "Mayoral", 'F', 20, "UPIICSA", "Quinto");
        p[n++] = new Estudiante("0698845732", "Pablo", "Buendia", 'M', 20, "UNAM", "Primero");

        p[n++] = new Trabajador("0565411254", "Leticia", "Rojas", 'M', 25, "Soporte cent", 18000);
        p[n++] = new Trabajador("0540126987", "Miguel", "Islas", 'M', 23, "Soporte tecnico", 9450);


        System.out.println(" \n CEDULA\t\tNOMBRES\tAPELLIDO\tSEXO\tEDAD\tCARRERA\tSEMESTRE\tCARGO\t\t\tSUELDO");
        System.out.println("................................................................................................................");

        for (int i = 0; i < n; i++) {
            System.out.println(p[i]);
        }

    }

}
