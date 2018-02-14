package kataRomanNumber;

public class RomanNumber {

	/**
	 * Convert number from 1 to 3999 into roman number
	 * @param nb up to 3999
	 * @return roman number
	 */
	public String convert(int nb) {
		String res="";
		if(nb < 4) {
			for (int i = 0; i < nb; i++) {
				res=res+"I";
			}
		}
		return res;
	}
}
