package com.np.designpatterns.singleton;


public class FilesystemEagerInit {

    private static final FilesystemEagerInit filesystem = new FilesystemEagerInit();

    private FilesystemEagerInit() {
        System.out.println("Creating an eager-init filesystem instance");
    }

    public static FilesystemEagerInit get() {
        System.out.println("[DEBUG] Eager-init filesystem instance: " + filesystem);
        return filesystem;
    }

    public void open() {
        System.out.println("Open a file");
    }

    public void close() {
        System.out.println("Close a file");
    }
}
