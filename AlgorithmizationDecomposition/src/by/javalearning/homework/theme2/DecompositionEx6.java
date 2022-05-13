package by.javalearning.homework.theme2;

import java.util.Scanner;

//2.Algorithmisation
//������������ � �������������� ������� (������������).
//������ 6. �������� ����� (������), �����������, �������� �� ������ ��� ����� ������� ��������.

public class DecompositionEx6 {

    static int[] a = new int[3];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("������� ��� ����������� �����:");
        for (int i = 0; i < a.length; i++) {
            System.out.print((i + 1) + "-e: ");
            a[i] = in.nextInt();
        }
        �oprimeNum(a);
        in.close();
    }

    // ������� ������� ����� - ��, � ������� ���������� ����� �������� ����� 1
    static void �oprimeNum(int a[]) {
        int nod = 1;
        int r = 1;
        int q1 = a[0];
        int i = 0;
        while (i < (a.length - 1)) {
            if (i != 0)
                q1 = nod;
            int q2 = a[i + 1];
            i++;
            if (q1 == q2)
                nod = q1;
            while (r != 0) {
                if (q1 > q2) {
                    r = q1 % q2;
                    if (r == 0) {
                        nod = q2;
                        break;
                    } else {
                        q1 = q2;
                        q2 = r;
                    }
                } else {
                    r = q2 % q1;
                    if (r == 0) {
                        nod = q1;
                        break;
                    } else {
                        q2 = q1;
                        q1 = r;
                    }
                }
            }
        }
        if (nod == 1)
            System.out.println("����� �������� ������� ��������");
        else
            System.out.println("����� �� �������� ������� ��������");
    }
}
