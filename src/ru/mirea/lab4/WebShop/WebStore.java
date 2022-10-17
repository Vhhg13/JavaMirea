package ru.mirea.lab4.WebShop;

import java.util.ArrayList;
import java.util.Scanner;

public class WebStore {
    private ArrayList<Good> goods = new ArrayList<>();
    private ArrayList<Good> cart = new ArrayList<>();

    public void addGoodToStore(Good good) {
        goods.add(good);
    }

    public void addToCart(int ind) {
        int j = 0;
        for (Good i : goods)
            if (++j == ind) {
                cart.add(i);
                goods.remove(i);
                return;
            }
    }

    public void printGoodsList() {
        int j = 1;
        for (Good i : goods)
            System.out.format("%d) %s (%.2f)\n", j++, i, i.getPrice());
    }

    public double getTotal() {
        double res = 0;
        for (Good i : cart) {
            res += i.getPrice();
        }
        return res;
    }

    public int getNumberOfGoods() {
        return goods.size();
    }

    public void printCart() {
        for (Good i : cart)
            System.out.format("%s (%.2f)\n", i.getName(), i.getPrice());
    }

    public boolean authenticate(String login, String passwd) {
        return login.compareTo("user") == 0 && passwd.compareTo("1234") == 0;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WebStore webStore = new WebStore();
        int tries = 0;
        while (tries < 3) {
            System.out.println("Please enter your credentials");
            String login = scanner.nextLine();
            String passwd = scanner.nextLine();
            if (webStore.authenticate(login, passwd))
                break;
            System.out.println("Error logging in!");
            tries++;
        }

        webStore.addGoodToStore(Good.PEN);
        webStore.addGoodToStore(Good.PENCIL);
        webStore.addGoodToStore(Good.PAPER);
        webStore.addGoodToStore(Good.PAPER);
        webStore.addGoodToStore(Good.ERASER);
        webStore.addGoodToStore(Good.MARKER);
        System.out.println("Welcome to our web store! Here's what we have:");
        while (true) {
            webStore.printGoodsList();
            int numOfGoods = webStore.getNumberOfGoods();
            System.out.format("%d) exit\n", numOfGoods + 1);
            System.out.format("%d) check out\n", numOfGoods + 2);
            System.out.println();
            System.out.println("Enter your choice");
            int input = scanner.nextInt();
            if (input <= numOfGoods && input > 0)
                webStore.addToCart(input);
            else if (input == numOfGoods + 1)
                return;
            else if (input == numOfGoods + 2)
                break;
            else
                System.out.println("No such number");
            System.out.println("Your cart:");
            webStore.printCart();
            System.out.format("Your total is %.2f RUB\n", webStore.getTotal());
            System.out.format("\n\n What's left in the store:\n");
        }
        double total = webStore.getTotal();
        if (total != 0) {
            System.out.format("Your total is %.2f RUB\n", total);
            CurrencyConverter cc = new CurrencyConverter(0.017, 0.14, 0.98);
            while (true) {
                System.out.println("Which currency would you like to use?");
                System.out.print("1) USD\n2) RUB\n3) YUAN\n");
                int curr = scanner.nextInt();
                String fString = "You have to pay %.2f %s\n";
                if (curr == 1)
                    System.out.printf(fString, cc.convert(total, "RUB", "USD"), "USD");
                if (curr == 2)
                    System.out.printf(fString, total, "RUB");
                if (curr == 3)
                    System.out.printf(fString, cc.convert(total, "RUB", "YUAN"), "YUAN");
                if (curr > 3)
                    System.out.println("No such choice");
                else break;
            }
        }
        
    }
}
