
import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws MalformedURLException {   //抛出异常
        final int width = 600;   //宽
        final int height = 800;  //高



        BuildUI calculator = new BuildUI();
        calculator.buildLayout();//构建布局
        calculator.setSize(width, height);
        calculator.setVisible(true);
    }
}
