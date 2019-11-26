package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		StringBuilder s2 = new StringBuilder(s);
		for (int i = 0; i < s.length(); i++) {
			if(i%2 == 1) {
				s2.setCharAt(i, Character.toUpperCase(s.charAt(i)));
			}else {
				s2.setCharAt(i, Character.toLowerCase(s.charAt(i)));
			}
		}
		
		return s2.toString();
	}

}
