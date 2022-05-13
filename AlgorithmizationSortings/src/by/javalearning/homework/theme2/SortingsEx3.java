package by.javalearning.homework.theme2;

import java.util.Scanner;

//2.Algorithmisation
//���������� �������. ����������
//������ 3. ���������� �������. ���� ������������������ ����� a1<=a2<=...<=an. 
//��������� ����������� �������� ���, ����� ��� ���� ����������� �� ��������. 
//��� ����� � �������, ������� � �������, ���������� ���������� ������� � �������� 
//�� ������ �����, � ������ -�� ����� �����������. �����, ������� �� �������, ��� 
//��������� �����������. �������� �������� ���������� �������.

public class SortingsEx3 {

    public static int[] arrFill(int n) {
        @SuppressWarnings("resource")
	Scanner in = new Scanner(System.in);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("������� ������� [" + (i + 1) + "]: ");
            arr[i] = in.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("������� ����� ������������������:");
        System.out.print("N=");
        int n = in.nextInt();
        if (n <= 0) {
            System.out.println("������ ������������������ �� ����� ���� ������� ��� �������������!");
            System.exit(1);
        }
        System.out.println("������� ����������� ������������������:");
        int ar[] = new int[n];
        ar = arrFill(n);

        // �� ����������
        for (int a : ar)
            System.out.print(a + "\t");
        System.out.println();

        int sw;
        for (int i = 0; i < ar.length; i++) {
            int ind = i;
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[j] > ar[ind])
                    ind = j;
            }
            sw = ar[ind];
            ar[ind] = ar[i];
            ar[i] = sw;
        }
        // ����� ����������
        for (int a : ar)
            System.out.print(a + "\t");
        System.out.println();
        in.close();
    }
}
