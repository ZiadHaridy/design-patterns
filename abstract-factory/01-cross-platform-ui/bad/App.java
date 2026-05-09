/**
 * BAD EXAMPLE: An app that builds a UI from concrete platform widgets
 * by switching on a string. Worse — nothing prevents accidentally mixing
 * a Windows button with a Mac checkbox.
 *
 * Problems:
 *  1. Every render path duplicates the platform if/else.
 *  2. Adding a Linux look-and-feel means editing this method.
 *  3. The platform "family" can be silently broken (mac button + windows checkbox)
 *     because there's no enforcement.
 */
public class App {

    public void renderForm(String platform) {
        // button
        if (platform.equals("windows")) {
            System.out.println("[Windows] paint button — square corners, blue accent");
        } else if (platform.equals("mac")) {
            System.out.println("[Mac] paint button — rounded corners, gray gradient");
        }

        // checkbox
        if (platform.equals("windows")) {
            System.out.println("[Windows] paint checkbox — square box, ✔ on click");
        } else if (platform.equals("mac")) {
            System.out.println("[Mac] paint checkbox — rounded box, blue ✔");
        }
    }
}
