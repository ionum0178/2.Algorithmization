package by.javalearning.homework.theme2;

import java.util.Scanner;
import static java.lang.Math.*;

// 2.Algorithmisation
// ������� ��������
// ������ 14. ������������ ��������� ������� m x n, ��������� �� ����� � ������, 
// ������ � ������ ������� ����� ������ ����� ������ �������.

public class MatricesEx14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("������� ����� �������� �������:");
        System.out.print("N=");
        int n = in.nextInt();
        System.out.println("������� ����� ����� �������:");
        System.out.print("M=");
        int m = in.nextInt();
        if (n <= 0 || m <= 0) {
            System.out.println("����� ����� ��� �������� �� ����� ���� ������� ��� �������������!");
            System.exit(1);
        }
        if (n > m) {
            System.out.println("����� ������� ��������� ����������!");
            System.exit(1);
        }
        int[][] arr = new int[m][n];

        // ���������
        int q = 2;
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < (q - 1); i++) {
                arr[i][j] = 1;
            }
            q++;
        }
        // ������������
        int a, index;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                index = (int) (random() * i);
                a = arr[index][j];
                arr[index][j] = arr[i][j];
                arr[i][j] = a;
            }
        }
        // �������
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
        in.close();
    }
}
