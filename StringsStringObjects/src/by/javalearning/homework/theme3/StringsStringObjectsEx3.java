package by.javalearning.homework.theme3;

import java.util.Scanner;

/* 
 * 3.Strings and basics of text processing
 * ������ �� ������� ��� � �������� ���� String��� StringBuilder.
 * ������ 3. ���������, �������� �� �������� ����� �����������.
 */
 
public class StringsStringObjectsEx3 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String s;
	System.out.println("������� ������: ");
	s = in.nextLine();
	palindromCheck(s);
	in.close();
    }

    static void palindromCheck(String s) {
	String s1="";
	for (int i=(s.length()-1);i>=0;i--) {
	    s1+=s.charAt(i);
	}
	if (s1.equals(s)) {
	    System.out.println("������ �������� �����������");
	} else {
	    System.out.println("������ �� �������� �����������");
	}
    }

}
