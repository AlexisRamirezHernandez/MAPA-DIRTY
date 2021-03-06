
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Emmanuel
 */
public class Mapa extends javax.swing.JFrame {

    /**
     * Creates new form Mapa
     */
    public Mapa() {
        initComponents();
        setSize(905,720);
        setResizable(false);
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/mapa.jpg")).getImage());
        jPanel2.setDoubleBuffered(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        OCEANOPACIFICO = new javax.swing.JButton();
        CHIHUAHUA = new javax.swing.JButton();
        GOLFODEMEXICO = new javax.swing.JButton();
        EUA = new javax.swing.JButton();
        SINALOA = new javax.swing.JButton();
        BAJACALIFORNIASUR = new javax.swing.JButton();
        BAJACALIFORNIANORTE = new javax.swing.JButton();
        COAHUILA = new javax.swing.JButton();
        DURANGO = new javax.swing.JButton();
        SONORA = new javax.swing.JButton();
        CHIAPAS = new javax.swing.JButton();
        CENTROAMERICA = new javax.swing.JButton();
        OAXACA = new javax.swing.JButton();
        VERACRUZ = new javax.swing.JButton();
        CAMPECHE = new javax.swing.JButton();
        MASESTADOS = new javax.swing.JComboBox<>();
        QUINTANAROO = new javax.swing.JButton();
        YUCATAN = new javax.swing.JButton();
        NUEVOLEON = new javax.swing.JButton();
        JALISCO = new javax.swing.JButton();
        ZACATECAS = new javax.swing.JButton();
        MICHOACAN = new javax.swing.JButton();
        GUERRERO = new javax.swing.JButton();
        SANLUIS = new javax.swing.JButton();
        TAMAULIPAS = new javax.swing.JButton();
        INFO = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(null);

        OCEANOPACIFICO.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        OCEANOPACIFICO.setText("OCEANO PACIFICO");
        OCEANOPACIFICO.setContentAreaFilled(false);
        OCEANOPACIFICO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OCEANOPACIFICOActionPerformed(evt);
            }
        });
        jPanel2.add(OCEANOPACIFICO);
        OCEANOPACIFICO.setBounds(0, 390, 300, 120);

        CHIHUAHUA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CHIHUAHUA.setText("CHIHUAHUA");
        CHIHUAHUA.setContentAreaFilled(false);
        CHIHUAHUA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CHIHUAHUAActionPerformed(evt);
            }
        });
        jPanel2.add(CHIHUAHUA);
        CHIHUAHUA.setBounds(240, 160, 120, 70);

        GOLFODEMEXICO.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        GOLFODEMEXICO.setText("GOLFO DE MÉXICO");
        GOLFODEMEXICO.setContentAreaFilled(false);
        GOLFODEMEXICO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GOLFODEMEXICOActionPerformed(evt);
            }
        });
        jPanel2.add(GOLFODEMEXICO);
        GOLFODEMEXICO.setBounds(580, 300, 200, 160);

        EUA.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EUA.setText("ESTADOS UNIDOS AMERICANOS");
        EUA.setContentAreaFilled(false);
        EUA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EUAActionPerformed(evt);
            }
        });
        jPanel2.add(EUA);
        EUA.setBounds(140, 0, 760, 70);

        SINALOA.setFont(new java.awt.Font("Tahoma", 1, 7)); // NOI18N
        SINALOA.setForeground(new java.awt.Color(255, 255, 255));
        SINALOA.setText("SINALOA");
        SINALOA.setContentAreaFilled(false);
        SINALOA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SINALOAActionPerformed(evt);
            }
        });
        jPanel2.add(SINALOA);
        SINALOA.setBounds(210, 270, 70, 20);

        BAJACALIFORNIASUR.setFont(new java.awt.Font("Tahoma", 1, 7)); // NOI18N
        BAJACALIFORNIASUR.setText("BAJA CALIFORNIA SUR");
        BAJACALIFORNIASUR.setContentAreaFilled(false);
        BAJACALIFORNIASUR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAJACALIFORNIASURActionPerformed(evt);
            }
        });
        jPanel2.add(BAJACALIFORNIASUR);
        BAJACALIFORNIASUR.setBounds(60, 250, 130, 20);

        BAJACALIFORNIANORTE.setFont(new java.awt.Font("Tahoma", 1, 7)); // NOI18N
        BAJACALIFORNIANORTE.setText("BAJA CALIFORNIA NORTE");
        BAJACALIFORNIANORTE.setContentAreaFilled(false);
        BAJACALIFORNIANORTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAJACALIFORNIANORTEActionPerformed(evt);
            }
        });
        jPanel2.add(BAJACALIFORNIANORTE);
        BAJACALIFORNIANORTE.setBounds(10, 150, 130, 20);

        COAHUILA.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        COAHUILA.setText("COAHUILA");
        COAHUILA.setContentAreaFilled(false);
        COAHUILA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                COAHUILAActionPerformed(evt);
            }
        });
        jPanel2.add(COAHUILA);
        COAHUILA.setBounds(369, 200, 100, 50);

        DURANGO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        DURANGO.setText("DURANGO");
        DURANGO.setContentAreaFilled(false);
        DURANGO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DURANGOActionPerformed(evt);
            }
        });
        jPanel2.add(DURANGO);
        DURANGO.setBounds(290, 280, 90, 50);

        SONORA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SONORA.setText("SONORA");
        SONORA.setContentAreaFilled(false);
        SONORA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SONORAActionPerformed(evt);
            }
        });
        jPanel2.add(SONORA);
        SONORA.setBounds(120, 90, 110, 50);

        CHIAPAS.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        CHIAPAS.setText("CHIAPAS");
        CHIAPAS.setContentAreaFilled(false);
        CHIAPAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CHIAPASActionPerformed(evt);
            }
        });
        jPanel2.add(CHIAPAS);
        CHIAPAS.setBounds(680, 580, 90, 20);

        CENTROAMERICA.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CENTROAMERICA.setText("CENTROAMÉRICA");
        CENTROAMERICA.setContentAreaFilled(false);
        CENTROAMERICA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CENTROAMERICAActionPerformed(evt);
            }
        });
        jPanel2.add(CENTROAMERICA);
        CENTROAMERICA.setBounds(750, 610, 139, 50);

        OAXACA.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        OAXACA.setText("OAXACA");
        OAXACA.setContentAreaFilled(false);
        OAXACA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OAXACAActionPerformed(evt);
            }
        });
        jPanel2.add(OAXACA);
        OAXACA.setBounds(550, 560, 90, 50);

        VERACRUZ.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        VERACRUZ.setText("VERACRUZ");
        VERACRUZ.setContentAreaFilled(false);
        VERACRUZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VERACRUZActionPerformed(evt);
            }
        });
        jPanel2.add(VERACRUZ);
        VERACRUZ.setBounds(570, 500, 100, 20);

        CAMPECHE.setFont(new java.awt.Font("Tahoma", 1, 7)); // NOI18N
        CAMPECHE.setText("CAMPECHE");
        CAMPECHE.setContentAreaFilled(false);
        CAMPECHE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAMPECHEActionPerformed(evt);
            }
        });
        jPanel2.add(CAMPECHE);
        CAMPECHE.setBounds(750, 510, 80, 20);

        MASESTADOS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MÁS ESTADOS", "1. PUEBLA", "2. TABASCO", "3. TLAXCALA", "4. DISTRITO FEDERAL", "5. NAYARIT", "6. COLIMA", "7. ESTADO DE MÉXICO", "8. GUANAJUATO", "9. AGUASCALIENTES", "10. HIDALGO", "11. MORELOS", "12. QUERÉTARO" }));
        MASESTADOS.setFocusable(false);
        MASESTADOS.setLightWeightPopupEnabled(false);
        MASESTADOS.setOpaque(false);
        MASESTADOS.setRequestFocusEnabled(false);
        MASESTADOS.setVerifyInputWhenFocusTarget(false);
        MASESTADOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MASESTADOSActionPerformed(evt);
            }
        });
        jPanel2.add(MASESTADOS);
        MASESTADOS.setBounds(670, 160, 230, 20);

        QUINTANAROO.setFont(new java.awt.Font("Tahoma", 1, 6)); // NOI18N
        QUINTANAROO.setText("QUINTA ROO");
        QUINTANAROO.setContentAreaFilled(false);
        QUINTANAROO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QUINTANAROOActionPerformed(evt);
            }
        });
        jPanel2.add(QUINTANAROO);
        QUINTANAROO.setBounds(810, 480, 80, 20);

        YUCATAN.setFont(new java.awt.Font("Tahoma", 1, 7)); // NOI18N
        YUCATAN.setText("YUCATÁN");
        YUCATAN.setContentAreaFilled(false);
        YUCATAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YUCATANActionPerformed(evt);
            }
        });
        jPanel2.add(YUCATAN);
        YUCATAN.setBounds(790, 420, 70, 20);

        NUEVOLEON.setFont(new java.awt.Font("Tahoma", 1, 5)); // NOI18N
        NUEVOLEON.setText("NUEVO LEÓN");
        NUEVOLEON.setContentAreaFilled(false);
        NUEVOLEON.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        NUEVOLEON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NUEVOLEONActionPerformed(evt);
            }
        });
        jPanel2.add(NUEVOLEON);
        NUEVOLEON.setBounds(460, 280, 65, 20);

        JALISCO.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        JALISCO.setText("JALISCO");
        JALISCO.setContentAreaFilled(false);
        JALISCO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JALISCOActionPerformed(evt);
            }
        });
        jPanel2.add(JALISCO);
        JALISCO.setBounds(320, 460, 77, 20);

        ZACATECAS.setFont(new java.awt.Font("Tahoma", 1, 7)); // NOI18N
        ZACATECAS.setText("ZACATECAS");
        ZACATECAS.setContentAreaFilled(false);
        ZACATECAS.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        ZACATECAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZACATECASActionPerformed(evt);
            }
        });
        jPanel2.add(ZACATECAS);
        ZACATECAS.setBounds(370, 340, 73, 17);

        MICHOACAN.setFont(new java.awt.Font("Tahoma", 1, 7)); // NOI18N
        MICHOACAN.setText("MICHOACÁN");
        MICHOACAN.setContentAreaFilled(false);
        MICHOACAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MICHOACANActionPerformed(evt);
            }
        });
        jPanel2.add(MICHOACAN);
        MICHOACAN.setBounds(400, 480, 80, 20);

        GUERRERO.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        GUERRERO.setText("GUERRERO");
        GUERRERO.setContentAreaFilled(false);
        GUERRERO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUERREROActionPerformed(evt);
            }
        });
        jPanel2.add(GUERRERO);
        GUERRERO.setBounds(440, 550, 90, 20);

        SANLUIS.setFont(new java.awt.Font("Tahoma", 1, 7)); // NOI18N
        SANLUIS.setText("SAN LUI POTOSI");
        SANLUIS.setContentAreaFilled(false);
        SANLUIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SANLUISActionPerformed(evt);
            }
        });
        jPanel2.add(SANLUIS);
        SANLUIS.setBounds(440, 400, 90, 20);

        TAMAULIPAS.setFont(new java.awt.Font("Tahoma", 1, 7)); // NOI18N
        TAMAULIPAS.setText("TAMAULIPAS");
        TAMAULIPAS.setContentAreaFilled(false);
        TAMAULIPAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TAMAULIPASActionPerformed(evt);
            }
        });
        jPanel2.add(TAMAULIPAS);
        TAMAULIPAS.setBounds(480, 350, 80, 20);

        INFO.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        INFO.setContentAreaFilled(false);
        INFO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INFOActionPerformed(evt);
            }
        });
        jPanel2.add(INFO);
        INFO.setBounds(40, 520, 160, 130);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GIF.gif"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, -20, 920, 740);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EUAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EUAActionPerformed
    System.out.println("test");
    }//GEN-LAST:event_EUAActionPerformed

    private void CHIHUAHUAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHIHUAHUAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CHIHUAHUAActionPerformed

    private void SONORAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SONORAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SONORAActionPerformed

    private void COAHUILAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COAHUILAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_COAHUILAActionPerformed

    private void DURANGOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DURANGOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DURANGOActionPerformed

    private void OAXACAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OAXACAActionPerformed
        new InfoOax().setVisible(true);
        this.setLocation(50, 100);
        
    }//GEN-LAST:event_OAXACAActionPerformed

    private void CHIAPASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHIAPASActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CHIAPASActionPerformed

    private void INFOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INFOActionPerformed

