package by.epamtc.birukov.entity;

public class Word implements PartOfText {

    private String value = null;
    private int position;

    public Word (String value){
        this.value = value;
    }

    public Word (String value, int position){
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
