package login.jiemian;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * @program: classprogram
 * @Description:
 * @author: chan
 * @date: 2019/11/9
 */
public class JieMian {
    static JFrame frame = new JFrame();
    public static void main(String[] args) {
        // 创建 JFrame 实例
        JFrame frame = new JFrame("Login Example");
        // Setting the width and height of frame
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /* 创建面板，这个类似于 HTML 的 div 标签
         * 我们可以创建多个面板并在 JFrame 中指定位置
         * 面板中我们可以添加文本字段，按钮及其他组件。
         */

        JPanel panel = new JPanel();
        // 添加面板
        frame.add(panel);
        /*
         * 调用用户定义的方法并添加组件到面板
         */
        placeComponents(panel);

        // 设置界面可见
        frame.setVisible(true);


    }

    //注册界面
    private static void perForm(JPanel panel ){
        final String COMMAND_LOGON = "LOGON";
        //设置布局为空
        panel.setLayout(null);
        //注册用户名
        JLabel name = new JLabel("name:") ;
        name.setBounds(10,20,80,25);
        panel.add(name );

        //输入域
        JTextField nameField = new JTextField(20) ;
        nameField.setBounds(100,20,165,25) ;
        panel.add(nameField) ;

        //注册用户密码
        JLabel password = new JLabel("password:") ;
        password.setBounds(10,50,80,25) ;
        panel.add(password);

        //注册用户密码安全显示
        JPasswordField passwordField = new JPasswordField(20) ;
        passwordField.setBounds(100,50,165,25);
        panel.add(passwordField);

        //注册用户邮箱
        JLabel email = new JLabel("email");
        email.setBounds(10,80,80,25);
        panel.add(email);

        //邮箱输入域
        JTextField emailField = new JTextField(20);
        emailField.setBounds(100,80,165,25);
        panel.add(emailField);

        //注册按钮
        JButton logonButton = new JButton("logon");
        logonButton.setBounds(10,110,80,25);
        logonButton.setActionCommand(COMMAND_LOGON);
        panel.add(logonButton );


        ActionListener logonActionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //获取动作
                String command = e.getActionCommand();
                //比较动作是否一致
                if(COMMAND_LOGON.equals(command) ){
                    System.out.println("OK 按钮被点击");
                    JOptionPane.showMessageDialog(null, "标题【出错啦】", "此功能尚未完善", JOptionPane.ERROR_MESSAGE);
                }
            }
        };
        //监听
        logonButton.addActionListener(logonActionListener);
    }

    //登录界面
    private static void placeComponents(JPanel panel) {

        final String COMMAND_LOGIN = "LOGIN";
        final String COMMAND_Register ="REGISTER";
        final String COMMAND_FORGET = "FORGET";

        /* 布局部分我们这边不多做介绍
         * 这边设置布局为 null
         */
        panel.setLayout(null);

        // 创建 JLabel
        JLabel userLabel = new JLabel("User:");
        /* 这个方法定义了组件的位置。
         * setBounds(x, y, width, height)
         * x 和 y 指定左上角的新位置，由 width 和 height 指定新的大小。
         */
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);

        /*
         * 创建文本域用于用户输入
         */
        JTextField userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        // 输入密码的文本域
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        /*
         *这个类似用于输入的文本域
         * 但是输入的信息会以点号代替，用于包含密码的安全性
         */
        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        // 创建登录按钮
        JButton loginButton = new JButton("login");
        loginButton.setBounds(10, 80, 80, 25);
        loginButton.setActionCommand(COMMAND_LOGIN);
        panel.add(loginButton);

        //创建注册按钮
        JButton RegisterButton = new JButton("Register");
        RegisterButton.setBounds(100,80,80,25);
        RegisterButton.setActionCommand(COMMAND_Register);
        panel.add(RegisterButton);

        //忘记密码按钮
        JButton ForgetButton = new JButton("Forget");
        ForgetButton.setBounds(190,80,80,25);
        ForgetButton.setActionCommand(COMMAND_FORGET);
        panel.add(ForgetButton);

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 获取动作命令
                String command = e.getActionCommand();

                // 根据动作命令区分被点击的按钮
                if (COMMAND_LOGIN.equals(command)) {
                    System.out.println("OK 按钮被点击");
                    JOptionPane.showMessageDialog(null, "标题【出错啦】", "此功能尚未完善", JOptionPane.ERROR_MESSAGE);

                }
                else {
                    System.out.println("Cancel 按钮被点击");
                }
                if (COMMAND_Register .equals(command)) {
                    closeThis();
                    // 创建新的窗口
                    JFrame frame = new JFrame("Register");
                    // 设置在屏幕的位置
                    frame.setLocation(100,50);
                    // 窗体大小
                    frame.setSize(350,200);
                    JPanel panel = new JPanel();
                    // 添加面板
                    frame.add(panel);
                    /*
                     * 调用用户定义的方法并添加组件到面板
                     */
                    perForm(panel) ;
                    // 显示窗体
                    frame.setVisible(true);

                    }
                 else {
                    System.out.println("Cancel 按钮被点击");
                }
                    if (COMMAND_FORGET .equals(command)) {
                        System.out.println("OK 按钮被点击");
                        JOptionPane.showMessageDialog(null, "标题【出错啦】", "此功能尚未完善", JOptionPane.ERROR_MESSAGE);

                    } else {
                        System.out.println("Cancel 按钮被点击");
                    }
            }
        };
        //监听
        loginButton.addActionListener(actionListener);
        RegisterButton.addActionListener(actionListener);
        ForgetButton.addActionListener(actionListener) ;
    }

    //窗口关闭
    private static void closeThis() {
        frame.dispose();
    }

}
