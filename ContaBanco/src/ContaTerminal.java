import java.util.Scanner;

public class ContaTerminal {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public void criarConta(){
        Scanner lerEntrada = new Scanner(System.in);
        System.out.println("Para criar a conta do cliente precisamos que preencha alguns dados a seguir:");
        System.out.println("Nome do cliente");
        this.nomeCliente = lerEntrada.next();
        System.out.println("Número da Conta");
        this.numero = lerEntrada.nextInt();
        System.out.println("Número da Agência");
        this.agencia = lerEntrada.next();
        System.out.println("Saldo Inicial");
        this.saldo = lerEntrada.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s"+
                " e seu saldo %s já está disponível para saque", nomeCliente, agencia, numero, saldo);
    }

}
