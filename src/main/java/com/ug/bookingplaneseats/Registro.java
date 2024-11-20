/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.ug.bookingplaneseats;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import javax.swing.JComboBox;




/**
 *
 * @author Misha
 */

public class Registro extends javax.swing.JFrame {

    private final ArrayList<String> registros = new ArrayList<>();
    private final Asiento[] asientos = new Asiento[30];
    private final ReentrantLock mutex = new ReentrantLock();

    /**
     * Creates new form Registro
     */
    public Registro() {
        initComponents();
        

        for (int i = 0; i < asientos.length; i++) {
            asientos[i] = new Asiento();
        }

        actualizarColoresAsientos();
    }

private void actualizarListaRegistrados() {
    // Guardar selección actual
    String seleccionCombo1 = (String) ComboCliente1.getSelectedItem();
    String seleccionCombo2 = (String) ComboCliente2.getSelectedItem();
    String seleccionCombo3 = (String) ComboCliente3.getSelectedItem();

    DefaultListModel<String> modeloLista = new DefaultListModel<>();
    for (String registro : registros) {
        modeloLista.addElement(registro);
    }
    jList1.setModel(modeloLista);

    DefaultComboBoxModel<String> modeloCombo1 = new DefaultComboBoxModel<>();
    DefaultComboBoxModel<String> modeloCombo2 = new DefaultComboBoxModel<>();
    DefaultComboBoxModel<String> modeloCombo3 = new DefaultComboBoxModel<>();

    for (String registro : registros) {
        modeloCombo1.addElement(registro);
        modeloCombo2.addElement(registro);
        modeloCombo3.addElement(registro);
    }

    ComboCliente1.setModel(modeloCombo1);
    ComboCliente2.setModel(modeloCombo2);
    ComboCliente3.setModel(modeloCombo3);

    // Restaurar selección
    ComboCliente1.setSelectedItem(seleccionCombo1);
    ComboCliente2.setSelectedItem(seleccionCombo2);
    ComboCliente3.setSelectedItem(seleccionCombo3);
}

