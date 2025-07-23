import java.util.Scanner;

public class AreaDoQuadrado {
    private float lado;
    private float area;

    public void calcularArea(){
        Scanner lerEntrada = new Scanner(System.in);
        System.out.println("Vamos calcular a area de um quadrado imaginario!");
        System.out.println("Qual o tamanho de um dos lados do quadrado?");
        this.lado = lerEntrada.nextFloat();
        this.area = lado*lado;

        System.out.printf("O quadrado tem uma área de: %s\n", area);
    }
}
