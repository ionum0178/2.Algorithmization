package by.javalearning.homework.theme2;

import java.util.Scanner;

//2.Algorithmisation
//������� ��������
//������ 2. ���� ���������� �������. ������� �� ����� ��������, ������� �� ���������.

public class MatricesEx2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("������� ������ �������:");
        System.out.print("N=");
        int n = in.nextInt();
        if (n <= 0) {
            System.out.println("����� ����� ��� �������� �� ����� ���� ������� ��� �������������!");
            System.exit(1);
        }
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("������� ������� ������� [" + (j + 1) + "] [" + (i + 1) + "]: ");
                arr[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < n; i++)
            System.out.print(arr[i][i] + " ");
        in.close();
    }
}
