package org.tadeo.patterns.plainImpl.structural.facade;

import java.io.File;

public class FacadeRun {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        // ...
    }
}
