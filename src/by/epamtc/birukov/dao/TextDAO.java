package by.epamtc.birukov.dao;

import by.epamtc.birukov.entity.Text;

import java.net.URISyntaxException;

public interface TextDAO {
    Text readParagraph(String str) throws URISyntaxException;
}
