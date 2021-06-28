package uasPL;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class tabelSorting {
    private JTextField textJumlahAngka;
    private JTextField textAngka;
    private JButton buttonSave;
    private JTable tableSorting;
    private JPanel rootPanel;
    private JButton buttonSimpan;
    private DefaultTableModel tableModel;
    private boolean added = false;
    private Object DefaultTabelModel;

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public tabelSorting() {

        this.iniComponents();
        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(textJumlahAngka.getText().isEmpty() || textAngka.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(rootPanel,
                            "Data belum diisi",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE);
                    return;
                }
                DefaultTableModel model = (DefaultTableModel) tableSorting.getModel();
                String input = textAngka.getText();
                int jumlah = Integer.parseInt(textJumlahAngka.getText());
                String[] stmp = input.split(",");


                if (stmp.length > jumlah || stmp.length < jumlah) {
                    JOptionPane.showMessageDialog(rootPanel,
                            "Jumlah Angka Tidak Sesuai",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE);
                    return;

                }

                if (!added) {
                    for (int i = 0; i < jumlah; i++) {
                        model.addRow(new Object[]{});
                    }
                    added = true;
                }
                int n = 0;
                for (int i : Sorting.getas(input, jumlah)) {
                    model.setValueAt(i, n, 0);
                    n++;
                }
                int m = 0;
                for (int i : Sorting.getdes(input, jumlah)) {
                    model.setValueAt(i, m, 1);
                    m++;
                }
            }
        });
        buttonSimpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    private void iniComponents() {
        Object[] tableColom = {
                "Ascending",
                "Descending"
        };
        Object[][] initData = {

        };
        tableModel = new DefaultTableModel(initData, tableColom);
        tableSorting.setModel(tableModel);
        tableSorting.setAutoCreateRowSorter(false);
        tableSorting.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
}
