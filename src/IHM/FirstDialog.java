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

public class FirstDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			System.out.println("hello");
		    FirstDialog dialog = new FirstDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
			dialog.setSize(620,320);
			dialog.setResizable(false);
			dialog.setTitle("GARDIEN");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * Create the dialog.
	 */
	public FirstDialog() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JComboBox comboBox = new JComboBox();
				comboBox.addItem("---Select Item---");
				comboBox.addItem("Gardien");
				comboBox.addItem("Intru");
				comboBox.addItem("Arbre");
				comboBox.addItem("Mur");
				comboBox.addItem("Eau");
			comboBox.setBounds(12, 22, 153, 26);
			contentPanel.add(comboBox);
		}
		{
			JLabel lblAbscisse = new JLabel("Abscisse : ");
			lblAbscisse.setBounds(255, 27, 73, 17);
			contentPanel.add(lblAbscisse);
		}
		{
			JLabel lblOrdone = new JLabel("Ordonée : ");
			lblOrdone.setBounds(255, 69, 87, 17);
			contentPanel.add(lblOrdone);
		}
		{
			textField = new JTextField();
			textField.setBounds(324, 25, 73, 21);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			textField_1 = new JTextField();
			textField_1.setBounds(324, 67, 73, 21);
			contentPanel.add(textField_1);
			textField_1.setColumns(10);
		}
		{
			JButton btnPlacer = new JButton("Placer");
			btnPlacer.setBounds(22, 160, 400, 27);
			contentPanel.add(btnPlacer);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");	
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setVisible(false);
					}
				});
				
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setVisible(false);
						
					}
				});
				
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
