package observer.display;

public class CurrentConditionsDisplay extends Display{
    @Override
    public void display() {
      System.out.print("Current conditions are ");
      System.out.println(this.temp + "-" + this.humidity + "-" + this.pressure);
    }
}
