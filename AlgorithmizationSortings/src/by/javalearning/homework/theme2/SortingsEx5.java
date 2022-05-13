package by.javalearning.homework.theme2;

import java.util.Scanner;

//2.Algorithmisation
//���������� �������. ����������
//������ 5. ���������� ���������. ���� ������������������ ����� a1, a2,..., an.   
//��������� ����������� ����� � ������� �����������. �������� ��� ��������� �������. 
//����� a1, a2,..., ai - ������������� ������������������, �. �. a1<=a2<=...<=ai. 
//������� ��������� ����� ai+1 � ����������� � ������������������ ���, ����� ����� 
//������������������ ���� ���� ������������. ������� ������������ �� ��� ���, ���� ��� �������� 
//�� i+1 �� n �� ����� ���������. 
//����������. ����� ��������� ���������� �������� � ��������������� ����� �����������
//� ������� ��������� ������. �������� ����� �������� � ���� ��������� �������.

public class SortingsEx5 {

    public static int[] arrFill(int n) {
        @SuppressWarnings("resource")
	Scanner in = new Scanner(System.in);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("������� ������� [" + (i + 1) + "]: ");
            arr[i] = in.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("������� ����� ������������������:");
        System.out.print("N=");
        int n = in.nextInt();
        if (n <= 0) {
            System.out.println("������ ������������������ �� ����� ���� ������� ��� �������������!");
            System.exit(1);
        }
        System.out.println("������� ������������������:");
        int ar[] = new int[n];
        ar = arrFill(n);

        // �� ����������
        for (int a : ar)
            System.out.print(a + "\t");
        System.out.println();

        // ���������� ���������
        int val;
        for (int i = 1; i < ar.length; i++) {
            int position = binFindPlace(ar, i); // �������� �����
            val = ar[i];
            for (int j = i; j > position; j--) {
                ar[j] = ar[j - 1];
            }
            ar[position] = val;
        }
        // ����� ����������
        for (int a : ar)
            System.out.print(a + "\t");
        System.out.println();
        
        in.close();
    }

    // �������� �����
    public static int binFindPlace(int arr[], int rng) { // �� 0 �� rng - ��������������� ����� �������
        int hfr = rng / 2;
        int pos = hfr;
        while (hfr > 1) {
            hfr = hfr / 2;
            if (arr[rng] < arr[pos])
                pos -= hfr;
            else
                pos += hfr;
        }
        // ��� ������������� ������� ������� ����� �������� ��� �������� �� ���� � �� ��
        // �������
        // ��������� � ������� � ������ �������
        while ((arr[rng] < arr[pos]) && (pos > 0))
            pos--;
        while ((arr[rng] >= arr[pos]) && (pos < rng))
            pos++;
        return pos;
    }
}
