package by.epamtc.birukov.entity;

import java.util.ArrayList;
import java.util.List;

public class Sentence implements PartOfText{

    private final List<PartOfText> VALUES = new ArrayList<>();

    public void addComponent(PartOfText component){
        VALUES.add(component);
    }

    public void removeComponent(PartOfText component){
        VALUES.remove(component);
    }
    //todo функционал

    @Override
    public String getContent() {
        String result = "";
        for (PartOfText component: VALUES){
            result += component.getContent()+" ";

        }
        return result;
    }
}
