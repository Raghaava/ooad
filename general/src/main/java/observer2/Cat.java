package observer2;

public class Cat implements Observer {

    private final Subject subject;

    public Cat(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void update(int newValue) {
        System.out.println(newValue);
    }

    @Override
    public void subscribe() {
        subject.registerObserver(this);
    }

    @Override
    public void unsubscribe() {
        subject.removeObserver(this);
    }
}
