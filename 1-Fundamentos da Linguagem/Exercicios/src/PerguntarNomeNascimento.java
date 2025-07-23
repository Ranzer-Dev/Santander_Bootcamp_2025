import java.util.Scanner;

public class PerguntarNomeNascimento {
    private String nome;
    private int anoNascimento;

    public void CalcularIdade(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual seu nome?");
        this.nome = ler.next();
        System.out.println("Qual sua data de nascimento?");
        this.anoNascimento = ler.nextInt();
        System.out.printf("Óla %s você tem %s anos \n", nome, (2025 - anoNascimento));
    }
}
