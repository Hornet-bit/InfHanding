package by.epamtc.birukov.dao;

import by.epamtc.birukov.service.EntityParser;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class FileReader {

    public static void readLine(){

        Path filePath = FileSystems.getDefault().getPath("resources" + File.separator + "text.txt");
        //FileReader.class.getResourceAsStream("example.txt");

//        String path = "resources/text.txt";
        String path = "src/by/epamtc/birukov/resources/text.txt";

        //todo убрать src
//        String filePath = "./resources/example.txt";
        String line = "";
        try {
            BufferedReader reader = new BufferedReader(new java.io.FileReader(path));
//            BufferedReader reader = Files.newBufferedReader(filePath);

            while (true) {

                line = reader.readLine();
//                System.out.println(line);

                if (line == null ){
                    break;
                }
                EntityParser.parseEntity(line);
            }
        }
        catch (IOException e){
            System.err.println("Error");
            e.printStackTrace();
            //log
        }




    }




}






