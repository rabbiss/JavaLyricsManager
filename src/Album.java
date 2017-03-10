
import java.util.HashMap;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rabbiss
 */
public class Album implements java.io.Serializable {
    
    private String artist, album, genre;
    private int year, tracks;
    private HashMap<Integer, String> lyrics;
    
    public Album(String artist, String album, int year, String genre, int tracks) {
        this.artist = artist;
        this.album = album;
        this.year = year;
        this.genre = genre;
        this.tracks = tracks;
        this.lyrics = new HashMap<>();
    }
    
    public String getLyrics(int track) {
        return this.lyrics.get(track);
    }
    
    public String getAllLyrics() {
        String content = "";
        for (Integer key : lyrics.keySet()) {
            content += lyrics.get(key) + "\n" + "end\n";
        }
        return content;
    }
    
    public void addLyrics(Integer track, String lyrics) {
        this.lyrics.put(track, lyrics);
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getTracks() {
        return tracks;
    }

    public void setTracks(int tracks) {
        this.tracks = tracks;
    }
    
    @Override
    public String toString(){
        return this.artist + ": " + this.album;
    }
    
}
