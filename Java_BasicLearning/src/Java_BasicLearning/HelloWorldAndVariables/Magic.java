package Java_BasicLearning.HelloWorldAndVariables;

public class Magic {
    public static void main(String[] args) {
        //初始号码
        int myNumber = 10;
        int stepOne = myNumber * myNumber;
        int stepTow = stepOne + myNumber;
        int stepThree = stepTow / stepOne;
        int stepFour = stepThree + 17;
        int stepFive = stepFour - stepFour;
        int stepSix = stepFive / 6;
        System.out.println(stepSix);
    }
}
