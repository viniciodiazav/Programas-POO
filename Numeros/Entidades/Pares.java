package Entidades;

public class Pares extends Numeros {
    
    public Pares(int[] conjunto) {
        super(conjunto);
    }

    @Override 
    public int calcular() {
        int mayor = new Mayor(conjunto).calcular();
        int menor = new Menor(conjunto).calcular();
        
        int cantidad = (mayor - menor) - 1;

        System.out.println("Entre el menor [" + menor + "] y el mayor [" + mayor + "] hay " + cantidad + " numeros");

        System.out.print("Pares: [");
        for (int i = 0; i < this.conjunto.length; i++) {
            if (this.conjunto[i] % 2 == 0) {
                if (i == this.conjunto.length - 1) {
                    System.out.print(this.conjunto[i]);
                } else {
                    System.out.print(this.conjunto[i] + ", ");
                }
            }
        }
        System.out.println("]");

        return 0;
    }

}
