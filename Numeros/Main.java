import Entidades.*;

public class Main {
    
    public static void main(String[] args) {
        
        int[] conjunto = {3, 5, 6, 4, 10};

        Mayor ma = new Mayor(conjunto);        
        Menor me = new Menor(conjunto);
        Pares p = new Pares(conjunto);

        ma.calcular();
        me.calcular();
        p.calcular();

    }

}
