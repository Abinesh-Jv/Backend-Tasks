package hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Long, ArrayList<String>> movieList = new HashMap<>();

        long moveId = 67543679867824983L;
        ArrayList<String> theaters = new ArrayList<>();
        theaters.add("Phoenix");
        theaters.add("Vetri");
        theaters.add("Sathyam");
        movieList.put(moveId,theaters);

        moveId = 876987897798L;
        theaters = new ArrayList<>();
        theaters.add("PVR");
        theaters.add("INOX");
        theaters.add("Sandeep");
        movieList.put(moveId,theaters);

        System.out.println(movieList);
    }
}
