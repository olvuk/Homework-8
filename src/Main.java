import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        System.out.println();
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println();
        double[] indexes = {1.57, 7.654, 9.986};
        System.out.println(indexes[0]);
        System.out.println(indexes[1]);
        System.out.println(indexes[2]);
        System.out.println();
        int[] ages = {15, 18, 19, 22, 15, 16};
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        System.out.println(ages[3]);
        System.out.println(ages[4]);
        System.out.println(ages[5]);

    }

    public static void task2() {
        System.out.println();
        System.out.println("Задача 2");
        System.out.println();
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = 0; i < numbers.length - 1; i = i + 1) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.println(numbers[2]);
        double[] indexes = {1.57, 7.654, 9.986};
        for (int i = 0; i < indexes.length - 1; i = i + 1) {
            System.out.print(indexes[i] + ", ");
        }
        System.out.println(indexes[2]);
        System.out.println();
        int[] ages = {15, 18, 19, 22, 15, 16};
        System.out.println(Arrays.toString(ages));
        System.out.println("или");
        for (int i = 0; i < ages.length - 1; i = i + 1) {
            System.out.print(ages[i] + ", ");
        }
        System.out.println(ages[5]);
    }

    public static void task3() {
        System.out.println();
        System.out.println("Задача 3");
        System.out.println();
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = 2; i > 0; i = i - 1) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.println(numbers[0]);
        double[] indexes = {1.57, 7.654, 9.986};
        for (int i = 2; i > 0; i = i - 1) {
            System.out.print(indexes[i] + ", ");
        }
        System.out.println(indexes[0]);
        int[] ages = {15, 18, 19, 22, 15, 16};
        for (int i = 5; i > 0; i = i - 1) {
            System.out.print(ages[i] + ", ");
        }
        System.out.println(ages[0]);
    }

    public static void task4() {
        System.out.println();
        System.out.println("Задача 4");
        int[] numbers = {1, 2, 3};
        for (int i = 1; i <= numbers.length; i = i + 1) {
            if (i % 2 == 0) {
                System.out.println(i);
            } else {
                System.out.println(i + 1);
            }
        }
    }
}