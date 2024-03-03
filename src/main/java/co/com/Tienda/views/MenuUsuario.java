package co.com.Tienda.views;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;



@SuppressWarnings("serial")
public class MenuUsuario extends JFrame {

	private JPanel contentPane;
	private JLabel labelRegistro;
	private JLabel labelDelete;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuUsuario frame = new MenuUsuario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenuUsuario() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenuUsuario.class.getResource("/imagenes/TiendaIco.png")));
		setBounds(100, 100, 944, 609);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		
		JPanel panelMenu = new JPanel();
		panelMenu.setBackground(new Color(12, 138, 152));
		panelMenu.setBounds(0, 0, 944, 200);
		contentPane.add(panelMenu);
		panelMenu.setLayout(null);
		
		JLabel imagenFondo = new JLabel("");
		imagenFondo.setBounds(0, 200, 944, 409);
		imagenFondo.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/imagenes/HorizontalUsurio.jpg")));
		contentPane.add(imagenFondo);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(50, 20, 150, 150);
		panelMenu.add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon(MenuUsuario.class.getResource("/imagenes/TiendaLogo.png")));
		
		
		
		final JPanel btnRegistro = new JPanel();
		btnRegistro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnRegistro.setBackground(new Color(118, 187, 223));				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnRegistro.setBackground(new Color(12, 138, 152));	
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				//ReservasView reservas = new ReservasView();
				//reservas.setVisible(true);
				dispose();
			}
		});
		btnRegistro.setBounds(255, 72, 220, 56);
		btnRegistro.setBackground(new Color(12, 138, 152));
		panelMenu.add(btnRegistro);
		btnRegistro.setLayout(null);
		
		labelRegistro = new JLabel("Registro de Productos");
		labelRegistro.setIcon(new ImageIcon(MenuUsuario.class.getResource("/imagenes/AddProducto.png")));
		labelRegistro.setForeground(SystemColor.text);
		labelRegistro.setBounds(0, 0, 235, 34);
		labelRegistro.setFont(new Font("Roboto", Font.PLAIN, 18));
		labelRegistro.setHorizontalAlignment(SwingConstants.LEFT);
		btnRegistro.add(labelRegistro);
		
		final JPanel btnDelete = new JPanel();
		btnDelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnDelete.setBackground(new Color(118, 187, 223));				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnDelete.setBackground(new Color(12, 138, 152));	
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				//ReservasView reservas = new ReservasView();
				//reservas.setVisible(true);
				dispose();
			}
		});
		
		btnDelete.setBounds(500, 72, 220, 56);
	
		btnDelete.setBackground(new Color(12, 138, 152));
		panelMenu.add(btnDelete);
		btnDelete.setLayout(null);
		
		
		labelDelete = new JLabel("Eliminar Producto");
		labelDelete.setIcon(new ImageIcon(MenuUsuario.class.getResource("/imagenes/Delete.png")));
		labelDelete.setForeground(SystemColor.text);
		labelDelete.setBounds(0, 0, 235, 34);
		labelDelete.setFont(new Font("Roboto", Font.PLAIN, 18));
		labelDelete.setHorizontalAlignment(SwingConstants.LEFT);
		btnDelete.add(labelDelete);
		
		
	}
	
}