package org.tadeo.patterns.plainImpl.behavioral.command;

import java.util.Scanner;

/**
 * https://refactoring.guru/design-patterns/command
 */
public class Editor {
    public void init() {
        System.out.println("Enter command and text");
        Scanner in = new Scanner(System.in);
        String command = in.next();
        String text = in.nextLine();
        System.out.println("command: " + command + ", text: " + text);
    }
}
