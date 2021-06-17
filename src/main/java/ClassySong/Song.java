package ClassySong;

import java.util.ArrayList;
import java.util.List;

public class Song {

    private String title;
    private String artist;
    private List<String> listeners = new ArrayList<>();

    public  Song (String title, String artist){
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int howMany(List<String> newListeners) {
        int newListenersCounter = 0;

        for (var listener : newListeners)
            if (!containsIgnoreCase(listener)){
                listeners.add(listener);
                newListenersCounter++;
            }

        return newListenersCounter;

    }

    public boolean containsIgnoreCase(String newListener) {
        for (var listener : listeners)
            if (newListener.toLowerCase().equals(listener.toLowerCase()))
                return true;

        return false  ;
    }

    public int howManyV2(ArrayList<String> names) {
        int oldLength = listeners.size();
        names.forEach(name -> listeners.add(name.toLowerCase()));
        return listeners.size()-oldLength;
    }

    public int howManyV3(List<String> people) {
        final int before = listeners.size();
        listeners.addAll(people);
        return listeners.size()-before;
    }

}
