package by.javalearning.homework.theme2;

import java.util.Arrays;
import java.util.Scanner;

//2.Algorithmisation
//���������� ������� 
//������ 7. ���� �������������� ����� a1,a2,...,a2n. ����� max(a1+a2n, a2+a2n-1, ...an+an+1).

public class ArraysEx7 {
    public static void main(String[] args) {
        System.out.println("������� ����� ������� (������ �����):");
        Scanner in = new Scanner(System.in);
        System.out.print("N=");
        int n = in.nextInt();
        if (n <= 0) {
            System.out.println("����� ������� �� ����� ���� ������� ��� �������������!");
            System.exit(1);
        }
        if ((n % 2) != 0) {
            System.out.println("�� ����� �������� �����!");
            System.exit(1);
        }
        double[] arr = new double[n];
        double[] aaa = new double[(n / 2)];
        for (int j = 0; j < n; j++) {
            System.out.println("������� " + (j + 1) + " ������� �������: ");
            arr[j] = in.nextDouble();
        }
        for (int i = 0; i < (n / 2); i++) {
            aaa[i] = arr[i] + arr[n - 1 - i];
        }
        Arrays.sort(aaa);
        double max = aaa[aaa.length - 1];
        System.out.println(max);
        in.close();
    }
}
