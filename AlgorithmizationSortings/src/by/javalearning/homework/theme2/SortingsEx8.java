package by.javalearning.homework.theme2;

import java.util.Scanner;

//2.Algorithmisation
//���������� �������. ����������
//������ 8. ���� ����� P1/Q1, P2/Q2, ..., Pn/Qn ( Pi, Qi - �����������). ��������� ���������,
//������� �������� ��� ����� � ������ ����������� � ������������� �� � ������� �����������.

public class SortingsEx8 {

    int q1;
    int q2;
    int nod;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("������� ���������� ������:");
        System.out.print("N=");
        int n = in.nextInt();
        int[] p = new int[n];
        int[] q = new int[n];
        int qq = 1; // ����� �����������
        for (int i = 0; i < n; i++) {
            System.out.println("������� ��������� " + (i + 1) + "-� �����: ");
            p[i] = in.nextInt();
            System.out.println("������� ����������� " + (i + 1) + "-� �����: ");
            q[i] = in.nextInt();
            if (q[i] == 0) {
                System.out.println("������ �� ���� ������!");
                System.exit(1);
            }
            qq = nok(q[i], qq);
        }
        // �������� ��������� � ������ �����������
        for (int i = 0; i < n; i++) {
            p[i] = (qq / q[i]) * p[i];
        }
        // ��������� (���������� �������)
        int sw;
        for (int i = 0; i < p.length; i++) {
            int ind = i;
            for (int j = i + 1; j < p.length; j++) {
                if (p[j] < p[ind])
                    ind = j;
            }
            sw = p[ind];
            p[ind] = p[i];
            p[i] = sw;
        }
        // �������
        for (int i = 0; i < n; i++) {
            System.out.print(p[i] + "/" + qq + " ");
        }
        System.out.println();
        in.close();
    }

    // ���������� ����� �������
    static int nok(int q1, int q2) {
        return (q1 * q2) / nod(q1, q2);
    }

    // ���������� ����� ��������
    static int nod(int q1, int q2) {
        int nod = 1;
        int r = 1;
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
        return nod;
    }
}
