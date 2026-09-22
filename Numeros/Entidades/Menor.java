package Entidades;

public class Menor extends Numeros{
 
    public Menor(int[] conjunto) {
        super(conjunto);
    }

    @Override 
    public int calcular() {
        int menor = this.conjunto[0];
        for (int i = 1; i < this.conjunto.length; i++) {
            if (this.conjunto[i] < menor) {
               menor = this.conjunto[i];
            }
        }
        System.out.println("El numero menor del conjunto es: " + menor);
        return menor;
    }

}
