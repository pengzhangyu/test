package test;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitTest {

	
	public static void main(String[] args) {
		String path="C:\\fakepath\\php-cgi.sh";
	/*	//String[] filename = path.split(File.separator);
		String regex = "([a-zA-Z0-9\u4e00-\u9fa5]|\\.)*$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(path);
		System.out.println(m.group());*/
		
		System.out.println(path);
		String[] s = path.split("\\\\"); //\\
		for (String e : s) {
			System.out.println(e);
		}
		
		int lastIndex = path.lastIndexOf("\\");
		System.out.println(lastIndex);
		System.out.println(path.substring(lastIndex+1));
	}
}
