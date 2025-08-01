import exceptions.ParametrosInvalidosException;

public static void main(String[] args) {
    Scanner terminal = new Scanner(System.in);
    System.out.println("Digite o primeiro parâmetro");
    int parametroUm = terminal.nextInt();
    System.out.println("Digite o segundo parâmetro");
    int parametroDois = terminal.nextInt();

    try {
        contar(parametroUm, parametroDois);
    } catch (ParametrosInvalidosException ex) {
        ex.printStackTrace();
    }
}

static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
    if (parametroDois < parametroUm) {
        throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
    }
    int contagem = parametroDois - parametroUm;
    for (var i = 1; i <= contagem; i++){
        System.out.printf("Imprimindo Nº %s\n", i);
    }
}
