package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class NewsTopic implements NewsPublisher {
    private List<Subscriber> subscribers = new ArrayList<>();

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(String news) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(news);
        }
    }

    // Method to simulate publishing news
    public void publishNews(String news) {
        System.out.println("Publishing news: " + news);
        notifySubscribers(news);
    }
}