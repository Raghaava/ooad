package observer2;

public class Mouse implements Observer {

    private final Subject subject;

    public Mouse(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void update(int newValue) {
        System.out.println(newValue+newValue);
    }

    public void subscribe() {
        subject.registerObserver(this);
    }

    public void unsubscribe() {
        subject.removeObserver(this);
    }
}
