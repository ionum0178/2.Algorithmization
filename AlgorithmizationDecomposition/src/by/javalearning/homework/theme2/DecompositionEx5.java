package by.javalearning.homework.theme2;

import java.util.Scanner;

//2.Algorithmisation
//������������ � �������������� ������� (������������).
//������ 5. ��������� ���������, ������� � ������� A[N] ������� ������ �� �������� ����� 
//(������� �� ������ �����, ������� ������ ������������� �������� �������, �� ������ ���� ������ ���������).

public class DecompositionEx5 {

    static int[] arrFill(int n) {
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
        System.out.println("������� ����� �������:");
        System.out.print("N=");
        int n = in.nextInt();
        if (n <= 0) {
            System.out.println("������ ������� �� ����� ���� ������� ��� �������������!");
            System.exit(1);
        }
        int ar[] = new int[n];
        ar = arrFill(n);

        for (int a : ar)
            System.out.print(a + "\t");
        System.out.println();

        System.out.println("������ �� �������� ����� � ������� ����� " + secondElement(ar));
        
        in.close();
    }

    static int secondElement(int aa[]) {
        int maxEl = aa[0];
        int sec= Integer.MIN_VALUE;
        for (int i = 0; i < aa.length; i++) { // ���� ������
            if (aa[i] > maxEl) {
                maxEl = aa[i];
            }
        }
        for (int i = 0; i < aa.length; i++) { // ���� ������
            if (aa[i] > sec && aa[i] < maxEl)
                sec = aa[i];
        }
        return sec;
    }
}
