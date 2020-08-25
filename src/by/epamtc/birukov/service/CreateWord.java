package by.epamtc.birukov.service;

import by.epamtc.birukov.entity.Word;

public class CreateWord {
    public static Word createWord(String word){

        Word wordObj = new Word(word);
        return wordObj;
    }
}
