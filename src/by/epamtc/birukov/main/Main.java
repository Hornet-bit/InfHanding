package by.epamtc.birukov.main;

import by.epamtc.birukov.dao.ParagraphReader;
import by.epamtc.birukov.entity.Text;

import java.net.URISyntaxException;

public class Main {

    public static void main(String[] args) throws URISyntaxException {


//        FileReader.readLine();
        Text text = new Text();

        ParagraphReader paragraphReader = new ParagraphReader();
        paragraphReader.readParagraph();



//        //////////////////////////////////////
//
//        int port = 9999;
//        try {
//            ServerSocket ss = new ServerSocket(port);
//            System.out.println("Waiting...");
//
//            Socket socket = ss.accept();
//
//
//
//            //  входной и выходной потоки сокета
//            InputStream sin = socket.getInputStream();
//            OutputStream sout = socket.getOutputStream();
//
//            // Конвертируем потоки в другой тип, чтоб легче обрабатывать текстовые сообщения.
//            DataInputStream in = new DataInputStream(sin);
//            DataOutputStream out = new DataOutputStream(sout);
//
//            String line = null;
//            while(true) {
//                line = in.readUTF(); // ожидаем пока клиент пришлет строку текста.
//                System.out.println("client send " + line);
//                out.writeUTF(line);
//                out.flush(); // заставляем поток закончить передачу данных.
//                System.out.println();
//            }
//        } catch(Exception x) { x.printStackTrace(); }


    }
}
