package _00_Text_Funkifier;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		StringBuilder s2 = new StringBuilder(s);
		for (int i = 0; i < s.length(); i++) {
			s2.setCharAt(s.length()-1-i, s.charAt(i));
		}
		return s2.toString();
	}

}
