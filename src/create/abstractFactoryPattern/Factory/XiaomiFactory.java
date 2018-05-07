package create.abstractFactoryPattern.Factory;

import create.abstractFactoryPattern.Product.computer.Computer;
import create.abstractFactoryPattern.Product.phone.Phone;
import create.abstractFactoryPattern.Product.computer.XiaomiComputer;
import create.abstractFactoryPattern.Product.phone.XiaomiPhone;

public class XiaomiFactory extends DigitalFactory {

    @Override
    public Computer createComputer() {
        return new XiaomiComputer();
    }

    @Override
    public Phone createPhone() {
        return new XiaomiPhone();
    }

}
