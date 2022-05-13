package by.javalearning.homework.theme2;

import java.util.Scanner;

//2.Algorithmisation
//���������� �������. ����������
//������ 4. ���������� ��������. ���� ������������������ ����� a1<=a2<=...<=an.
//��������� ����������� ����� � ������� �����������. ��� ����� ������������ ��� �������� 
//����� ai � ai+1. ���� ai>ai+1, �� �������� ������������. ��� ������������ �� ��� ���, 
//���� ��� �������� �� ������ ����������� � ������� �����������. ��������� �������� ����������, 
//����������� ��� ���� ���������� ������������. 

public class SortingsEx4 {

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
        System.out.println("������� ������������������:");
        int ar[] = new int[n];
        ar = arrFill(n);

        // �� ����������
        for (int a : ar)
            System.out.print(a + "\t");
        System.out.println();

        int sw;
        int ch = 0; // ������ ����� ������������
        int c = 1; // ����� ������������ �� 1 ������ ����� ����������. ���� �=0, ������
                   // ������������.
        while (c != 0) {
            c = 0;
            for (int i = 1; i < ar.length; i++) {
                if (ar[i] < ar[i - 1]) {
                    sw = ar[i - 1];
                    ar[i - 1] = ar[i];
                    ar[i] = sw;
                    ch++;
                    c++;
                }
            }
        }
        // ����� ����������
        for (int a : ar)
            System.out.print(a + "\t");
        System.out.println();
        System.out.println("������� ������������: " + ch);
        in.close();
    }
}
