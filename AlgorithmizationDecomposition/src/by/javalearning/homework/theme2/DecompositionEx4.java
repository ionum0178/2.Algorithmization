package by.javalearning.homework.theme2;

import java.util.Scanner;

//2.Algorithmisation
//������������ � �������������� ������� (������������).
//������ 4. �� ��������� ������ ������ ������������ n �����. �������� ����� (������), 
//������������, ����� ������ �� ��� ����� ����� ������� ����������. ��������. ���������� ����� ������� � ������.

public class DecompositionEx4 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("������� ���������� �����:");
        System.out.print("N=");
        int n = in.nextInt();
        if (n < 2) {
            System.out.println("������������ �����");
            System.exit(1);
        }
        double[][] a = new double[2][n]; // [0, i] - x; [1, i] - y
        for (int i = 0; i < a[0].length; i++) {
            System.out.println("������� ���������� " + (i + 1) + "-� �����: ");
            System.out.print("X=");
            a[0][i] = in.nextDouble();
            System.out.print("Y=");
            a[1][i] = in.nextDouble();
        }
        pointsDistance(a);
        in.close();
    }

    // ���������� ����� ������� � � � ������� �� ������� d = sqrt((�� � ��)^2 + (��
    // � ��)^2).
    // ��� �������� ����� ���������� �������� ���������� (d^2)
    static void pointsDistance(double a[][]) {
        double maxD = -1; // ������� ����������
        int maxI = 0;
        int maxJ = 0;
        for (int i = 0; i < (a[0].length - 1); i++) {
            for (int j = i + 1; j < a[0].length; j++) {
                double d = ((a[0][i] - a[0][j]) * (a[0][i] - a[0][j])) + ((a[1][i] - a[1][j]) * (a[1][i] - a[1][j]));
                if (d > maxD) {
                    maxD = d;
                    maxI = i;
                    maxJ = j;
                }
            }
        }
        System.out.println("���������� ���������� ����� ������� " + (maxI + 1) + " � " + (maxJ + 1));
    }
}
