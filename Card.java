package com.company;
import java.util.Scanner;

public class Card {
    Scanner sc = new Scanner(System.in);
    public void Insert(){
        boolean cycle=true;
        System.out.println("Здравствуйте. Введите номер карты:");
        while (cycle) {
        String CardNumber = sc.nextLine();
        String[] subCardNumber;
        String delimeter = "-";
        subCardNumber = CardNumber.split(delimeter);
            if (subCardNumber.length != 4 || subCardNumber[0].length() != 4 || subCardNumber[1].length() != 4 || subCardNumber[2].length() != 4 || subCardNumber[3].length() != 4)
            {
                System.out.println("Ошибка. Введите верный номер карты:");
            }
            else {
                System.out.println("Верный номер карты.");
                cycle = false;
                }
        }
    }

    public  void PIN() {
        boolean cycle = false;
        int wrongPIN=0;
        System.out.println("Введите PIN-код:");
        while (!cycle) {
            Scanner sc = new Scanner(System.in);
            int PIN=1111;
            int InsertPIN = sc.nextInt();
            if (InsertPIN == PIN) {
                System.out.println("Добро пожаловать.");
                cycle = true;
            }
            else if (wrongPIN == 0) {
                System.out.println("Ошибка. Неверный PIN-код.");
                wrongPIN++;
                System.out.println("Осталось 2 попытки.");
            }
            else if (wrongPIN == 1) {
                System.out.println("Ошибка. Неверный PIN-код.");
                wrongPIN++;
                System.out.println("Осталась 1 попытка.");
            }
            else if (wrongPIN == 2) {
                System.out.println("Вы ввели неверный PIN-код 3 раза. Ваша карта была заблокирована.");
            }
        }
    }
}