package pl.edu.agh.soa2;

import sun.misc.BASE64Decoder;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceRef;
import javax.xml.ws.soap.MTOM;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class MainStudent {
    @MTOM(enabled=true, threshold=1024)
    @WebServiceRef(StudentService.class)

    public static void main(String[] args){
        StudentService studentService = new StudentService();
        Student student = studentService.getStudentPort();

        System.out.println("Ustawianie autoryzacji");
        setCredentials((BindingProvider) student);

        System.out.println("Wyświetlenie obrazka");
        System.out.println(student.encodeImage("agh.png"));
        decodeToImageDisp(student.encodeImage("agh.png"));

        System.out.println(student.hello("student"));

    }

    private static void setCredentials(BindingProvider port) {
        port.getRequestContext().put("javax.xml.ws.security.auth.username", "usera");
        port.getRequestContext().put("javax.xml.ws.security.auth.password", "password");
    }

    private static void decodeToImageDisp(String imageString) {

        BufferedImage image = null;
        byte[] imageByte;
        try {
            BASE64Decoder decoder = new BASE64Decoder();
            imageByte = decoder.decodeBuffer(imageString);
            ByteArrayInputStream bis = new ByteArrayInputStream(imageByte);
            image = ImageIO.read(bis);
            bis.close();
            DisplayImage(image);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void DisplayImage(BufferedImage bufferedImage) throws IOException
    {
        ImageIcon icon=new ImageIcon(bufferedImage);
        JFrame frame=new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setSize(200,300);
        JLabel lbl=new JLabel();
        lbl.setIcon(icon);
        frame.add(lbl);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
