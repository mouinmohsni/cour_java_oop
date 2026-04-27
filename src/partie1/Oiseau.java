package partie1;

public class Oiseau extends Animal {
    private double envergure;

    public Oiseau(String nom, String espece, int age, String regimeAlimentaire, double envergure) {
        super(nom, espece, age, regimeAlimentaire);
        this.envergure = envergure;
    }

    public void voler() {
        System.out.println(getNom() + " déploie ses ailes de " + envergure + "m.");
    }

    @Override
    public void afficherInformations() {
        super.afficherInformations();
        System.out.println("Envergure: " + envergure + " mètres");
    }
}
