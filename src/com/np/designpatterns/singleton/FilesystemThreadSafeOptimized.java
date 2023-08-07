package com.np.designpatterns.singleton;

public class FilesystemThreadSafeOptimized {

    private static volatile FilesystemThreadSafeOptimized filesystem;

    private FilesystemThreadSafeOptimized() {
        System.out.println("Creating an optimized thread-safe filesystem instance");
    }

    // only the first time the object null we will have the synchronized init, all later accesses to this block will not
    // do synchronized init which will reduce the overhead
    public synchronized static FilesystemThreadSafeOptimized get() {
        // To make thread safe
        if (filesystem == null) {
            synchronized (FilesystemThreadSafeOptimized.class) {
                // check again as multiple threads can reach above step;
                // Ensure that the instance hasn't yet been initialized by another thread while this one
                // has been waiting for the lock's release.
                if (filesystem == null) {
                    filesystem = new FilesystemThreadSafeOptimized();
                }
            }
        }

        System.out.println("[DEBUG] Optimized thread-safe filesystem instance: " + filesystem);
        return filesystem;
    }

    public void open() {
        System.out.println("Open a file");
    }

    public void close() {
        System.out.println("Close a file");
    }
}
