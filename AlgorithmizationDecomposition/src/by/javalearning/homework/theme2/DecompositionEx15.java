package by.javalearning.homework.theme2;

import java.util.Scanner;

// 2.Algorithmisation
// ������������ � �������������� ������� (������������).
// ������ 15. ����� ��� ����������� n-������� �����, ����� � ������� �������� ������ 
// ������������ ������������������ (��������, 1234, 5789). ��� ������� ������ ������������ ������������.

public class DecompositionEx15 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("������� N:");
        System.out.print("N=");
        int n = in.nextInt();
        if (n > 9 || n < 1) {
            System.out.println("����� ����� �� ����������");
            System.exit(1);
        }
        increaseSearch(n);
        in.close();
    }

    static void increaseSearch(int n) {
        int fff = 0;
        int f = 0;
        for (int i = 1; i <= n; i++) // ������� ����� �� ������ ���� 11111, ������� ����� ���������� � ����������
            f += Math.pow(10, (n - i));
        for (int i = 1; i <= n; i++) // ������� ������� �����-������������������, ������������ � 1.
            fff += i * Math.pow(10, (n - i));
        for (int x = 0; x < (10 - n); x++) // ������� �����
            System.out.print((fff + x * f) + " ");
    }
}
