package pl.put.poznan.ioprojectarchitecture.logic;

import java.util.Arrays;

import pl.put.poznan.ioprojectarchitecture.logic.functionality.*;
import pl.put.poznan.ioprojectarchitecture.rest.TextTransformerClass;


public abstract class TextTransformer {
	protected String descr = "valueATT";

	public String getText() {
		return descr;
	}

	public abstract String transform();

}
