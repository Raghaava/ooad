package Strategy2.behavior;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("use Bow & Arrow!");
    }
}
