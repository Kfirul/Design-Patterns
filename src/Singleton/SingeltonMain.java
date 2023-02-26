package Singleton;//Singleton

public class SingeltonMain {
    public static void main(String[] args) {
    PresidentUSA president = PresidentUSA.getInstance();
    System.out.println("The current President of the United States is: " + president.getName());
}
}
