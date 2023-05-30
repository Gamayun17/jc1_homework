package prack8.practl57;

import java.util.Objects;
import java.util.concurrent.locks.Lock;

public class Main {
    public static void main(String[] args) {

            final Object lock1 = new Object();
            final Object lock2 = new Object();
            final Object lock3 = new Object();


            Thread thread1 = new Thread() {
                public void run() {
                    synchronized (lock1) {
                        System.out.println("Thread1 locked lock1: " + lock1);
                        try {
                            Thread.sleep(2000);
                        } catch (Exception e) {
                            System.out.println(e);
                        }
                        synchronized (lock2) {
                            System.out.println("Thread2 locked lock2: " + lock2);
                        }
                        synchronized (lock3) {
                            System.out.println("Thread2 locked lock3: " + lock3);
                        }
                    }
                }
            };

            Thread thread2 = new Thread() {
                public void run() {
                    synchronized (lock2) {
                        System.out.println("Thread1 locked lock2: " + lock2);
                        try {
                            Thread.sleep(2000);
                        } catch (Exception e) {
                            System.out.println(e);
                        }
                        synchronized (lock1) {
                            System.out.println("Thread2 locked lock1: " + lock1);
                        }
                        synchronized (lock3) {
                            System.out.println("Thread2 locked lock3: " + lock3);
                        }
                    }
                }
            };

            Thread thread3 = new Thread() {
                public void run() {

                    synchronized (lock3) {
                        System.out.println("Thread1 locked lock3: " + lock3);
                        try {
                            Thread.sleep(2000);
                        } catch (Exception e) {
                            System.out.println(e);
                        }
                        synchronized (lock1) {
                            System.out.println("Thread2 locked lock1: " + lock1);
                        }
                        synchronized (lock2) {
                            System.out.println("Thread2 locked lock2: " + lock2);
                        }
                    }
                }
            };

            thread1.start();
            thread2.start();
            thread3.start();

        }
    }