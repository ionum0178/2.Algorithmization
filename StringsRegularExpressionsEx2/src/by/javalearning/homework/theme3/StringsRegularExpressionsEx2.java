package by.javalearning.homework.theme3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 3.Strings and basics of text processing
 * ������ �� ������� ��� � �������� ���� String ��� StringBuilder.
 * ������ 2. �������� ����������, ����������� ��������������� ���������� 
 * ���������� ����� xml-��������� � ��� ���  (����������� ���, 
 * �����������  ���, ���������� ����, ��� ��� ����). ������������ �������� 
 * ��������� XML ��� ������� ������ ������ ������. 
 */

public class StringsRegularExpressionsEx2 {
    static String fileName = "./src/resource/xml.xml";
    static final String XML_TAG_PATTERN = "<(\\s*[^/]+?)>|</(.+?)>|<([^/]+?)/>";

    public static void main(String[] args) throws IOException {
	Pattern tag_search = Pattern.compile(XML_TAG_PATTERN);
	String xml_doc = readFile(fileName).strip(); // ������ �� �����, ������� �������� �������
	Matcher matcher = tag_search.matcher(xml_doc);
	int pos = 0; // ������� ������ � ������
	while (matcher.find()) { // ���� ���� ����
	    if (pos > 0) { // ���������� ������ �� ������� ���� �������������
		// ���������� ����
		String tag = xml_doc.substring(pos, matcher.start());
		if (!tag.isBlank()) {
		    tag = tag.replaceAll("\\s+", " ");
		    System.out.println("���������� ����: " + tag);
		}
	    }
	    pos = matcher.end();
	    if (matcher.group(1) != null) {
		System.out.print("����������� ���: ");
	    } else if (matcher.group(2) != null) {
		System.out.print("����������� ���: ");
	    } else {
		System.out.print("��� ��� ����: ");
	    }
	    System.out.println(matcher.group(0).replaceAll("\\s+", " "));
	}
    }

    // ������ �����
    @SuppressWarnings("resource")
    static String readFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line = reader.readLine();
        String xml_text = "";
        while (line != null) {
            xml_text += line + "\n";
            line = reader.readLine();
        }
        return xml_text;
    }

}
