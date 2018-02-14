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
			res = unit(nb, res);
		}
		else if(nb == 4){
			res = "IV";
		}
		else if(nb == 5) {
			res = "V";
		}
		else if(nb < 9) {
			res="V";
			res = unit(nb-5, res);
		}
		return res;
	}

	private String unit(int nb, String res) {
		for (int i = 0; i < nb; i++) {
			res=res+"I";
		}
		return res;
	}
}
