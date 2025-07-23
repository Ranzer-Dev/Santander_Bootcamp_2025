import java.util.Scanner;

public class TabuadaDeNumeroX {
    private int numeroX;
    private int resultado;

    public void construirTabuada(){
        Scanner lerNumero = new Scanner(System.in);
        System.out.println("Digite um número inteiro para calcularmos a Tabuada dele até 10");
        numeroX = lerNumero.nextInt();

        for (int i = 1; i <= 10; i++){
            resultado = numeroX*i;
            System.out.printf("%s * %s = %s \n", numeroX, i, resultado );
        }
    }
}
