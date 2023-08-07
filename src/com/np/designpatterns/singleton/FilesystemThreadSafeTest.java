package com.np.designpatterns.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FilesystemThreadSafeTest {


    public static void main(String[] args) {
        testConcurrent();
        test();
    }

    private static void test() {
        FilesystemThreadSafe filesystem = FilesystemThreadSafe.get();
        filesystem.open();
        filesystem.close();

        FilesystemThreadSafe filesystem2 = FilesystemThreadSafe.get();
        filesystem2.open();
        filesystem2.close();
    }

    private static void testConcurrent() {
        ExecutorService executor = Executors.newCachedThreadPool();
        for (int i = 0; i < 8; i++) executor.execute(new FilesystemThreadSafeTest.SingletonTestTask());
    }

    private static class SingletonTestTask implements Runnable {
        @Override
        public void run() {
            FilesystemThreadSafe filesystem = FilesystemThreadSafe.get();
            filesystem.open();
            filesystem.close();
        }
    }
}
