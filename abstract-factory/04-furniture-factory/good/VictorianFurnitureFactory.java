public class VictorianFurnitureFactory implements FurnitureFactory {

    @Override public Chair createChair() { return new VictorianChair(); }
    @Override public Sofa  createSofa()  { return new VictorianSofa();  }
    @Override public Table createTable() { return new VictorianTable(); }
}
