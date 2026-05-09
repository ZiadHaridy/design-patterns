/**
 * BAD EXAMPLE: A furniture shop that picks each piece by style string.
 *
 * Problems:
 *  1. Adding a new style (Art Deco, Bauhaus) means editing every method.
 *  2. A "modern" chair could be paired with a "victorian" sofa with no warning.
 *  3. Listing a room set repeats the style if/else for every item.
 */
public class FurnitureShop {

    public void displayLivingRoom(String style) {
        // chair
        if (style.equals("modern")) {
            System.out.println("Modern Chair — minimalist steel frame");
        } else if (style.equals("victorian")) {
            System.out.println("Victorian Chair — carved oak, velvet seat");
        }

        // sofa
        if (style.equals("modern")) {
            System.out.println("Modern Sofa — low profile, neutral fabric");
        } else if (style.equals("victorian")) {
            System.out.println("Victorian Sofa — tufted backrest, mahogany legs");
        }

        // table
        if (style.equals("modern")) {
            System.out.println("Modern Table — glass top on chrome legs");
        } else if (style.equals("victorian")) {
            System.out.println("Victorian Table — heavy wood with carved trim");
        }
    }
}
