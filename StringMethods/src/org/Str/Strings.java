package org.Str;

public class Strings {
      public static void main(String[] args) {
		String a = "Sugeetha";
		String s = "Stella";
		String t = "tall";
		
		char b=a.charAt(3);
		System.out.println(b);
		
		int c = a.indexOf("h");
		System.out.println(c);
		
		int c1 = a.lastIndexOf("e");
		System.out.println(c1);
		
		int d =a.length();
		System.out.println(d);
		
		boolean e=a.isEmpty();
		System.out.println(e);
		
		boolean bool =a.contains("g");
		System.out.println(bool);
		
		String trim=a.trim();
		System.out.println(trim);
		
		boolean start=a.startsWith("S");
		System.out.println(start);
		
		boolean end=a.endsWith("a");
		System.out.println(end);
		
		String upper = a.toUpperCase();
		System.out.println(upper);
		
		String lower = a.toLowerCase();
		System.out.println(lower);
		
		boolean equal=a.equals(s);
		System.out.println(equal);
		
		boolean equal1=a.equalsIgnoreCase(s);
		System.out.println(equal1);
		
		String replace=t.replace("t", "b");
		System.out.println(replace);
		
		String replaceall = s.replaceAll("Stella", "Nancy");
		System.out.println(replaceall);
		
		String sub=a.substring(2);
		System.out.println(sub);
		
		String v = "Thalapathy";
		String sub1=v.substring(5, 10);
		System.out.println(sub1);
		
		
		int z=a.compareTo(v);
		System.out.println(z);
		  
		
	
	}
}
