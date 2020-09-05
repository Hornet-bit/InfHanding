package by.epamtc.birukov.main;

import by.epamtc.birukov.controller.Controller;
import by.epamtc.birukov.dao.ParagraphReader;
import by.epamtc.birukov.entity.Text;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URISyntaxException;
import java.net.UnknownHostException;

public class Main {

    public static void main(String[] args){

        Controller controller = new Controller();
        controller.startServer();


    }
}
