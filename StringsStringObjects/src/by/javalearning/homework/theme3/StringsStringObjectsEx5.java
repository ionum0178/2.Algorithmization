package by.javalearning.homework.theme3;

import java.util.Scanner;

/* 
 * 3.Strings and basics of text processing
 * ������ �� ������� ��� � �������� ���� String ��� StringBuilder.
 * ������ 5. ����������, ������� ��� ����� �������� �������� ������ 
 * ����������� ����� ���.
 */

public class StringsStringObjectsEx5 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String s;
	System.out.println("������� ������: ");
	s = in.nextLine();
	int q = aLetterCounter(s);
	System.out.println("���������� ���� �: " + q);
	in.close();
    }
    
    static int aLetterCounter(String s) {
	int q=0;
	for (int i=0; i<s.length();i++) {
	    if(s.charAt(i)=='a' || s.charAt(i)=='A'|| s.charAt(i)=='�'|| 
		    s.charAt(i)=='�') {
		q++;
	    }
	}
	return q;
    }
}
