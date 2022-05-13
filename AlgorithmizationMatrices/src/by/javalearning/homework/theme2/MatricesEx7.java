package by.javalearning.homework.theme2;

import java.util.Scanner;
import static java.lang.Math.*;

//2.Algorithmisation
//������� ��������
//������ 7. ������������ ���������� ������� ������� N �� ������� A[i,j] = sin((i^2-j^2)/N)
//� ���������� ���������� ������������� ��������� � ���.

public class MatricesEx7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("������� ������ �������:");
        System.out.print("N=");
        int n = in.nextInt();

        double[][] arr = new double[n][n];
        int q = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sin((pow(i, 2) - pow(j, 2)) / n);
                if (arr[i][j] > 0)
                    q++;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
        System.out.println("���������� ������������ ��������� �������: " + q);
        in.close();
    }
}
