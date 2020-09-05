package by.epamtc.birukov.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Paragraph implements PartOfText, Serializable {

    private final List<PartOfText> values = new ArrayList<>();

    public void addComponent(PartOfText component){
        values.add(component);
    }

    public void removeComponent(PartOfText component){
        values.remove(component);
    }

    @Override
    public String getContent() {
        String result = "";
        for (PartOfText component: values){
            result += component.getContent()+" ";

        }
        return result;
    }
}
