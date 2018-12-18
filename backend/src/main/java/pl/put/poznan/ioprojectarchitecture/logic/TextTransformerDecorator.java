package pl.put.poznan.ioprojectarchitecture.logic;

public abstract class TextTransformerDecorator extends TextTransformer {
    protected TextTransformer textToTransform;

    public TextTransformerDecorator(TextTransformer textToTransform) {
        this.textToTransform = textToTransform;
    }

    @Override
    public abstract String transform();
}
