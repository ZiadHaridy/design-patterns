/**
 * Client — uses Character and Weapon abstractions only.
 * Era is chosen once when the WorldFactory is selected.
 */
public class Game {

    private final Character character;
    private final Weapon weapon;

    public Game(WorldFactory factory) {
        this.character = factory.createCharacter();
        this.weapon = factory.createWeapon();
    }

    public void playRound() {
        character.describe();
        weapon.use();
        System.out.println("Begin round!");
    }
}
