package org.tadeo.patterns.plainImpl.structural.proxy;

import org.tadeo.patterns.plainImpl.structural.proxy.downloader.YouTubeDownloader;
import org.tadeo.patterns.plainImpl.structural.proxy.proxy.YouTubeCacheProxy;
import org.tadeo.patterns.plainImpl.structural.proxy.someCoolMediaLib.ThirdPartyYouTubeClass;

/**
 * https://refactoring.guru/design-patterns/proxy
 *
 * provides an object that acts as a substitute for a real service object used by a client
 *
 */
public class ProxyRun {
    public static void main(String[] args) {
        YouTubeDownloader naiveDownloader = new YouTubeDownloader(new ThirdPartyYouTubeClass());
        YouTubeDownloader smartDownloader = new YouTubeDownloader(new YouTubeCacheProxy());

        long naive = test(naiveDownloader);
        long smart = test(smartDownloader);
        System.out.print("Time saved by caching proxy: " + (naive - smart) + "ms");

    }

    private static long test(YouTubeDownloader downloader) {
        long startTime = System.currentTimeMillis();

        // User behavior in our app:
        downloader.renderPopularVideos();
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("dancesvideoo");
        // Users might visit the same page quite often.
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderVideoPage("someothervid");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.print("Time elapsed: " + estimatedTime + "ms\n");
        return estimatedTime;
    }
}
