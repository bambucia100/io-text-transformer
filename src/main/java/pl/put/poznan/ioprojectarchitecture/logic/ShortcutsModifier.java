package pl.put.poznan.ioprojectarchitecture.logic;

import pl.put.poznan.ioprojectarchitecture.rest.TextTransformerClass;

public class ShortcutsModifier {

	private String shortcutType;
	private String text;
	private String result;
	
	public ShortcutsModifier() {	
	}
	
	public ShortcutsModifier(String shortcutType, String text) {
		this.shortcutType = shortcutType;
		this.text = text;
		System.out.println(shortcutType);
	}
	//TODO
	public String modifyShortcuts() {
		result = "";

		//System.out.println(TextTransformerClass.getShortcuts());
		//if (shortcutType.equals("expand")) {
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
		//}
		return result;
	}
}
