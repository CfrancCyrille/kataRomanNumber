package kataRomanNumber;

public class RomanNumber {
	
	int[] pivotVal = new int[] {5,10};
	String[] pivotSymbol = new String[] {"V", "X"};

	/**
	 * Convert number from 1 to 3999 into roman number
	 * @param nb up to 3999
	 * @return roman number
	 */
	public String convert(int nb) {		
		String res="";		
		res = convertUpTo10(nb, res);
		return res;
	}

	private String convertUpTo10(int nb, String res) {
		if(nb < (pivotVal[0]-1)) {
			res = unit(nb, res);
		}
		else if(nb == (pivotVal[0]-1)){
			res = "I"+pivotSymbol[0];
		}
		else if(nb == pivotVal[0]) {
			res = pivotSymbol[0];
		}
		else if(nb < (pivotVal[1]-1)) {
			res=pivotSymbol[0];
			res = unit(nb-5, res);
		}
		else if(nb == (pivotVal[1]-1)) {
			res = "I"+pivotSymbol[1];
		}
		else if(nb == pivotVal[1]) {
			res = pivotSymbol[1];
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
