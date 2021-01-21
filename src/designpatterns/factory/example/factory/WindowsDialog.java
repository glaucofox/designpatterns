package designpatterns.factory.example.factory;

import designpatterns.factory.example.buttons.Button;
import designpatterns.factory.example.buttons.WindowsButton;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
    
}
