import java.util.Scanner;

public class GamblingSimulator {
    //Initialized static variables
    static Scanner scanner = new Scanner(System.in);
    static int startGame;
    static int perDayMoney;
    static int perGameMoney;

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

    //Main method to call all the method and printing welcome message and entering player's name
    public static void main(String[] args) {
        System.out.println("Welcome to gambling game");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println(name);
        money();
        startGame();
    }
}
