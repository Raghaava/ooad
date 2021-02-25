package observer2;

public interface Observer {
    void update(int val);

    void subscribe();

    void unsubscribe();
}
