package com.lty.ui;
import javax.swing.*;
import java.awt.*;

public class GameJFrame extends JFrame {
     //游戏主界面
      public GameJFrame() {
          //设置界面宽高
          this.setSize(800,800);

          //设置界面标题

          this.setTitle("拼图游戏 v1.0");

          //设置界面置顶
          this.setAlwaysOnTop(true);
          //设置界面居中
          this.setLocationRelativeTo(null);
          //设置关闭模式
          this.setDefaultCloseOperation(3);
       //菜单栏设置

          //1.创建一个菜单对象
          JMenuBar jmb=new JMenuBar();

          jmb.setFont(new Font("微软雅黑",Font.ROMAN_BASELINE,20));
          //2.创建这个菜单的两个功能分别为(功能 关于我们)


          JMenu FunctionJmb=new JMenu("功能");
          JMenu AboutUs=new JMenu("关于我们");

           //调整字体
          FunctionJmb.setFont(new Font("微软雅黑",Font.ROMAN_BASELINE,20));
          AboutUs.setFont(new Font("微软雅黑",Font.ROMAN_BASELINE,20));


          //并且把他们添加到jmb中
          jmb.add(FunctionJmb);
          jmb.add(AboutUs);
          //3.创建选项下面的条目对象
          JMenuItem ReplayGame=new JMenuItem("重新游戏");
          JMenuItem ReLogINGame=new JMenuItem("重新登录");
          JMenuItem ExitGame=new JMenuItem("关闭游戏");


          //设置字体
          ReplayGame.setFont(new Font("微软雅黑",Font.ROMAN_BASELINE,18));
          ReLogINGame.setFont(new Font("微软雅黑",Font.ROMAN_BASELINE,18));
          ExitGame.setFont(new Font("微软雅黑",Font.ROMAN_BASELINE,18));

          //把3个功能添加到"功能"菜单下
          FunctionJmb.add(ReplayGame);
          FunctionJmb.add(ReLogINGame);
          FunctionJmb.add(ExitGame);

          //把一个功能添加到"关于我们"菜单下
          JMenuItem accountItem=new JMenuItem("公众号");


          accountItem.setFont(new Font("微软雅黑",Font.ROMAN_BASELINE,18));


          AboutUs.add(accountItem);










          //把菜单设置进界面
          this.setJMenuBar(jmb);



          //设置界面显示
          this.setVisible(true);
      }

}
