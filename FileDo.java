package filedo;
import java.io.*;
/**
 * @author ：cl
 * date:2019-12-16
 * descrition:读取文件内容
 */
public class FileDo {
    public static void main(String[] args) {
        try {
            File file = new File("sb.txt");
            if (!file.exists()) {
                throw new Exception();
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            String username = bufferedReader.readLine();
            String password = bufferedReader.readLine();
            System.out.println("用户名：" + username);
            System.out.println("密码："+password );
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
