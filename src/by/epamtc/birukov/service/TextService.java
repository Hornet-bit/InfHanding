package by.epamtc.birukov.service;

import by.epamtc.birukov.entity.Text;

import java.net.URISyntaxException;

public interface TextService {
    Text createComponent(String str) throws URISyntaxException;
}
