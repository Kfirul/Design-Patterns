package Singleton;//Singleton

public class PresidentUSA {
  private static volatile PresidentUSA instance;
  private String name;

    private PresidentUSA(){
        name=null;
    };

    public static PresidentUSA getInstance() {
        if(instance==null){
            synchronized(PresidentUSA.class){
                if(instance==null){
                    instance=new PresidentUSA();
                }
            }
        }
        return instance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
