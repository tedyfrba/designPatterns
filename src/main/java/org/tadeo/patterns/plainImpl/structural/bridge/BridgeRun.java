package org.tadeo.patterns.plainImpl.structural.bridge;

import org.tadeo.patterns.plainImpl.structural.bridge.remotes.AdvancedRemote;
import org.tadeo.patterns.plainImpl.structural.bridge.remotes.BasicRemote;
import org.tadeo.patterns.plainImpl.structural.bridge.devices.Device;
import org.tadeo.patterns.plainImpl.structural.bridge.devices.Radio;
import org.tadeo.patterns.plainImpl.structural.bridge.devices.TV;

/** from
 * https://refactoring.guru/design-patterns/bridge
 *
 * divides business logic or huge class into separate class hierarchies that can be developed independently
 */
public class BridgeRun {
    public static void main(String[] args) {
        testDevice(new TV());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}