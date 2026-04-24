public class MedievalWorldFactory implements WorldFactory {

    @Override
    public Character createCharacter() {
        return new Knight();
    }

    @Override
    public Weapon createWeapon() {
        return new Sword();
    }
}
