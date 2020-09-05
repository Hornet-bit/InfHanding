package by.epamtc.birukov.entity;

import java.io.Serializable;
import java.util.Objects;

public class PunctuationMark implements PartOfText, Serializable {

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PunctuationMark that = (PunctuationMark) o;
        return position == that.position &&
                Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, position);
    }

    @Override
    public String toString() {
        return "PunctuationMark{" +
                "value='" + value + '\'' +
                ", position=" + position +
                '}';
    }
}
