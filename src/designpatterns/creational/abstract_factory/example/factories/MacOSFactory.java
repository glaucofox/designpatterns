package designpatterns.creational.abstract_factory.example.factories;

import designpatterns.creational.abstract_factory.example.buttons.Button;
import designpatterns.creational.abstract_factory.example.buttons.MacOSButton;
import designpatterns.creational.abstract_factory.example.checkboxes.Checkbox;
import designpatterns.creational.abstract_factory.example.checkboxes.MacOSCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}

