    package Modul6;

    import java.awt.BorderLayout;
    import java.util.List;
    import javax.swing.JFrame;
    import javax.swing.JPanel;
    import javax.swing.JScrollPane;
    import javax.swing.JTable;
    import javax.swing.table.DefaultTableModel;

    public class GUI {
        public static void main(String[] args) {

            JFrame frame = new JFrame("Praktikum 6 - GUI Mahasiswa");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);

            JPanel panel = new JPanel(new BorderLayout());

            String[] columnNames = {"NIM", "Nama"};
            DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
            JTable table = new JTable(tableModel);

            List<Mahasiswa> mahasiswaList = DataMahasiswa.getMahasiswaList();
            for (Mahasiswa m : mahasiswaList) {
                tableModel.addRow(new Object[]{m.getNIM(), m.getNama()});
            }

            JScrollPane scrollPane = new JScrollPane(table);
            panel.add(scrollPane, BorderLayout.CENTER);

            frame.add(panel);

            frame.setVisible(true);
        }
    }

