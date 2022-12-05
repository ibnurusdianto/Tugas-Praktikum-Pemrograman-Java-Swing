package Pertemuan8;

import javax.swing.table.*;
import java.util.ArrayList;

public class BiodataTableModel extends AbstractTableModel {

    private String[] columnNames = { "Nama", "Nomor Telp", "Alamat", "Jenis Kelamin" };
    private ArrayList<Profil> data = new ArrayList<Profil>();

    public int getRowCount() {
        return data.size();
    }

    public int getColumnCount() {
        return columnNames.length;
    }

    public String getColumnName(int col) {
        return columnNames[col];
    }

    public Object getValueAt(int row, int col) {
        Profil rowItem = data.get(row);
        String value = "";

        switch (col) {
            case 0:
                value = rowItem.getNama();
                break;
            case 1:
                value = rowItem.getNoTelp();
                break;
            case 2:
                value = rowItem.getAlamat();
                break;
            case 3:
                value = rowItem.getJenisKelamin();
                break;
        }

        return value;
    }

    public boolean isCellEditable(int row, int col) {
        return false;
    }

    public void add(Profil value) {
        data.add(value);
        fireTableRowsInserted(data.size() - 1, data.size() - 1);
    }

}
