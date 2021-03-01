package decorator.decorator2;

public interface DataSource {
    void writeData(Object data);
    Object readData();
}
