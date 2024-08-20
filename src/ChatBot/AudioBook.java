package ChatBot;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public final class AudioBook extends javax.swing.JFrame {
    
    static int rate = 120;
    static ArrayList<String> books = new ArrayList<>();

    public AudioBook() {
        initComponents();
        addBook("A_Leap_of_Faith.txt");
        addBook("Echoes_in_the_Datascape.txt");
        jComboBox1.addItem("A Leap of Faith");
        jComboBox1.addItem("Echoes in the Datascape");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPanel = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jSlider1 = new javax.swing.JSlider();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
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
        jLabel2.setText("Audiobooks");

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jSlider1.setBackground(java.awt.Color.lightGray);
        jSlider1.setMaximum(1000);
        jSlider1.setMinimum(50);
        jSlider1.setValue(120);

        jLabel3.setText("Voice Modulation");

        javax.swing.GroupLayout bgPanelLayout = new javax.swing.GroupLayout(bgPanel);
        bgPanel.setLayout(bgPanelLayout);
        bgPanelLayout.setHorizontalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgPanelLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bgPanelLayout.setVerticalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(61, 61, 61)
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addGap(35, 35, 35)
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String chosenBook = (String)jComboBox1.getSelectedItem();
        rate = jSlider1.getValue();
        if (chosenBook.equals("A Leap of Faith")) {
            textToSpeech(books.get(0));
        } else if (chosenBook.equals("Echoes in the Datascape")) {
            textToSpeech(books.get(1));
        } 
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            voice.setRate(rate);  // Moderate to fast speech rate
            voice.setPitch(100); // Neutral pitch
            voice.setVolume(2);  // Medium volume

            voice.speak(text);
            voice.deallocate();
        } else {
            System.err.println("Voice not found.");
        }
    }

    public void addBook(String bookName) {
        String book = "";
        String fileName = bookName;
        String projectPath = System.getProperty("user.dir");
        String filePath = projectPath + File.separator + "src\\ChatBot\\Books"
                + File.separator + fileName;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                book += line;
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        books.add(book);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new AudioBook().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgPanel;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSlider jSlider1;
    // End of variables declaration//GEN-END:variables
}
