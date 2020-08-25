package by.epamtc.birukov.service;

import by.epamtc.birukov.entity.PunctuationMark;
import by.epamtc.birukov.entity.Sentence;

public class CreatePunctuation {

    public static PunctuationMark create(String symbol){

        PunctuationMark mark = new PunctuationMark(symbol);

        return mark;
    }

}
