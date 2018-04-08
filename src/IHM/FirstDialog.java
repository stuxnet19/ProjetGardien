package IHM;




import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.HashMap;

public class FirstDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private String selectedObject;
	private String selectedMode;
	private int gameMode;

	public FirstDialog(HashMap<String,Integer> itemList,FirstFrame frame) {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
			JLabel lblAbscisse = new JLabel("<html>le nembre d'objet type <br>"+selectedObject+" : </html>");
			lblAbscisse.setBounds(180, 27, 150, 35);
			contentPanel.add(lblAbscisse);
			JComboBox comboBox = new JComboBox();
				comboBox.addItem("--- Select Item ---");
				comboBox.addItem("Gardien");
				comboBox.addItem("Intru");
				comboBox.addItem("Arbre");
			comboBox.setBounds(12, 22, 153, 26);
			contentPanel.add(comboBox);
		JComboBox comboBox2 = new JComboBox();
		comboBox2.addItem("Select Game Mode");
		comboBox2.addItem("mode aléatoire");
		comboBox2.addItem("mode controle");
		comboBox2.setBounds(12, 70, 153, 26);
		contentPanel.add(comboBox2);
			comboBox.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					selectedObject = comboBox.getSelectedItem().toString();
					lblAbscisse.setText("<html>le nembre d'objet type <br>"+selectedObject+" : </html>");
				}
			});
			textField = new JTextField();
			textField.setBounds(340, 25, 73, 21);
			contentPanel.add(textField);
			textField.setColumns(10);
			JButton btnPlacer = new JButton("Placer");
			btnPlacer.setBounds(22, 160, 400, 27);
			contentPanel.add(btnPlacer);
			btnPlacer.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					switch (selectedObject){
						case "Gardien" : itemList.put(selectedObject,Integer.parseInt(textField.getText()));
						break;
						case "Intru": itemList.put(selectedObject,Integer.parseInt(textField.getText()));
						break;
						case "Arbre" : itemList.put(selectedObject,Integer.parseInt(textField.getText()));
					}
				}
			});
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
				JButton okButton = new JButton("OK");	
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setVisible(false);
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
				okButton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						frame.setItemNumbers(itemList);
						frame.setGameMode(comboBox2.getSelectedIndex()-1);
					}
				});
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e){
						setVisible(false);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
				this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				this.setVisible(true);
				this.setSize(620,320);
				this.setResizable(false);
				this.setTitle("GARDIEN");
	}

}
