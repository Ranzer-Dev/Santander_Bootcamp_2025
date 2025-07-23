import java.util.Scanner;

public class IMC {
    private double IMC;
    private double altura;
    private double peso;

    public void calculaIMC() {
        Scanner lerEntrada = new Scanner(System.in);
        System.out.println("Informe sua altura para calcularmos seu IMC\nExemplo: 1,83");
        altura = lerEntrada.nextDouble();
        System.out.println("Agora o seu peso\nExemplo: 63,20");
        peso = lerEntrada.nextDouble();

        IMC = (peso / (altura * altura));

        System.out.printf("Sua altura é de %s \nSeu peso %s \nPortanto seu IMC é de %s\n", altura, peso, IMC);
        String frase = "você esta ";

        if (IMC <= 18.5){
            System.out.println(frase+"abaixo do Peso");
        } else if (IMC < 24.9) {
            System.out.println(frase+"com peso ideal");
        } else if (IMC <= 29.9){
            System.out.println(frase+"levemente acima do peso");
        } else if (IMC <= 35.9) {
            System.out.println(frase+"com obesidade Grau I");
        } else if (IMC <= 39.9) {
            System.out.println(frase+"com obesidade Grau II (Severa)");
        } else {
            System.out.println(frase+"com obesidade Grau III (Mórbida)");
        }
    }
}
