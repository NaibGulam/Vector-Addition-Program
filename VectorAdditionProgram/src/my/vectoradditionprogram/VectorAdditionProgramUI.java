/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.vectoradditionprogram;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.*;
import my.vectoradditionquiz.VectorAdditionQuizUI;

/**
 * Created by Naib Gulam
 * on June 2014
 * to teach students how to add vectors,
 * quiz them, and then give them a vector
 * calculator
 */
public class VectorAdditionProgramUI extends javax.swing.JFrame {
    // Global Variable of arraylist to store the lesson
    ArrayList <String> teach = new ArrayList();
    
    // counter to keep track of the user's position during the lesson
    int location = 0;

    /**
     * Creates new form VectorAdditionProgramUI
     */
    public VectorAdditionProgramUI() {
        initComponents();
        
        // Arraylist containing the lesson to teach vector addition
        Collections.addAll(teach, "\tHow to Add Vectors\n", "\nBefore we get started you should be comfortable with using pythagoreon theorem, the trigonometry functions, and angles. Unlike traditional vectors I will not be using compass directions, instead I will be measuring angles from the standard position, 0° up to 360°. In order to teach you how to add vectors we will be using an example question and then guiding you through that example.\n", "\nLet's begin!\n", "\nA vector is defined as a quantity that has both a magnitude as well as a direction. Simple mathematical operations such addition and subtraction are not enough to solve these problems.\n", 
                "\n1. Get the angles and magnitudes of your vectors.\n Our example vectors will be 45 units [0°], 65 units [230°], and 20 units [165°].\n", "\n2. Break up the vectors into their x and y components. To find the x component use the formula x = r * cos(θ) where r represents the magnitude and θ represents the angle measured between the standard position (0°) and the vector. To find the y component use the formula y = r * sin(θ) where again r represents the magnitude and θ represents the angle measured between the standard position (0°) and the vector.\n", "\nx1: 45 * cos(0) = 45 units\ny1: 45 * sin(0) = 0 units\n", 
                "\nx2: 65 * cos(230) = -41.78 units\ny2: 65 * sin(230) = -49.79 units\n", "\nx3: 20 * cos(165) = -19.32 units\ny3: 20 * sin(165) = 5.18 units\n", "\n3. Add up all your x components and then add up all your y components to get the resultant x and y components.\n", "\nResultant x component: 45 units - 41.78 units - 19.32 units = -16.10 units\n", "\nResultant y component = 0 units - 49.79 units + 5.18 units = -44.614 units\n", "\n4. Use pythagoreon theorem with the resultant components as your a and b values to get your c value or resultant magnitude.\n", 
                "\nResultant vector: √((-16.10))^2 + ((-44.614))^2 = 47.43 units\n", "\n5. Use the formula θ = tan^-1(resultant y component / resultant x component) to find the resultant angle.\n", "\nθ = tan^-1(-44.61/-16.10) = 70°\n", "\n6. This angle is the reference angle. You need to determine the actual angle by looking in which quadrant the resultant x and y components are in based on the signs of the resultant x and y components.\n", 
                "\nIf the resultant x component is + and the resultant y component is +, then that is your resultant angle.\n", "\nIf the resultant x component is - and the resultant y component is +, then subtract that from 180° to get your resultant angle.\n", "\nIf the resultant x component is - and the resultant y component is -, then add 180° to get your resultant angle.\n", "\nIf the resultant x component is + and the resultant y component is -, then subtract that from 360° to get your resultant angle.\n", "\nSince the resultant x component is - and the resultant y component is -, add 180° to get the resultant angle.\n", 
                "\n70° + 180° = 250°\n", "\n7. Therefore, the resultant vector is 47.43 units [250°]\n", "\nFeel free to review all of this, and once you are ready, take the quiz, if you feel brave enough.");
        
        // Hides all pictures
        takeQuizButton1.setVisible(false);
        vector45UnitLabel.setVisible(false);
        vector65UnitLabel.setVisible(false);
        vector20UnitLabel.setVisible(false);
        allVectorsLabel.setVisible(false);
        vectorComponentTableLabel.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        outputTextArea = new javax.swing.JTextArea();
        takeQuizButton1 = new javax.swing.JButton();
        vectorAdditionLabel1 = new javax.swing.JLabel();
        vector65UnitLabel = new javax.swing.JLabel();
        vectorComponentTableLabel = new javax.swing.JLabel();
        tutorialLabel = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        vector20UnitLabel = new javax.swing.JLabel();
        vector45UnitLabel = new javax.swing.JLabel();
        allVectorsLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        outputTextArea.setColumns(20);
        outputTextArea.setLineWrap(true);
        outputTextArea.setRows(5);
        outputTextArea.setWrapStyleWord(true);
        jScrollPane1.setViewportView(outputTextArea);

        takeQuizButton1.setText("Take Quiz");
        takeQuizButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                takeQuizButton1ActionPerformed(evt);
            }
        });

        vectorAdditionLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        vectorAdditionLabel1.setForeground(new java.awt.Color(0, 0, 255));
        vectorAdditionLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vectorAdditionLabel1.setText("Learn 2D Vector Addition");

        vector65UnitLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\Vector Program Final Final\\VectorAdditionProgram\\pictures\\Vector2.PNG")); // NOI18N

        vectorComponentTableLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\Vector Program Final Final\\VectorAdditionProgram\\pictures\\Vector5.PNG")); // NOI18N

        tutorialLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tutorialLabel.setForeground(new java.awt.Color(0, 0, 255));
        tutorialLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tutorialLabel.setText("Tutorial");

        startButton.setText("Start");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        vector20UnitLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\Vector Program Final Final\\VectorAdditionProgram\\pictures\\Vector3.PNG")); // NOI18N

        vector45UnitLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\Vector Program Final Final\\VectorAdditionProgram\\pictures\\Vector1.PNG")); // NOI18N

        allVectorsLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\Vector Program Final Final\\VectorAdditionProgram\\pictures\\Vector4.PNG")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(vectorAdditionLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(tutorialLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vector20UnitLabel)
                            .addComponent(vector65UnitLabel)
                            .addComponent(vector45UnitLabel))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(allVectorsLabel)
                                .addGap(72, 72, 72))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(113, 113, 113)
                                        .addComponent(takeQuizButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(vectorComponentTableLabel)))
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(vectorAdditionLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(allVectorsLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(vectorComponentTableLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(takeQuizButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tutorialLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(startButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(vector45UnitLabel)
                        .addGap(18, 18, 18)
                        .addComponent(vector65UnitLabel)
                        .addGap(18, 18, 18)
                        .addComponent(vector20UnitLabel)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void takeQuizButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_takeQuizButton1ActionPerformed
        // Declaration and initialization to open VectorAdditionQuizUI when the user has clicked the take quiz button
        VectorAdditionQuizUI a = new VectorAdditionQuizUI();
        a.setVisible(true);
        
        // Closes the old window so that user isn't cheating while taking the quiz
        WindowEvent winClosingEvent = new WindowEvent (this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }//GEN-LAST:event_takeQuizButton1ActionPerformed

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        // Changes the button text from 'start' to 'next'
        startButton.setText("Next");
        
        // Everytime the next button is clicked, it retrieves the next line from the teach Arraylist
        outputTextArea.append(teach.get(location));
        
        //Increments the location counter
        location++;
        
        // If statements are used to enable pictures based on the location of the user
        if (location == 5)
        {
            vector45UnitLabel.setVisible(true);
            vector65UnitLabel.setVisible(true);
            vector20UnitLabel.setVisible(true);
        }
        
        if (location == 10)
        {
            allVectorsLabel.setVisible(true);
            vectorComponentTableLabel.setVisible(true);
        }
        
        // Method call to allow user to take the quiz
        if (location == teach.size())
        {
            enableQuiz();
        }
        
    }//GEN-LAST:event_startButtonActionPerformed
    
    // Disables the next button and enables the quiz button to allow the user to take the quiz
    public void enableQuiz() {
        takeQuizButton1.setVisible(true);
        startButton.setEnabled(false);
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
            java.util.logging.Logger.getLogger(VectorAdditionProgramUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VectorAdditionProgramUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VectorAdditionProgramUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VectorAdditionProgramUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VectorAdditionProgramUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel allVectorsLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea outputTextArea;
    private javax.swing.JButton startButton;
    private javax.swing.JButton takeQuizButton1;
    private javax.swing.JLabel tutorialLabel;
    private javax.swing.JLabel vector20UnitLabel;
    private javax.swing.JLabel vector45UnitLabel;
    private javax.swing.JLabel vector65UnitLabel;
    private javax.swing.JLabel vectorAdditionLabel1;
    private javax.swing.JLabel vectorComponentTableLabel;
    // End of variables declaration//GEN-END:variables
}
