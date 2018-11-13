package pl.put.poznan.ioprojectarchitecture.logic;

import pl.put.poznan.ioprojectarchitecture.rest.TextTransformerClass;

public class ShortcutsModifier {

	private String shortcutType;
	private String text;
	private String result;

    /**
     * Class constructor
     */
	public ShortcutsModifier() {	
	}

    /**
     * Class constructor specifying type of transformation
     *
     * @param shortcutType - String variable to select the transformation
     * @param text - - text to tramsform
     */
	public ShortcutsModifier(String shortcutType, String text) {
		this.shortcutType = shortcutType;
		this.text = text;
	}

    /**
     * Returns String "text" with modified shortcuts
     *
     * @return      the modified shortcut
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
                    case "inż.":
                        result += "inżynier ";
                        break;
                    case "Inż.":
                        result += "Inżynier ";
                        break;
                    case "br.":
                        result += "bieżącego roku ";
                        break;
                    case "Br.":
                        result += "Bieżącego roku ";
                        break;
                    case "nr":
                        result += "numer ";
                        break;
                    case "Nr":
                        result += "Numer ";
                        break;
                    case "mgr":
                        result += "magister ";
                        break;
                    case "Mgr":
                        result += "Magister ";
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

            text = text.replaceAll("inżynier","inż.");
            text = text.replaceAll("Inżynier","Inż.");

            text = text.replaceAll("bieżącego roku","br.");
            text = text.replaceAll("Bieżącego roku","Br.");

            text = text.replaceAll("numer","nr");
            text = text.replaceAll("Numer","Nr");

            text = text.replaceAll("mgr","magister");
            text = text.replaceAll("Mgr","Magister");


			return text;

		}
		else return text;

	}
}
