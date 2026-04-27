package partie1;

public class Mammifere extends Animal {
    private String couleurPoil;

    public Mammifere(String nom, String espece, int age, String regimeAlimentaire, String couleurPoil) {
        // super() appelle le constructeur de la classe parente Animal
        super(nom, espece, age, regimeAlimentaire);
        this.couleurPoil = couleurPoil;
    }

    public void allaiter() {
        System.out.println(getNom() + " allaite ses petits.");
    }

    @Override
    public void afficherInformations() {
        super.afficherInformations(); // Appelle la méthode de base
        System.out.println("Couleur du poil: " + couleurPoil);
    }
}
