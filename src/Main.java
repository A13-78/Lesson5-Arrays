public class Main {
    public static void main(String[] args) {
        System.out.println("Привет, Java!");

        // Задание 1

        int[] day = new int[3];
        day[0] = 1;
        day[1] = 2;
        day[2] = 3;

        double[] weights = {1.57, 7.654, 9.986};

        boolean[] night = {true, false, true, false};

        // Задание 2

        for (int i = 0; i < day.length - 1; i++) {
            System.out.print(day[i] + ", ");
        }
        System.out.println(day[day.length - 1]);

        for (int i = 0; i < weights.length; i++) {
            if (i == weights.length - 1) {
                System.out.println(weights[i]);
            } else {
                System.out.print(weights[i] + ", ");
            }
        }

        // Задание 3

        int counter = night.length - 1;
        while (counter > 0){
            System.out.print(night[counter] + ", ");
            counter--;
        }
        System.out.println(night[0]);

        // Задание 4

        for (int i = 0; i < day.length; i++) {
            if (day[i] % 2 != 0) day[i]++;
            System.out.print(day[i] + " ");
        }
    }
}