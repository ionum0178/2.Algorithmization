package by.javalearning.homework.theme3;

import java.util.Scanner;

/* 
 * 3.Strings and basics of text processing
 * ������ �� ������� ��� � �������� ���� String ��� StringBuilder.
 * ������ 10. ������ X ������� �� ���������� �����������, ������ �� ������� 
 * ��������� ������, ��������������� ��� �������������� ������. ����������
 * ���������� ����������� � ������ X.
 */

public class StringsStringObjectsEx10 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in).useDelimiter("\n");
	String s;
	System.out.println("������� ������: ");
	s = in.nextLine();
	int x = sentenceCount(s);
	System.out.println("���������� ����������� � ������: " + x);
	in.close();

    }
    static int sentenceCount(String s) {
	int x=0;
	for (int i=0; i<s.length(); i++) {
	    if (s.charAt(i) == '.' || s.charAt(i) == '!' || s.charAt(i) == '?') {
		x++;
	    }
	}
	return x;
    }

}
