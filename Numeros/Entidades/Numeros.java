package Entidades;

public abstract class Numeros {
    
    int conjunto[];

    public Numeros(int[] conjunto) {
        this.conjunto = conjunto;
    }

    public abstract int calcular();

}
