public class SciFiWorldFactory implements WorldFactory {

    @Override
    public Character createCharacter() {
        return new SpaceMarine();
    }

    @Override
    public Weapon createWeapon() {
        return new LaserRifle();
    }
}
