package Java_BasicLearning.Arrays_and_ArrayLists;

import java.util.ArrayList;

class Playlist {

    public static void main(String[] args) {

        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

        desertIslandPlaylist.add("song01");
        desertIslandPlaylist.add("song02");
        desertIslandPlaylist.add("song03");
        desertIslandPlaylist.add("song04");
        desertIslandPlaylist.add("song05");
        desertIslandPlaylist.add("song06");

        System.out.println(desertIslandPlaylist);
        System.out.println(desertIslandPlaylist.size());

        desertIslandPlaylist.remove(5);
        int indexA = desertIslandPlaylist.indexOf("song02");
        int indexB = desertIslandPlaylist.indexOf("song03");
        String tempA = "song02";
        desertIslandPlaylist.set(indexA,"song03~");
        desertIslandPlaylist.set(indexB,tempA);
        System.out.println(desertIslandPlaylist);
    }

}