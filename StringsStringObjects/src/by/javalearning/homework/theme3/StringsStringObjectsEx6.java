package by.javalearning.homework.theme3;

import java.util.Scanner;

/* 
 * 3.Strings and basics of text processing
 * ������ �� ������� ��� � �������� ���� String ��� StringBuilder.
 * ������ 6. �� �������� ������ �������� �����, �������� ������ ������ ������.
 */

public class StringsStringObjectsEx6 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String s;
	System.out.println("������� ������: ");
	s = in.nextLine();
	String s1 = doubleSymbols(s);
	System.out.println("����������� ������: \n" + s1);
	in.close();
    }

    static String doubleSymbols(String s) {
	String s1="";
	for (int i=0; i<s.length();i++) {
	    s1=s1 + s.charAt(i) + s.charAt(i);
	}
    	return s1;
    }

}
