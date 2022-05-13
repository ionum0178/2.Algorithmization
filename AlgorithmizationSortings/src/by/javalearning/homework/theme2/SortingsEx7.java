package by.javalearning.homework.theme2;

import java.util.Scanner;

//2.Algorithmisation
//���������� �������. ����������
//������ 7. ����� ���� ��� ����������� ������������������ �������������� ����� a1<=a2<=...<=an 
//� b1<=b2<=...<=bm. ��������� ������� �� �����, �� ������� ����� ��������� �������� ������������������ 
//b1<=b2<=...<=bm � ������ ������������������ ���, ����� ����� ������������������ ���������� ������������.

public class SortingsEx7 {

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
        System.out.println("������� ����� ������������������ 1:");
        System.out.print("N=");
        int n = in.nextInt();
        System.out.println("������� ����� ������������������ 2:");
        System.out.print("M=");
        int m = in.nextInt();
        if (n <= 0 || m <= 0) {
            System.out.println("������ ������������������ �� ����� ���� ������� ��� �������������!");
            System.exit(1);
        }
        System.out.println("������� ����������� ������������������ 1:");
        int a[] = new int[n];
        a = arrFill(n);

        System.out.println("������� ����������� ������������������ 2:");
        int b[] = new int[m];
        b = arrFill(m);

        System.out.println("������� ��� ������������������ 2: ");
        int i = 0;
        int j = 0;
        int ai = a[i];
        int bj = b[j];
        for (int z = 0; z < (n + m); z++) {
            if (ai < bj) {
                i++;
                if (i < n) {
                    ai = a[i];
                } else
                    ai = Integer.MAX_VALUE;
            } else {
                System.out.print((z + 1) + "\t");
                j++;
                if (j < m) {
                    bj = b[j];
                } else
                    bj = Integer.MAX_VALUE;
            }
        }
        in.close();
    }
}
