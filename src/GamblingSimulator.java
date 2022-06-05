import java.util.Scanner;

public class GamblingSimulator {
    //Initialized static variables
    static Scanner scanner = new Scanner(System.in);
    static int startGame;
    static int perDayMoney;
    static int perGameMoney;
    static int betOption;


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

    //Checks if the ransom number and the betOption number is same or different, if same displays u won else display u lost
    public static void game() {
        int betamount = perGameMoney;
        int randomnumber = (int) ((Math.random() * 5) + 1);
        System.out.println("Random number appeared is:" + randomnumber);
        System.out.println("You have bet $" + betamount + "for this game");
        if (betOption == randomnumber) {
            System.out.println("Congratulations...you won " + betamount);
        } else {
            System.out.println("Sorry...you lost " + betamount);
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
    }
}
