package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLOutput;

public class FormBiodata {
    private JTextField textNama;
    private JTextField textNim;
    private JButton buttonSave;
    private JPanel rootPanel;
    private JTextField textFakultas;
    private JTextField textJurusan;
    private JTextField textJK;
    private JTextField textNomorUrut;
    private JTextField textJP;
    private JTextField textTahunMasuk;
    private JButton button1;

    public FormBiodata() {
        buttonSave.addActionListener(e ->  {
                //Mengambil data dari teksNama
                String nama = textNama.getText();
                //Mengambil data dari textNim
                String nim = textNim.getText();
                //Diproses
                Mahasiswa mhs = new Mahasiswa();
                mhs.setNama(nama);
                mhs.setNim(nim);
                //Tampilkan output ke Form
            textNama.setText(nama);
            textNim.setText(nim);
            textJP.setText(mhs.getJenjangPendidikan());
            textTahunMasuk.setText(mhs.getTahunMasuk());
            textFakultas.setText(mhs.getFakultas());
            textJurusan.setText(mhs.getJurusan());
            textJK.setText(mhs.getJenisKelamin());
            textNomorUrut.setText(mhs.getNomorUrut());


    });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }

}
