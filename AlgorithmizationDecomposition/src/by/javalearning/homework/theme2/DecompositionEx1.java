package by.javalearning.homework.theme2;

import java.util.Scanner;

//2.Algorithmisation
//������������ � �������������� ������� (������������).
//������ 1. �������� ����� (������) ��� ���������� ����������� ������ �������� 
//� ����������� ������ �������� ���� ����������� �����.

public class DecompositionEx1 {
    
    int nod;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("������� ��� ����������� �����:");
        System.out.print("A=");
        int a = in.nextInt();
        System.out.print("B=");
        int b = in.nextInt();
        System.out.println("���������� ����� �������� �����: " + nod(a, b));
        System.out.println("���������� ����� ������� �����: " + nok(a, b));
        in.close();
    }

    // ���������� ����� �������
    static int nok(int a, int b) {
        return (a * b) / nod(a, b);
    }

    // ���������� ����� ��������
    static int nod(int a, int b) {
        int nod = 1;
        int r = 1;
        if (a == b)
            nod = a;
        while (r != 0) {
            if (a > b) {
                r = a % b;
                if (r == 0) {
                    nod = b;
                    break;
                } else {
                    a = b;
                    b = r;
                }
            } else {
                r = b % a;
                if (r == 0) {
                    nod = a;
                    break;
                } else {
                    b = a;
                    a = r;
                }
            }
        }
        return nod;
    }
}
