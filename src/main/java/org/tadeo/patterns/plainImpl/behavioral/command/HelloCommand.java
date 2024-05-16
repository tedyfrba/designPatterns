package org.tadeo.patterns.plainImpl.behavioral.command;

/**
 * https://refactoring.guru/design-patterns/command
 */
public class HelloCommand implements Command {
    private Receiver receiver;

    public HelloCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.sayHello();
    }
}
