package Java_BasicLearning.HelloWorldAndVariables;

public class GreaterThanEqualTo {
    public static void main(String[] args){
        double recommendedWaterIntake = 8;
        double daysInChallenge = 30;
        double yourWaterIntake = 235.5;
        double totalRecommendedAmount = recommendedWaterIntake * daysInChallenge;
        System.out.println(totalRecommendedAmount > yourWaterIntake);

        double isChallengeComplete = totalRecommendedAmount;
        System.out.println(isChallengeComplete == yourWaterIntake);
    }
}

