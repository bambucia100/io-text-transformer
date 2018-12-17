package pl.put.poznan.ioprojectarchitecture.logic;

public abstract class TextTransformerDecorator extends TextTransformer {
    protected TextTransformer textToTransform;

    public TextTransformerDecorator(TextTransformer textToTransform) {
        this.textToTransform = textToTransform;
        System.out.println(textToTransform.toString() + " decorator");
        System.out.println(textToTransform.getText() + " tekst");
    }

    @Override
    public abstract String transform();
}
