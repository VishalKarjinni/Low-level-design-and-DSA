package creational_design_pattern.factory.abstractFactoryMethod;

public class HondaFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new Honda();
    }
}
