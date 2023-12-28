package common;

public class RemoveSplChars {

	public static void main(String[] args) {
		String s= "Vikas%$%%*(&%Bansal";
		System.out.println(s);
		String s2=s.replaceAll("[^0-9,a-z,A-Z]", "");
		System.out.println(s2);
		System.out.println(s);
	}
}
