public class Main {

    public static void main(String[] args) {
        int resultado = 0;
        resultado = suma( 6, 4, 8 );
        System.out.println(resultado);

        Coche miCoche = new Coche();
        miCoche.AgregarPuerta();
        System.out.println(miCoche.puertas);
    }

public static int suma (int a, int b, int c) {

    return a + b + c;
}
}

class Coche{
    public int puertas = 0;

    public void AgregarPuerta() {
        this.puertas++;
    }
}
