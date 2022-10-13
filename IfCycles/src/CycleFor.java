import javax.swing.*;
import java.awt.*;

public class CycleFor {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Counter");
        jFrame.setSize(500, 300);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        for(int i=0;i<10;i++)
        jFrame.setContentPane(new DrawPanel());

    }

}
class DrawPanel extends JPanel{
    public void paintComponent(Graphics graphics){
        for(int i=0;i<10;i++) {
            graphics.setColor(Color.pink);
            graphics.fillRect(20+i*50, 50, 20, 20);
        JLabel jLabel=new JLabel();
        jLabel.setText(String.valueOf(i));

        jLabel.setBounds(20+i*50, 30, 20, 20);
        if(i%2==0)jLabel.setForeground(Color.MAGENTA);
        else jLabel.setForeground(Color.RED);
        this.add(jLabel);

    } }
}
