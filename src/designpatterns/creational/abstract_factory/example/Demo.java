package designpatterns.creational.abstract_factory.example;

import designpatterns.creational.abstract_factory.example.app.Application;
import designpatterns.creational.abstract_factory.example.factories.GUIFactory;
import designpatterns.creational.abstract_factory.example.factories.MacOSFactory;
import designpatterns.creational.abstract_factory.example.factories.WindowsFactory;

/**
 * Demo class. Everything comes together here.
 */
public class Demo {

    /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osname = System.getProperty("os.name").toLowerCase();
        if (osname.contains("mac")) {
            factory = new MacOSFactory();
            app = new Application(factory);
        } else {
            factory = new WindowsFactory();
            app = new Application(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
