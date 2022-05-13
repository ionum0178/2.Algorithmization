package by.javalearning.homework.theme2;

import java.util.Scanner;

// 2.Algorithmisation
// ������������ � �������������� ������� (������������).
// ������ 9. ���� ����� X, Y, Z, � ������ ������ ����������������. �������� ����� 
// (������) ���������� ��� �������, ���� ���� ����� ��������� ������ X � Y�������.

public class DecompositionEx9 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("������� ����� ������ ����������������:");
        System.out.print("X=");
        double x = in.nextDouble();
        System.out.print("Y=");
        double y = in.nextDouble();
        System.out.print("Z=");
        double z = in.nextDouble();
        System.out.print("T=");
        double t = in.nextDouble();
        System.out.println("������� ���������������� �����: " + s(x, y, z, t));
        in.close();
    }

    // ������� ����������������: ��������� ��� �� ��� ������������, ���� �� ���
    // �������������
    static double s(double x, double y, double z, double t) {
        double s1 = x * y / 2;
        double r = Math.sqrt(x * x + y * y);
        double p = (z + t + r) / 2;
        double s2 = Math.sqrt(p * (p - z) * (p - t) * (p - r));
        return s1 + s2;
    }
}
