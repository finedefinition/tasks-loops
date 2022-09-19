package maxevennumber;

import java.util.Scanner;

/*
Программа должна считывать целые числа с клавиатуры до тех пор, пока не будет введено что-то другое: например, строка или символ. Выведи на экран максимальное четное число из введенных. Если введено несколько таких чисел, необходимо вывести любое из них.

Пример ввода:
8
9
8
4
5
e

Пример вывода:
8
Требования:
	Программа должна считывать числа c клавиатуры.
•	Программа должна выводить число на экран.
•	Программа должна выводить на экран максимальное четное из введенных целых чисел.
•	Если введено несколько максимальных четных чисел, необходимо вывести любое.
•	Если среди введенных символов нет четного числа или введен только один не числовой символ,
то вывести на экран минимальное значение числа типа int.
•	Считывать данные с клавиатуры необходимо в цикле while.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int maxEven = Integer.MIN_VALUE;
        while (console.hasNextInt()) {
            int x = console.nextInt();
            if (x % 2 == 0 && maxEven < x) maxEven = x;
        }
        System.out.println(maxEven);
    }
}
