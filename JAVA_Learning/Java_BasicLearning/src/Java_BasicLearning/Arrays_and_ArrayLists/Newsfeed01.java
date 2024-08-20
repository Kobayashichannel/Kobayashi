package Java_BasicLearning.Arrays_and_ArrayLists;
import java.util.Arrays;
public class Newsfeed01 {


    public Newsfeed01(){

    }

    // Create getTopics() below:
    public String[] getTopics() {
        String[] topics = {"Opinion", "Tech", "Science", "Health"};
        return topics;
    }

    public static void main(String[] args){
        Newsfeed01 sampleFeed = new Newsfeed01();
        String[] topics = sampleFeed.getTopics();
        System.out.println(Arrays.toString(topics));
    }
}
