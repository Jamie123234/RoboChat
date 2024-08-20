package ChatBot;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class TextToSpeech extends javax.swing.JFrame {
    
    static int voiceModulationRate = 120;
    
    public TextToSpeech() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPanel = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        clear = new javax.swing.JButton();
        start = new javax.swing.JButton();
        jSlider1 = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        bgPanel.setBackground(java.awt.Color.lightGray);

        title.setFont(new java.awt.Font("Gill Sans MT", 1, 26)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Welcome to Text To Speech");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        clear.setBackground(new java.awt.Color(102, 255, 255));
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        start.setBackground(new java.awt.Color(0, 255, 255));
        start.setText("Start");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        jSlider1.setBackground(java.awt.Color.lightGray);
        jSlider1.setMaximum(300);
        jSlider1.setMinimum(50);
        jSlider1.setValue(120);

        jLabel1.setText("Voice Modulation");

        javax.swing.GroupLayout bgPanelLayout = new javax.swing.GroupLayout(bgPanel);
        bgPanel.setLayout(bgPanelLayout);
        bgPanelLayout.setHorizontalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgPanelLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 761, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(bgPanelLayout.createSequentialGroup()
                                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        bgPanelLayout.setVerticalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgPanelLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        WelcomePage window = new WelcomePage();
        window.setAlwaysOnTop(true);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        jTextArea1.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        String prompt = jTextArea1.getText();
        voiceModulationRate = jSlider1.getValue();
        textToSpeech(prompt);
    }//GEN-LAST:event_startActionPerformed

    public static void textToSpeech(String text) {
        System.setProperty("freetts.voices",
                "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory,"
                + "com.sun.speech.freetts.en.us.cmu_time_awb.AlanVoiceDirectory");

        //Fetching the voice to be used from the TTS engine
        VoiceManager voiceManager = VoiceManager.getInstance();
        Voice voice = voiceManager.getVoice("kevin16");

        if (voice != null) {
            voice.allocate();

            // Set parameters to approximate TTS
            voice.setRate(voiceModulationRate);  // Moderate to fast speech rate
            voice.setPitch(100); // Neutral pitch
            voice.setVolume(2);  // Medium volume

            voice.speak(text);
            voice.deallocate();
        } else {
            System.err.println("Voice not found.");
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TextToSpeech().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgPanel;
    private javax.swing.JButton clear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton start;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
