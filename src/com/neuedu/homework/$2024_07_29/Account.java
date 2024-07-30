package com.neuedu.homework.$2024_07_29;

public class Account {
    /**
     * 账号
     */
    String account;
    /**
     * 余额
     */
    double balance;

    public Account(String account, double balance) {
        this.account = account;
        this.balance = balance;
    }

    public double saveMoney(double money) {
        return balance += money;
    }

    public double getMoney(double money) throws BNEException {
        return balance -= money;
    }
}

class AccountTest {
    public static void main(String[] args) {
        Account account = new Account("admin", 2000);
        try {
            System.out.println("余额是：" + account.saveMoney(600));
            System.out.println("余额是：" + account.getMoney(3000));
            if (account.balance < 0) {
                throw new BNEException("余额不足！");
            }
        } catch (BNEException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
