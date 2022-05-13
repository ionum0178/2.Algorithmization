package by.javalearning.homework.theme2;

import java.util.Arrays;
import java.util.Scanner;

//2.Algorithmisation
//���������� ������� 
//������ 2. ���� ������������������ �������������� ����� �1,�2 ,..., ��. 
//�������� ��� �� �����, ������� ������� Z, ���� ������. ���������� ���������� �����.

public class ArraysEx2 {
    public static void main(String[] args) {
	System.out.println("������� ����� �������:");
	Scanner in = new Scanner(System.in);
	System.out.print("N=");
	int n = in.nextInt();
	if (n <= 0) {
	    System.out.println("����� ������� �� ����� ���� ������� ��� �������������!");
	    System.exit(1);
	}
	int[] arr = new int[n];
	System.out.println("������� Z:");
	System.out.print("Z=");
	int z = in.nextInt();
	int zam = 0;
	for (int i = 0; i < n; i++) {
	    System.out.println("������� " + (i + 1) + " ������� �������: ");
	    arr[i] = in.nextInt();
	    if (arr[i] > z) {
		arr[i] = z;
		zam++;
	    }
	}
	String arr_str = Arrays.toString(arr);
	System.out.println(arr_str);
	System.out.println("���������� ���������� ��������� ������� ����� " + zam);
	in.close();
    }
}
