package org.tadeo.patterns.plainImpl.structural.decorator;

/**
 * A common data interface, which defines read and write operations
 */
public interface DataSource {
    void writeData(String data);

    String readData();
}