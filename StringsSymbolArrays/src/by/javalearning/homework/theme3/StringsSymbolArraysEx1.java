package by.javalearning.homework.theme3;

import java.util.Scanner;

/* 
 * 3.Strings and basics of text processing
 * ������ �� ������� ��� � �������� ��������.
 * ������ 1. ��� ������ �������� ���������� � camelCase. ������������� �������� � snake_case.
 */

public class StringsSymbolArraysEx1 {

	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    System.out.println("������� ���������� ������������� ����������: ");
	    System.out.print("n=");
	    int n = in.nextInt();
	    System.out.println("������� ����� �������� ���������� � ������� camelCase: ");
	    String[] s = new String[n];
	    for (int i = 0; i < n; i++) {
	        s[i] = in.next();
	    }
	    System.out.println("����� ���������� � ������� snake_�ase: ");
	    for (int i = 0; i < n; i++) {
	        s[i] = camelToSnake(s[i]);
	        System.out.println(s[i]);
	    }  
	    in.close();
	}
	
	static String camelToSnake(String s) {
	    // ����������� ������ � ���������� ������
	    // ��� ���� ���������� ��������� ����� �������, ����� �������� "_"
	    int shift = 0;
	    for (int i = 1; i < s.length(); i++) { 
	        if (Character.isUpperCase(s.charAt(i))) shift++;
	    }
	    char[] result = new char[s.length() + shift];
	    result[0] = Character.toLowerCase(s.charAt(0));
	    shift = 0;	    
	    for (int i = 1; i < s.length(); i++) {
	        if (Character.isUpperCase(s.charAt(i))) {
	            result[i + shift] = '_';
	            shift++;
	            result[i + shift] = Character.toLowerCase(s.charAt(i));
	        } else {
	            result[i + shift] = s.charAt(i);
	        }
	    }
	    return new String(result);
	}

}
