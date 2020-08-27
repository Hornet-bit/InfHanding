package by.epamtc.birukov.service;

import by.epamtc.birukov.entity.PunctuationMark;
import by.epamtc.birukov.entity.Sentence;
import by.epamtc.birukov.entity.Word;

import java.util.regex.Pattern;

public class EntityParser {

    public static Sentence parseEntity(String sentence) {

        Sentence sen = new Sentence();
        String[] split = sentence.split(" ?(?<!\\G)((?<=[^\\p{Punct}])(?=\\p{Punct})|\\b) ?");


        for (String a : split) {

            if (Pattern.matches("[\\p{Punct}]", a )) {//если знак пунктуации

                sen.addComponent(new PunctuationMark(a));
            }

            else if(!Pattern.matches("[\\p{Punct}]", a )){

                sen.addComponent(new Word(a));

            }
        }

        return sen;
    }
}
