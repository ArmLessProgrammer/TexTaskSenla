package com.company;
import java.util.Scanner;

public class Money {

        public int CardBalance = 2351820;
        public int ATMBalance = 754560;
        private Scanner sc = new Scanner(System.in);
        Cycles CycleCheck = new Cycles();
        Cycles CycleWithdraw = new Cycles();
        Cycles CycleDeposit = new Cycles();

    public int getCardBalance() {
        return CardBalance;
    }

    public int getATMBalance() {
        return ATMBalance;
    }

    public void Check() {
            System.out.println("Баланс Вашей карты: " + CardBalance + " рублей.\nЖелаете продолжить? Y/N");
            CycleCheck.YN();
            }

        public void Withdraw(){
            boolean cycle = true;
            System.out.println("Выберите, сколько Вы хотите снять:");
                while (cycle) {
                    int withdraw = sc.nextInt();
                    if (withdraw > CardBalance) {
                        System.out.println("Ошибка: на балансе недостаточно средств, чтобы снять данную сумму. Введите корректную сумму:");
                    } else if (withdraw > ATMBalance) {
                        System.out.println("Ошибка: в банкомате недостаточно средств, чтобы снять данную сумму. Введите корректную сумму:");
                    } else {
                        System.out.println("Вы сняли " + withdraw + " р. Желаете продолжить? Y/N");
                        CardBalance = CardBalance - withdraw;
                        cycle = false;
                        CycleWithdraw.YN();
                    }
                }
        }

        public void Deposit() {
            boolean cycle = true;
            System.out.println("Выберите, на сколько Вы хотите поплнить баланс:");
            while (cycle) {
                int deposit = sc.nextInt();
                if (deposit > 1000000)
                    System.out.println("Сумма пополнения не должна превышать 1 000 000. Пожалуйста, внесите верный депозит:");
                else {
                    CardBalance = CardBalance + deposit;
                    System.out.println("Вы пополнили баланс на "+deposit+" р. Желаете продолжить? Y/N");
                    cycle = false;
                    CycleDeposit.YN();
                }
            }
        }
}