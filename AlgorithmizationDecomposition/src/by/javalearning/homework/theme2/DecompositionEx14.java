package by.javalearning.homework.theme2;

import java.util.Scanner;

// 2.Algorithmisation
// ������������ � �������������� ������� (������������).
// ������ 14. ����������� �����, � ������ �������� n ����, ���������� ������ ����������, 
// ���� ����� ��� ����, ����������� � ������� n, ����� ������ �����. ����� ��� �����
// ���������� �� 1 �� k. ��� ������� ������ ������������ ������������.

public class DecompositionEx14 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("������� k:");
        System.out.print("k=");
        int k = in.nextInt();
        armstrongSearch(k);
        in.close();
    }

    static void armstrongSearch(int k) {
        int z = 0;
        System.out.print("����� ����������: ");
        for (int i = 1; i <= k; i++) {
            if (digitSum(i) == i) {
                System.out.print(i + " ");
                z++;
            }
        }
        if (z == 0)
            System.out.print("�� �������");
    }

    static int digits(int nn) { // ���������� ���� �����
        int rn = 0;
        while (nn != 0) {
            rn++;
            nn /= 10;
        }
        return rn;
    }

    static int digitSum(int n) { // ����� ���� �����, ����������� � ������� n
        int nn = n;
        int sum = 0;
        while (nn != 0) {
            sum += Math.pow((nn % 10), digits(n));
            nn /= 10;
        }
        return sum;
    }
}
