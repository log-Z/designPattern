package create.factoryMethodPattern.method1.factory;

import create.factoryMethodPattern.method1.button.Button;
import create.factoryMethodPattern.method1.button.MacButton;

public class MacButtonFactory extends ButtonFactory {

    public Button createButton() {
        return new MacButton();
    }

}
