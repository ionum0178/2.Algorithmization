package by.javalearning.homework.theme3;

import java.util.Scanner;

/* 
 * 3.Strings and basics of text processing
 * ������ �� ������� ��� � �������� ���� String ��� StringBuilder.
 * ������ 9. ��������� ���������� �������� (���������) � ��������� (�������) 
 * ���� � ��������� ������. ��������� ������ ���������� �����.
 */

public class StringsStringObjectsEx9 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String s;
	System.out.println("������� ������: ");
	s = in.nextLine();
	countSymbols(s);
	in.close();
    }

    static void countSymbols(String s) {
	int lowercase=0;
	int uppercase=0;
	for (int i=0; i<s.length(); i++) {
	    if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
		lowercase++;
	    }
	    if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
		uppercase++;
            }
	}
	System.out.println("���������� �������� ����: " + lowercase);
	System.out.println("���������� ��������� ����: " + uppercase);
    }
}
