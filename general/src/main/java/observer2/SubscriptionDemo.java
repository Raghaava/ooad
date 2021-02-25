package observer2;


public class SubscriptionDemo {
    public static void main(String... args) {
        Subject subject = new ConcreteSubject();

        Observer observer1 = new Cat(subject);
        Observer observer2 = new Mouse(subject);

        observer1.subscribe();
        subject.notifyObservers(10);

        observer2.subscribe();
        subject.notifyObservers(20);

        observer1.unsubscribe();
        subject.notifyObservers(30);
    }
}
