package Entidades;

public class Mayor extends  Numeros{
   
    public Mayor(int[] conjunto) {
        super(conjunto);
    }

    @Override
    public int calcular() {
        int mayor = this.conjunto[0];
        for (int i = 1; i < this.conjunto.length; i++) {
            if (this.conjunto[i] > mayor) {
                mayor = this.conjunto[i];
            }
        }
        return mayor;
    }

}
