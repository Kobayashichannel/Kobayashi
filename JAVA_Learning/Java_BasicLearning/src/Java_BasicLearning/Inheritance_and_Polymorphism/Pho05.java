package Java_BasicLearning.Inheritance_and_Polymorphism;

class Pho05 extends Noodle05 {

    Pho05() {

        super(30.0, 0.64, "flat", "rice flour");

    }

    @Override
    public String getCookPrep() {

        return "Soak pho for 1 hour, then boil for 1 minute in broth. Then garnish with cilantro and jalapeno.";

    }

}