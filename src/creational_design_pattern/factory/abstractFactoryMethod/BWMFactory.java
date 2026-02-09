package creational_design_pattern.factory.abstractFactoryMethod;

public class BWMFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new BMW();
    }
}
