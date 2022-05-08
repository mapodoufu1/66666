

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class Log {
    public void writeFile(String expression, String result) {   //设置文件
        try {
            final String currentLogPath = System.getProperty("user.dir");
            final String fileName = currentLogPath + "/log.txt";

            FileWriter writer = new FileWriter(fileName, true);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String time = sdf.format(new java.util.Date());

            writer.write(time + ": " + expression + " = " + result + "\n");
            writer.close();
        } catch (IOException e) {   //IO异常
            System.out.println("Problem writing file!!!");
        }
    }
}