new InfoDesarrolladores().setVisible(true);
    }//GEN-LAST:event_INFOActionPerformed

    private void YUCATANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YUCATANActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_YUCATANActionPerformed

    private void GUERREROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUERREROActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GUERREROActionPerformed

    private void ZACATECASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZACATECASActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ZACATECASActionPerformed

    private void NUEVOLEONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NUEVOLEONActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NUEVOLEONActionPerformed

    private void JALISCOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JALISCOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JALISCOActionPerformed

    private void MICHOACANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MICHOACANActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MICHOACANActionPerformed

    private void TAMAULIPASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TAMAULIPASActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TAMAULIPASActionPerformed

    private void SANLUISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SANLUISActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SANLUISActionPerformed

    private void CAMPECHEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAMPECHEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CAMPECHEActionPerformed

    private void QUINTANAROOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QUINTANAROOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QUINTANAROOActionPerformed

    private void CENTROAMERICAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CENTROAMERICAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CENTROAMERICAActionPerformed

    private void GOLFODEMEXICOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GOLFODEMEXICOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GOLFODEMEXICOActionPerformed

    private void OCEANOPACIFICOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OCEANOPACIFICOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OCEANOPACIFICOActionPerformed

    private void BAJACALIFORNIANORTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAJACALIFORNIANORTEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BAJACALIFORNIANORTEActionPerformed

    private void BAJACALIFORNIASURActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAJACALIFORNIASURActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BAJACALIFORNIASURActionPerformed

    private void VERACRUZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VERACRUZActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VERACRUZActionPerformed

    private void SINALOAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SINALOAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SINALOAActionPerformed

    private void MASESTADOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MASESTADOSActionPerformed

        MASESTADOS.setBorder(null);
         
        MASESTADOS.setBorder(null);
        if( MASESTADOS.getSelectedItem()=="1. PUEBLA"){
        MASESTADOS.setBackground(Color.decode("#f75252"));
    
        }
        if(MASESTADOS.getSelectedItem()=="2. TABASCO"){
        MASESTADOS.setBackground(Color.decode("#5a948c"));
        
        }
        
           if( MASESTADOS.getSelectedItem()=="3. TLAXCALA"){
        MASESTADOS.setBackground(Color.decode("#4a73ce"));
       
        }
        if(MASESTADOS.getSelectedItem()=="4. DISTRITO FEDERAL"){
        MASESTADOS.setBackground(Color.decode("#ffff00"));
        
        }
        
           if( MASESTADOS.getSelectedItem()=="5. NAYARIT"){
        MASESTADOS.setBackground(Color.decode("#de6310"));
        }
        if(MASESTADOS.getSelectedItem()=="6. COLIMA"){
        MASESTADOS.setBackground(Color.decode("#73005a"));
        
        }
        
           if( MASESTADOS.getSelectedItem()=="7. ESTADO DE MÉXICO"){
        MASESTADOS.setBackground(Color.decode("#e7ad52"));
       
        }
        if(MASESTADOS.getSelectedItem()=="8. GUANAJUATO"){
        MASESTADOS.setBackground(Color.decode("#102184"));
        
        }
        
           if( MASESTADOS.getSelectedItem()=="9. AGUASCALIENTES"){
        MASESTADOS.setBackground(Color.decode("#4a7384"));
        }
        if(MASESTADOS.getSelectedItem()=="10. HIDALGO"){
        MASESTADOS.setBackground(Color.decode("#10b584"));
        
        }
        
           if( MASESTADOS.getSelectedItem()=="11. MORELOS"){
        MASESTADOS.setBackground(Color.decode("#adef52"));
        }
        if(MASESTADOS.getSelectedItem()=="12. QUERÉTARO"){
        MASESTADOS.setBackground(Color.decode("#b5189c"));
        
        }
        
        
       
    }//GEN-LAST:event_MASESTADOSActionPerformed

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
            java.util.logging.Logger.getLogger(Mapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mapa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAJACALIFORNIANORTE;
    private javax.swing.JButton BAJACALIFORNIASUR;
    private javax.swing.JButton CAMPECHE;
    private javax.swing.JButton CENTROAMERICA;
    private javax.swing.JButton CHIAPAS;
    private javax.swing.JButton CHIHUAHUA;
    private javax.swing.JButton COAHUILA;
    private javax.swing.JButton DURANGO;
    private javax.swing.JButton EUA;
    private javax.swing.JButton GOLFODEMEXICO;
    private javax.swing.JButton GUERRERO;
    private javax.swing.JButton INFO;
    private javax.swing.JButton JALISCO;
    private javax.swing.JComboBox<String> MASESTADOS;
    private javax.swing.JButton MICHOACAN;
    private javax.swing.JButton NUEVOLEON;
    private javax.swing.JButton OAXACA;
    private javax.swing.JButton OCEANOPACIFICO;
    private javax.swing.JButton QUINTANAROO;
    private javax.swing.JButton SANLUIS;
    private javax.swing.JButton SINALOA;
    private javax.swing.JButton SONORA;
    private javax.swing.JButton TAMAULIPAS;
    private javax.swing.JButton VERACRUZ;
    private javax.swing.JButton YUCATAN;
    private javax.swing.JButton ZACATECAS;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
