package ru.itsjava.threads.lecture2;

public class ThreadPractice {
    public static void main(String[] args) {

        Runnable anonymousRunnable = new Runnable() { // создаем экземпляр этого класса ()
            //  мы создаем класс, который реализует интерфейс Runnable , переопределяем метод run

            @Override
            public void run() {
                System.out.println("Привет из анонимного класса");
            }
        };

        anonymousRunnable.run();

        Thread thread = new Thread(anonymousRunnable);
        thread.start();


        Runnable functionalRunnable = () -> System.out.println("Привет из функционального программирования");
        new Thread(functionalRunnable).start();


//        new Thread(() -> {
//            for (int i = 0; i < 5; i++) {
//                try {
//                    Thread.sleep(3000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println("Привет из быстрого потока");
//            }
//        }).start();


//        Runnable runnable = () -> {
//            for (int i = 0; i < 5; i++) {
//                System.out.println("Привет после сна в 3 секунды");
//                try {
//                    Thread.sleep(3000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        };
//        Thread thread1 = new Thread(runnable);
//        thread1.setDaemon(false); // не ждём вывполнения потока
//        thread1.start();
//  Создать поток, реализовав интерфейс Runnable (с помощью лямбда выражения) И вывести "Привет я Runnable"
        Runnable hiRunnable = () -> System.out.println("Привет я Runnable");
        new Thread(hiRunnable).start();


        // Создать поток реализовав интерфейс Runnable (с помощью лямбда выражения)
        // Который печатает раз в 4 секунда "Привет я проснулся после 4 секунд" И сделать его демоном.

        Runnable runnable2 = () -> {
            for (int i = 0; i < 12; i++) {
                System.out.println("Привет я проснулся после 4 секунд");
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread2 = new Thread(runnable2);
        thread2.setDaemon(false); //   ждём выполнения потока
        thread2.start();
    }
}

