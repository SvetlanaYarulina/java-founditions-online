package ru.itsjava.threads.lecture3;

import lombok.SneakyThrows;

public class ThreadPractice {
    public static void main(String[] args) throws InterruptedException {
//        Object obj = new Object();
//
//        synchronized (obj) {
//            obj.notify();
//        }


        ThreadPractice threadPractice = new ThreadPractice();
        MyThread thread1 = new MyThread(1, threadPractice);
        MyThread thread2 = new MyThread(2, threadPractice);
        MyThread thread3 = new MyThread(3, threadPractice);

        thread1.start();
        thread2.start();
        thread3.start();
        // потоки выполняются не синхронно


//        Thread.currentThread().join();  // Deadlock - взаимная блокировка - мы ждём пока мы сами завершимся

    }

    @SneakyThrows
    public synchronized void printNum(int num) {
//        synchronized (this) { // синхронизация по тому же объекту, на который вызываем метод wait
        System.out.println("Begin " + num);
        this.wait(3000); //this - статический метод
//        Thread.sleep(3000);
        System.out.println("End " + num);
//        }
    }

}

