import java.util.Scanner;

public class DiferencaIdade {
    private int idade1, idade2;

    public void calcularDiferencaIdade(){
        Scanner lerEntrada = new Scanner(System.in);
        System.out.println("vamos calcular a diferença de idade entre duas pessoas!");
        System.out.println("Qual a idade da 1º pessoa?");
        this.idade1 = lerEntrada.nextInt();
        System.out.println("Qual a idade da 2º pessoa?");
        this.idade2 = lerEntrada.nextInt();

        System.out.printf("A diferença de idade entre as duas pessoas é de %s \n", (Math.abs(idade1-idade2)));
    }
}
/* hh*/