package Strategy;//Strategy
/**
 * A class representing a Quick Kick action that implements the Kick interface.
 */
public class QuickKick implements Kick{

    private int power;
    private int energy;

    /**
     * Creates a Quick Kick action with the given power.
     *
     * @param power the power of the Quick Kick action.
     */
    public QuickKick(int power){
        this.power=power;
        this.energy=-1*power;
    }

    /**
     * Returns the power of the Quick Kick action.
     *
     * @return the power of the Quick Kick action.
     */
    public int getPower() {
        return power;
    }

    /**
     * Sets the power of the Quick Kick action.
     *
     * @param power the power of the Quick Kick action.
     */
    public void setPower(int power) {
        this.power = power;
    }

    /**
     * Returns the energy lost when performing the Quick Kick action.
     *
     * @return the energy lost when performing the Quick Kick action.
     */
    public int getEnergy() {
        return energy;
    }

    /**
     * Sets the energy lost when performing the Quick Kick action.
     *
     * @param energy the energy lost when performing the Quick Kick action.
     */
    public void setEnergy(int energy) {
        this.energy = energy;
    }

    /**
     * Performs the Quick Kick action and displays the power and energy lost.
     */
    @Override
    public void kick() {
        System.out.println("QuickKick power:" + power);
        System.out.println("You lost : "+energy +" energy");
    }
}

