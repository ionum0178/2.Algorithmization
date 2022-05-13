package by.javalearning.homework.theme2;

import java.util.Scanner;

//2.Algorithmisation
//������������ � �������������� ������� (������������).
//������ 13. ��� ������� ����� ���������� �����������, ���� ��� ���������� 
//���� �� ����� �� 2 (��������, 41 � 43). ����� � ���������� ��� ���� ���������� 
//�� ������� [n,2n], ��� n-�������� ����������� ����� ������ 2. ��� ������� ������ 
//������������ ������������.

public class DecompositionEx13 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("������� N:");
        System.out.print("N=");
        int n = in.nextInt();
        if (n <= 2) {
            System.out.println("����� ������ ���� ������ 2!");
            System.exit(1);
        }
        primePairs(n);
        in.close();
    }

    static void primePairs(int n) {
        boolean f;
        for (int j = n; j < (2 * n); j++) {
            f = true;
            for (int i = 2; i < j; i++) {
                if (j % i == 0)
                    f = false;
            }
            if (f) {
                for (int i = 2; i < j; i++) {
                    if ((j + 2) % i == 0)
                        f = false;
                }
            }
            if (f && (j + 2) <= (2 * n))
                System.out.print(j + " " + (j + 2) + "\t");
        }
    }
}
