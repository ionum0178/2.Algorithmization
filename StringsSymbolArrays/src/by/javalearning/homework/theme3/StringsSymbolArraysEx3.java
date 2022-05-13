package by.javalearning.homework.theme3;

import java.util.Scanner;

/* 
 * 3.Strings and basics of text processing
 * ������ �� ������� ��� � �������� ��������.
 * ������ 3. � ������ ����� ���������� ����.
 */

public class StringsSymbolArraysEx3 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String s;
	System.out.println("������� ������: ");
	s = in.nextLine();
	int count = findDigits(s);
	System.out.println("���������� ���� � ������: " + count);
	in.close();
    }
    
    static int findDigits(String s) {
	char[] c=s.toCharArray();
	int count=0;
	int i=0;
	while (i<c.length) {
	    if (Character.isDigit(c[i])) {
	    count++;
	    } 
	i++;
	}
	return count;
	}
}
