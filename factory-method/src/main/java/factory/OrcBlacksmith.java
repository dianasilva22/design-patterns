package factory;

import weapons.OrcWeapon;
import weapons.Weapon;
import weapons.WeaponType;

import java.util.HashMap;
import java.util.Map;

public class OrcBlacksmith implements Blacksmith{

    private static Map<WeaponType, OrcWeapon> ORC_ARSENAL;

    static {
        ORC_ARSENAL = new HashMap<>(WeaponType.values().length);
        for (WeaponType type : WeaponType.values()) {
            ORC_ARSENAL.put(type, new OrcWeapon(type));
        }
    }

    @Override
    public Weapon manufactureWeapon(WeaponType weaponType) {
        return ORC_ARSENAL.get(weaponType);
    }
}
