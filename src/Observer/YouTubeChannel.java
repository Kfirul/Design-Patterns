package Observer;

import java.util.ArrayList;
//Observer

/**
 * A class representing a YouTube channel that can be observed by its subscribers.
 */
public class YouTubeChannel implements Observerable{

    /**
     * The title of the channel's latest video.
     */
    private String newVideo;

    /**
     * A list of subscribers to the channel.
     */
    private ArrayList<Observer> membersArr;

    /**
     * Creates a new YouTube channel with no subscribers and no latest video.
     */
    public YouTubeChannel(){
        this.newVideo=null;
        this.membersArr=new ArrayList<Observer>();
    }

    /**
     * Adds a new subscriber to the channel.
     * @param o the observer to add to the list of subscribers.
     */
    @Override
    public void addObserver(Observer o) {
        membersArr.add(o);
    }

    /**
     * Removes a subscriber from the channel.
     * @param o the observer to remove from the list of subscribers.
     */
    @Override
    public void removeObserver(Observer o) {
        membersArr.remove(o);
    }

    /**
     * Notifies all subscribers of the channel that a new video has been uploaded.
     */
    @Override
    public void notifyObserver() {
        for(Observer obs:membersArr){
            obs.update(newVideo);
        }
    }

    /**
     * Gets the title of the channel's latest video.
     * @return the title of the latest video.
     */
    public String getNewVideo() {
        return newVideo;
    }

    /**
     * Sets the title of the channel's latest video.
     * @param newVideo the title of the latest video.
     */
    public void setNewVideo(String newVideo) {
        this.newVideo = newVideo;
    }

    /**
     * Gets the list of subscribers to the channel.
     * @return the list of subscribers to the channel.
     */
    public ArrayList<Observer> getMembersArr() {
        return membersArr;
    }

    /**
     * Sets the list of subscribers to the channel.
     * @param membersArr the list of subscribers to the channel.
     */
    public void setMembersArr(ArrayList<Observer> membersArr) {
        this.membersArr = membersArr;
    }
}

