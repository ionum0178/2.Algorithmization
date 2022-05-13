package by.javalearning.homework.theme2;

import java.util.Arrays;
import java.util.Scanner;

//2.Algorithmisation
//������� ��������
//������ 12. ������������� ������ ������� �� ����������� � �������� �������� ���������.

public class MatricesEx12 {
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
	// �� ����������
	for (int i = 0; i < m; i++) {
	    for (int j = 0; j < n; j++)
		System.out.print(arr[i][j] + " ");
	    System.out.println();
	}
	System.out.println("���������� ����� �� �����������:");
	int[] line = new int[n];
	for (int i = 0; i < m; i++) {
	    for (int j = 0; j < n; j++)
		line[j] = arr[i][j];
	    Arrays.sort(line);
	    for (int j = 0; j < n; j++)
		arr[i][j] = line[j];
	}
	for (int i = 0; i < m; i++) {
	    for (int j = 0; j < n; j++)
		System.out.print(arr[i][j] + " ");
	    System.out.println();
	}
	System.out.println("���������� ����� �� ��������:");
	for (int i = 0; i < m; i++) {
	    for (int j = 0; j < n; j++)
		line[j] = arr[i][j];
	    Arrays.sort(line);
	    for (int j = 0; j < n; j++)
		arr[i][n - 1 - j] = line[j];
	}
	for (int i = 0; i < m; i++) {
	    for (int j = 0; j < n; j++)
		System.out.print(arr[i][j] + " ");
	    System.out.println();
	}
	System.out.println();
	in.close();
    }
}
