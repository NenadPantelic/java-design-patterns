package com.np.designpatterns.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FilesystemEagerInitTest {

    public static void main(String[] args) {
        testConcurrent();
        test();
    }

    private static void test() {
        FilesystemEagerInit filesystem = FilesystemEagerInit.get();
        filesystem.open();
        filesystem.close();

        FilesystemEagerInit filesystem2 = FilesystemEagerInit.get();
        filesystem2.open();
        filesystem2.close();
    }

    private static void testConcurrent() {
        ExecutorService executor = Executors.newCachedThreadPool();
        for (int i = 0; i < 8; i++) executor.execute(new FilesystemEagerInitTest.SingletonTestTask());
    }

    private static class SingletonTestTask implements Runnable {
        @Override
        public void run() {
            FilesystemEagerInit filesystem = FilesystemEagerInit.get();
            filesystem.open();
            filesystem.close();
        }
    }
}
