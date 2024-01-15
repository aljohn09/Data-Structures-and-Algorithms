import java.util.LinkedList;

public class TailRecur {
    LinkedList<String> songs = new LinkedList<>();
    LinkedList<String> artists = new LinkedList<>();
    LinkedList<String> album = new LinkedList<>();
    int currentIndex = 0;

    public static void main(String[] args) {
        TailRecur tc = new TailRecur();
        tc.songs.add("Tao Lang");
        tc.songs.add("Life Goes On");
        tc.songs.add("Crossroad");
        tc.songs.add("Ayo");
        tc.songs.add("Elevate");
        tc.songs.add("Patiwakal");


        tc.artists.add("Loonie");
        tc.artists.add("Tupac");
        tc.artists.add("Bone Thug And Harmony");
        tc.artists.add("ChrisBrown");
        tc.artists.add("Jeff Garcia");
        tc.artists.add("Jrldm");

        tc.processNext();
    }

    public void processNext() {
        if (currentIndex >= songs.size()) {
            printOutput();
            return;
        }

        String combination = songs.get(currentIndex) + " - " + artists.get(currentIndex);
        album.add(combination);

        currentIndex++;
        processNext();
    }

    public void printOutput() {
        System.out.printf("%-20s%-20s%-20s\n", "Songs", "Artists", "Album");
        for (int i = 0; i < songs.size(); i++) {
            System.out.printf("%-20s%-20s%-20s\n", songs.get(i), artists.get(i), album.get(i));
        }
    }
}