package Application;

import UI.MainFrame;

import java.awt.*;

public class Application {
    public static void main(String[] args) {
        System.setProperty("sun.java2d.opengl", "true");
        EventQueue.invokeLater(MainFrame::new);
    }
}
