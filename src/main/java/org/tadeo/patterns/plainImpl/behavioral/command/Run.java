package org.tadeo.patterns.plainImpl.behavioral.command;

/**
 * https://refactoring.guru/design-patterns/command
 */
public class Run {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new HelloCommand(receiver);
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.run();
    }
}
