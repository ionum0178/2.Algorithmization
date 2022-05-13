package by.javalearning.homework.theme2;

import java.util.Arrays;
import java.util.Scanner;

//2.Algorithmisation
//���������� ������� 
//������ 4. ���� �������������� ����� �1,�2,..., �n. �������� ������� ���������� � ���������� ��������.

public class ArraysEx4 {
    public static void main(String[] args) {
        System.out.println("������� ����� �������:");
	Scanner in = new Scanner(System.in);
        System.out.print("N=");
        int n = in.nextInt();
        if (n <= 0) {
            System.out.println("����� ������� �� ����� ���� ������� ��� �������������!");
            System.exit(1);
        }
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("������� " + (i + 1) + " ������� �������: ");
            arr[i] = in.nextDouble();
        }
        double minimum = arr[0];
        double maximum = arr[0];
        int minnum = 0;
        int maxnum = 0;
        for (int j = 0; j < n; j++) {
            if (arr[j] <= minimum) {
                minimum = arr[j];
                minnum = j;
            }
            if (arr[j] >= maximum) {
                maximum = arr[j];
                maxnum = j;
            }
        }
        String arr_str = Arrays.toString(arr);
        System.out.println("���������� ������� �� ������: " + arr_str);
        arr[minnum] = maximum;
        arr[maxnum] = minimum;
        arr_str = Arrays.toString(arr);
        System.out.println("���������� ������� ����� ������: " + arr_str);
        in.close();
    }
}
