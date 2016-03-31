import javax.swing.*;
import java.awt.*;

public class WarmUp
{
	private JFrame jf, jf1;
	private JRadioButton rb1, rb2, rb3, rb4;
	private ButtonGroup bg;
	private JPanel p0, p1, p2;
	private GridBagConstraints gbc;
	private Color myGrey;
	
	private JTextField WorkingWeightTextField;
	private JLabel WorkingWeightLabel;
	private JButton WorkingWeightSubmit;
	
	WarmUp()
	{
		myGrey = new Color(140, 150, 150);
		
		jf = new JFrame("Warm Up Calculator!");
		jf.setSize(640, 400);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		
		p0 = new JPanel(new GridBagLayout());
		//p0.setBackground(Color.green);
		p0.setBackground(myGrey);
		p1 = new JPanel(new BorderLayout());
		p1.setBackground(Color.RED);
		
		bg = new ButtonGroup();
		rb1 = new JRadioButton("Squat");
		//rb1.setBackground(Color.YELLOW);
		rb2 = new JRadioButton("Deadlift");
		rb3 = new JRadioButton("Bench Press");
		rb4 = new JRadioButton("Overhead Press");
		
		gbc = new GridBagConstraints();
		
		bg.add(rb1);
		bg.add(rb2);
		bg.add(rb3);
		bg.add(rb4);
		
		gbc.anchor = GridBagConstraints.NORTHWEST;
		gbc.weightx = 1.0;
		gbc.weighty = 0.1;
		//gbc.fill = GridBagConstraints.HORIZONTAL;
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		p0.add(rb1, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 2;
		p0.add(rb2, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 3;
		p0.add(rb3, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 4;
		p0.add(rb4, gbc);
		jf.add(p0, BorderLayout.WEST);
		jf.add(p1, BorderLayout.CENTER);
		
		p2 = new JPanel(new FlowLayout());
		p2.setBackground(Color.YELLOW);
		WorkingWeightLabel = new JLabel("Enter your working weight.");
		WorkingWeightTextField = new JTextField(15);
		WorkingWeightSubmit = new JButton("Submit");
		p2.add(WorkingWeightLabel);
		p2.add(WorkingWeightTextField);
		p2.add(WorkingWeightSubmit);
		p2.setBackground(Color.GREEN);
		
		/* To test whether the panel p2 is being created.
		jf1 = new JFrame("Test p2");
		jf1.setSize(200, 200);
		jf1.add(p2);
		jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf1.setVisible(true);
		*/
		
		
		p1.add(p2, BorderLayout.NORTH);
		p1.validate();//<- Either have this, or make jf visible here instead of above.
		/*"If a component has been added to a container that has been displayed,
		validate must be called on that container to display that component"*/
	}
	
	public static void main(String [] args)
	{
		new WarmUp();
	}
}
