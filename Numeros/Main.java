import Entidades.*;

public class Main {
    
    public static void main(String[] args) {
        
        int[] conjunto = {3, 5, 6, 4, 10};

        Mayor ma = new Mayor(conjunto);        
        Menor me = new Menor(conjunto);
        Pares p = new Pares(conjunto);

        System.out.println("El mayor numero del conjunto es: " + ma.calcular());
        System.out.println("El menor numero del conjunto es: " + me.calcular());
        p.calcular();

    }

}
