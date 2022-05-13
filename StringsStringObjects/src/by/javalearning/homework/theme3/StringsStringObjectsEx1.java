package by.javalearning.homework.theme3;

import java.util.Scanner;

/* 
 * 3.Strings and basics of text processing
 * ������ �� ������� ��� � �������� ���� String ��� StringBuilder.
 * ������ 1. ��� �����(������). ������� ���������� ���������� ������ 
 * ������ �������� � ���.
 */
 
public class StringsStringObjectsEx1 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String s;
	System.out.println("������� ������: ");
	s = in.nextLine();
	int q = spacesCount(s);
	System.out.println("���������� ���������� ������ ������ ��������: " + q);
	in.close();
    }

    static int spacesCount(String s) {
	int spaces=0;
	int maxSpaces=0;
	int i=0;
	while (i<s.length()) {
	    spaces=0;
	    while(s.charAt(i) == ' ') {
                spaces++;
                i++;
		if (i == s.length()) {
		    break;
		}
	    }
	    if (spaces > maxSpaces) {
		maxSpaces = spaces;
	    }
	    i++;
	}
	return maxSpaces;
    }
}
