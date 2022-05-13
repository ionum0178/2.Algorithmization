package by.javalearning.homework.theme2;

import java.util.Scanner;

//2.Algorithmisation
//������������ � �������������� ������� (������������).
//������ 11. �������� �����(������), ������������, � ����� �� ������ ���� ����� ������ ����.

public class DecompositionEx11 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("������� ��� ����������� �����:");
        System.out.print("N=");
        int n = in.nextInt();
        System.out.print("M=");
        int m = in.nextInt();
        digits(n, m);
        in.close();
    }

    static void digits(int n, int m) {
        int rn = 0;
        int rm = 0;
        int nn = n;
        int mm = m;
        while (nn != 0) {
            rn++;
            nn /= 10;
        }
        while (mm != 0) {
            rm++;
            mm /= 10;
        }
        if (rn == rm)
            System.out.println("���������� ���� � ������ ���������");
        if (rn > rm)
            System.out.println("���������� ���� ������ � ����� " + n);
        if (rn < rm)
            System.out.println("���������� ���� ������ � ����� " + m);
    }
}
