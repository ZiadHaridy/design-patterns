/**
 * Strategy interface — defines the contract for all routing algorithms.
 */
public interface RouteStrategy {

    void buildRoute(String origin, String destination);
}
