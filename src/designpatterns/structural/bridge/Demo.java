package designpatterns.structural.bridge;

import designpatterns.structural.bridge.example.devices.Device;
import designpatterns.structural.bridge.example.devices.Radio;
import designpatterns.structural.bridge.example.devices.Tv;
import designpatterns.structural.bridge.example.remotes.AdvancedRemote;
import designpatterns.structural.bridge.example.remotes.BasicRemote;

public class Demo 
{
    public static void main(String[] args)
    {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device)
    {
        System.out.println("Tests with basic remote");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }

}
