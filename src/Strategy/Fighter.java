package Strategy;//Strategy

/**
 * A class representing a fighter who can kick with different techniques.
 */
public class Fighter {
    private Kick kick;

    /**
     * Creates a new fighter with the given kick technique.
     *
     * @param kick the kick technique of the fighter.
     */
    public Fighter(Kick kick) {
        this.kick = kick;
    }

    /**
     * Kicks the opponent with the fighter's kick technique.
     */
    public void kick() {
        kick.kick();
    }

    /**
     * Sets the kick technique of the fighter to the given technique.
     *
     * @param kick the new kick technique of the fighter.
     */
    public void setKick(Kick kick) {
        this.kick = kick;
    }
}