    private void actualizarColoresAsientos() {
        for (int i = 0; i < asientos.length; i++) {
            if (asientos[i].getEstado()==true) {
                cambiarColorAsiento(i, java.awt.Color.RED);
            } else {
                cambiarColorAsiento(i, java.awt.Color.GREEN);
            }
        }
    }

private void cambiarColorAsiento(int indice, java.awt.Color color) {
    switch (indice) {
        case 0:
            Asiento1.setBackground(color);
            break;
        case 1:
            Asiento2.setBackground(color);
            break;
        case 2:
            Asiento3.setBackground(color);
            break;
        case 3:
            Asiento4.setBackground(color);
            break;
        case 4:
            Asiento5.setBackground(color);
            break;
        case 5:
            Asiento6.setBackground(color);
            break;
        case 6:
            Asiento7.setBackground(color);
            break;
        case 7:
            Asiento8.setBackground(color);
            break;
        case 8:
            Asiento9.setBackground(color);
            break;
        case 9:
            Asiento10.setBackground(color);
            break;
        case 10:
            Asiento11.setBackground(color);
            break;
        case 11:
            Asiento12.setBackground(color);
            break;
        case 12:
            Asiento13.setBackground(color);
            break;
        case 13:
            Asiento14.setBackground(color);
            break;
        case 14:
            Asiento15.setBackground(color);
            break;
        case 15:
            Asiento16.setBackground(color);
            break;
        case 16:
            Asiento17.setBackground(color);
            break;
        case 17:
            Asiento18.setBackground(color);
            break;
        case 18:
            Asiento19.setBackground(color);
            break;
        case 19:
            Asiento20.setBackground(color);
            break;
        case 20:
            Asiento21.setBackground(color);
            break;
        case 21:
            Asiento22.setBackground(color);
            break;
        case 22:
            Asiento23.setBackground(color);
            break;
        case 23:
            Asiento24.setBackground(color);
            break;
        case 24:
            Asiento25.setBackground(color);
            break;
        case 25:
            Asiento26.setBackground(color);
            break;
        case 26:
            Asiento27.setBackground(color);
            break;
        case 27:
            Asiento28.setBackground(color);
            break;
        case 28:
            Asiento29.setBackground(color);
            break;
        case 29:
            Asiento30.setBackground(color);
            break;
        default:
            // Índice inválido
            break;
    }
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Interfaz = new javax.swing.JPanel();
        Ventanilla1 = new javax.swing.JPanel();
        AsientoText1 = new javax.swing.JLabel();
        Cliente1 = new javax.swing.JLabel();
        TextAsiento1 = new javax.swing.JTextField();
        ComboCliente1 = new javax.swing.JComboBox<>();
        BotonReservar1 = new javax.swing.JButton();
        BotonEliminar1 = new javax.swing.JButton();
        BotonCambiar1 = new javax.swing.JButton();
        NombreVentanilla4 = new javax.swing.JLabel();
        Ventanilla2 = new javax.swing.JPanel();
        NombreVentanilla2 = new javax.swing.JLabel();
        AsientoText2 = new javax.swing.JLabel();
        Cliente2 = new javax.swing.JLabel();
        TextAsiento2 = new javax.swing.JTextField();
        ComboCliente2 = new javax.swing.JComboBox<>();
        BotonReservar2 = new javax.swing.JButton();
        BotonEliminar2 = new javax.swing.JButton();
        BotonCambiar2 = new javax.swing.JButton();
        Ventanilla3 = new javax.swing.JPanel();
        NombreVentanilla3 = new javax.swing.JLabel();
        AsientoText3 = new javax.swing.JLabel();
        Cliente3 = new javax.swing.JLabel();
        TextAsiento3 = new javax.swing.JTextField();
        ComboCliente3 = new javax.swing.JComboBox<>();
        BotonReservar3 = new javax.swing.JButton();
        BotonEliminar3 = new javax.swing.JButton();
        BotonCambiar3 = new javax.swing.JButton();
        Asientos = new javax.swing.JPanel();
        NombreVentanilla1 = new javax.swing.JLabel();
        Asiento1 = new javax.swing.JPanel();
        Asiento2 = new javax.swing.JPanel();
        Asiento3 = new javax.swing.JPanel();
        Asiento4 = new javax.swing.JPanel();
        Asiento5 = new javax.swing.JPanel();
        Asiento6 = new javax.swing.JPanel();
        Asiento7 = new javax.swing.JPanel();
        Asiento8 = new javax.swing.JPanel();
        Asiento9 = new javax.swing.JPanel();
        Asiento10 = new javax.swing.JPanel();
        Asiento11 = new javax.swing.JPanel();
        Asiento12 = new javax.swing.JPanel();
        Asiento13 = new javax.swing.JPanel();
        Asiento14 = new javax.swing.JPanel();
        Asiento15 = new javax.swing.JPanel();
        Asiento16 = new javax.swing.JPanel();
        Asiento17 = new javax.swing.JPanel();
        Asiento18 = new javax.swing.JPanel();
        Asiento19 = new javax.swing.JPanel();
        Asiento20 = new javax.swing.JPanel();
        Asiento21 = new javax.swing.JPanel();
        Asiento22 = new javax.swing.JPanel();
        Asiento23 = new javax.swing.JPanel();
        Asiento24 = new javax.swing.JPanel();
        Asiento25 = new javax.swing.JPanel();
        Asiento26 = new javax.swing.JPanel();
        Asiento27 = new javax.swing.JPanel();
        Asiento28 = new javax.swing.JPanel();
        Asiento29 = new javax.swing.JPanel();
        Asiento30 = new javax.swing.JPanel();
        RegistrarForm = new javax.swing.JPanel();
        Registrar = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        NombreText = new javax.swing.JTextField();
        Cedula = new javax.swing.JLabel();
        CedulaText = new javax.swing.JTextField();
        Apellidos = new javax.swing.JLabel();
        ApellidosText = new javax.swing.JTextField();
        Direccion = new javax.swing.JLabel();
        DireccionText = new javax.swing.JTextField();
        BotonRegistrar = new javax.swing.JButton();
        ListRegistrados = new javax.swing.JPanel();
        Registrados = new javax.swing.JLabel();
        ClientesRegistrados = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Ventanilla1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Ventanilla1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AsientoText1.setText("Asiento");
        Ventanilla1.add(AsientoText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 45, -1, -1));

