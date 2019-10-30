import javax.swing.*;
import java.io.IOException;
public class ResourceTest {
    public static void main(String[] args) throws IOException {
        Class cl = ResourceTest.class;
        var title = new String(cl.getResourceAsStream("title.txt").readAllBytes(), "UTF-8");
        System.out.println(title);
        var about = new String(cl.getResourceAsStream("data/about.txt").readAllBytes(), "UTF-8");
        System.out.println(about);
        var price = new String(cl.getResourceAsStream("price.txt").readAllBytes(), "UTF-8");
        System.out.println(price);

        var icon = new ImageIcon(cl.getResource("about.gif.jpg"));
        JOptionPane.showMessageDialog(null, price, title, JOptionPane.INFORMATION_MESSAGE, icon);

    }
}