package observer;

public interface Observer {
    void update(int temp, int humidity, int pressure);

    void subscribe();

    void unsubscribe();
}
