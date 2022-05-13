package by.javalearning.homework.theme3;

import java.util.Scanner;

/* 
 * 3.Strings and basics of text processing
 * ������ �� ������� ��� � �������� ��������.
 * ������ 5. ������� � ������ ��� ������ �������, �� ���� ����� ������ ������ 
 * �������� �������� �� ��������� �������. ������� ������� � ������ �������.
 */

public class StringsSymbolArraysEx5 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String s;
	System.out.println("������� ������: ");
	s = in.nextLine();
	String s1 = deleteSpaces(s);
	System.out.println("����������� ������: \n(������ ������)" + s1 + "(����� ������)");
	in.close();
    }
    
    static String deleteSpaces(String s) {
	// ��������� ������
	char[] c = s.toCharArray();
	int i = 0;
	String s1="";
	// �������� ������
	
	// ������ ������ 
	while (Character.isWhitespace(c[i])) {
		i++;
		if (i == c.length) {
		    break;
		}
	}
	// ���������� ������
	while (i < c.length) {
	    if (!Character.isWhitespace(c[i])) {
		s1=s1+c[i];
		i++;
		if (i == c.length) {
		    break;
		}
	    }
	    
	    while (Character.isWhitespace(c[i])) {
		    i++;
		    if (i == c.length) {
			break;
		    }
		    if (!Character.isWhitespace(c[i])) {
			s1=s1+c[i-1];
		    }
	    }
	}
    return s1;
    }
}
