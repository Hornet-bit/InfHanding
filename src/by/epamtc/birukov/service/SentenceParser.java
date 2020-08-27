package by.epamtc.birukov.service;

import by.epamtc.birukov.entity.Paragraph;
import by.epamtc.birukov.entity.PartOfText;
import by.epamtc.birukov.entity.Sentence;

public class SentenceParser {

    public static Paragraph makeSentencesFromParagr(String par){

        String[] sentences = par.split("(?<=\\?)");

        Paragraph paragraph = new Paragraph();


        Sentence sentenceObj;
        for (String a: sentences){

            sentenceObj = EntityParser.parseEntity(a);
            paragraph.addComponent(sentenceObj);

        }



        return paragraph;
    }

}
