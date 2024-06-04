public class PersonDetails {
    public static void main(String[] args) {


        // to create our variables

        String firstPersonName = "Cathy Jones";
        String secondPersonName = "Kendall Black";
        int firstPersonAge = 33;
        int secondPersonAge = 22;
        int firstPersonCarYear = 2010;
        int secondPersonCarYear = 2019;
        boolean firstPersonViolations = false;
        boolean secondPersonViolations = true;
        double firstPersonCreditScore = 690.0;
        double secondPersonCreditScore = 570.0;

        double monthlyRate1;
        double monthlyRate2;

        // car insurance

        if (firstPersonViolations && firstPersonCreditScore <= 700) {
            monthlyRate1 = 500;
        } else {
            monthlyRate1 = 100;
        }

        if (secondPersonViolations && secondPersonCreditScore <= 700) {
            monthlyRate2 = 500;
        } else {
            monthlyRate2 = 100;
        }

        // total cost

        double total1 = monthlyRate1 + 100; // Adjusted rate for first person
        double total2 = monthlyRate2 + 300; // Adjusted rate for second person

        // Print first person's

        System.out.println("Your name: " + firstPersonName);
        System.out.println("Your age: " + firstPersonAge);
        System.out.println("Your car: " + firstPersonCarYear);
        System.out.println("Your violations: " + firstPersonViolations);
        System.out.println("Your Credit Score: " + firstPersonCreditScore);
        System.out.println(total1 + " dollars");
        System.out.println();

        // Print second person's

        System.out.println("Your name: " + secondPersonName);
        System.out.println("Your age: " + secondPersonAge);
        System.out.println("Your car: " + secondPersonCarYear);
        System.out.println("Your violations: " + secondPersonViolations);
        System.out.println("Your Credit Score: " + secondPersonCreditScore);
        System.out.println(total2 + " dollars");
    }
}