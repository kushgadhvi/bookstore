package bookstore;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;

public class ButtonEditor extends AbstractCellEditor implements TableCellEditor, ActionListener {
    JButton button;
    Object value;
    int row;
    JTable table;

    public ButtonEditor(JCheckBox checkBox) {
        button = new JButton();
        button.setOpaque(true);
        button.addActionListener(this);
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        this.value = value;
        this.row = row;
        this.table = table;
        button.setText(value == null ? "" : value.toString());
        return button;
    }

    @Override
    public Object getCellEditorValue() {
        return value;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Implement your button click logic here
        fireEditingStopped();
    }
}