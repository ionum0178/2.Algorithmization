package by.javalearning.homework.theme2;

import java.util.Scanner;

//2.Algorithmisation
//���������� ������� 
//������ 5. ���� ����� ����� �1,�2 ,..., �n. ������� �� ������ ������ �� �����, ��� ������� �i> i.

public class ArraysEx5 {
    public static void main(String[] args) {
        System.out.println("������� ����� �������:");
        Scanner in = new Scanner(System.in);
        System.out.print("N=");
        int n = in.nextInt();
        if (n <= 0) {
            System.out.println("����� ������� �� ����� ���� ������� ��� �������������!");
            System.exit(1);
        }
        System.out.println("������� i:");
        System.out.print("i=");
        int i = in.nextInt();
        int[] arr = new int[n];
        for (int j = 0; j < n; j++) {
            System.out.println("������� " + (j + 1) + " ������� �������: ");
            arr[j] = in.nextInt();
        }
        int m = 0;
        System.out.print("�������� �������, ������� ������ ��� i: ");
        for (int k = 0; k < n; k++) {
            if (arr[k] > i) {
                System.out.print(arr[k] + ", ");
                m++;
            }
        }
        if (m == 0)
            System.out.print("�� �������");
        in.close();
    }
}
