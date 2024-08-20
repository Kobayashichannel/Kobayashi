package Java_BasicLearning.String_Methods;

@SuppressWarnings("all")
public class DNA {
    public static void main(String[] args) {
        // DNA Sequencing
        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";
        String dna = dna3;

        // Find the length:
        int length = dna.length();
        System.out.println("Length: " + length);

        // Find start codon:
        int start = dna.indexOf("ATG");
        System.out.println("Start: " + start);

        // Find stop codon:
        int stop = dna.indexOf("TGA");
        System.out.println("Stop: " + stop);

        if (start != -1 && stop != -1 && (stop - start) % 3 == 0) {
            System.out.println("Condition 1 and 2 and 3 are satisfied.");
        }

        if (start != -1 &&
                stop != -1 &&
                (stop - start) % 3 == 0) {

            String protein = dna.substring(start, stop + 3);
            System.out.println("Protein: " + protein);
        } else {
            System.out.println("No protein.");
        }
    }
}
