package designpatterns.abstract_factory.example.factories;

import designpatterns.abstract_factory.example.buttons.Button;
import designpatterns.abstract_factory.example.checkboxes.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
