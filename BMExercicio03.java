class BMExercicio03 {
    public static void main(String[] args) {

        double bombom1 = 2.95;
        double bombom2 = 3.50;

        double custoSoma = bombom1 + bombom2;

        final double taxa = 8.25 / 100; // 8.25%

        double taxaCalculada = (custoSoma * taxa) + custoSoma;
        double novoCusto = (bombom1 * taxa) + (bombom2 * taxa);

        boolean muitoCaro = novoCusto >= 10;


        System.out.println("O bombom 1 custa " + bombom1 + " e o bombom 2 custa " + bombom2);
        System.out.println("A soma dos dois bombons é igual a " + custoSoma);
        System.out.println("A soma dos dois bombons com a taxa é igual a " + taxaCalculada);
        System.out.println("O bombom 1 custa com a taxa " + ((bombom1 * taxa)+ bombom1) +
        " e o bombom 2 custa com a taxa " + 
        ((bombom2 * taxa) + bombom2));
        System.out.println("É muito caro ? " + muitoCaro);
    }
}