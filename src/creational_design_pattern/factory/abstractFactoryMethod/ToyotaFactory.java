package creational_design_pattern.factory.abstractFactoryMethod;

public class ToyotaFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new Toyota();
    }
}
