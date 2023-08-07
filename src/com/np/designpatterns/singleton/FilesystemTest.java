package com.np.designpatterns.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FilesystemTest {

    public static void main(String[] args) {
        testConcurrent(); // two instances are made
        test();
    }

    private static void test() {
        Filesystem filesystem = Filesystem.get();
        filesystem.open();
        filesystem.close();

        Filesystem filesystem2 = Filesystem.get();
        filesystem2.open();
        filesystem2.close();
    }

    private static void testConcurrent() {
        ExecutorService executor = Executors.newCachedThreadPool();
        for (int i = 0; i < 8; i++) executor.execute(new FilesystemTest.SingletonTestTask());
    }

    private static class SingletonTestTask implements Runnable {
        @Override
        public void run() {
            Filesystem filesystem = Filesystem.get();
            filesystem.open();
            filesystem.close();
        }
    }
}
