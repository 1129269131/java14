package com.koala.java;

/**
 * day02：实用的NullPointerException
 * 使用的NullPointerException的提示
 * 测试：
 *   1、下拉选择 Edit Configurations... --》 Modify options --》 Add VM options
 *   2、输入：-XX:+ShowCodeDetailsInExceptionMessages
 *   3、未执行第二步时运行Feature02.java 进行测试查看
 *   4、执行第二步后运行Feature02.java 进行测试查看
 * Create by koala on 2021-08-15
 */
public class Feature02 {
    public static void main(String[] args) {
        //Bank bank = new Bank(new Customer(new Account(1000)));
        /*
        Exception in thread "main" java.lang.NullPointerException: Cannot invoke
        "com.atguigu.feature.Account.withdraw(double)" because the return value of
        "com.atguigu.feature.Customer.getAccount()" is null
         */
        Bank bank = new Bank(new Customer());

        bank.getCustomer().getAccount().withdraw(200);
    }

}

class Bank {
    private Customer customer;

    public Bank() {
    }

    public Bank(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}

class Customer {
    private Account account;

    public Customer() {
    }

    public Customer(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}

class Account {
    private double balance;//余额

    public Account() {
    }

    public Account(double balance) {
        this.balance = balance;
    }

    //取钱操作
    public void withdraw(double amt) {
        if (balance >= amt) {
            balance -= amt;
            System.out.println("成功取款：" + amt);
        } else {
            System.out.println("余额不足，取款失败");
        }
    }
}
