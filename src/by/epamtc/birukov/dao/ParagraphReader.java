package by.epamtc.birukov.dao;

import by.epamtc.birukov.entity.Text;
import by.epamtc.birukov.service.SentenceParser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Pattern;

public class ParagraphReader {
    public String readParagraph() throws URISyntaxException {

        //String path = "src/by/epamtc/birukov/resources/text.txt";

        URL resource = ParagraphReader.class.getResource("../resources/text.txt");
        File normPath = Paths.get(resource.toURI()).toFile();


        String line = "";
        Text text = new Text();
        try {
            BufferedReader reader = new BufferedReader(new java.io.FileReader(normPath));
            String result = "";
            String REGEX_CODE = "}";


            boolean isCode = false;
            while (true) {

                line = reader.readLine();

                if (line == null ){
                    break;
                }
                result+=line;

                if (line.contains("{")){

                    isCode = true;

                }

                if (Pattern.matches("(?:[^\n][\n]?)+", line)){//в result параграф


//todo проверка на КОД
                    text.addComponent(SentenceParser.makeSentencesFromParagr(result));

                    result = "";
                }

            }


        }
        catch (IOException e){
            System.err.println("Error");
            e.printStackTrace();
            //log
        }

        System.out.println(text.getContent());
        return null;
    }
}
