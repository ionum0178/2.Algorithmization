package by.javalearning.homework.theme2;

import java.util.Scanner;

//2.Algorithmisation
//���������� ������� 
//������ 10. ��� ������������� ������ � ����������� ��������� �. ����� ������, 
//�������� �� ���� ������ ������ ������� (�������������� �������� ��������� ������).
//����������. �������������� ������ �� ������������

public class ArraysEx10 {
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
        for (int j = 0; j < n; j++) {
            System.out.println("������� " + (j + 1) + " ������� �������: ");
            arr[j] = in.nextInt();
        }
        for (int i = 1; i < n; i += 2)
            arr[i] = 0;
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        in.close();
    }
}
