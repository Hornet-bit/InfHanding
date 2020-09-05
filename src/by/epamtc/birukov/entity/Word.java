package by.epamtc.birukov.entity;

import java.io.Serializable;
import java.util.Objects;

public class Word implements PartOfText, Serializable {

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word = (Word) o;
        return position == word.position &&
                Objects.equals(value, word.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, position);
    }

    @Override
    public String toString() {
        return "Word{" +
                "value='" + value + '\'' +
                ", position=" + position +
                '}';
    }
}
