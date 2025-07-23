import java.util.Scanner;

public class ParOuImparEmIntervaloX {
    private int numeroMenor;
    private int numeroMaior;
    private int escolha;

    public void contarParesOuImpares() {
        Scanner lerEntrada = new Scanner(System.in);

        System.out.println("Escolha dois números para calcularmos quantos impares ou pares teremos no intervalo entre eles");
        System.out.println("Digite o numero menor");
        numeroMenor = lerEntrada.nextInt();
        System.out.println("Digite o numero maior");
        numeroMaior = lerEntrada.nextInt();
        while (numeroMaior < numeroMenor) {
            System.out.println("O segundo numero precisa ser maior que o primeiro");
            numeroMaior = lerEntrada.nextInt();
        }
        System.out.println("Escolha entre 1-Par ou 2-Impar");
        escolha = lerEntrada.nextInt();
        do {
            if (escolha == 1) {
                for (int i = numeroMaior; i >= numeroMenor; i--) {
                    if (i % 2 == 0) {
                        System.out.printf("o número: %s é par\n", i);
                    }
                }
            }else if (escolha == 2) {
                for (int i = numeroMaior; i >= numeroMenor; i--) {
                    if (i % 2 == 1) {
                        System.out.printf("o número: %s é impar\n", i
                        );
                    }
                }
            } else {
                System.out.println("escolha invalida digite novamente\n 1-Par, 2-Impar");
                escolha = lerEntrada.nextInt();
            }
        } while (escolha != 1 && escolha != 2);
    }
}
