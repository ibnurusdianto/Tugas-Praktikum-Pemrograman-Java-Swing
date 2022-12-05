package UTS;

import javax.swing.table.*;
import java.util.ArrayList;

public class TableModel extends AbstractTableModel {

    private String[] columnNames = { "Judul", "Genre", "Sinopsis" };
    private ArrayList<Model> data = new ArrayList<Model>();

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
        Model rowItem = data.get(row);
        String value = "";

        switch (col) {
            case 0:
                value = rowItem.getJudul();
                break;
            case 1:
                value = rowItem.getGenre();
                break;
            case 2:
                value = rowItem.getSinopsis();
                break;
        }

        return value;
    }

    public boolean isCellEditable(int row, int col) {
        return false;
    }

    public void add(Model value) {
        data.add(value);
        fireTableRowsInserted(data.size() - 1, data.size() - 1);
    }

}
