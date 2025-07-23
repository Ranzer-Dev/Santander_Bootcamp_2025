import javax.naming.PartialResultException;

public class Main {
    public static void main(String[] args) {
        TabuadaDeNumeroX tabuada = new TabuadaDeNumeroX();
        IMC valorIMC = new IMC();
        ParOuImparEmIntervaloX parOuImparDeIntervalo = new ParOuImparEmIntervaloX();
        DivideSeRestarAcaba divide = new DivideSeRestarAcaba();

        tabuada.construirTabuada();
        valorIMC.calculaIMC();
        parOuImparDeIntervalo.contarParesOuImpares();
        divide.divideAteRestar();

    }
}