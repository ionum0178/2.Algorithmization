package by.javalearning.homework.theme2;

import java.util.Scanner;
// 2.Algorithmisation
// ���������� ������� 
// ������ 1. � ������ A[N] �������� ����������� �����. ����� ����� ��� ���������, ������� ������ ������� �.

public class ArraysEx1 {

    public static void main(String[] args) {

	System.out.println("������� ����� �������:");
	Scanner in = new Scanner(System.in);
	System.out.print("N=");
	int n = in.nextInt();
	if (n <= 0) {
	    System.out.println("����� ������� �� ����� ���� ������� ��� �������������!");
	    System.exit(1);
	}
	int[] a = new int[n];
	System.out.println("������� ���������:");
	System.out.print("�=");
	int k = in.nextInt();
	int sum = 0;
	for (int i = 0; i < n; i++) {
	    System.out.println("������� " + (i + 1) + " ������� �������: ");
	    a[i] = in.nextInt();
	    if (a[i] % k == 0)
		sum += a[i];
	}
	System.out.println("����� ��������� �������, ������� �, ����� " + sum);
	in.close();
    }

}