        Cliente1.setText("Cliente");
        Ventanilla1.add(Cliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 85, -1, -1));
        Ventanilla1.add(TextAsiento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 42, 168, -1));

        ComboCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboCliente1ActionPerformed(evt);
            }
        });
        Ventanilla1.add(ComboCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 82, 167, -1));

        BotonReservar1.setText("Reservar Asiento");
        BotonReservar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonReservar1ActionPerformed(evt);
            }
        });
        Ventanilla1.add(BotonReservar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 122, 214, -1));

        BotonEliminar1.setText("Eliminar Reservacion");
        BotonEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminar1ActionPerformed(evt);
            }
        });
        Ventanilla1.add(BotonEliminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 157, 214, -1));

        BotonCambiar1.setText("Cambiar Asiento");
        BotonCambiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCambiar1ActionPerformed(evt);
            }
        });
        Ventanilla1.add(BotonCambiar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 192, 214, -1));

        NombreVentanilla4.setText("Ventanilla 1");
        Ventanilla1.add(NombreVentanilla4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        Ventanilla2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Ventanilla2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NombreVentanilla2.setText("Ventanilla 2");
        Ventanilla2.add(NombreVentanilla2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        AsientoText2.setText("Asiento");
        Ventanilla2.add(AsientoText2, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 45, -1, -1));

        Cliente2.setText("Cliente");
        Ventanilla2.add(Cliente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 85, -1, -1));
        Ventanilla2.add(TextAsiento2, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 42, 168, -1));

        ComboCliente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboCliente2ActionPerformed(evt);
            }
        });
        Ventanilla2.add(ComboCliente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 82, 167, -1));

        BotonReservar2.setText("Reservar Asiento");
        BotonReservar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonReservar2ActionPerformed(evt);
            }
        });
        Ventanilla2.add(BotonReservar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 122, 214, -1));

        BotonEliminar2.setText("Eliminar Reservacion");
        BotonEliminar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminar2ActionPerformed(evt);
            }
        });
        Ventanilla2.add(BotonEliminar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 157, 214, -1));

        BotonCambiar2.setText("Cambiar Asiento");
        BotonCambiar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCambiar2ActionPerformed(evt);
            }
        });
        Ventanilla2.add(BotonCambiar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 192, 214, -1));

        Ventanilla3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Ventanilla3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NombreVentanilla3.setText("Ventanilla 3");
        Ventanilla3.add(NombreVentanilla3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        AsientoText3.setText("Asiento");
        Ventanilla3.add(AsientoText3, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 45, -1, -1));

        Cliente3.setText("Cliente");
        Ventanilla3.add(Cliente3, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 85, -1, -1));
        Ventanilla3.add(TextAsiento3, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 42, 168, -1));
        Ventanilla3.add(ComboCliente3, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 82, 167, -1));

        BotonReservar3.setText("Reservar Asiento");
        BotonReservar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonReservar3ActionPerformed(evt);
            }
        });
        Ventanilla3.add(BotonReservar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 122, 214, -1));

        BotonEliminar3.setText("Eliminar Reservacion");
        BotonEliminar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminar3ActionPerformed(evt);
            }
        });
        Ventanilla3.add(BotonEliminar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 157, 214, -1));

        BotonCambiar3.setText("Cambiar Asiento");
        BotonCambiar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCambiar3ActionPerformed(evt);
            }
        });
        Ventanilla3.add(BotonCambiar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 192, 214, -1));

        Asientos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Asientos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NombreVentanilla1.setText("Asientos");
        Asientos.add(NombreVentanilla1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Asiento1.setBackground(new java.awt.Color(0, 153, 0));
        Asiento1.setToolTipText("");
        Asiento1.setName(""); // NOI18N
        Asiento1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Asiento1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Asiento1MouseExited(evt);
            }
        });
        Asiento1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Asientos.add(Asiento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 50, 50));
        Asiento1.getAccessibleContext().setAccessibleName("");

        Asiento2.setBackground(new java.awt.Color(0, 153, 0));
        Asiento2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Asiento2MouseEntered(evt);
            }
        });
        Asiento2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Asientos.add(Asiento2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 50, 50));

        Asiento3.setBackground(new java.awt.Color(0, 153, 0));
        Asiento3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Asiento3MouseEntered(evt);
            }
        });
        Asiento3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Asientos.add(Asiento3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 50, 50));

        Asiento4.setBackground(new java.awt.Color(0, 153, 0));
        Asiento4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Asiento4MouseEntered(evt);
            }
        });
        Asiento4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Asientos.add(Asiento4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 50, 50));
        Asiento4.getAccessibleContext().setAccessibleName("hhh");
        Asiento4.getAccessibleContext().setAccessibleDescription("sss");

        Asiento5.setBackground(new java.awt.Color(0, 153, 0));
        Asiento5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Asiento5MouseEntered(evt);
            }
        });
        Asiento5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Asientos.add(Asiento5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 50, 50));

        Asiento6.setBackground(new java.awt.Color(0, 153, 0));
        Asiento6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Asiento6MouseEntered(evt);
            }
        });
        Asiento6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Asientos.add(Asiento6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 50, 50));

        Asiento7.setBackground(new java.awt.Color(0, 153, 0));
        Asiento7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Asiento7MouseEntered(evt);
            }
        });
        Asiento7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Asientos.add(Asiento7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 50, 50));

        Asiento8.setBackground(new java.awt.Color(0, 153, 0));
        Asiento8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Asiento8MouseEntered(evt);
            }
        });
        Asiento8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Asientos.add(Asiento8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 50, 50));

        Asiento9.setBackground(new java.awt.Color(0, 153, 0));
        Asiento9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Asiento9MouseEntered(evt);
            }
        });
        Asiento9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Asientos.add(Asiento9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 50, 50));

        Asiento10.setBackground(new java.awt.Color(0, 153, 0));
        Asiento10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Asiento10MouseEntered(evt);
            }
        });
        Asiento10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Asientos.add(Asiento10, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, 50, 50));

        Asiento11.setBackground(new java.awt.Color(0, 153, 0));
        Asiento11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Asiento11MouseEntered(evt);
            }
        });
        Asiento11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Asientos.add(Asiento11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 50, 50));

        Asiento12.setBackground(new java.awt.Color(0, 153, 0));
        Asiento12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Asiento12MouseEntered(evt);
            }
        });
        Asiento12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Asientos.add(Asiento12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 50, 50));

        Asiento13.setBackground(new java.awt.Color(0, 153, 0));
        Asiento13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Asiento13MouseEntered(evt);
            }
        });
        Asiento13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Asientos.add(Asiento13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 50, 50));

        Asiento14.setBackground(new java.awt.Color(0, 153, 0));
        Asiento14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Asiento14MouseEntered(evt);
            }
        });
        Asiento14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Asientos.add(Asiento14, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 50, 50));

        Asiento15.setBackground(new java.awt.Color(0, 153, 0));
        Asiento15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Asiento15MouseEntered(evt);
            }
        });
        Asiento15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Asientos.add(Asiento15, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 50, 50));

        Asiento16.setBackground(new java.awt.Color(0, 153, 0));
        Asiento16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Asiento16MouseEntered(evt);
            }
        });
        Asiento16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Asientos.add(Asiento16, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 50, 50));

        Asiento17.setBackground(new java.awt.Color(0, 153, 0));
        Asiento17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Asiento17MouseEntered(evt);
            }
        });
        Asiento17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Asientos.add(Asiento17, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 50, 50));

        Asiento18.setBackground(new java.awt.Color(0, 153, 0));
        Asiento18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Asiento18MouseEntered(evt);
            }
        });
        Asiento18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Asientos.add(Asiento18, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 50, 50));

        Asiento19.setBackground(new java.awt.Color(0, 153, 0));
        Asiento19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Asiento19MouseEntered(evt);
            }
        });
        Asiento19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Asientos.add(Asiento19, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 50, 50));

        Asiento20.setBackground(new java.awt.Color(0, 153, 0));
        Asiento20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Asiento20MouseEntered(evt);
            }
        });
        Asiento20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Asientos.add(Asiento20, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 50, 50));

        Asiento21.setBackground(new java.awt.Color(0, 153, 0));
        Asiento21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Asiento21MouseEntered(evt);
            }
        });
        Asiento21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Asientos.add(Asiento21, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 50, 50));

        Asiento22.setBackground(new java.awt.Color(0, 153, 0));
        Asiento22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Asiento22MouseEntered(evt);
            }
        });
        Asiento22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Asientos.add(Asiento22, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 50, 50));

        Asiento23.setBackground(new java.awt.Color(0, 153, 0));
        Asiento23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Asiento23MouseEntered(evt);
            }
        });
        Asiento23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Asientos.add(Asiento23, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 50, 50));

        Asiento24.setBackground(new java.awt.Color(0, 153, 0));
        Asiento24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Asiento24MouseEntered(evt);
            }
        });
        Asiento24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Asientos.add(Asiento24, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 50, 50));

        Asiento25.setBackground(new java.awt.Color(0, 153, 0));
        Asiento25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Asiento25MouseEntered(evt);
            }
        });
        Asiento25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Asientos.add(Asiento25, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 50, 50));

        Asiento26.setBackground(new java.awt.Color(0, 153, 0));
        Asiento26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Asiento26MouseEntered(evt);
            }
        });
        Asiento26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Asientos.add(Asiento26, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 50, 50));

        Asiento27.setBackground(new java.awt.Color(0, 153, 0));
        Asiento27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Asiento27MouseEntered(evt);
            }
        });
        Asiento27.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Asientos.add(Asiento27, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 50, 50));

        Asiento28.setBackground(new java.awt.Color(0, 153, 0));
        Asiento28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Asiento28MouseEntered(evt);
            }
        });
        Asiento28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Asientos.add(Asiento28, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 160, 50, 50));

        Asiento29.setBackground(new java.awt.Color(0, 153, 0));
        Asiento29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Asiento29MouseEntered(evt);
            }
        });
        Asiento29.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Asientos.add(Asiento29, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, 50, 50));

        Asiento30.setBackground(new java.awt.Color(0, 153, 0));
        Asiento30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Asiento30MouseEntered(evt);
            }
        });
        Asiento30.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Asientos.add(Asiento30, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, 50, 50));

        RegistrarForm.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        RegistrarForm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Registrar.setText("Registrar");
        RegistrarForm.add(Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Nombre.setText("Nombre");
        RegistrarForm.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        NombreText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreTextActionPerformed(evt);
            }
        });
        RegistrarForm.add(NombreText, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 190, -1));

        Cedula.setText("Cedula");
        RegistrarForm.add(Cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 40, -1));
        RegistrarForm.add(CedulaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 190, -1));

        Apellidos.setText("Apellidos");
        RegistrarForm.add(Apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, -1));
        RegistrarForm.add(ApellidosText, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 190, -1));

        Direccion.setText("Direccion");
        RegistrarForm.add(Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, -1, -1));
        RegistrarForm.add(DireccionText, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 190, -1));

        BotonRegistrar.setText("Registrar");
        BotonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarActionPerformed(evt);
            }
        });
        RegistrarForm.add(BotonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, -1, -1));

        ListRegistrados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ListRegistrados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Registrados.setText("Registrados");
        ListRegistrados.add(Registrados, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        ClientesRegistrados.setToolTipText("dd");
        ClientesRegistrados.setViewportView(jList1);

        ListRegistrados.add(ClientesRegistrados, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 190, 600));

        javax.swing.GroupLayout InterfazLayout = new javax.swing.GroupLayout(Interfaz);
        Interfaz.setLayout(InterfazLayout);
        InterfazLayout.setHorizontalGroup(
            InterfazLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InterfazLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InterfazLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Asientos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(InterfazLayout.createSequentialGroup()
                        .addComponent(Ventanilla1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Ventanilla2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Ventanilla3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(RegistrarForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(ListRegistrados, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        InterfazLayout.setVerticalGroup(
            InterfazLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InterfazLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InterfazLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(InterfazLayout.createSequentialGroup()
                        .addGroup(InterfazLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Ventanilla1, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                            .addComponent(Ventanilla2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Ventanilla3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(Asientos, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RegistrarForm, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ListRegistrados, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Interfaz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Interfaz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void reservarAsiento(int asientoIndex, String cliente) throws InterruptedException {
    mutex.lock(); // Adquirir el bloqueo

    try {
        // Simular tiempo de procesamiento
        Thread.sleep((int) (Math.random() * (1000 - 100 + 1) + 100));
        if (asientos[asientoIndex].getEstado()) {
            JOptionPane.showMessageDialog(this, "El asiento ya está reservado.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        asientos[asientoIndex].setCliente(cliente);
        asientos[asientoIndex].setEstado(true);
        actualizarColoresAsientos();
        limpiar2Campos();

       

    } finally {
        mutex.unlock(); // Liberar el bloqueo
    }
}




private void eliminarAsiento(JComboBox<String> comboBox, JTextField textField) throws InterruptedException{
    mutex.lock(); // Adquirir el bloqueo

    try {
        // Simular tiempo de procesamiento
        Thread.sleep((int) (Math.random() * (1000 - 100 + 1) + 100));
        int asientoIndex;
        try {
            asientoIndex = Integer.parseInt(textField.getText()) - 1;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Número de asiento inválido.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (asientoIndex < 0 || asientoIndex >= asientos.length) {
            JOptionPane.showMessageDialog(this, "Número de asiento inválido.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!asientos[asientoIndex].getEstado()) {
            JOptionPane.showMessageDialog(this, "El asiento no está reservado.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String clienteActual = asientos[asientoIndex].getCliente();
        String clienteSeleccionado = comboBox.getSelectedItem().toString();

        if (!clienteActual.equals(clienteSeleccionado)) {
            JOptionPane.showMessageDialog(this, "Solo el cliente que tiene reservado el asiento puede eliminarlo.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        asientos[asientoIndex].setCliente("");
        asientos[asientoIndex].setEstado(false);
        actualizarColoresAsientos();

        // Limpiar los campos
        textField.setText("");
         limpiar2Campos();
        comboBox.setSelectedIndex(0);
    } finally {
        mutex.unlock(); // Liberar el bloqueo
    }
}


private void BotonCambiarActionPerformed(JComboBox<String> comboBox, JTextField textField) {
    mutex.lock(); // Adquirir el bloqueo

    try {
        int asientoIndex = Integer.parseInt(textField.getText()) - 1;
        if (comboBox.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un cliente.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String clienteSeleccionado = comboBox.getSelectedItem().toString();

        // Verificar si el asiento pertenece al mismo cliente
        if (!asientos[asientoIndex].getCliente().equals(clienteSeleccionado)) {
            JOptionPane.showMessageDialog(this, "El asiento no pertenece a este cliente.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        asientos[asientoIndex].setCliente("");
        asientos[asientoIndex].setEstado(false);
        actualizarColoresAsientos();
         limpiar2Campos();
        
        // Resto del código

    } finally {
        mutex.unlock(); // Liberar el bloqueo
    }
}

    private void BotonReservar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonReservar1ActionPerformed
       
    int asientoIndex = Integer.parseInt(TextAsiento1.getText()) - 1;
    String cliente = ComboCliente1.getSelectedItem().toString();
        try {
            reservarAsiento(asientoIndex, cliente);
        } catch (InterruptedException ex) {
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_BotonReservar1ActionPerformed

    
    
    






    private void BotonEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminar1ActionPerformed
        try {        
            eliminarAsiento(ComboCliente1, TextAsiento1);
        } catch (InterruptedException ex) {
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_BotonEliminar1ActionPerformed

    
     
    private void BotonCambiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCambiar1ActionPerformed
        
        BotonCambiarActionPerformed(evt, ComboCliente1, TextAsiento1);


    }//GEN-LAST:event_BotonCambiar1ActionPerformed

    private void BotonReservar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonReservar2ActionPerformed
        // TODO add your handling code here:
         int asientoIndex = Integer.parseInt(TextAsiento2.getText()) - 1;
    String cliente = ComboCliente2.getSelectedItem().toString();
        try {
            reservarAsiento(asientoIndex, cliente);
        } catch (InterruptedException ex) {
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BotonReservar2ActionPerformed

    private void BotonEliminar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminar2ActionPerformed
        try {
            // TODO add your handling code here:
            eliminarAsiento(ComboCliente2, TextAsiento2);
        } catch (InterruptedException ex) {
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BotonEliminar2ActionPerformed

    private void BotonCambiar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCambiar2ActionPerformed
        // TODO add your handling code here:
                BotonCambiarActionPerformed(evt, ComboCliente2, TextAsiento2);

    }//GEN-LAST:event_BotonCambiar2ActionPerformed

    private void BotonReservar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonReservar3ActionPerformed
        // TODO add your handling code here:
         int asientoIndex = Integer.parseInt(TextAsiento3.getText()) - 1;
    String cliente = ComboCliente3.getSelectedItem().toString();
        try {
            reservarAsiento(asientoIndex, cliente);
        } catch (InterruptedException ex) {
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BotonReservar3ActionPerformed

    private void BotonEliminar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminar3ActionPerformed
        try {
            // TODO add your handling code here:
            eliminarAsiento(ComboCliente3, TextAsiento3);
        } catch (InterruptedException ex) {
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BotonEliminar3ActionPerformed

    private void BotonCambiar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCambiar3ActionPerformed
        // TODO add your handling code here:
                BotonCambiarActionPerformed(evt, ComboCliente3, TextAsiento3);

    }//GEN-LAST:event_BotonCambiar3ActionPerformed

    private void BotonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarActionPerformed
        
        mutex.lock(); // Adquirir el bloqueo

        try {
            // Código para el registro de asientos
              String nombre = NombreText.getText();
        String cedula = CedulaText.getText();
        String apellidos = ApellidosText.getText();
        String direccion = DireccionText.getText();
        
        if (nombre.isEmpty() || cedula.isEmpty() || apellidos.isEmpty() || direccion.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

        boolean cedulaRepetida = verificarCedulaRepetida(cedula);
    if (cedulaRepetida) {
        JOptionPane.showMessageDialog(this, "La cédula ya está registrada.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
        String registro = nombre + " - " + apellidos + " - " + cedula + " - " + direccion;
        registros.add(registro);

        actualizarListaRegistrados();
          limpiarCampos();

            // Resto del código

        } finally {
            mutex.unlock(); // Liberar el bloqueo
        }
    
        
      
    }//GEN-LAST:event_BotonRegistrarActionPerformed
    DefaultComboBoxModel<String> modeloClientes = new DefaultComboBoxModel<>();  
  

    private void NombreTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreTextActionPerformed

    private void ComboCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboCliente1ActionPerformed
   
    }//GEN-LAST:event_ComboCliente1ActionPerformed

    private void ComboCliente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboCliente2ActionPerformed
        // TODO add your handling code here:
          
    }//GEN-LAST:event_ComboCliente2ActionPerformed

    private void Asiento1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Asiento1MouseEntered

    }//GEN-LAST:event_Asiento1MouseEntered


    private void Asiento1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Asiento1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Asiento1MouseExited

    private void Asiento2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Asiento2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Asiento2MouseEntered

    private void Asiento3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Asiento3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Asiento3MouseEntered

    private void Asiento4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Asiento4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Asiento4MouseEntered

    private void Asiento5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Asiento5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Asiento5MouseEntered

    private void Asiento6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Asiento6MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Asiento6MouseEntered

    private void Asiento7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Asiento7MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Asiento7MouseEntered

    private void Asiento8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Asiento8MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Asiento8MouseEntered

    private void Asiento9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Asiento9MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Asiento9MouseEntered

    private void Asiento10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Asiento10MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Asiento10MouseEntered

    private void Asiento11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Asiento11MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Asiento11MouseEntered

    private void Asiento12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Asiento12MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Asiento12MouseEntered

    private void Asiento13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Asiento13MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Asiento13MouseEntered

    private void Asiento14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Asiento14MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Asiento14MouseEntered

    private void Asiento15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Asiento15MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Asiento15MouseEntered

    private void Asiento16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Asiento16MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Asiento16MouseEntered

    private void Asiento17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Asiento17MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Asiento17MouseEntered

    private void Asiento18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Asiento18MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Asiento18MouseEntered

    private void Asiento19MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Asiento19MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Asiento19MouseEntered

    private void Asiento20MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Asiento20MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Asiento20MouseEntered

    private void Asiento22MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Asiento22MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Asiento22MouseEntered

    private void Asiento24MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Asiento24MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Asiento24MouseEntered

    private void Asiento26MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Asiento26MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Asiento26MouseEntered

    private void Asiento28MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Asiento28MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Asiento28MouseEntered

    private void Asiento30MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Asiento30MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Asiento30MouseEntered

    private void Asiento21MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Asiento21MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Asiento21MouseEntered

    private void Asiento23MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Asiento23MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Asiento23MouseEntered

    private void Asiento25MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Asiento25MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Asiento25MouseEntered

    private void Asiento27MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Asiento27MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Asiento27MouseEntered

    private void Asiento29MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Asiento29MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Asiento29MouseEntered

    private boolean verificarCedulaRepetida(String cedula) {
    for (String registro : registros) {
        String[] campos = registro.split(" - ");
        String cedulaRegistrada = campos[2];
        if (cedula.equals(cedulaRegistrada)) {
            return true;
        }
    }
    
    
    return false;
}
    
    private void limpiarCampos() {
    NombreText.setText("");
    CedulaText.setText("");
    ApellidosText.setText("");
    DireccionText.setText("");
}
    
private void limpiar2Campos() {
    TextAsiento1.setText("");
    TextAsiento2.setText("");
    TextAsiento3.setText("");
    ComboCliente1.setSelectedIndex(0);
    ComboCliente2.setSelectedIndex(0);
    ComboCliente3.setSelectedIndex(0);
}

    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Registro().setVisible(true);
        });
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apellidos;
    private javax.swing.JTextField ApellidosText;
    private javax.swing.JPanel Asiento1;
    private javax.swing.JPanel Asiento10;
    private javax.swing.JPanel Asiento11;
    private javax.swing.JPanel Asiento12;
    private javax.swing.JPanel Asiento13;
    private javax.swing.JPanel Asiento14;
    private javax.swing.JPanel Asiento15;
    private javax.swing.JPanel Asiento16;
    private javax.swing.JPanel Asiento17;
    private javax.swing.JPanel Asiento18;
    private javax.swing.JPanel Asiento19;
    private javax.swing.JPanel Asiento2;
    private javax.swing.JPanel Asiento20;
    private javax.swing.JPanel Asiento21;
    private javax.swing.JPanel Asiento22;
    private javax.swing.JPanel Asiento23;
    private javax.swing.JPanel Asiento24;
    private javax.swing.JPanel Asiento25;
    private javax.swing.JPanel Asiento26;
    private javax.swing.JPanel Asiento27;
    private javax.swing.JPanel Asiento28;
    private javax.swing.JPanel Asiento29;
    private javax.swing.JPanel Asiento3;
    private javax.swing.JPanel Asiento30;
    private javax.swing.JPanel Asiento4;
    private javax.swing.JPanel Asiento5;
    private javax.swing.JPanel Asiento6;
    private javax.swing.JPanel Asiento7;
    private javax.swing.JPanel Asiento8;
    private javax.swing.JPanel Asiento9;
    private javax.swing.JLabel AsientoText1;
    private javax.swing.JLabel AsientoText2;
    private javax.swing.JLabel AsientoText3;
    private javax.swing.JPanel Asientos;
    private javax.swing.JButton BotonCambiar1;
    private javax.swing.JButton BotonCambiar2;
    private javax.swing.JButton BotonCambiar3;
    private javax.swing.JButton BotonEliminar1;
    private javax.swing.JButton BotonEliminar2;
    private javax.swing.JButton BotonEliminar3;
    private javax.swing.JButton BotonRegistrar;
    private javax.swing.JButton BotonReservar1;
    private javax.swing.JButton BotonReservar2;
    private javax.swing.JButton BotonReservar3;
    private javax.swing.JLabel Cedula;
    private javax.swing.JTextField CedulaText;
    private javax.swing.JLabel Cliente1;
    private javax.swing.JLabel Cliente2;
    private javax.swing.JLabel Cliente3;
    private javax.swing.JScrollPane ClientesRegistrados;
    private javax.swing.JComboBox<String> ComboCliente1;
    private javax.swing.JComboBox<String> ComboCliente2;
    private javax.swing.JComboBox<String> ComboCliente3;
    private javax.swing.JLabel Direccion;
    private javax.swing.JTextField DireccionText;
    private javax.swing.JPanel Interfaz;
    private javax.swing.JPanel ListRegistrados;
    private javax.swing.JLabel Nombre;
    private javax.swing.JTextField NombreText;
    private javax.swing.JLabel NombreVentanilla1;
    private javax.swing.JLabel NombreVentanilla2;
    private javax.swing.JLabel NombreVentanilla3;
    private javax.swing.JLabel NombreVentanilla4;
    private javax.swing.JLabel Registrados;
    private javax.swing.JLabel Registrar;
    private javax.swing.JPanel RegistrarForm;
    private javax.swing.JTextField TextAsiento1;
    private javax.swing.JTextField TextAsiento2;
    private javax.swing.JTextField TextAsiento3;
    private javax.swing.JPanel Ventanilla1;
    private javax.swing.JPanel Ventanilla2;
    private javax.swing.JPanel Ventanilla3;
    private javax.swing.JList<String> jList1;
    // End of variables declaration//GEN-END:variables

    private void BotonCambiarActionPerformed(ActionEvent evt, JComboBox<String> ComboCliente1, JTextField TextAsiento1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
