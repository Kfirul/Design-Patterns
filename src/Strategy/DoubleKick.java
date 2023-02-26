package Strategy;//Strategy
/**
 * The DoubleKick class is an implementation of the {@link Kick} interface
 * that represents a kick with twice the power of a regular kick, at the cost of double the energy.
 */
public class DoubleKick implements Kick {

    /**
     * The power of the double kick.
     */
    private int power;

    /**
     * The amount of energy lost when performing the double kick.
     */
    private int energy;

    /**
     * Constructs a new {@link DoubleKick} with the specified power.
     * The energy lost when performing the double kick is set to -2 times the power.
     * @param power the power of the double kick.
     */
    public DoubleKick(int power){
        this.power = power;
        this.energy = -2 * power;
    }

    /**
     * Returns the power of the double kick.
     * @return the power of the double kick.
     */
    public int getPower() {
        return power;
    }

    /**
     * Sets the power of the double kick.
     * @param power the power of the double kick.
     */
    public void setPower(int power) {
        this.power = power;
    }

    /**
     * Returns the amount of energy lost when performing the double kick.
     * @return the amount of energy lost when performing the double kick.
     */
    public int getEnergy() {
        return energy;
    }

    /**
     * Sets the amount of energy lost when performing the double kick.
     * @param energy the amount of energy lost when performing the double kick.
     */
    public void setEnergy(int energy) {
        this.energy = energy;
    }

    /**
     * Performs the double kick, printing out the power and amount of energy lost.
     */
    @Override
    public void kick() {
        System.out.println("DoubleKick power: " + power);
        System.out.println("You lost: " + energy + " energy");
    }
}


