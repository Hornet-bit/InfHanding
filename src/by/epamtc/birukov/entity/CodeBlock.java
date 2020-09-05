package by.epamtc.birukov.entity;

import java.io.Serializable;

public class CodeBlock implements PartOfText, Serializable {

    String value = null;

    public CodeBlock(String value){
        this.value = value;
    }


    @Override
    public String getContent() {
        return "<code> "+value+" </code>";
    }
}
