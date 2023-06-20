package Java_BasicLearning.Inheritance_and_Polymorphism;

class Dinner {

    private void makeNoodles(Noodle04 noodle04, String sauce) {

        noodle04.cook();

        System.out.println("Mixing " + noodle04.texture + " noodles made from " + noodle04.ingredients + " with " + sauce + ".");
        System.out.println("Dinner is served!");

    }

    public static void main(String[] args) {

        Dinner noodlesDinner = new Dinner();
        // Add your code here:
        Noodle04 biangBiang = new BiangBiang();
        noodlesDinner.makeNoodles(biangBiang, "soy sauce and chili oil");

    }

}
