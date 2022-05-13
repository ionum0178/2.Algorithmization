package by.javalearning.homework.theme3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
 * 3.Strings and basics of text processing
 * ������ �� ������� ��� � �������� ���� String ��� StringBuilder.
 * ������ 1.C������ ����������, ����������� �����(����� �������� � ������) �
 * ����������� ��������� � ������� ��� ��������� ��������: ������������� 
 * ������ �� ���������� �����������; � ������ ����������� ������������� ����� 
 * �� �����; ������������� ������� � ����������� �� �������� ���������� ���������
 * ��������� �������, � � ������ ��������� � �� ��������.
 */

public class StringsRegularExpressionsEx1 {
    private static File file;
    private static Scanner sc;
    private static StringBuilder text;
    private static String txt; 
    private static Pattern linesPattern = Pattern.compile("\\s*[\n\r]+"); // ���������� �� ������
    private static Pattern sntncPattern = Pattern.compile("[\\.\\!\\?]+"); // ���������� �� �����������
    private static Pattern wordsPattern = Pattern.compile("[\\s\\p{Punct}�-]+"); // ���������� �� �����

    public static void main(String[] args) {
	readTextFile(); //��������� ���� � �������
	txt = text.toString(); // ����������� � ������
	startMenu(); 
    }
    
    // ��������� ���� � �������
    private static void readTextFile() {
	file = new File("./src/resource/text.txt");
	text = new StringBuilder();
	sc = null;
	try {
	    sc = new Scanner(file);
	    while (sc.hasNextLine()) {
		text.append(sc.nextLine()).append("\n");
	    }
	} catch (FileNotFoundException e) {
	    e.printStackTrace();
	    System.exit(1);
	}
    }

    private static void startMenu() {
	@SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);
	while (true) {
	    System.out.println("�������� ����� ����:\n" 
		    + "0. �����\n" 
		    + "1. ������� �� ����� �������� �����\n"
		    + "2. ������������� ������ �� ���������� �����������\n" 
		    + "3. ������������� ����� � ������������ �� �����\n"
		    + "4. ������������� ����� � ������������ �� �������� ���������� ��������� ���������\r\n"
		    + "�������, � � ������ ��������� - �� ��������\n");
	    int choice = scanner.nextInt();
	    if (choice == 0) {
		System.out.println("���������� ��� ���!");
		System.exit(1);
	    }
	    if (choice < 1 || choice > 4) {
		System.out.println("������ ������������ ����� ����, ��������� ����.");
		continue;
	    }
	    switch (choice) {
	    case 1:
		System.out.println(text.toString());
		break;
	    case 2:
		System.out.println(sortLines(txt));
		break;
	    case 3:
		System.out.println(sortByLength(txt));
		break;
	    case 4:
		System.out.print("������� ������: (�� ���������� �������� ��������� ������)");
		String symb = scanner.next();
		char symbol = symb.charAt(0);
		System.out.println(sortBySymbol(txt, symbol));
		break;
	    }
	}
	}
    
    // ���������� ������� �� ���������� �����������
    private static String sortLines(String txt) {
	String[] lines = linesPattern.split(txt); 
	// ��� ���������� ������� ������ � ����� ������: 
	// ����� ������ (index) � ���������� ����������� � ��� (value)
	IndexedValue[] sntncQuantity = new IndexedValue[lines.length];
	for (int i = 0; i < lines.length; i++) {
	    sntncQuantity[i] = new IndexedValue();
	    sntncQuantity[i].index = i;
	    sntncQuantity[i].value = sntncPattern.split(lines[i]).length;
	}
	Arrays.sort(sntncQuantity);
	String result = ""; // �������� ��������������� �����
	for (var c : sntncQuantity) {
	    result += lines[c.index] + "\n";
	}
	return result;
    }
    
	// ���������� ���� � ������������ �� �����
    private static String sortByLength(String txt) {
	String[] lines = linesPattern.split(txt); 
	String result = "";
	for (var ln : lines) {
	    String[] sentences = sntncPattern.split(ln);
	    // ����� �� �������� ���� ���������� � ����� �����������
	    Matcher pMatcher = sntncPattern.matcher(ln);
	    boolean firstSentence = true; // ������ ����� ������ � ����������� �������������
	    for (var sentence : sentences) {
		String[] words = wordsPattern.split(sentence);
		if (words.length == 0)
		    continue;
		if (firstSentence) {
		    firstSentence = false;
		} else {
		    result += " "; // ������ ����� ������ � ����������� �������������
		}
		// ������� �������� � ������ ��� ��, ��� ������� ����������� � �������
		IndexedValue[] sc = new IndexedValue[words.length]; 
		for (int i = 0; i < words.length; i++) {
		    sc[i] = new IndexedValue();
		    sc[i].index = i;
		    sc[i].value = words[i].length();
		}
		Arrays.sort(sc);
		boolean firstWord = true;
		for (var c : sc) {
		    // ����������� ������ ���������� � ��������� �����
		    if (firstWord) {
			if (c.value == 0)
			    continue; // ������� ���� � ������� ������
			result += Character.toUpperCase(words[c.index].charAt(0));
			result += words[c.index].substring(1);
			firstWord = false;
		    } else { // ������ ����� �������
			result += " " + words[c.index];
		    }
		}
		if (pMatcher.find()) { // ���� ���������� � ����� �����������
		    result += ln.substring(pMatcher.start(), pMatcher.end());
		} else {
		    result += "."; // ���� ������ �� ���� - ������ �����
		}
	    }
	    result += "\n";
	}
	return result;
    }

