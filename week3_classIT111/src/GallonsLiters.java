public class GallonsLiters {

    public static void main(String[] args) {
        // Conversion

        final double GALLONS_PER_LITER = 1.0 / 3.79;
        // Counter to keep track of the number of lines printed
        int counter = 0;

        // Loop through the range of liters from 1 to 100 and increment of 6

        for (int liters = 1; liters <= 100; liters += 6) {

            // Convert liters to gallons

            double gallons = liters * GALLONS_PER_LITER;
            // Print the conversion in a user-friendly format

            System.out.printf("%.2f Liters = %.1f Gallons%n", (double) liters, gallons);
            counter++;

            // Print a blank after every 5 lines

            if (counter % 5 == 0) {
                System.out.println();
            }
        }

        // Print end loop message

        System.out.println("We are done!!!!");
    }
}

