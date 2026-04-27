package partie1;
import java.util.ArrayList;
import java.util.List;

public class MainZoo {
    public static void main(String[] args) {
        System.out.println("=== TEST DE LA PARTIE 1 : ENCAPSULATION ET HÉRITAGE ===\n");

        // 1. Test de l'Encapsulation avec la classe de base Animal
        System.out.println("--- Test 1 : Classe Animal ---");
        Animal lion = new Animal("Simba", "Lion", 5, "Carnivore");
        lion.afficherInformations();

        // Test des setters avec validation
        System.out.println("\nTentative de modification avec des données invalides :");
        lion.setAge(-3); // Devrait afficher un message d'erreur
        lion.setRegimeAlimentaire(""); // Devrait afficher un message d'erreur

        System.out.println("\nModification avec des données valides :");
        lion.setAge(6);
        lion.setRegimeAlimentaire("Omnivore");
        lion.afficherInformations();

        // 2. Test de l'Héritage avec Mammifere
        System.out.println("\n--- Test 2 : Classe Mammifere (Héritage) ---");
        Mammifere tigre = new Mammifere("Shere Khan", "Tigre", 8, "Carnivore", "Orange et Noir");
        tigre.afficherInformations(); // Utilise la méthode surchargée
        tigre.allaiter(); // Méthode spécifique aux mammifères

        // 3. Test de l'Héritage avec Oiseau
        System.out.println("\n--- Test 3 : Classe Oiseau (Héritage) ---");
        Oiseau aigle = new Oiseau("Aiglon", "Aigle Royal", 3, "Carnivore", 2.5);
        aigle.afficherInformations(); // Utilise la méthode surchargée
        aigle.voler(); // Méthode spécifique aux oiseaux

        // Démontrer que l'oiseau a aussi accès aux méthodes d'Animal (Héritage)
        System.out.println("\nModification de l'âge de l'oiseau via la méthode héritée :");
        aigle.setAge(4);
        System.out.println("Nouvel âge de l'oiseau : " + aigle.getAge() + " ans.");
    }
}
