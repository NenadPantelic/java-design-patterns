package com.np.designpatterns.singleton;

public class FilesystemThreadSafe {

    private static FilesystemThreadSafe filesystem;

    private FilesystemThreadSafe() {
        System.out.println("Creating a thread-safe filesystem instance");
    }

    // all threads entering here will acquire a lock
    public synchronized static FilesystemThreadSafe get() {
        if (filesystem == null) {
            filesystem = new FilesystemThreadSafe();
        }

        System.out.println("[DEBUG] Thread-safe filesystem instance: " + filesystem);
        return filesystem;
    }

    public void open() {
        System.out.println("Open a file");
    }

    public void close() {
        System.out.println("Close a file");
    }
}
