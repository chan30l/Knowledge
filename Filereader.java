package filereader.text;
import java.io.* ;
/**
 * @author :cl
 * @Date：2019-12-15
 * @Description：先读取文件内容并在控制台输出，随后依据提示输入要修改的内容。
 */
public class FileReader {
    public static void main(String[] args){
       try{
           BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(new FileInputStream("out.txt") ) );
           String username = bufferedReader1.readLine();
           String password = bufferedReader1.readLine();
           System.out.println("用户名："+username);
           System.out.println("密码:"+password);
           BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in) );
           System.out.println("Enter a line");
           String line =  bufferedReader.readLine();
           System.out.println("Enter password");
           String newPassword = bufferedReader.readLine();
           BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("out.txt") ) );
           bufferedWriter .write(line+"\n");
           bufferedWriter.write(newPassword);
           bufferedWriter .close();
       } catch (IOException e) {
           e.printStackTrace();
       }
    }
}
