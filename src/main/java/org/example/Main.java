import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Зчитуємо кількість елементів
        System.out.print("Введіть кількість елементів: ");
        int n = input.nextInt();

        // Створюємо масив для зберігання введених чисел
        int[] numbers = new int[n];

        // Зчитуємо числа з консолі
        System.out.println("Введіть цілі числа:");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }

        // Сортування методом бульбашки по спаданню модулів
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (Math.abs(numbers[j]) < Math.abs(numbers[j + 1])) {
                    // Обмін елементів, якщо потрібно
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        // Виводимо відсортований масив
        System.out.println("Елементи, розташовані методом бульбашки по спаданню модулів:");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }

        input.close();
    }
}
