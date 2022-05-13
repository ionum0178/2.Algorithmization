package by.javalearning.homework.theme2;

import java.util.Scanner;

//2.Algorithmisation
//���������� ������� 
//������ 3. ���  ������  ��������������  �����,  �����������  �������� N. 
//����������,  �������  �  ���  �������������, ������������� � ������� ���������.

public class ArraysEx3 {
    public static void main(String[] args) {
        System.out.println("������� ����� �������:");
	Scanner in = new Scanner(System.in);
        System.out.print("N=");
        int n = in.nextInt();
        if (n <= 0) {
            System.out.println("����� ������� �� ����� ���� ������� ��� �������������!");
            System.exit(1);
        }
        double[] arr = new double[n];
        int pos = 0;
        int neg = 0;
        int zero = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("������� " + (i + 1) + " ������� �������: ");
            arr[i] = in.nextDouble();
            if (arr[i] > 0)
                pos++;
            if (arr[i] < 0)
                neg++;
            if (arr[i] == 0)
                zero++;
        }
        System.out.println("���������� ������������� ��������� ������� ����� " + pos);
        System.out.println("���������� ������������� ��������� ������� ����� " + neg);
        System.out.println("���������� ������� ��������� ������� ����� " + zero);
        in.close();
    }
}
