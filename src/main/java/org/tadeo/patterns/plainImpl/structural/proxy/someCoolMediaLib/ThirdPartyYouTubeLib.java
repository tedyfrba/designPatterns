package org.tadeo.patterns.plainImpl.structural.proxy.someCoolMediaLib;

import java.util.HashMap;

/**
 * Remote service interface
 */
public interface ThirdPartyYouTubeLib {
    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}