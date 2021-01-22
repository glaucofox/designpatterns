package designpatterns.abstract_factory.example.app;

import designpatterns.abstract_factory.example.buttons.Button;
import designpatterns.abstract_factory.example.checkboxes.Checkbox;
import designpatterns.abstract_factory.example.factories.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }

}
