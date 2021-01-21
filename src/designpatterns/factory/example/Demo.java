package designpatterns.factory.example;

import designpatterns.factory.example.factory.Dialog;
import designpatterns.factory.example.factory.HtmlDialog;
import designpatterns.factory.example.factory.WindowsDialog;

/**
 * Demo class. Everything comes together here.
 */
public class Demo {
    private static Dialog dialog;
    
    public static void main(String[] args) {
        configure();
        bussinessLogic();
    }

    /**
     * The concrete factory is usually chosen depending on configuration or
     * environment options.
     */
    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }
    
    /**
     * All of the client code should work with factories and products through
     * abstract interfaces. This way it does not care which factory it works
     * with and what kind of product it returns.
     */
    static void bussinessLogic() {
        dialog.renderWindow();
    }

}
