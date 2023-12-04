import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGUI {
    public static void main(String[] args) {
        // Создаем главное окно
        JFrame frame = new JFrame("Simple GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Создаем кнопку
        JButton button = new JButton("Click Me");

        // Добавляем слушателя событий для кнопки
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Button clicked!");
            }
        });

        // Создаем панель с кнопкой
        JPanel panel = new JPanel();
        panel.add(button);

        // Добавляем панель в окно
        frame.add(panel);

        // Делаем окно видимым
        frame.setVisible(true);
    }
}
