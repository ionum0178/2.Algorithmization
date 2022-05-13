package by.javalearning.homework.theme2;

import static java.lang.Math.*;

//2.Algorithmisation
//������� ��������
//������ 11. ������� 10x20 ��������� ���������� ������� �� 0 �� 15. ������� �� ����� 
//���� ������� � ������ �����, � ������� ����� 5 ����������� ��� � ����� ���.

public class MatricesEx11 {
    public static void main(String[] args) {

	int[][] arr = new int[10][20];
	for (int i = 0; i < 10; i++) {
	    for (int j = 0; j < 20; j++) {
		arr[i][j] = (int) round(15 * random());
	    }
	}
	for (int i = 0; i < 10; i++) {
	    for (int j = 0; j < 20; j++)
		System.out.print(arr[i][j] + " ");
	    System.out.println();
	}
	System.out.println("����� 5 ����������� 3 � ����� ��� � ������� � ��������: ");
	int q = 0;
	for (int i = 0; i < 10; i++) {
	    for (int j = 0; j < 20; j++) {
		if (arr[i][j] == 5)
		    q++;
	    }
	    if (q >= 3)
		System.out.print((i + 1) + " ");
	    q = 0;
	}
    }
}
