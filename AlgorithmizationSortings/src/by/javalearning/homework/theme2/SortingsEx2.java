package by.javalearning.homework.theme2;

import java.util.Scanner;

//2.Algorithmisation
//���������� �������. ����������
//������ 2. ���� ��� ������������������ a1<=a2<=...<=an, b1<=b2<=...<=bm. 
//���������� �� ��� ����� ������������������ ����� ���, ����� ��� ���� ���� �����������. 
//����������.�������������� ������ �� ������������.

public class SortingsEx2 {

    public static int[] arrFill(int n) {
        int[] arr = new int[n];
        @SuppressWarnings("resource")
	Scanner in = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("������� ������� ������� [" + (i + 1) + "]: ");
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
        int aa[] = new int[n];
        aa = arrFill(n);

        System.out.println("������� ����������� ������������������ 2:");
        int bb[] = new int[m];
        bb = arrFill(m);

        int[] res = new int[(n + m)];

        int i = 0;
        int j = 0;
        int ai = aa[i];
        int bj = bb[j];
        for (int z = 0; z < (n + m); z++) {
            if (ai < bj) {
                res[z] = ai;
                i++;
                if (i < n) {
                    ai = aa[i];
                } else
                    ai = Integer.MAX_VALUE;
            } else {
                res[z] = bj;
                j++;
                if (j < m) {
                    bj = bb[j];
                } else
                    bj = Integer.MAX_VALUE;
            }
        }
        // �������
        for (int a : res)
            System.out.print(a + "\t");
        System.out.println();
        in.close();
    }
}
