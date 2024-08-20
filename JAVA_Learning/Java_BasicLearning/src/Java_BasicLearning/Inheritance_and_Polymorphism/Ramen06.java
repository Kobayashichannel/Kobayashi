package Java_BasicLearning.Inheritance_and_Polymorphism;

class Ramen06 extends Noodle06 {

    Ramen06() {

        super(30.0, 0.3, "flat", "wheat flour");

    }

    @Override
    public String getCookPrep() {

        return "Boil ramen for 5 minutes in broth, then add meat, mushrooms, egg, and vegetables.";

    }

}
