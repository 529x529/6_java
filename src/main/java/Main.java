import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Сумма int: " + intSum(145, 1567));
        System.out.println("Сумма int c переполнением: " + intSum(2147483647, 1000000));
        System.out.println("Вычитание из double int: " + doubleIntSubtraction(8.421, 4));
        System.out.println("Умножение int c переполнением: " + intMultiplication(2147483647, 10));
        System.out.println("Деление int на double: " + intDoubleDivision(10, 25.545));
        System.out.println("Остаток от деления: " + remainderOfTheDivision(11, 4));
        System.out.println("Инкремент: " + intIncrement(25));
        System.out.println("Декремент: " + intDecrement(20));
        System.out.println("Первое введенное число больше второго: " + firstNumberGreaterThanSecond(10, 4));
        System.out.println(checkParity(6));
        System.out.println(checkParity(5));
        System.out.println(switchCase(1));

    }

    public static int intSum(int a, int b) {
        return a + b;
    }

    public static double doubleIntSubtraction(double a, int b) {
        return a - b;
    }

    public static int intMultiplication(int a, int b) {
        return a * b;
    }

    public static double intDoubleDivision(int a, double b) {
        return a / b;
    }

    public static int remainderOfTheDivision(int a, int b) {
        return a % b;
    }

    public static int intIncrement (int a) {
        return ++a;
    }

    public static int intDecrement(int a ) {
        return --a;
    }

    public static boolean firstNumberGreaterThanSecond (int a, int b) {
        return a > b;
    }

    public static String checkParity (int num) {
        if (num % 2 == 0) {
            return "Число четное";
        } else {
            return "Число нечетное";
        }
    }

    public static String switchCase (int num) {

        String result = null;

        switch (num) {
            case 1:
                result = "Введено число = 1";
                break;
            case 2:
                result = "Введено число = 2";
                break;
            default:
                result = "Введено число больше 2";
          }
          return result;
        }
}

