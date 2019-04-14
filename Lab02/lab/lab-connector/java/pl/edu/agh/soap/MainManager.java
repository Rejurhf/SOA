package pl.edu.agh.soap;

import sun.misc.BASE64Decoder;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.xml.ws.BindingProvider;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class MainManager {

    public static void main(String[] args){
        StudentsManagerService studentsManagerService = new StudentsManagerService();
        StudentsManager studentsManager = studentsManagerService.getStudentsManagerPort();

        System.out.println("Ustawianie autoryzacji");
        setCredentials((BindingProvider) studentsManager);

        System.out.println("\n\nWyświetlenie obrazka użytkownika o id 777");
        System.out.println(studentsManager.getEncodeAvatarOf(777));
        decodeToImageDisp(studentsManager.getEncodeAvatarOf(777));

        System.out.println("\n\nWyświetlenie info o studentach");
        System.out.println(studentsManager.getAllStudentsInfo());
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
