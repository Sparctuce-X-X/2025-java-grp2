// Classe principale pour tester les objets Voiture et Avion
public class Main {
    public static void main(String[] args) {
        Transport voiture = new Voiture();
        Transport avion = new Avion();

        voiture.deplacer();
        avion.deplacer();
    }
}
