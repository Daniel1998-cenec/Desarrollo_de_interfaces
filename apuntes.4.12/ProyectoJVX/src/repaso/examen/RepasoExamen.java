package repaso.examen;

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;
// 1º creamos dos jpane uno para el formulario y otro para los botones
//2º vamos añadiendo los diferentes elementos
// para que los campos tengan el mismo tamaño, introducimos un layout, denominado gridlayout
// quedando como tenemos en este ejemplo
// 9 son la filas
// 1 las columnas
// 5 y 5 distancia en pixeles horizontal y vertical entre las celdas

public class RepasoExamen extends JFrame{
private JTextField textField;
private JTextField textField_1;
public RepasoExamen() {
getContentPane().setLayout(new BorderLayout(0, 0));

JPanel formulario = new JPanel();
formulario.setBackground(new Color(255, 255, 128));
getContentPane().add(formulario, BorderLayout.NORTH);
formulario.setLayout(new GridLayout(7, 7, 7, 7));

JLabel lblNewLabel_1 = new JLabel("Apellidos");
formulario.add(lblNewLabel_1);

textField = new JTextField();
formulario.add(textField);
textField.setColumns(10);

JLabel lblNewLabel = new JLabel("Nombre");
formulario.add(lblNewLabel);

textField_1 = new JTextField();
formulario.add(textField_1);
textField_1.setColumns(10);
JLabel lblOcupacin = new JLabel("Ocupación");
formulario.add(lblOcupacin);
JComboBox comboBox = new JComboBox();
comboBox.setModel(new DefaultComboBoxModel(new String[] {"Trabajador por cuenta ajena", "Sin trabajo"}));
formulario.add(comboBox);
JLabel lblEstudio = new JLabel("Estudio");
formulario.add(lblEstudio);
JComboBox comboBox_1 = new JComboBox();
comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Estudiando", "No estudiando"}));
formulario.add(comboBox_1);

JLabel label = new JLabel("");
formulario.add(label);

JLabel label_1 = new JLabel("");
formulario.add(label_1);

JPanel botones = new JPanel();
botones.setBackground(new Color(128, 255, 0));
botones.setForeground(new Color(255, 128, 64));
FlowLayout flowLayout = (FlowLayout) botones.getLayout();
flowLayout.setAlignment(FlowLayout.LEFT);
getContentPane().add(botones, BorderLayout.SOUTH);

JButton btnNewButton = new JButton("Aceptar");
botones.add(btnNewButton,BorderLayout.SOUTH);
setLocationRelativeTo(null);
pack();
}

public static void main(String[] args) {
// TODO Auto-generated method stub
SwingUtilities.invokeLater(() -> {
new RepasoExamen().setVisible(true);
});
}

}