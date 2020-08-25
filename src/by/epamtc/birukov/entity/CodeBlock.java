package by.epamtc.birukov.entity;

public class CodeBlock implements PartOfText{

    String value = null;

    public CodeBlock(String value){
        this.value = value;
    }


    @Override
    public String getContent() {
        return value;
    }
}
