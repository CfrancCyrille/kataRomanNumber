package kata.roman;

public enum RomanSymbols {
	I ("I", 1), V("V", 5), X("X",10), XL("XL",40), L("L",50); 

	private final String symbol;
	
	private final int value;
	
	private RomanSymbols(String symbol, int number) {
		this.symbol = symbol;
		this.value = number;
	}
	
	public String getSymbol() {
		return symbol;
	}
	
	public int getValue() {
		return value;
	}	
}
