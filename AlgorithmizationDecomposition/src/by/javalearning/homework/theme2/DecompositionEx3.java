package by.javalearning.homework.theme2;

import java.util.Scanner;
import java.lang.Math;

// 2.Algorithmisation
// ������������ � �������������� ������� (������������).
// ������ 3. ��������� ������� ����������� �������������� �� �������� �, 
// ��������� ����� ���������� ������� ������������.

public class DecompositionEx3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("������� ������ ������� ����������� ���������������:");
        System.out.print("A=");
        double a = in.nextDouble();
        System.out.println("������� �������������� �����: " + (6 * s(a)));
    // ������� ����������� �������������� ����� ������� ����� ��������������
    // ������������� � ������ �������, ������ ����� ������� ��������������.
        in.close();
}
    // ������� ��������������� ������������
    static double s(double a) {
        double s = Math.sqrt(3) * a * a / 4;
        return s;
    }
}
