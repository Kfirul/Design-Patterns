package Observer;//Observer

/**
 * The Observer interface defines the contract for objects that should be
 * notified of changes in the state of a subject they are observing.
 */
public interface Observer {

    /**
     * Update the observer with new information from the subject.
     *
     * @param s the new information from the subject
     */
    public void update(String s);
}

