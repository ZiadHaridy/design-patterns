/**
 * BAD EXAMPLE: A Game class that hardcodes characters and weapons by era.
 *
 * Problems:
 *  1. Adding a new era (Cyberpunk, Wild West) means editing every spawn method.
 *  2. The game can mix a Knight (medieval) with a LaserRifle (sci-fi) — there's
 *     no enforcement of internal consistency.
 *  3. The "play one round" workflow is muddled with creation logic.
 */
public class Game {

    public void playRound(String era) {
        // spawn character
        if (era.equals("medieval")) {
            System.out.println("Spawn Knight (sword skills, plate armor)");
        } else if (era.equals("scifi")) {
            System.out.println("Spawn Space Marine (energy shields, EVA suit)");
        }

        // give weapon
        if (era.equals("medieval")) {
            System.out.println("Equip Sword (slash, parry)");
        } else if (era.equals("scifi")) {
            System.out.println("Equip Laser Rifle (high-energy shots)");
        }

        System.out.println("Begin round!");
    }
}
