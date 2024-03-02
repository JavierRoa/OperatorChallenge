public class OperatorChallenge {
    public static void main(String[] args) {

        double primerValor = 20.0;
        double segundoValor = 80.0;
        double multiplicacion = (primerValor + segundoValor) * 100.0;
        double resto = multiplicacion % 40.0;
        boolean esResto0 = resto == 0.0;

        System.out.println(esResto0);

        if(!esResto0) {
            System.out.println("Existe un resto");
        }
    }
}
