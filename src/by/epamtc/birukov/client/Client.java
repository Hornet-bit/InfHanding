package by.epamtc.birukov.client;

import by.epamtc.birukov.dao.ParagraphReader;
import by.epamtc.birukov.entity.Text;

import java.io.*;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URL;
import java.nio.channels.SocketChannel;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Client {
    public static void main(String[] ar) {
        int serverPort = 9999;
        String address = "localhost";

        try {
            URL resource = ParagraphReader.class.getResource("../resources/text.txt");
            File path = Paths.get(resource.toURI()).toFile();

            InetAddress ipAddress = InetAddress.getByName(address);

            Socket socket = new Socket(ipAddress, serverPort);


            InputStream сin = socket.getInputStream();
            OutputStream сout = socket.getOutputStream();

            DataInputStream in = new DataInputStream(сin);
            DataOutputStream out = new DataOutputStream(сout);


            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path));
            BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());



            byte[] byteArray = Files.readAllBytes(Paths.get(resource.toURI()));//
            int count = byteArray.length;


//            bos.write(count);


            while (bis.read(byteArray)!=-1) {

//                byteArray = bis.readNBytes(1024);
                bos.write(byteArray);


                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

                    Text text = (Text) ois.readObject();
                    System.out.println(text.getContent());

                bis.close();
                bos.close();
            }

        } catch (Exception x) {
            x.printStackTrace();
        }
    }
}
