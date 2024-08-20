package Java_BasicLearning.Inheritance_and_Polymorphism;

class Spaghetti05 extends Noodle05 {

    Spaghetti05() {

        super(30.0, 0.2, "round", "semolina flour");

    }

    @Override
    public String getCookPrep() {

        return "Boil spaghetti for 8 - 12 minutes and add sauce, cheese, or oil and garlic.";

    }

}
