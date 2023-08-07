package com.np.designpatterns.singleton;


// not thread-safe
public class Filesystem {

    private static Filesystem filesystem;

    private Filesystem() {
        System.out.println("Creating a filesystem instance");
    }

    public  static Filesystem get() {
        if (filesystem == null) {
            filesystem = new Filesystem();
        }

        System.out.println("[DEBUG] Filesystem instance: " + filesystem);
        return filesystem;
    }

    public void open() {
        System.out.println("Open a file");
    }

    public void close() {
        System.out.println("Close a file");
    }
}
