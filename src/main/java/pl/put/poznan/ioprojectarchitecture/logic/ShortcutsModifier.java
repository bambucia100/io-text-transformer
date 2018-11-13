package pl.put.poznan.ioprojectarchitecture.logic;

import pl.put.poznan.ioprojectarchitecture.rest.TextTransformerClass;

public class ShortcutsModifier {

	private String shortcutType;
	private String text;
	private String result;
	
	public ShortcutsModifier() {	
	}

    /**
     *
     * @param shortcutType - String variable to select the transformation
     * @param text - - text to tramsform
     */
	public ShortcutsModifier(String shortcutType, String text) {
		this.shortcutType = shortcutType;
		this.text = text;
	}

    /**
     *
     * @return the modified shortcut
     */
	public String modifyShortcuts() {
		result = "";
		if (shortcutType.equals("expand")) {
			String[] arr = text.split(" ");
			for (String ss : arr) {
				switch (ss) {
					case "dr":
						result += "doktor ";
						break;
					case "Dr":
						result += "Doktor ";
						break;
					case "prof.":
						result += "profesor ";
						break;
					case "Prof.":
						result += "Profesor ";
						break;
					case "np.":
						result += "na przykład ";
						break;
					case "Np.":
						result += "Na przykład ";
						break;
					case "itp.":
						result += "i tym podobne ";
						break;
					case "Itp.":
						result += "I tym podobne ";
						break;
					default:
						result += ss + " ";
				}

			}
			return result;
		}
		else if(shortcutType.equals("compress")){
			text = text.replaceAll("doktor","dr");
			text = text.replaceAll("Doktor","Dr");
			text = text.replaceAll("profesor","prof.");
			text = text.replaceAll("Profesor","Prof.");
			text = text.replaceAll("na przykład","np.");
			text = text.replaceAll("Na przykład","Np.");
			text = text.replaceAll("i tym podobne","itp.");
			text = text.replaceAll("I tym podobne","Itp.");


			return text;

		}
		else return text;

	}
}
