package pl.put.poznan.ioprojectarchitecture.logic;

public class NumbersExpander {
	
	private boolean numberExpandAllow;
	private String text;

	/**
	 * Class constructor
	 */
	public NumbersExpander() {	
	}

	/**
	 * Class constructor specifying type of transformation
	 *
	 * @param numberExpandAllow 	bool variable to select the transformation
	 * @param text 					text to tramsform
	 */
	public NumbersExpander(boolean numberExpandAllow, String text) {
		this.numberExpandAllow = numberExpandAllow;
		this.text = text;
	}

	/**
	 * Returns String "text" with converted numbers into words
	 *
	 * @return 		numbers into words
	 */
	public String numberExpander() {
		if(numberExpandAllow) {
			String[] arr = text.split(" ");
			char[] chars;
			String result = "";
			String number = "";
			for ( String ss : arr) {
				chars = ss.toCharArray();
				if (Character.getNumericValue(chars[0]) >= 0 && Character.getNumericValue(chars[0]) < 10)
				for(int i = chars.length-1, j=1; i >= 0; i--, j++){
					if(j == 1)
					switch (chars[i]){
						case '1':
							number = "jeden";
							break;
						case '2':
							number = "dwa";
							break;
						case '3':
							number = "trzy";
							break;
						case '4':
							number = "cztery";
							break;
						case '5':
							number = "pięć";
							break;
						case '6':
							number = "sześć";
							break;
						case '7':
							number = "siedem";
							break;
						case '8':
							number = "osiem";
							break;
						case '9':
							number = "dziewięć";
							break;
					}
					if(j == 2)
						switch (chars[i]){
							case '1':
								number = "dziesięć " + number;
								break;
							case '2':
								number = "dwadzieścia " + number;
								break;
							case '3':
								number = "trzydzieści " + number;
								break;
							case '4':
								number = "czterdieści " + number;
								break;
							case '5':
								number = "pięćdziesiąt " + number;
								break;
							case '6':
								number = "sześćdziesiąt " + number;
								break;
							case '7':
								number = "siedemdziesiąt " + number;
								break;
							case '8':
								number = "osiemdziesiąt " + number;
								break;
							case '9':
								number = "dziewięćdziesiąt " + number;
								break;
						}
						if( j == 2 && Character.getNumericValue(chars[chars.length-2]) == 1)
							switch (chars[chars.length-1]){
								case '1':
									number = "jedenaście";
									break;
								case '2':
									number = "dwanaście";
									break;
								case '3':
									number = "trzynaście";
									break;
								case '4':
									number = "czternaście";
									break;
								case '5':
									number = "piętnaście";
									break;
								case '6':
									number = "szesnaście";
									break;
								case '7':
									number = "siedemnaście";
									break;
								case '8':
									number = "osiemnaście";
									break;
								case '9':
									number = "dziewiętnaście";
									break;
							}
					if(j == 3)
						switch (chars[i]){
							case '1':
								number = "sto " + number;
								break;
							case '2':
								number = "dwieście " + number;
								break;
							case '3':
								number = "trzysta " + number;
								break;
							case '4':
								number = "czterysta " + number;
								break;
							case '5':
								number = "pięćset " + number;
								break;
							case '6':
								number = "sześćset " + number;
								break;
							case '7':
								number = "siedemset " + number;
								break;
							case '8':
								number = "osiemset " + number;
								break;
							case '9':
								number = "dziewięćset " + number;
								break;
						}
				}
				result += (number.compareTo("") == 0) ? ss + " " : number + " ";
				number = "";
			}


			return result;
		} else {
			return text;
		}
	}
	
}
