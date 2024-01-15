import java.util.LinkedList;
import java.util.List;
 
public class LinkedListSongWithArtist {
    public static void main(String[] args) {
        // Create three linked lists for songs, artists, and albums
        List<String> songs = new LinkedList<>();
        List<String> artists = new LinkedList<>();
        List<String> albums = new LinkedList<>();
 
        // Step 2: Add 5 song titles and their corresponding artists to the first two lists
        songs.add("Ayo");
        songs.add("Love of my life");
        songs.add("Congratulation");
        songs.add("Heathens");
        songs.add("Write This Down");
 
        artists.add("ChrisBrown,Tyga");
        artists.add("Queen");
        artists.add("Post Malone");
        artists.add(" twenty one pilots");
        artists.add("Pop Smoke and Tupac Shakur");
 
        // Step 3: Combine the first two lists and add each combination to the third list (album)
        for (int i = 0; i < songs.size(); i++) {
            String song = songs.get(i);
            String artist = artists.get(i);
            String albumEntry = song + " - " + artist;
            albums.add(albumEntry);
        }
 
        // Step 4: Display the content of the three linked lists
        System.out.println("Songs:");
        for (String song : songs) {
            System.out.println(song);
        }
 
        System.out.println("\nArtists:");
        for (String artist : artists) {
            System.out.println(artist);
        }
 
        System.out.println("\nAlbums:");
        for (String album : albums) {
            System.out.println(album);
        }
    }
}