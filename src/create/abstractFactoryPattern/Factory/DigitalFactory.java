package create.abstractFactoryPattern.Factory;

import create.abstractFactoryPattern.Product.computer.Computer;
import create.abstractFactoryPattern.Product.phone.Phone;

abstract class DigitalFactory {

    public abstract Computer createComputer();

    public abstract Phone createPhone();

}
