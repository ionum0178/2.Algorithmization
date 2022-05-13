package by.javalearning.homework.theme2;

import java.util.Scanner;

//2.Algorithmisation
//������������ � �������������� ������� (������������).
//������ 12. ���� ����������� ����� � � N. �������� ����� (������) ������������ 
//������� �, ���������� �������� �������� �����, ����� ���� ������� ����� � � ������� �� ������ N.

public class DecompositionEx12 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("������� � � N:");
        System.out.print("K=");
        int k = in.nextInt();
        System.out.print("N=");
        int n = in.nextInt();

        // ����� �������
        for (int a : makeArray(k, n))
            System.out.print(a + "\t");
        System.out.println();
        
        in.close();
    }

    static int[] makeArray(int k, int n) {
        // K �� ����� ���� ������, ��� N.
        int el = 0;
        for (int i = 0; i < n; i++) { // ������� ���������� ��������� �������
            if (digitSum(i) == k)
                el++;
        }
        int[] a = new int[el]; // ��������� ������
        int j = 0;
        int t = 0;
        while (j < n) { // ���������
            if (digitSum(j) == k) {
                a[t] = j;
                t++;
            }
            j++;
        }
        return a;
    }
    
    static int digitSum(int n) { // ����� ���� �����
        int nn = n;
        int sum = 0;
        while (nn != 0) {
            sum += nn % 10;
            nn /= 10;
        }
        return sum;
    }
}
