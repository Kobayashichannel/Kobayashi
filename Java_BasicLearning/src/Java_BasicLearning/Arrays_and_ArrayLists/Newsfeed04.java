package Java_BasicLearning.Arrays_and_ArrayLists;
import java.util.Arrays;

public class Newsfeed04 {

    String[] topics = {"Opinion", "Tech", "Science", "Health"};
    int[] views = {0, 0, 0, 0};

    public Newsfeed04(){
        String[] menuItems = new String[5];
        System.out.println(menuItems.length);

        double[] prices = {13.1, 15.87, 14.22, 16.66};
        System.out.println(prices.length);
    }

    public String[] getTopics(){
        return topics;
    }

    public int getNumTopics(){
        return views.length;
    }

    public static void main(String[] args){
        Newsfeed04 sampleFeed = new Newsfeed04();

        System.out.println("The number of topics is "+ sampleFeed.getNumTopics());

    }
}

