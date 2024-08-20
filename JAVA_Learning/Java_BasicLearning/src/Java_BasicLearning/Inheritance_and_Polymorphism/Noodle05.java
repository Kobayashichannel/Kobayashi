package Java_BasicLearning.Inheritance_and_Polymorphism;

class Noodle05 {

    protected double lengthInCentimeters;
    protected double widthInCentimeters;
    protected String shape;
    protected String ingredients;
    protected String texture = "brittle";

    Noodle05(double lenInCent, double wthInCent, String shp, String ingr) {

        this.lengthInCentimeters = lenInCent;
        this.widthInCentimeters = wthInCent;
        this.shape = shp;
        this.ingredients = ingr;

    }

    public String getCookPrep() {

        return "Boil noodle for 7 minutes and add sauce.";

    }


    public static void main(String[] args) {

        Noodle05 spaghetti, ramen, pho;

        spaghetti = new Spaghetti05();
        ramen = new Ramen05();
        pho = new Pho05();

        // Add your code below:
        Noodle05[] allTheNoodles = {spaghetti, ramen, pho};

        for (Noodle05 noodle05 : allTheNoodles) {

            System.out.println(noodle05.getCookPrep());

        }
    }

}
