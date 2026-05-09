public interface Transaction {
    boolean execute();
    void rollback();
}
