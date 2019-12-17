服务器代码：
package socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**

 * @Description:
 * @author: cl
 * @date: 2019/12/11 3:39 下午
 */
public class ServerChat {
    public static void main(String[] args) throws IOException {
        int serverPort = 8899;
        //创建服务器并指定端口号
        ServerSocket server=new ServerSocket(serverPort);

        //开启监听
        Socket socket=server.accept();

        //创建线程
        Thread send=new Thread(new SocketWriter(socket,"网管"));
        Thread reception=new Thread(new SocketReader(socket));

        //开启线程
        send.start();
        reception.start();
    }
}

客户端代码：
package socket;

import java.io.IOException;
import java.net.Socket;

/**
 * @Description:
 * @author: cl
 * @date: 2019/12/11 3:44 下午
 */
public class Client {
    public static void main(String[] args) throws IOException {
        //ip  和  端口号
        Socket socket=new Socket("10.3.17.28",8899);

        Thread  send       =new Thread(new SocketWriter(socket,"我"));
        Thread  reception  =new Thread(new SocketReader(socket));

        send.start();
        reception.start();
    }
}
读操作代码：
package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * @program: classprogram
 * @Description:
 * @author: cl
 * @date: 2019/12/11 2:58 下午
 */
public class SocketReader implements Runnable {

    private Socket socket;

    private BufferedReader br;

    public SocketReader(Socket socket) {
        this.socket = socket;
    }

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        String temp = new String();
        try {
            //创建缓冲流 读取消息
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while (true){
                temp = br.readLine();
                System.out.println(temp);
                //以bye结尾就退出
                if(temp.endsWith("bye")){
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(br!=null){
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
写入代码：
package socket;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * @program: classprogram
 * @Description:
 * @author: Mr.Cheng
 * @date: 2019/12/11 3:16 下午
 */
public class SocketWriter implements Runnable {

    private Socket socket;
    private String userName;
    private PrintWriter pw;

    public SocketWriter(Socket socket) {
        this.socket = socket;
    }

    public SocketWriter(Socket socket, String userName) {
        this.socket = socket;
        this.userName = userName;
    }

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        String temp=new String();
        Scanner input=new Scanner(System.in);
        try {
            //打印流 通过Socket用于发送消息
            pw=new PrintWriter(socket.getOutputStream(),true);

            while (true){
                temp=input.nextLine();
                //将消息发送出去
                pw.println(userName+":"+temp);
                //以bye结尾就退出
                if(temp.endsWith("bye")){
                    break;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(pw!=null){
                pw.close();
            }
        }
    }
}

