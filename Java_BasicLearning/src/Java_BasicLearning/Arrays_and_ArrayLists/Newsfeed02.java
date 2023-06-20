package Java_BasicLearning.Arrays_and_ArrayLists;

import java.util.Arrays;

public class Newsfeed02 {

    String[] topics = {"Opinion", "Tech", "Science", "Health"};
    int[] views = {0, 0, 0, 0};

    public Newsfeed02(){

    }

    public String[] getTopics(){
        return topics;
    }

    public String getTopTopic(){
        return topics[0];

    }

    public void viewTopic(int topicIndex){
        views[topicIndex] = views[topicIndex] + 1;
    }

    public static void main(String[] args){
        Newsfeed02 sampleFeed = new Newsfeed02();

        System.out.println("The top topic is "+ sampleFeed.getTopTopic());

        sampleFeed.viewTopic(1);
        sampleFeed.viewTopic(1);
        sampleFeed.viewTopic(3);
        sampleFeed.viewTopic(2);
        sampleFeed.viewTopic(2);
        sampleFeed.viewTopic(1);

        System.out.println("The " + sampleFeed.topics[0] + " topic has been viewed " + sampleFeed.views[1] + " times!");
    }
}

