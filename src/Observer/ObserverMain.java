package Observer;//Observer

public class ObserverMain {
    public static void main(String[] args) {
        YouTubeChannel channel = new YouTubeChannel();
        Member member1 = new Member();
        Member member2 = new Member();
        Member member3 = new Member();

        channel.addObserver(member1);
        channel.addObserver(member2);
        channel.addObserver(member3);

        channel.setNewVideo("New video uploaded!");
        channel.notifyObserver();

        System.out.println("Notification for member 1: " + member1.getNotification());
        System.out.println("Notification for member 2: " + member2.getNotification());
        System.out.println("Notification for member 3: " + member3.getNotification());

        channel.removeObserver(member2);
        channel.setNewVideo("Another new video uploaded!");
        channel.notifyObserver();

        System.out.println("Notification for member 1: " + member1.getNotification());
        System.out.println("Notification for member 2: " + member2.getNotification());
        System.out.println("Notification for member 3: " + member3.getNotification());
    }


    }
