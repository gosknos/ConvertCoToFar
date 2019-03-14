package exoConvertion;
import javax.swing.*;


import java.awt.*;
import java.awt.event.*;

public class ConvertionGUI extends JFrame {

	public ConvertionGUI()
	{
		super();
		build();
	}

	void build()
	{
		setTitle("Convert Celsius to Fahrenheit");
		setPreferredSize(new Dimension(600, 100));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(buildContentPane());
	}


	Container buildContentPane()
	{
		final JTextField celsius;

		final JButton convert;
		final JLabel fahrenheit;

		celsius = new JTextField(0);
                celsius.setPreferredSize(new Dimension(25, 25));

		convert = new JButton("Convert");
		fahrenheit = new JLabel();

		this.setLayout(new FlowLayout());
		this.add(celsius);
		this.add(convert);
		this.add(fahrenheit);

		convert.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
                            int c = Integer.parseInt(celsius.getText());
                            int res = Convertion.convertion(c);
                            String result = String.valueOf(res);
                            fahrenheit.setText(result + " Fahrenheit");
			}
		});

		pack();
		return getContentPane();
	}	
}

