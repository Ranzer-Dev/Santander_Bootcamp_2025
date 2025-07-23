import java.util.Scanner;

public class DivideSeRestarAcaba {
    private int numeroDivisor;
    private int numeroDividendo;

    public void divideAteRestar(){
        Scanner lerEntrada = new Scanner(System.in);

        System.out.println("Digite o número Divisor");
        numeroDivisor = lerEntrada.nextInt();
        System.out.println("Escreva o número que sera divido");
        numeroDividendo = lerEntrada.nextInt();
        System.out.println("Resultado: "+numeroDividendo%numeroDivisor);
        while (true){

            if (numeroDividendo%numeroDivisor == 1 && numeroDividendo >= numeroDivisor){
                break;
            } else {
                System.out.println("Escreva o número que sera divido");
                numeroDividendo = lerEntrada.nextInt();
                if (numeroDividendo <= numeroDivisor){
                    System.out.println("Número dividendo é menor que divisor");
                    continue;
                }
                System.out.println("Resultado: "+numeroDividendo%numeroDivisor);
            }
        }
        System.out.printf("Fim da execusão divisão de %s por %s tem resto\n", numeroDividendo, numeroDivisor);
    }
}
