package designpatterns.creational.abstract_factory.example.factories;

import designpatterns.creational.abstract_factory.example.buttons.Button;
import designpatterns.creational.abstract_factory.example.checkboxes.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
