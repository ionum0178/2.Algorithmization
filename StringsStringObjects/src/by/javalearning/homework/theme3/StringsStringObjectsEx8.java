package by.javalearning.homework.theme3;

import java.util.Scanner;

/* 
 * 3.Strings and basics of text processing
 * ������ �� ������� ��� � �������� ���� String ��� StringBuilder.
 * ������ 8. �������� ������ ����, ����������� ���������. ����� ����� 
 * ������� ����� � ������� ��� �� �����. ������, ����� ����� ������� ���� 
 * ����� ���� ���������, �� ������������.
 */

public class StringsStringObjectsEx8 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String s;
	System.out.println("������� ������: ");
	s = in.nextLine();
	String s1 = longestWord(s);
	System.out.print("����� ������� �����: " + s1);
	in.close();
    }

    static String longestWord(String s) {
	String w="";
	String[] words = s.split(" ");
	int countletters=0;
	int countwords=0;
	for (int i=0; i<words.length; i++) {
	    if (words[i].length()>countletters) {
		countletters=words[i].length();
		w=words[i];
	    }
	}
	for (int i=0; i<words.length; i++) {
	    if (words[i].length()==countletters) {
		countwords++;
	    }
	}
	if (countwords>1) {
	    return "�� �������";
	} else {
	    return w;
	}
    }
}
