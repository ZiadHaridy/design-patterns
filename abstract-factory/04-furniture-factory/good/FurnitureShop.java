/**
 * Client — assembles a living room from one factory. Style is consistent by construction.
 */
public class FurnitureShop {

    private final Chair chair;
    private final Sofa sofa;
    private final Table table;

    public FurnitureShop(FurnitureFactory factory) {
        this.chair = factory.createChair();
        this.sofa = factory.createSofa();
        this.table = factory.createTable();
    }

    public void displayLivingRoom() {
        chair.show();
        sofa.show();
        table.show();
    }
}
