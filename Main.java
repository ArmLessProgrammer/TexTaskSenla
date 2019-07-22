package com.company;
import java.util.Scanner;
import java.io.*;
public class Main {

    public static void main(String[] args) throws Exception {
        float MainCycle = 1;
        Scanner sc = new Scanner(System.in);
        Cycles YesNo = new Cycles();
        Money Balance = new Money();
        Card Visa = new Card();
        Visa.Insert();
        Visa.PIN();
        do {
            File Data = new File("output.txt");
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(Data));
                System.out.println("Выберите действие:\n1 - просмотр баланса карты;\n2 - снять средства со счёта;\n3 - пополнить счёт.");
                int choose = sc.nextInt();
                if (choose == 1) {
                    Balance.Check();
                    MainCycle = YesNo.getSecCycle();
                } else if (choose == 2) {
                    Balance.Withdraw();
                    MainCycle = YesNo.getSecCycle();
                } else if (choose == 3) {
                    Balance.Deposit();
                    MainCycle = YesNo.getSecCycle();
                } else System.out.println("Ошибка. Введите верное число: ");
                writer.write(Balance.getCardBalance()+""+Balance.getATMBalance());
                writer.flush();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } while (MainCycle == 1);
    }
}
