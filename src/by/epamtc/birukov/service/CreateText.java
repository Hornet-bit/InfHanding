package by.epamtc.birukov.service;

import by.epamtc.birukov.dao.ParagraphReader;
import by.epamtc.birukov.entity.Text;

import java.net.URISyntaxException;

public class CreateText implements TextService {
    @Override
    public Text createComponent(String str) {
        ParagraphReader paragraphReader = new ParagraphReader();
        Text result = paragraphReader.readParagraph(str);

        return result;
    }
}
