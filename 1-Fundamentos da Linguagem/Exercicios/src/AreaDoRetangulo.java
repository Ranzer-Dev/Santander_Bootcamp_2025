import java.util.Scanner;

public class AreaDoRetangulo {
    private float area;
    private float altura;
    private float base;

    public void calcularArea(){
        Scanner lerEntrada = new Scanner(System.in);
        System.out.println("Vamos calcular a area de um retangulo imaginario!");
        System.out.println("Qual altura do retangulo?");
        this.altura = lerEntrada.nextFloat();
        System.out.println("Qual a base do retangulo");
        this.base = lerEntrada.nextFloat();

        area = base * altura;

        System.out.printf("Esse retangulo tem %s de area:", area);
    }
}
