package Observer;//Observer

/**
 * The Observable interface defines the methods required for an object to be observable,
 * that is, for other objects to be able to subscribe and receive notifications when
 * certain events occur.
 */
public interface Observerable {
    /**
     * Adds a new observer to the list of observers for this observable object.
     * @param o the observer to be added
     */
    public void addObserver(Observer o);
    /**
     * Removes an observer from the list of observers for this observable object.
     * @param o the observer to be removed
     */
    public void removeObserver(Observer o);
    /**
     * Notifies all observers that the observable object has changed.
     */
    public void notifyObserver();
}
