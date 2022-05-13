package by.javalearning.homework.theme2;

import java.util.Scanner;

//2.Algorithmisation
//������� ��������
//������ 9. ������ ������� ��������������� �����. ��������� ����� ��������� 
//� ������ �������. ����������, ����� ������� �������� ������������ �����.

public class MatricesEx9 {
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
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("������� ������� ������� [" + (j + 1) + "] [" + (i + 1) + "]: ");
                arr[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
        int[] rw = new int[n];
        int rw_max = 0;
        int rw_index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                rw[i] += arr[j][i];
            }
            System.out.println("����� ��������� ������� " + (i + 1) + " ����� " + rw[i]);
            if (rw[i] > rw_max) {
                rw_max = rw[i];
                rw_index = i;
            }
        }
        System.out.println("�������� " + (rw_index + 1) + " ����� ������������ ����� ���������, ������ " + rw_max);
        in.close();
    }
}
