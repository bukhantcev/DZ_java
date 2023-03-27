// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
// Ввод:5
// Треугольное число 1 + 2 + 3 + 4 + 5 = 15
// n! 1 * 2 * 3 * 4 * 5 = 120




package DZ_1;

import java.util.Scanner;

public class DZ_1_1 {
    public static void main(String[] args) {
        System.out.println("Vvedite chislo n:  ");
        Scanner sc = new Scanner(System.in);
        int last_num = sc.nextInt();
        sc.close();
        int result_sum = 0;
        int result_mult = 1;
        for (int i = 1; i <= last_num; i++){
            result_sum += i;
            result_mult *= i;
        }
        System.out.println("Treugolnoe chislo = " + result_sum);
        System.out.println("n! = " + result_mult);
    }
}
