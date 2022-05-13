package by.javalearning.homework.theme2;

import java.util.Scanner;

//2.Algorithmisation
//������������ � �������������� ������� (������������).
//������ 10. ���� ����������� ����� N. �������� ����� (������) ��� ������������ 
//�������, ���������� �������� �������� ����� ����� N.

public class DecompositionEx10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("������� ����������� �����:");
        System.out.print("N=");
        int n = in.nextInt();

        // ����� �������
        for (int a : fill(n))
            System.out.print(a + "\t");
        System.out.println();
        
        in.close();
    }

    static int[] fill(int n) {
        int r = 0;
        int a = n;
        while (a != 0) {
            r++;
            a /= 10;
        }
        a = n;
        int[] ar = new int[r];
        for (int i = (r - 1); i >= 0; i--) {
            ar[i] = a % 10;
            a /= 10;
        }
        return ar;
    }
    
}
