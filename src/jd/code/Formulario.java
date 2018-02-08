package jd.code;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Date;

    public class Formulario extends JFrame {

        private JLabel etiqueta1;
        private JLabel etiqueta2;
        private JLabel etiqueta3;
        private JLabel etiqueta4;
        private JLabel etiqueta5;
        private JLabel etiqueta6;
        private JLabel title;
        private JTextField campo1;
        private JTextField campo2;
        private JTextField campo3;
        private JTextField campo4;
        private JButton guardar;
        private JDialog dialogo;
        private JRadioButton op1,op2,op3,op4;
        private JComboBox combo;
        private JComboBox gen;
        public Formulario() {
            super("Formulario de Inscripcion");
            etiqueta1 = new JLabel("Nombres: ");
            campo1 = new JTextField(15);

            etiqueta2 = new JLabel("Apellidos: ");
            campo2 = new JTextField(15);
            etiqueta3 = new JLabel("C.I.: ");
            campo3 = new JTextField(8);
            etiqueta4 = new JLabel("Emitido en: ");
            combo = new JComboBox();
            combo.addItem("La Paz");
            combo.addItem("Cochabamba");
            combo.addItem("Oruro");
            combo.addItem("Santa Cruz");
            combo.addItem("Potosi");
            combo.addItem("Tarija");
            combo.addItem("Pando");
            combo.addItem("Beni");
            combo.addItem("Chuquisaca");
            etiqueta5 = new JLabel("Sexo: ");
            gen = new JComboBox();
            gen.addItem("Hombre");
            gen.addItem("Mujer");
            gen.addItem("Helicoptero Apache");
            gen.addItem("Indefinido");
            etiqueta6 = new JLabel("Intereses: ");
            op1 = new JRadioButton("Tecnologia");
            op2 = new JRadioButton("Musica");
            op3 = new JRadioButton("Videojuegos");
            op4 = new JRadioButton("Deporte");
            guardar = new JButton("Guardar");

            title = new JLabel("Datos Almacenados");
            dialogo = new JDialog(this);
            dialogo.setSize(300, 100);
            FlowLayout f = new FlowLayout();
          setLayout(f);

            add(etiqueta1);
            add(campo1);
            add(etiqueta2);
            add(campo2);
            add(etiqueta3);
            add(campo3);
            add(etiqueta4);
            add(combo);
            add(etiqueta5);
            add(gen);
            add(etiqueta6);
            add(op1);
            add(op2);
            add(op3);
            add(op4);
            add(guardar);

            guardar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    guardarForm();
                }
            });
        }

        private void guardarForm() {
            String nom = campo1.getText();
            String ap = campo2.getText();
            String ci = campo3.getText();
            String emit = (String) combo.getSelectedItem();
            String sex = (String) gen.getSelectedItem();
            Boolean tech = op1.isSelected();
            Boolean music = op2.isSelected();
            Boolean game = op3.isSelected();
            Boolean sport = op4.isSelected();
            System.out.println("Nombre : "+nom +"\nApellidos: " + ap+ "\nC.I.: " + ci + "\nEmitido: " + emit + "\nSexo: " + sex );
            System.out.println("Tecnologia: "+ tech +"\nMusica: "+ music +"\nVideojuegos: "+ game+"\nDeporte: " + sport);
            title.setText("Sus Datos han sido guardados");
            dialogo.add(title);
            dialogo.setVisible(true);

        }




    }

