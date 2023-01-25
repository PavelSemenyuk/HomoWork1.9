public class HomeWork {
    public static void main(String[] args) {
        task0();
        task1();
        task2();
        task3();
        task4();


    }

    public static void task0() {
        System.out.println("Задача 0 тест");

        int[] weights = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        int[] weightsCopy = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};

        boolean arraysAreEqual = true;
        arraysAreEqual = weights.length == weightsCopy.length;
        if (arraysAreEqual) {
            for (int i = 0; i < weights.length; i++) {
                if (weights[i] != weightsCopy[i]) {
                    arraysAreEqual = false;
                }
            }
        }
        if (arraysAreEqual) {
            System.out.println("Массивы одинаковые");
        } else {
            System.out.println("Массивы разные");
        }
        int maxWeight = -1;
        for (final int current : weights) {
            if (current > maxWeight) {
                maxWeight = current;
            }
        }
        System.out.println(maxWeight);
        for (int i = 0; i < weights.length - 1 && weights[i + 1] != 0; i++) {
            System.out.println(weights[i + 1] - weights[i]);
        }
    }



    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;

    }

    /*  Бухгалтеры попросили посчитать сумму всех выплат за месяц.
    Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате:
    «Сумма трат за месяц составила … рублей».*/

    public static void task1() {
        System.out.println(" ");
        System.out.println("Задача 1");
        int arr[] = generateRandomArray();
        int sum = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            sum = sum + arr[i];
            if (arr[i] > sum) {
                sum = arr[i];

            }
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей. ");
    }
/*   Также бухгалтерия попросила найти минимальную и максимальную трату за день.
Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате:
 «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».*/

    public static void task2() {
        System.out.println(" ");
        System.out.println("Задача 2");
        int arr[] = generateRandomArray();
        int maxSum = 0;
        int minSum = 200000;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] > maxSum) {
                maxSum = arr[i];
            }

        }
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] < minSum) {
                minSum = arr[i];
            }


        }
        System.out.println("Минимальная сумма трат за день составила " +minSum+ " рублей. " +
                "Максимальная сумма трат за день составила " +maxSum+ " рублей");

    }


    /* Теперь бухгалтерия хочет понять, какую в среднем сумму компания тратила в течение 30 дней.
Напишите программу, которая посчитает среднее значение трат за месяц
(то есть сумму всех трат за месяц поделить на количество дней), и выведите в консоль результат в формате:
 «Средняя сумма трат за месяц составила … рублей».
Важно помнить: подсчет среднего значения может иметь остаток, то есть быть не целым, а дробным числом.*/

    public static void task3() {
        System.out.println(" ");
        System.out.println("Задача 3");
        int arr[] = generateRandomArray();
        int sum = 0;
        int day=30;

        for (int i = 0; i <= arr.length - 1; i++) {
            sum = sum + arr[i];
            if (arr[i] > sum) {
                sum = arr[i];

            }

        }
        System.out.println("Средняя сумма трат за месяц составила " + sum/day + " рублей");
    }

    /*  В бухгалтерской книге появился баг. Что-то пошло нет так — фамилии и имена сотрудников начали
    отображаться в обратную сторону. Т. е. вместо «Иванов Иван» мы имеем «навИ вонавИ».
    Данные с именами сотрудников хранятся в виде массива символов — char[ ].
    Напишите код, который в случае такого бага будет выводить фамилии и имена сотрудников в корректном виде.
    В качестве данных для массива используйте:
    char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
    В результате в консоль должно быть выведено: Ivanov Ivan.
    Важно: не используйте дополнительные массивы для решения этой задачи.
    Необходимо корректно пройти по массиву циклом и распечатать его элементы в правильном порядке.*/

    public static void task4() {
        System.out.println(" ");
        System.out.println("Задача 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i>=0; i--) {

            System.out.print(reverseFullName[i]);

        }
    }
}