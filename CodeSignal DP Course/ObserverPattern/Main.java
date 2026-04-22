package ObserverPattern;

public class Main {
    public static void main(String[] args) {
        NewsTopic newsTopic = new NewsTopic();

        Subscriber subscriber1 = new NewsSubscriber("Subscriber 1");
        Subscriber subscriber2 = new NewsSubscriber("Subscriber 2");

        newsTopic.addSubscriber(subscriber1);
        newsTopic.addSubscriber(subscriber2);

        newsTopic.publishNews("Breaking News 1");
        newsTopic.removeSubscriber(subscriber1);
        newsTopic.publishNews("Breaking News 2");
    }
}