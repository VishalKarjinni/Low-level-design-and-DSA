package multi_threading.simulation_thread;

public class RestaurantSimulation {
    public static void main(String[] args) {
        Object lock = new Object();
        WaiterThread waiterThread = new WaiterThread(lock);
        ChefThread chefThread = new ChefThread(lock);

        waiterThread.start();
        chefThread.start();
    }
}
