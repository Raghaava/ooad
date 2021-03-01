package decorator.decorator2;


public class DataManager {
    public static void main(String... args) {
        DataSource dataSource = new CompressionDecorator(new FileDataSource());

        dataSource.writeData(null);
        dataSource.readData();
    }
}
