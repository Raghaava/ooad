package decorator.decorator2;

public class DataSourceDecorator implements DataSource {
    protected DataSource dataSource;

    public DataSourceDecorator(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void writeData(Object data) {
        dataSource.writeData(data);
    }

    @Override
    public Object readData() {
        return dataSource.readData();
    }
}
