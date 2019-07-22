package com.company;
import java.util.Scanner;

public class Cycles {
    private boolean cycle = true;
    private String cont;
    public int SecCycle = 1;
    Scanner sc = new Scanner(System.in);


    public float getSecCycle () {
        return SecCycle;
    }

    public void YN () {
        while (cycle) {
            cont = sc.nextLine();
            if (cont.equalsIgnoreCase("N")) {
                SecCycle = 2;
                System.out.println("Спасибо за работу. Хорошего дня!");
                break;
            }
            else if (cont.equalsIgnoreCase("Y")) {
                SecCycle = 1;
                cycle = false;}
            else System.out.println("Ошибка. Введите верное выражение: ");
        }
    }
}