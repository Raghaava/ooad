package decorator.decorator2;

public class FileDataSource implements DataSource {
    @Override
    public void writeData(Object data) {
        System.out.println("Writing data to file");
    }

    @Override
    public Object readData() {
        System.out.println("Reading data from file");
        return null;
    }
}
