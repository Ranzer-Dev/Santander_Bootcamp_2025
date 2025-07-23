public class Main {
    public static void main(String[] args) {
        PerguntarNomeNascimento calcularIdade = new PerguntarNomeNascimento();
        AreaDoQuadrado calcularAreaQuadrado = new AreaDoQuadrado();
        AreaDoRetangulo calcularAreaRetangulo = new AreaDoRetangulo();
        DiferencaIdade calcularDiferencaIdade = new DiferencaIdade();

        calcularDiferencaIdade.calcularDiferencaIdade();
        calcularIdade.CalcularIdade();
        calcularAreaQuadrado.calcularArea();
        calcularAreaRetangulo.calcularArea();
    }
}