package kataRomanNumber;

public class RomanNumber {

	int[] pivotVal = new int[] { 5, 10, 50 };
	String[] pivotSymbol = new String[] { "V", "X", "L" };

	/**
	 * Convert number from 1 to 3999 into roman number
	 * 
	 * @param nb
	 *            up to 3999
	 * @return roman number
	 */
	public String convert(int nb) {
		String res = "";
		if (nb == 0) {
			return res;
		} else if (nb <= 10) {
			res = convertUpTo10(nb, res);
		} else if (nb < 40) {
			res = "X" + convert(nb - 10);
		} else if (nb < 50) {
			res = "XL" + convert(nb - 40);
		} else {
			res = "L" + convert(nb - 50);
		}
		return res;
	}

	private String convertUpTo10(int nb, String res) {
		if (nb < (pivotVal[0] - 1)) {
			res = unit(nb, res);
		} else if (nb == (pivotVal[0] - 1)) {
			res = "I" + pivotSymbol[0];
		} else if (nb == pivotVal[0]) {
			res = pivotSymbol[0];
		} else if (nb < (pivotVal[1] - 1)) {
			res = pivotSymbol[0];
			res = unit(nb - 5, res);
		} else if (nb == (pivotVal[1] - 1)) {
			res = "I" + pivotSymbol[1];
		} else if (nb == pivotVal[1]) {
			res = pivotSymbol[1];
		}
		return res;
	}

	private String unit(int nb, String res) {
		for (int i = 0; i < nb; i++) {
			res = res + "I";
		}
		return res;
	}
}
