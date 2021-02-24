package Strategy2;

import Strategy2.behavior.WeaponBehavior;

public abstract class Character {
    protected WeaponBehavior weapon;

    protected void fight() {
        weapon.useWeapon();
    }

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
}
