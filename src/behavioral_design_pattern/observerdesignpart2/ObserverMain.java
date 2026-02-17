package behavioral_design_pattern.observerdesignpart2;

public class ObserverMain {
    public static void main(String[] args) {
        Channel channel = new Channel("VK Tech Guru");
        Subscriber subscriber1 = new Subscriber("Alice", channel);
        Subscriber subscriber2 = new Subscriber("Bob", channel);

        channel.subscribe(subscriber1);
        channel.subscribe(subscriber2);

        channel.uploadVideo("Observer Design Pattern in Java");

        channel.unSubscribe(subscriber2);

        channel.uploadVideo("Decorator Design Pattern in Java");

    }
}
