package by.epamtc.birukov.controller;

import by.epamtc.birukov.entity.Text;
import by.epamtc.birukov.service.CreateText;

import java.io.*;
import java.net.*;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class Controller {

    public void startServer(){
        try {


            int serverPort = 9999;
            ServerSocket serverSocket = new ServerSocket(serverPort);

            Socket server = serverSocket.accept();

            InputStream in = server.getInputStream();



            ByteArrayOutputStream servInp = new ByteArrayOutputStream();

            byte[] buf = new byte[2000];


            int len = 0;
            while ( (len = in.read(buf)) > -1) {
                servInp.write(buf);
            }

                String str = new String(buf);

                CreateText createText = new CreateText();
                Text result = createText.createComponent(str);


                System.out.println("Sender Start");


                ObjectOutputStream oos = new ObjectOutputStream(server.getOutputStream());
                oos.writeObject(result);
            System.out.println("sender work");


//////////////////////////////////
//            result += fromClient.readLine();




        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
