package by.epamtc.birukov.entity;

import java.util.ArrayList;
import java.util.List;

public class Text implements PartOfText {

    private final List<PartOfText> VALUES = new ArrayList<>();


    public void addComponent(PartOfText component){
        VALUES.add(component);
    }

    public void removeComponent(PartOfText component){
        VALUES.remove(component);
    }

    @Override
    public String getContent() {
        String result = "";
        for (PartOfText component: VALUES){
            result += component.getContent()+"\n";

        }
        return result;
    }
}
