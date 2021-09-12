/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.midespensa.screens;

import javax.swing.JFrame;
import com.mycompany.midespensa.classes.article;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class productos extends javax.swing.JFrame {

    /**
     *
     */
    public productos() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        addRowToJTable();
    }
    
     public ArrayList ListProducts()
    {
        ArrayList<article> list = new ArrayList<article>();
        article P1 = new article(1, "Atun", (float)1.50, (float)0.75, 300, "Alimento", "01-09-2021", "001");
        article P2 = new article(2, "Cereal", (float)3.99, (float)1.75, 100, "Alimento", "01-09-2021", "003");
        article P3 = new article(3, "Lámpara", (float)10, (float)6.95, 80, "Hogar", "04-09-2021", "002");
        list.add(P1);
        list.add(P2);
        list.add(P3);       
        
        return list;
    }
     
      public void addRowToJTable()
    {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        ArrayList<article> list = ListProducts();
        Object rowData[] = new Object[8];
        for(int i = 0; i < list.size(); i++)
        {
            rowData[0] = list.get(i).getId();
            rowData[1] = list.get(i).getDesc();
            rowData[2] = list.get(i).getPvp();
            rowData[3] = list.get(i).getPrice();
            rowData[4] = list.get(i).getStock();
            rowData[5] = list.get(i).getCategory();
            rowData[6] = list.get(i).getDateIn();
            rowData[7] = list.get(i).getCodeProv();
            model.addRow(rowData);
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setText("PRODUCTOS");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "PVP", "PRECIO", "STOCK", "CATEGORIA", "FECHA IN", "PROVEEDOR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}