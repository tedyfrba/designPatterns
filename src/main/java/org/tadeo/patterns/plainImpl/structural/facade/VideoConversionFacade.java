package org.tadeo.patterns.plainImpl.structural.facade;

import org.tadeo.patterns.plainImpl.structural.facade.someComplexLib.AudioMixer;
import org.tadeo.patterns.plainImpl.structural.facade.someComplexLib.BitrateReader;
import org.tadeo.patterns.plainImpl.structural.facade.someComplexLib.Codec;
import org.tadeo.patterns.plainImpl.structural.facade.someComplexLib.OggCompressionCodec;
import org.tadeo.patterns.plainImpl.structural.facade.someComplexLib.VideoFile;
import org.tadeo.patterns.plainImpl.structural.facade.someComplexLib.CodecFactory;
import org.tadeo.patterns.plainImpl.structural.facade.someComplexLib.MPEG4CompressionCodec;

import java.io.File;

/**
 * Facade provides simple interface of video conversion
 */
public class VideoConversionFacade {
    public File convertVideo(String fileName, String format) {
        System.out.println("VideoConversionFacade: conversion started.");
        VideoFile file = new VideoFile(fileName);
        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec;
        if (format.equals("mp4")) {
            destinationCodec = new MPEG4CompressionCodec();
        } else {
            destinationCodec = new OggCompressionCodec();
        }
        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
        File result = (new AudioMixer()).fix(intermediateResult);
        System.out.println("VideoConversionFacade: conversion completed.");
        return result;
    }
}