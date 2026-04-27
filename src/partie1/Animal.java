package partie1;

public class Animal {
    // Attributs privés pour l'encapsulation
    private String nom;
    private String espece;
    private int age;
    private String regimeAlimentaire;

    // Constructeur
    public Animal(String nom, String espece, int age, String regimeAlimentaire) {
        this.nom = nom;
        this.espece = espece;
        this.age = age;
        this.regimeAlimentaire = regimeAlimentaire;
    }

    // Getters (Accesseurs)
    public String getNom() { return nom; }
    public String getEspece() { return espece; }
    public int getAge() { return age; }
    public String getRegimeAlimentaire() { return regimeAlimentaire; }

    // Setters (Mutateurs) avec validation
    public void setAge(int nouvelAge) {
        if (nouvelAge >= 0) {
            this.age = nouvelAge;
        } else {
            System.out.println("Erreur : L'âge ne peut pas être négatif !");
        }
    }

    public void setRegimeAlimentaire(String nouveauRegime) {
        if (nouveauRegime != null && !nouveauRegime.isEmpty()) {
            this.regimeAlimentaire = nouveauRegime;
        } else {
            System.out.println("Erreur : Le régime alimentaire ne peut pas être vide !");
        }
    }

    public void afficherInformations() {
        System.out.println("Nom: " + nom + ", Espèce: " + espece + ", Âge: " + age + ", Régime: " + regimeAlimentaire);
    }
}
