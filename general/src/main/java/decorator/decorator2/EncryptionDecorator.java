package decorator.decorator2;

public class EncryptionDecorator extends DataSourceDecorator {
    public EncryptionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(Object data) {
        System.out.println("Encrypting data....");
        super.writeData(data);
    }

    @Override
    public Object readData() {
        System.out.println("Decrypting data....");
        return super.readData();
    }
}
