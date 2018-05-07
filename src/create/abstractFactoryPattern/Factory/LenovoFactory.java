package create.abstractFactoryPattern.Factory;

import create.abstractFactoryPattern.Product.computer.Computer;
import create.abstractFactoryPattern.Product.computer.LenovoComputer;
import create.abstractFactoryPattern.Product.phone.LenovoPhone;
import create.abstractFactoryPattern.Product.phone.Phone;

public class LenovoFactory extends DigitalFactory {

    @Override
    public Computer createComputer() {
        return new LenovoComputer();
    }

    @Override
    public Phone createPhone() {
        return new LenovoPhone();
    }

}
