/**
 * AbstractFactory — produces a Character + Weapon pair from one era.
 */
public interface WorldFactory {

    Character createCharacter();

    Weapon createWeapon();
}
