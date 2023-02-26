package Observer;

import java.util.Objects;
//Observer
public class Member implements Observer{
    private String notification;

    /**
     * Constructs a new Member object with null notification.
     */
    public Member(){
        this.notification=null;
    }

    /**
     * Returns the notification of this Member.
     * @return the notification of this Member
     */
    public String getNotification() {
        return notification;
    }

    /**
     * Sets the notification of this Member.
     * @param notification the notification to set for this Member
     */
    public void setNotification(String notification) {
        this.notification = notification;
    }

    /**
     * Updates the notification of this Member.
     * @param notification the notification to set for this Member
     */
    @Override
    public void update(String notification) {
        this.notification=new String (notification);
    }
}

