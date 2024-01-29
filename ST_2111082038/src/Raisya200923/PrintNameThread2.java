/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Raisya200923;

/**
 *
 * @author ACER
 */

class PrintNameThread2 implements Runnable {
    Thread thread;

    PrintNameThread2(String name) {
        thread = new Thread(this, name);
        thread.start();
    }

    public void run() {
        String name = thread.getName();
        for (int i = 0; i < 100; i++) {
            System.out.print(name);
        }
    }
}

class TestThread2 {
    public static void main(String args[]) {
        new PrintNameThread2("A");
        new PrintNameThread2("B");
        new PrintNameThread2("C");
        new PrintNameThread2("D");
    }
}