// ���������� ���� � ������������ �� �������� ���������� ��������� ���������
// �������, � � ������ ��������� - �� ��������
    private static String sortBySymbol(String txt, char symbol) {
	String[] lines = linesPattern.split(txt); // ���������� �� ������
	String result = "";
	for (var ln : lines) {
	    String[] sentences = sntncPattern.split(ln);
	    // ����� �� �������� ���� ���������� � ����� �����������
	    Matcher pMatcher = sntncPattern.matcher(ln);
	    boolean firstSentence = true; // ������ ����� ������ � ����������� �������������
	    for (var sentence : sentences) {
		String[] words = wordsPattern.split(sentence);
		if (words.length == 0)
		    continue;
		if (firstSentence) {
		    firstSentence = false;
		} else {
		    result += " "; // ������ ����� ������ � ����������� �������������
		}
		// ������� �������� � ������ 
		// ��� ���������� ������� ������ � ����� ������: 
		// ����� (word) � ���������� �������� � ��� (value)
		WordSort[] ds = new WordSort[words.length]; 
		for (int i = 0; i < words.length; i++) {
		    ds[i] = new WordSort();
		    ds[i].word = words[i];
		    for (var ch : words[i].toCharArray()) { // ������� ��������� ��������� �������
			if (ch == symbol)
			    ds[i].value--; //���������, ����� ����� ������������� �� �����������
		    }
		}
		Arrays.sort(ds);
		boolean firstWord = true;
		for (var c : ds) {
		    if (c.word.isBlank())
			continue; // ������� ������ ����
		 // ����������� ������ ���������� � ��������� �����
		    if (firstWord) {
			result += Character.toUpperCase(c.word.charAt(0));
			result += c.word.substring(1);
			firstWord = false;
		    } else { // ������ ����� �������
			result += " " + c.word;
		    }
		}
		if (pMatcher.find()) { // ���� ���������� � ����� �����������
		    result += ln.substring(pMatcher.start(), pMatcher.end());
		} else {
		    result += "."; // ���� ������ �� ���� - ������ �����
		}
	    }
	    result += "\n";
	}
	return result;
    }
}


 // ����� ��� ���������� ����������� � �� �������� ���������� 
class IndexedValue implements Comparable<IndexedValue> {
    public int index;
    public int value;

    @Override
    public int compareTo(IndexedValue that) {
	return this.value - that.value;
    }
}

//����� ��� ���������� ���� �� ���������� ��������
class WordSort implements Comparable<WordSort> {
    public int value;
    public String word;
    
//���������� �� ���������� ��������, ���� ����������, ���������� ����� �� ��������
    
    @Override
    public int compareTo(WordSort that) {
	if (this.value == that.value) {
	    return this.word.compareToIgnoreCase(that.word);
	} else {
	    return this.value - that.value;
	}
    }
}

