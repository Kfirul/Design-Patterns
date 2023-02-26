package Strategy;//Strategy

public class StrategyMain {
    public static void main(String[] args) {

        Kick quickKick = new QuickKick(10);
        Kick doubleKick = new DoubleKick(8);

        Fighter julian = new Fighter(quickKick);
        Fighter frizen = new Fighter(doubleKick);

        julian.kick();
        frizen.kick();

        frizen.setKick(quickKick);
        frizen.kick();
    }
}