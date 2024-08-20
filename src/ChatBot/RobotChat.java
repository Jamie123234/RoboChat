package ChatBot;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import java.util.ArrayList;

public class RobotChat extends javax.swing.JFrame {

    ArrayList<String[]> prompt_response = new ArrayList<>();

    public RobotChat() {
        initComponents();
        prompt_response.add(new String[]{"Hey", "Hi"});
        prompt_response.add(new String[]{"Hello", "Hey there"});
        prompt_response.add(new String[]{"How are you", "I am good thanks"});
        prompt_response.add(new String[]{"Nice to meet you", "Nice to meet you too"});
        prompt_response.add(new String[]{"You are awesome", "Thank you"});
        prompt_response.add(new String[]{"What is your name", "My name is robochat"});
        for (String[] item : prompt_response) {
            jComboBox1.addItem(item[0]);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPanel = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        bgPanel.setBackground(java.awt.Color.lightGray);

        jButton4.setText("Confirm");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Goudy Stout", 1, 26)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Welcome to RoboChat");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ChatBot/Images/image.png"))); // NOI18N

        javax.swing.GroupLayout bgPanelLayout = new javax.swing.GroupLayout(bgPanel);
        bgPanel.setLayout(bgPanelLayout);
        bgPanelLayout.setHorizontalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgPanelLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgPanelLayout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)))
                    .addGroup(bgPanelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        bgPanelLayout.setVerticalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bgPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        WelcomePage window = new WelcomePage();
        window.setAlwaysOnTop(true);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       String prompt = (String)jComboBox1.getSelectedItem();
       for (String[] item : prompt_response) {
           if (item[0].equalsIgnoreCase(prompt)) {
               textToSpeech(item[1]);
           }
       }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            voice.setRate(120);  // Moderate to fast speech rate
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
                new RobotChat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgPanel;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
