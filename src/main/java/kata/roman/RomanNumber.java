package kata.roman;

import static kata.roman.RomanSymbols.*;

public class RomanNumber {

	/**
	 * Convert number from 1 to 3999 into roman number
	 * 
	 * @param nb
	 *            up to 3999
	 * @return roman number
	 */
	public String convert(int nb) {
		String res = "";
		// Nothing to convert
		if (nb == 0) {
			return res;
		}
		// From 1 to 10
		else if (nb < 10) {
			res = convertUpTo10(nb, res);
		}
		// From 10 to 50-10
		else if (nb < 40) {
			res = X.getSymbol() + convert(nb - 10);
		}
		// From 50-10 to 50
		else if (nb < 50) {
			res = XL.getSymbol() + convert(nb - 40);
		} 
		// From 50
		else {
			res = L.getSymbol() + convert(nb - 50);
		}
		return res;
	}

	private String convertUpTo10(int nb, String res) {
		// Numbers from 1 to 3
		if (nb < (V.getValue() - 1)) {
			res = unit(nb, res);
		}
		// Number 4
		else if (nb == (V.getValue() - 1)) {
			res = I.getSymbol() + V.getSymbol();
		} 
		// Number 5
		else if (nb == V.getValue()) {
			res = V.getSymbol();
		}
		// Numbers from 6 to 8
		else if (nb < (X.getValue() - 1)) {
			res = V.getSymbol();
			res = unit(nb - V.getValue(), res);
		}
		// Number 9
		else {
			res = I.getSymbol() + X.getSymbol();
		}
		return res;
	}

	private String unit(int nb, String res) {
		for (int i = 0; i < nb; i++) {
			res = res + I.getSymbol();
		}
		return res;
	}
}
