/**
 * AbstractFactory — produces a coordinated chair + sofa + table set.
 */
public interface FurnitureFactory {

    Chair createChair();

    Sofa createSofa();

    Table createTable();
}
