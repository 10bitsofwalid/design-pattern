package ObserverPattern;

public interface NewsPublisher {
    void addSubscriber(Subscriber subscriber);

    void removeSubscriber(Subscriber subscriber);

    void notifySubscribers(String news);
}