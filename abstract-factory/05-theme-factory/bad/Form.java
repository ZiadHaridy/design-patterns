/**
 * BAD EXAMPLE: A form that picks colors and styles based on a theme string.
 *
 * Problems:
 *  1. Every widget reads the theme variable. Half the form could be light
 *     and half could be dark if any branch is forgotten.
 *  2. Adding a "high-contrast" theme means editing every render method.
 *  3. Theme rules (background, text, border) live scattered in the form.
 */
public class Form {

    public void render(String theme) {
        // button
        if (theme.equals("light")) {
            System.out.println("Button: bg=#FFFFFF text=#000000 border=#CCCCCC");
        } else if (theme.equals("dark")) {
            System.out.println("Button: bg=#202020 text=#EEEEEE border=#444444");
        }

        // text field
        if (theme.equals("light")) {
            System.out.println("TextField: bg=#FFFFFF text=#000000 placeholder=#999999");
        } else if (theme.equals("dark")) {
            System.out.println("TextField: bg=#1A1A1A text=#EEEEEE placeholder=#777777");
        }
    }
}
