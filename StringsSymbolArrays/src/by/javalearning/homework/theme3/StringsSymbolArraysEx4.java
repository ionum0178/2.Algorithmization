package by.javalearning.homework.theme3;

import java.util.Scanner;

/* 
 * 3.Strings and basics of text processing
 * ������ �� ������� ��� � �������� ��������.
 * ������ 4. � ������ ����� ���������� �����.
 */

public class StringsSymbolArraysEx4 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String s;
	System.out.println("������� ������: ");
	s = in.nextLine();
	int count = findNumbers(s);
	System.out.println("���������� ����� � ������: " + count);
	in.close();
    }

    static int findNumbers(String s) {
	char[] c = s.toCharArray();
	int count = 0;
	int i = 0;
	while (i < c.length) {
	    if (Character.isDigit(c[i])) {
		count++;
		do {
		    i++;
		    if (i == c.length)
			break;
		} while (Character.isDigit(c[i]));
		if (i == c.length)
		    break;
		if (c[i] == '.') {
		    i++;
		    if (i == c.length)
			break;
		    if (Character.isDigit(c[i])) {
			do {
			    i++;
			    if (i == c.length)
				break;
			} while (Character.isDigit(c[i]));
		    }
		}
	    }
	    i++;
	    if (i == c.length)
		break;
	}
	return count;

    }
}
