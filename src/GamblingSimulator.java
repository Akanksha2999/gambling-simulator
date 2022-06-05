import com.sun.tools.javac.Main;

import java.util.Scanner;

public class GamblingSimulator {
    //Initialized static variables
    static Scanner scanner = new Scanner(System.in);
    static int startGame;
    static int perDayMoney;
    static int perGameMoney;
    static int betOption;
    static int money;
    static int wins = 0;
    static int lose = 0;


    //Method to start the game on entering number 1
    public static void startGame() {
        System.out.println("Enter 1 to start the game");
        String num = scanner.nextLine();
        System.out.println(num);
    }

    //Method to know how much money is with the player to bet per game and per day
    public static void money() {
        perDayMoney = 100;
        perGameMoney = 1;
        System.out.println("You have $" + perDayMoney + " for per day gambling game");
        System.out.println("You have $" + perGameMoney + " for per game");
    }

    //Player chooses one number between 1 to 6 to bet on it
    public static void betOption() {
        System.out.println("Enter number you want to bet on between 1 to 6");
        betOption = scanner.nextInt();
        System.out.println(betOption);
    }

    //Checks if the ransom number and the betOption number is same or different, if same displays u won else display u lost until the per day money is greater than 50
    public static void game() {
        for (int day = 1; day <= 20; day++) {
            while (perDayMoney > 50 && perDayMoney < 150) {
                int betamount = perGameMoney;
                int randomnumber = (int) ((Math.random() * 5) + 1);
                System.out.println("Random number appeared is:" + randomnumber);
                if (betOption == randomnumber) {
                    System.out.println("Congratulations...you won " + betamount);
                    perDayMoney++;
                    System.out.println(perDayMoney);
                    betOption();
                    System.out.println("New per day money" + perDayMoney);
                } else {
                    System.out.println("sorry...you lost " + betamount);
                    perDayMoney--;
                    System.out.println(perDayMoney);
                    betOption();
                }

            }
            if (perDayMoney == 50) {
                lose++;
                System.out.println("Day" + day + "Lost");
            } else {
                wins++;
                System.out.println("Day" + day + "Won");
            }
        }
    }

    //totalAmount method checks for the winning and losing amount after 20 days
    public static void totalAmount() {

        int finalAmount = wins * 50 - lose * 50;
        System.out.println(+finalAmount);
        if (finalAmount > 1000) {
            System.out.println("After 20 days player won:" + finalAmount);
        } else if (finalAmount < 1001) {
            System.out.println("After 20 days Gambler lost:" + finalAmount);
        } else {
            System.out.println("No profit or loss");
        }
    }

    //Main method to call all the method and printing welcome message and entering player's name
    public static void main(String[] args) {
        System.out.println("Welcome to gambling game");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println(name);
        money();
        startGame();
        betOption();
        game();
        totalAmount();
    }
}