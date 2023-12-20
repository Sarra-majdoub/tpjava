import java.util.ArrayList;
import java.util.List;

public class Song {

    protected String title;

    protected float duration;
    protected String genre;
    public Song(String title, float length, String genre){
        this.title=title;
        this.duration=length;
        this.genre=genre;
    }

    public void playSong(){
        System.out.println(" the song" + title + "is playing ");
    }
     public float getSongLength(){
        return duration;
     }

    public String getTitle() {
        return title;
    }

    public void displayInformation() {
        System.out.println("title: "+ title+ " _ genre:"+ genre+" _ length: " + duration);
    }
}
class Album{
    protected List<Song> Songs ;
    protected String title;

    public Album(String title) {
        this.Songs = new ArrayList<>();
        this.title=title;
    }

    public void addSong(Song song) {
        Songs.add(song);
    }
    public void removeSong(Song song) {
        if (Songs.contains(song)) {
            Songs.remove(song);
            System.out.println("song removed :" + song.getTitle());
        } else {
            System.out.println("song not found .");
        }
    }
    public void listAllSongs() {
        if (Songs.isEmpty()) {
            System.out.println("The Album is empty ");
        } else {
            System.out.println("songs available:");
            for (Song song : Songs) {
                song.displayInformation();
            }
        }
    }

    public String getTitle() {
        return title;
    }

    public void displayInformation() {
        System.out.println("album title: "+title );
        for (Song song : Songs) {
            song.displayInformation();
        }
    }
}
interface  User{
     void Listen(Song song);
     void addToPlayList(Song song);
}
class FreeUser implements User{

    protected String UserName;
    protected PlayList myPlayList;
    public FreeUser(String userName, String myPlayList_name){
        this.UserName=userName;
        this.myPlayList=new PlayList(myPlayList_name);
    }
    @Override
    public void Listen(Song song) {
        System.out.println("Playing Advertisement...");
        System.out.println("Buy our premium service for an ad-free experience!");
        System.out.println("------------------------------");

        System.out.println("the user "+ UserName +" is listening to"+ song.getTitle());
    }
    @Override
    public void addToPlayList(Song song) {
        System.out.println("this song "+song.getTitle()+" is added to"+ UserName+"'s playlist");
        myPlayList.add_to_playlist(song);
    }
    public void shuffle_playlist(){
        for (Song song : myPlayList.list_of_songs) {
            System.out.println("Playing Advertisement...");
            System.out.println("Upgrade to premium for an ad-free experience!");
            System.out.println("------------------------------");
            song.displayInformation();
        }
    }
}
class PremiumUser implements User{
    protected String UserName;
    protected PlayList myPlayList;
    public PremiumUser(String userName, String myPlayList_name){
        this.UserName=userName;
        this.myPlayList=new PlayList(myPlayList_name);
    }
    @Override
    public void Listen(Song song) {
        System.out.println("the user "+ UserName +" is listening to"+ song.getTitle());
    }

    @Override
    public void addToPlayList(Song song) {
        System.out.println("this song "+song.getTitle()+" is added to"+ UserName+"'s playlist");
        myPlayList.add_to_playlist(song);
    }
    public void shuffle_playlist(){
        for (Song song : myPlayList.list_of_songs) {
            song.displayInformation();
        }
    }
}

class PlayList{
    protected List<Song> list_of_songs;
    protected String title;
    public PlayList(String title){
        this.list_of_songs = new ArrayList<>();
        this.title=title;
    }
    public void add_to_playlist(Song song) {
        list_of_songs.add(song);
    }
    public void remove_from_playlist(Song song) {
        if (list_of_songs.contains(song)) {
            list_of_songs.remove(song);
            System.out.println("song removed from the playlist :" + song.getTitle());
        } else {
            System.out.println("song not found.");
        }
    }
}



class Artist {
    protected List<Album> albums;
    protected String name;

    public Artist(String name) {
        this.albums = new ArrayList<>();
        this.name = name;
    }

    public void addAlbum(Album album) {
        albums.add(album);
    }

    public void removeAlbum(Album album) {
        if (albums.contains(album)) {
            albums.remove(album);
            System.out.println("album removed :" + album.getTitle());
        } else {
            System.out.println("album not found .");
        }
    }

    public void listAllSongs() {
        if (albums.isEmpty()) {
            System.out.println(" No albums  available !");
        } else {
            System.out.println(" Albums of :" + name);
            for (Album album : albums) {
                album.displayInformation();
            }
        }
    }
}

 class Main {
    public static void main(String[] args) {

        Song song1 = new Song("Song 1", 3.5f, "Pop");
        Song song2 = new Song("Song 2", 4.2f, "Rock");
        Song song3 = new Song("Song 3", 5.1f, "Jazz");


        Album album1 = new Album("Album 1");
        album1.addSong(song1);
        album1.addSong(song2);


        Album album2 = new Album("Album 2");
        album2.addSong(song3);


        Artist artist = new Artist("Artist 1");
        artist.addAlbum(album1);
        artist.addAlbum(album2);


        System.out.println("List of all songs:");
        album1.listAllSongs();


        album1.removeSong(song1);


        System.out.println("\nList of all songs after removing a song:");
        album1.listAllSongs();


        System.out.println("\nList of all albums by " + artist.name + ":");
        artist.listAllSongs();


        FreeUser freeUser = new FreeUser("FreeUser1", "MyPlaylist");
        freeUser.Listen(song1);  // Listening with an ad
        freeUser.addToPlayList(song2);  // Adding to playlist
        freeUser.shuffle_playlist();  // Shuffling playlist with ads


        PremiumUser premiumUser = new PremiumUser("PremiumUser1", "PremiumPlaylist");
        premiumUser.Listen(song3);  // Listening without an ad
        premiumUser.addToPlayList(song1);  // Adding to playlist
        premiumUser.shuffle_playlist();  // Shuffling playlist without ads
    }
}







