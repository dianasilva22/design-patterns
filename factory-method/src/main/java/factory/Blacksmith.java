package factory;

import weapons.Weapon;
import weapons.WeaponType;

public interface Blacksmith {

    Weapon manufactureWeapon(WeaponType weaponType);
}
