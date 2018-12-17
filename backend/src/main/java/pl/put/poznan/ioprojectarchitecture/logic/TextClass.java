package pl.put.poznan.ioprojectarchitecture.logic;

public class TextClass extends TextTransformer{

    public TextClass(String str){
        this.descr = str;
    }

    @Override
    public String transform() {
        return descr;
    }

}
