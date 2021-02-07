package designpatterns.structural.bridge.example.remotes;

import designpatterns.structural.bridge.example.devices.Device;

public class AdvancedRemote  extends BasicRemote
{
    public AdvancedRemote(Device device)
    {
        super.device = device;
    }

    public void mute()
    {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}
