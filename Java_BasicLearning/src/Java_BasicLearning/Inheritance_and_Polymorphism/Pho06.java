package Java_BasicLearning.Inheritance_and_Polymorphism;

class Pho06 extends Noodle06 {

    Pho06() {

        super(30.0, 0.64, "flat", "rice flour");

    }

    @Override
    public String getCookPrep() {

        return "Soak pho for 1 hour, then boil for 1 minute in broth. Then garnish with cilantro and jalapeno.";

    }

}