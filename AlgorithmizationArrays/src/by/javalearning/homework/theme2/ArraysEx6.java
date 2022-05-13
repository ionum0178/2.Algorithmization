package by.javalearning.homework.theme2;

import java.util.Scanner;

//2.Algorithmisation
//���������� ������� 
//������ 6. ������ ������������������ N������������ �����. ��������� ����� �����, 
//���������� ������ ������� �������� �������� �������

public class ArraysEx6 {
    public static void main(String[] args) {
        System.out.println("������� ����� �������:");
        Scanner in = new Scanner(System.in);
        System.out.print("N=");
        int n = in.nextInt();
        if (n <= 0) {
            System.out.println("����� ������� �� ����� ���� ������� ��� �������������!");
            System.exit(1);
        }
        boolean f = true;
        double sum = 0;
        double[] arr = new double[n];
        for (int j = 0; j < n; j++) {
            System.out.println("������� " + (j + 1) + " ������� �������: ");
            arr[j] = in.nextDouble();
            f = true;
            if ((j + 1) > 1) {
                for (int i = 2; i < (j + 1); i++) {
                    if ((j + 1) % i == 0)
                        f = false;
                }
                if (f)
                    sum += arr[j];
            }
        }
        System.out.print("����� ���������: " + sum);
        in.close();
    }
}
