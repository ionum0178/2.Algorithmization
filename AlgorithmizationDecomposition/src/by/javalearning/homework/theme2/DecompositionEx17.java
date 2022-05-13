package by.javalearning.homework.theme2;

import java.util.Scanner;

//2.Algorithmisation
//������������ � �������������� ������� (������������).
//������ 17. �� ��������� ����� ����� ����� ��� ����. �� ���������� ����� ����� 
//����� ��� ���� � �.�. ������� ����� �������� ���� ����������, ����� ��������� ����?
//��� ������� ������ ������������ ������������.

public class DecompositionEx17 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("������� �����:");
        System.out.print("N=");
        int n = in.nextInt();
        System.out.println("����� ��������� ���� ����� " + decrease(n) + " ���������");
        in.close();
    }

    static int decrease(int n) {
        int d = 0; // ���������� ���������
        while (n != 0) {
            n = n - digitSum(n);
            d++;
        }
        return d;
    }

    static int digitSum(int n) { // ����� ���� �����
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
