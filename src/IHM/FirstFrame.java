package IHM;


import java.awt.Dialog.ModalExclusionType;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class FirstFrame extends JFrame{
	private int gameMode=1;
	private JPanel contentPane;
	private HashMap<String,Integer> itemNumbers = new HashMap<String, Integer>();

	/**
	 * to launch the application.n
	 */
	public static void main(String[] args) {
				try {
					FirstFrame frame = new FirstFrame();
					frame.setVisible(true);
					frame.setTitle("GARDIEN");
					frame.setResizable(false);
					frame.setSize(620,620);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
	/**
	 * to create the frame.
	 */
	public FirstFrame getInstance(){
		return this;
	}
	public FirstFrame() {
		itemNumbers.put("Gardien",1);
		itemNumbers.put("Intru",5);
		itemNumbers.put("Arbre",5);
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		JButton btnMenu = new JButton("MENU");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FirstDialog fd= new FirstDialog(itemNumbers,getInstance());
				fd.setVisible(true);
			}
		});
		
		JButton btnStart = new JButton("START");
		btnStart.addActionListener((new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				Game game = new Game(31*41,31*21,"gardien",itemNumbers.get("Gardien"),itemNumbers.get("Intru"),itemNumbers.get("Arbre"),gameMode);
				game.setGameMode(gameMode);
				game.start();
			}
		}));
		JPanel panel = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
						.addComponent(btnMenu, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
						.addComponent(btnExit, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
						.addComponent(btnStart, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnStart)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnMenu)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnExit)
					.addContainerGap())
		);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setIcon(new ImageIcon("res/textures/menuIcon.png"));
		lblNewLabel.setBounds(0, 0, 657, 657);
		panel.add(lblNewLabel);
		contentPane.setLayout(gl_contentPane);
	}

	public void setItemNumbers(HashMap<String, Integer> itemNumbers) {
		this.itemNumbers = itemNumbers;
	}

	public void setGameMode(int gameMode) {
		this.gameMode = gameMode;
	}
}

