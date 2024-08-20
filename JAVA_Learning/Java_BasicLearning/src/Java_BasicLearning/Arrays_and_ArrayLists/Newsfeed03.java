package Java_BasicLearning.Arrays_and_ArrayLists;

import java.util.Arrays;

public class Newsfeed03 {

    String[] topics = {"Opinion", "Tech", "Science", "Health"};
    int[] views = {0, 0, 0, 0};
    String[] favoriteArticles;

    public Newsfeed03(){
        // Initialize favoriteArticles here:
        favoriteArticles = new String[10];
    }

    public void setFavoriteArticle(int favoriteIndex, String newArticle){
        // Add newArticle to favoriteArticles:
        favoriteArticles[2] = "Celebrity Hands Throughout the Decades";

    }

    public static void main(String[] args){
        Newsfeed03 sampleFeed = new Newsfeed03();

        sampleFeed.setFavoriteArticle(2, "Humans: Exterminate Or Not?");
        sampleFeed.setFavoriteArticle(3, "Organic Eye Implants");
        sampleFeed.setFavoriteArticle(0, "Oil News");

        System.out.println(Arrays.toString(sampleFeed.favoriteArticles));
    }
}

