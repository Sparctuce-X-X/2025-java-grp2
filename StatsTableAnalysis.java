import java.util.Arrays;

public class StatsTableAnalysis {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 23, 67, 34, 89, 21, 55, 38, 44};

        // Calcul de la moyenne
        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double moyenne = sum / numbers.length;

        // Tri du tableau
        Arrays.sort(numbers);

        // Calcul de la médiane
        double mediane;
        if (numbers.length % 2 == 0) {
            mediane = (numbers[numbers.length / 2 - 1] + numbers[numbers.length / 2]) / 2.0;
        } else {
            mediane = numbers[numbers.length / 2];
        }

        // Calcul de l'écart-type
        double variance = 0;
        for (int num : numbers) {
            variance += Math.pow(num - moyenne, 2);
        }
        variance = variance / numbers.length;
        double ecartType = Math.sqrt(variance);

        // Valeurs minimale et maximale
        int valeurMin = numbers[0];
        int valeurMax = numbers[numbers.length - 1];

        // Affichage des résultats
        System.out.println("Tableau initial : " + Arrays.toString(new int[]{12, 45, 23, 67, 34, 89, 21, 55, 38, 44}));
        System.out.println("Moyenne : " + moyenne);
        System.out.println("Médiane : " + mediane);
        System.out.println("Écart-type : " + ecartType);
        System.out.println("Tableau trié : " + Arrays.toString(numbers));
        System.out.println("Valeur minimale : " + valeurMin);
        System.out.println("Valeur maximale : " + valeurMax);
    }
}
