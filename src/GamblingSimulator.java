public class GamblingSimulator {

    //Initialize constant variables
    public static final int everyGameBet = 1;
    public static int everyDayStake = 100;

    //Main method calculating every day winning and loosing amount and printing the luckiest amount and unluckiest amount
    public static void main(String[] args) {
        System.out.println("Welcome to Gambling simulation program on master branch");
        int day, maxMonthly = 0, minMonthly = 0, large = 0, small = 0;
        for (day = 1; day <= 30; day++) {
            while (true) {
                for (int i = 0; i < 100; i++) {

                    int game = (int) (Math.random() * 2);
                    if (game == 1) {
                        everyDayStake += everyGameBet;
                    } else {
                        everyDayStake -= everyGameBet;
                    }
                }

                if (everyDayStake >= 150) {
                    System.out.println("Win 50%  :So resign the day");
                    System.out.println(" Day" + day + " :remaining amount is " + everyDayStake);
                    maxMonthly += everyDayStake;
                    if (everyDayStake > large)
                        large = everyDayStake;

                    break;
                }
                if (everyDayStake == 50) {
                    System.out.println("Loose 50% :So resign the day");
                    System.out.println(" Day" + day + ": remaining amount is " + everyDayStake);
                    minMonthly += everyDayStake;
                    small = everyDayStake;
                    break;
                }//End of if loop
            }
        }

        //Printing luckiest winning amount
        System.out.println("Luckiest winning amount is :" + large);

        //Printing unluckiest winning amount
        System.out.println("Unluckiest loosing amount is :" + small);
        System.out.println(" ");

        //Printing the total monthly winning and loosing amount
        System.out.println("Total monthly winning amount is :" + maxMonthly);
        System.out.println("Total monthly loosing amount is :" + minMonthly);

        //Prints to continue gambling for next month if total winning amount of month is greater than loosing amount
        if (maxMonthly > minMonthly) {
            System.out.println("Continue gambling for next month");
        } else {
            System.out.println("Stop gambling");
        }
    }
}