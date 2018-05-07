package create.factoryMethodPattern.method1.factory;

import create.factoryMethodPattern.method1.button.Button;
import create.factoryMethodPattern.method1.button.WinButton;

public class WinButtonFactory extends ButtonFactory {

    public Button createButton() {
        return new WinButton();
    }

}
