package decorator.decorator2;

public class CompressionDecorator extends DataSourceDecorator {
    public CompressionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(Object data) {
        System.out.println("Compressing data....");
        super.writeData(data);
    }

    @Override
    public Object readData() {
        System.out.println("Decompressing data....");
        return super.readData();
    }
}
