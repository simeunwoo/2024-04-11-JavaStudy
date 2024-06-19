package com.sist.dao;
import javax.swing.*;
import java.awt.*;
import java.util.List;

public class ComboBoxExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("ComboBox Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 200);
            frame.setLayout(new FlowLayout());

            JComboBox<String> comboBox = new JComboBox<>();
            GoodsDAO dao = new GoodsDAO();
            List<String> items = dao.getComboBoxItems();

            for (String item : items) {
                comboBox.addItem(item);
            }

            frame.add(comboBox);
            frame.setVisible(true);
        });
    }
}