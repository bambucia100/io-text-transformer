package pl.put.poznan.ioprojectarchitecture.logic.functionality;


import pl.put.poznan.ioprojectarchitecture.logic.TextTransformer;
import pl.put.poznan.ioprojectarchitecture.logic.TextTransformerDecorator;

public class ShortcutsModifier extends TextTransformerDecorator {

	private String shortcutType;
	private String result;
	private String text;

    /**
     * Class constructor
     */
	public ShortcutsModifier(TextTransformer textToTransform, String shortcutType) {
		super(textToTransform);
		this.descr = textToTransform.getText();
		this.shortcutType = shortcutType;
	}


    /**
     * Returns String "text" with modified shortcuts
     *
     * @return      the modified shortcut
     */
	public String function(String s) {
		//text = textToTransform.getText();
		text = s;
		result = "";
		if (shortcutType.equals("expand")) {
			//String[] arr = textToTransform.getText().split(" ");
			String[] arr = s.split(" ");
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

	@Override
	public String transform() {
		return function(textToTransform.transform());
	}

}

