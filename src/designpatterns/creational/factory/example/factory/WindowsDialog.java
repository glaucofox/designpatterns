package designpatterns.creational.factory.example.factory;

import designpatterns.creational.factory.example.buttons.Button;
import designpatterns.creational.factory.example.buttons.WindowsButton;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
    
}
