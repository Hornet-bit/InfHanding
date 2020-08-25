package by.epamtc.birukov.entity;

public class PunctuationMark implements PartOfText {

    private String value;
    private int position;

    public PunctuationMark (String value){
        this.value = value;
    }

    public PunctuationMark(String value, int position){
        this.value = value;
        this.position = position;
    }

    @Override
    public String getContent() {
        return value;
    }

    public int getPosition(){
        return position;
    }
}
