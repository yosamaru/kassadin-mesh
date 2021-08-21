package com.yosamaru.lock;

public class RnEnterLockDemo {
    public void method() {
        synchronized (this) {
            System.out.println("start");
        }
    }

    public static void main(String[] args) {
        new RnEnterLockDemo().method();
    }
}