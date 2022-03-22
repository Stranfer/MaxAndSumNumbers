import java.util.Scanner;

public class MaxAndSumNumbers {
    public static double sum1(String Double) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        int i = scanner.nextInt();

        int k = 0;
        int sum = 0;

        while (i > 0) {
            k = i % 10;
            if (k % 2 != 0) {
                sum += k;
            }
            i = i / 10;
        }
        return (double) sum;

    }

    public static double max1(String Double) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Введите число: ");
        int number = scanner.nextInt();

        int maxOfNumbers = 0;

        while (number > 0) {
            int k;
            k = number % 10;
            if (k > maxOfNumbers) {
                maxOfNumbers = k;
            }
            number /= 10;
        }
        return (double) maxOfNumbers;
    }

    public static double sumNumbers1(String Double) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Введите число: ");
        int number1 = scanner.nextInt();

        int numbersCount = 0;

        while (number1 > 0) {
            numbersCount += number1 % 10;
            number1 /= 10;
        }
        return (double) numbersCount;

    }

    public static void main(String[] args) {

        double sum = sum1("");
        System.out.println("Сумма нечетных цифр числа: " + sum);

        double max = max1("");
        System.out.println("Максимальная цифра числа: " + max);

        double sumOfNumbers = sumNumbers1("");
        System.out.println("Сумма цифр числа: " + sumOfNumbers);
    }
}