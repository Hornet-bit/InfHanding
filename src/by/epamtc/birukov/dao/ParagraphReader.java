package by.epamtc.birukov.dao;

import by.epamtc.birukov.entity.CodeBlock;
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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParagraphReader implements TextDAO {
    public Text readParagraph(String str){


//        URL resource = ParagraphReader.class.getResource("../resources/text.txt");
//        File path = Paths.get(resource.toURI()).toFile();


        String line = "";
        Text text = new Text();
        //            BufferedReader reader = new BufferedReader(new java.io.FileReader(path));
        String result = "";
        String REGEX_CODE = "}";

        String [] arrayOfLines = str.split("\n");


        boolean isCode = false;
        for (int i = 0; i < arrayOfLines.length; i++){

            line = arrayOfLines[i];

//                if (line == null ){
//                    break;
//                }
            result+=line;

            if (line.contains("{")){

                isCode = true;

            }

            if (Pattern.matches("(?:[^\n][\n]?)+", line) && isCode == false){//в result параграф

                text.addComponent(SentenceParser.makeSentencesFromParagr(result));

                result = "";
            }
            else if (Pattern.matches("(?:[^\n][\n]?)+", line) && isCode){

//                    countBracket(result);
                if (countBracket(result) == 0){
                    CodeBlock codeBlock = new CodeBlock(result);
                    text.addComponent(codeBlock);
                    result = "";
                    isCode = false;
                }

                result+="\n";
            }

        }

        return text;
    }

    public static int countBracket(String code){

        Pattern REGEX_INCREMENT = Pattern.compile("\\{");
        Pattern REGEX_DECREMENT = Pattern.compile("}");

        int count = 0;
        Matcher increment = REGEX_INCREMENT.matcher(code);
        Matcher decrement = REGEX_DECREMENT.matcher(code);



        while (increment.find()){
            count++;
        }

        while (decrement.find()){
            count--;
        }

        return count;
    }
}
