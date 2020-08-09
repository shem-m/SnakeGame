package SnakeGame;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Layer extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.ORANGE); //Задаем цвет элементов
//        g2.setColor(Color.RED);
        g.fillRect(Room.game.getWidth() * 10, 0, 10, (Room.game.getWidth() * 10) + 10);  //Рисуем прямоугольник показывающий край поля справа
        g.fillRect(0, Room.game.getHeight() * 10, (Room.game.getHeight() * 10) + 10, 10); //Рисуем прямоугольник показывающий край поля снизу
//        this.setBackground(Color.BLACK);
        g.fillRect(Room.game.getMouse().getX() * 10, Room.game.getMouse().getY() * 10, 10, 10); //Рисуем прямоугольник показывающий мышь

        List<SnakeSection> getSection = Room.game.getSnake().getSections(); //Получаем секции змейки
        for (int i = 0; i < getSection.size(); i++) {
            g.fillRect(getSection.get(i).getX() * 10, getSection.get(i).getY() * 10, 10, 10); //Рисуем по очереди секции змейки
        }
    }
}