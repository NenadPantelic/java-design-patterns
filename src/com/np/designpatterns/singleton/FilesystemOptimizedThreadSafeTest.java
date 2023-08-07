package com.np.designpatterns.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FilesystemOptimizedThreadSafeTest {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newCachedThreadPool();
        for (int i = 0; i < 8; i++) executor.execute(new SingletonTestTask());
    }

    private static class SingletonTestTask implements Runnable {
        @Override
        public void run() {
            FilesystemThreadSafeOptimized filesystemThreadSafeOptimized = FilesystemThreadSafeOptimized.get();
            filesystemThreadSafeOptimized.open();
            filesystemThreadSafeOptimized.close();
        }
    }

}
