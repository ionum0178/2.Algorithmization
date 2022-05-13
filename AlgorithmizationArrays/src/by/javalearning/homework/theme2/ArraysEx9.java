package by.javalearning.homework.theme2;

import java.util.Scanner;

//2.Algorithmisation
//���������� ������� 
//������ 9. � ������� ����� ����� � ����������� ��������� n ����� �������� ����� ������������� �����. 
//���� ����� ����� ���������, �� ���������� ���������� �� ���.

public class ArraysEx9 {
    public static void main(String[] args) {
        System.out.println("������� ����� �������:");
        Scanner in = new Scanner(System.in);
        System.out.print("N=");
        int n = in.nextInt();
        if (n <= 0) {
            System.out.println("����� ������� �� ����� ���� ������� ��� �������������!");
            System.exit(1);
        }
        int[] arr = new int[n];
        int[] num = new int[n]; // ������ ��� ��������� � arr[]
        int[] freq = new int[n]; // ������� ��� ���������� ������ �������
        for (int i = 0; i < n; i++) {
            System.out.println("������� " + (i + 1) + " ������� �������: ");
            arr[i] = in.nextInt();
            num[i] = arr[i];
        }
        for (int i = 0; i < n; i++) { // ����������, ������� ��� ����������� ������ �������
            freq[i] = 0;
            for (int k = 0; k < n; k++) {
                if (arr[i] == num[k]) { // ���� ����� ��������� ��������� ����� ��
                    freq[i]++;
                }
            }
        }
        int min = 0; // ������ ����������� �� �������� ����� ������������� �����
        for (int j = 0; j < n; j++) {
            if (freq[j] > freq[min]) {
                min = j;
            } else if (freq[j] == freq[min])
                if (num[j] < num[min])
                    min = j;
        }
        System.out.println(num[min]);
        in.close();
    }
}
