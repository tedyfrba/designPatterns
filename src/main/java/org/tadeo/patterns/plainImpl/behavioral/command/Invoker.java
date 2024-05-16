package org.tadeo.patterns.plainImpl.behavioral.command;

/**
 * https://refactoring.guru/design-patterns/command
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void run() {
        command.execute();
    }
}
