package application;

import java.awt.Image;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;

public class Calculator extends JFrame {

    private JButton szamok[];
    private JButton muveletek[];
    private Double resz_er;
    private Double er;
    private String muvelet;
    private boolean volt_muvelet;

    /*
      Creates new form Calculator
     */
    public Calculator() {

        initComponents();
        this.setIconImage(new ImageIcon("pic/calc.png").getImage());
        this.volt_muvelet = false;
        this.szamok = new JButton[]{nullas, egyes, kettes, harmas, negyes, otos, hatos, hetes, nyolcas, kilences};
        this.muveletek = new JButton[]{kivonas, szorzas, osztas, osszeadas};
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        for (int i = 0; i < szamok.length; i++) {

            this.szamok[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (kijelzo.getText().length() < 27) {

                        if (kijelzo.getText().charAt(0) == '0' || volt_muvelet) {
                            kijelzo.setText("");
                            volt_muvelet = false;
                        }
                        kijelzo.setText(kijelzo.getText() + ((JButton) e.getSource()).getText());

                    } else {

                        JOptionPane.showMessageDialog(null, "Több számjegyet nem lehet írni!", "Rendszerüzenet", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });
        }
        for (int i = 0; i < muveletek.length; i++) {

            this.muveletek[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    resz_er = Double.parseDouble(kijelzo.getText());
                    muvelet = ((JButton) e.getSource()).getText();
                    volt_muvelet = true;
                }
            });
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        kijelzo = new javax.swing.JLabel();
        torol_szamjegy = new javax.swing.JButton();
        hetes = new javax.swing.JButton();
        negyes = new javax.swing.JButton();
        egyes = new javax.swing.JButton();
        plusz_minusz = new javax.swing.JButton();
        torol_mindent = new javax.swing.JButton();
        nyolcas = new javax.swing.JButton();
        otos = new javax.swing.JButton();
        kettes = new javax.swing.JButton();
        nullas = new javax.swing.JButton();
        hatos = new javax.swing.JButton();
        harmas = new javax.swing.JButton();
        pont = new javax.swing.JButton();
        torles_c = new javax.swing.JButton();
        kilences = new javax.swing.JButton();
        osztas = new javax.swing.JButton();
        szorzas = new javax.swing.JButton();
        osszeadas = new javax.swing.JButton();
        kivonas = new javax.swing.JButton();
        egyenlo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Számológép");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(102, 102, 102), null, null));

        kijelzo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        kijelzo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        kijelzo.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kijelzo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kijelzo, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addContainerGap())
        );

        torol_szamjegy.setBackground(java.awt.SystemColor.textHighlight);
        torol_szamjegy.setText("DEL");
        torol_szamjegy.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        torol_szamjegy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                torol_szamjegyActionPerformed(evt);
            }
        });

        hetes.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
        hetes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        hetes.setText("7");
        hetes.setActionCommand("");
        hetes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        negyes.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
        negyes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        negyes.setText("4");
        negyes.setActionCommand("");
        negyes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        egyes.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
        egyes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        egyes.setText("1");
        egyes.setActionCommand("");
        egyes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        plusz_minusz.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
        plusz_minusz.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        plusz_minusz.setText("+/-");
        plusz_minusz.setActionCommand("");
        plusz_minusz.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        plusz_minusz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusz_minuszActionPerformed(evt);
            }
        });

        torol_mindent.setBackground(java.awt.SystemColor.textHighlight);
        torol_mindent.setText("CE");
        torol_mindent.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        torol_mindent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                torol_mindentActionPerformed(evt);
            }
        });

        nyolcas.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
        nyolcas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nyolcas.setText("8");
        nyolcas.setActionCommand("");
        nyolcas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        otos.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
        otos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        otos.setText("5");
        otos.setActionCommand("");
        otos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        kettes.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
        kettes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        kettes.setText("2");
        kettes.setActionCommand("");
        kettes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        nullas.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
        nullas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nullas.setText("0");
        nullas.setActionCommand("");
        nullas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        hatos.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
        hatos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        hatos.setText("6");
        hatos.setActionCommand("");
        hatos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        harmas.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
        harmas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        harmas.setText("3");
        harmas.setActionCommand("");
        harmas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        pont.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
        pont.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pont.setText(".");
        pont.setActionCommand("");
        pont.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pontActionPerformed(evt);
            }
        });

        torles_c.setBackground(java.awt.SystemColor.textHighlight);
        torles_c.setText("C");
        torles_c.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        torles_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                torles_cActionPerformed(evt);
            }
        });

        kilences.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
        kilences.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        kilences.setText("9");
        kilences.setActionCommand("");
        kilences.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        osztas.setBackground(java.awt.SystemColor.textHighlight);
        osztas.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        osztas.setText("/");
        osztas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        szorzas.setBackground(java.awt.SystemColor.textHighlight);
        szorzas.setFont(new java.awt.Font("Aharoni", 0, 24)); // NOI18N
        szorzas.setText("*");
        szorzas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        osszeadas.setBackground(java.awt.SystemColor.textHighlight);
        osszeadas.setFont(new java.awt.Font("Aharoni", 0, 24)); // NOI18N
        osszeadas.setText("+");
        osszeadas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        kivonas.setBackground(java.awt.SystemColor.textHighlight);
        kivonas.setFont(new java.awt.Font("Aharoni", 0, 24)); // NOI18N
        kivonas.setText("-");
        kivonas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        egyenlo.setBackground(java.awt.SystemColor.textHighlight);
        egyenlo.setFont(new java.awt.Font("Aharoni", 0, 24)); // NOI18N
        egyenlo.setText("=");
        egyenlo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        egyenlo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                egyenloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(torol_szamjegy, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                            .addComponent(hetes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(negyes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(egyes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(plusz_minusz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nullas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(kettes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(otos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nyolcas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(torol_mindent, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(harmas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pont, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(torles_c, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kilences, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(egyenlo, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                            .addComponent(kivonas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(osszeadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(szorzas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(osztas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(osztas, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(szorzas, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(osszeadas, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(kivonas, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(egyenlo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(torles_c, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(kilences, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(hatos, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(harmas, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(pont, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(torol_mindent, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(nyolcas, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(otos, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(kettes, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(nullas, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(torol_szamjegy, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(hetes, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(negyes, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(egyes, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(plusz_minusz, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void torol_mindentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_torol_mindentActionPerformed

        this.torolKijelzo();
        this.resz_er = 0.;

    }//GEN-LAST:event_torol_mindentActionPerformed

    private void torol_szamjegyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_torol_szamjegyActionPerformed

        if (this.kijelzo.getText().length() <= 1) {

            this.torolKijelzo();

        } else {

            this.kijelzo.setText(this.kijelzo.getText().substring(0, this.kijelzo.getText().length() - 1));
        }

    }//GEN-LAST:event_torol_szamjegyActionPerformed

    private void plusz_minuszActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusz_minuszActionPerformed

        if (!this.kijelzo.getText().contains("-")) {

            this.kijelzo.setText("-" + this.kijelzo.getText());
        } else {
            this.kijelzo.setText(this.kijelzo.getText().substring(1));
        }

    }//GEN-LAST:event_plusz_minuszActionPerformed

    private void pontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pontActionPerformed

        if (!this.kijelzo.getText().contains(".")) {
            this.kijelzo.setText(this.kijelzo.getText() + ".");
        }

    }//GEN-LAST:event_pontActionPerformed

    private void egyenloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_egyenloActionPerformed

        er = Double.parseDouble(this.kijelzo.getText());

        try {

            if (muvelet.equals("+")) {

                this.kijelzo.setText(resz_er + er + "");

            } else if (muvelet.equals("/")) {

                if (resz_er == 0 || er == 0) {
                    throw new MyException("0-val nem lehet osztani!");
                }
                this.kijelzo.setText(resz_er / er + "");

            } else if (muvelet.equals("*")) {

                int a = (int) Math.round(resz_er);
                int b = (int) Math.round(er);
                this.kijelzo.setText(a * b + "");

            } else if (muvelet.equals("-")) {

                this.kijelzo.setText(resz_er - er + "");
            }
            this.volt_muvelet = true;
            this.er = 0.;

        } catch (MyException ex) {
            JOptionPane.showMessageDialog(null, ex.getHibauzenet(), "Művelet hiba!", JOptionPane.ERROR_MESSAGE);
            this.torolKijelzo();
        }


    }//GEN-LAST:event_egyenloActionPerformed

    private void torles_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_torles_cActionPerformed

        this.torolKijelzo();

    }//GEN-LAST:event_torles_cActionPerformed

    private void torolKijelzo() {

        this.kijelzo.setText("0");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton egyenlo;
    private javax.swing.JButton egyes;
    private javax.swing.JButton harmas;
    private javax.swing.JButton hatos;
    private javax.swing.JButton hetes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton kettes;
    private javax.swing.JLabel kijelzo;
    private javax.swing.JButton kilences;
    private javax.swing.JButton kivonas;
    private javax.swing.JButton negyes;
    private javax.swing.JButton nullas;
    private javax.swing.JButton nyolcas;
    private javax.swing.JButton osszeadas;
    private javax.swing.JButton osztas;
    private javax.swing.JButton otos;
    private javax.swing.JButton plusz_minusz;
    private javax.swing.JButton pont;
    private javax.swing.JButton szorzas;
    private javax.swing.JButton torles_c;
    private javax.swing.JButton torol_mindent;
    private javax.swing.JButton torol_szamjegy;
    // End of variables declaration//GEN-END:variables
}
