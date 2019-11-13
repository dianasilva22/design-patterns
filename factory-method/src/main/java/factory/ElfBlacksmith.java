package factory;

import weapons.ElfWeapon;
import weapons.Weapon;
import weapons.WeaponType;

import java.util.HashMap;
import java.util.Map;

public class ElfBlacksmith implements Blacksmith{
    private static Map<WeaponType, ElfWeapon> ELF_ARSENAL;

    static {
        ELF_ARSENAL = new HashMap<>(WeaponType.values().length);
        for (WeaponType type : WeaponType.values()) {
            ELF_ARSENAL.put(type, new ElfWeapon(type));
        }
    }

    @Override
    public Weapon manufactureWeapon(WeaponType weaponType) {
        return ELF_ARSENAL.get(weaponType);
    }
}
