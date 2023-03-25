package resources;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SelectionCriteria extends JFrame{

	private JFrame frame;

	private static int index=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelectionCriteria window = new SelectionCriteria();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SelectionCriteria() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 886, 263);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel Overfitting = new JLabel("Overfitting");
		Overfitting.setBounds(10, 45, 70, 14);
		frame.getContentPane().add(Overfitting);
		
		final JComboBox comboBoxOverfitting = new JComboBox();
		comboBoxOverfitting.setBounds(10, 61, 70, 36);
		comboBoxOverfitting.addItem("Yes");
		comboBoxOverfitting.addItem("No"); 
		frame.getContentPane().add(comboBoxOverfitting);
		
		JLabel ImbalancedDataSet = new JLabel("ImbalancedDataSet");
		ImbalancedDataSet.setBounds(113, 45, 97, 14);
		frame.getContentPane().add(ImbalancedDataSet);
		
		final JComboBox comboBoxImbalancedDataSet = new JComboBox();
		comboBoxImbalancedDataSet.setBounds(100, 61, 110, 36);
		comboBoxImbalancedDataSet.addItem("Yes");
		comboBoxImbalancedDataSet.addItem("No"); 
		frame.getContentPane().add(comboBoxImbalancedDataSet);
		
		JLabel MinoryClass = new JLabel("MinoryClass");
		MinoryClass.setBounds(233, 45, 72, 14);
		frame.getContentPane().add(MinoryClass);
		
		final JComboBox comboBoxMinoryClass = new JComboBox();
		comboBoxMinoryClass.setBounds(220, 61, 85, 36);
		comboBoxMinoryClass.addItem(">>1000");
		comboBoxMinoryClass.addItem("<<1000");
		frame.getContentPane().add(comboBoxMinoryClass);
		
		JLabel ProblemType = new JLabel("ProblemType");
		ProblemType.setBounds(327, 45, 85, 14);
		frame.getContentPane().add(ProblemType);
		
		final JComboBox comboBoxProblemType = new JComboBox();
		comboBoxProblemType.setBounds(319, 61, 93, 36);
		comboBoxProblemType.addItem("Classification");
		comboBoxProblemType.addItem("Regression");
		comboBoxProblemType.addItem("Clustering"); 
		frame.getContentPane().add(comboBoxProblemType);
		
		JLabel ConfidentialyDataLableled = new JLabel("ConfidentialyDataLableled");
		ConfidentialyDataLableled.setBounds(430, 45, 117, 14);
		frame.getContentPane().add(ConfidentialyDataLableled);
		
		final JComboBox comboBoxConfidentialyDataLableled = new JComboBox();
		comboBoxConfidentialyDataLableled.setBounds(422, 61, 149, 36);
		comboBoxConfidentialyDataLableled.addItem("No"); 
		comboBoxConfidentialyDataLableled.addItem("Yes"); 
		frame.getContentPane().add(comboBoxConfidentialyDataLableled);
		
		JLabel Accuracy = new JLabel("Accuracy");
		Accuracy.setBounds(599, 45, 64, 14);
		frame.getContentPane().add(Accuracy);
		
		final JComboBox comboBoxAccuracy = new JComboBox();
		comboBoxAccuracy.setBounds(581, 61, 70, 36);
		comboBoxAccuracy.addItem("High");
		comboBoxAccuracy.addItem("Moderate");
		comboBoxAccuracy.addItem("Low"); 
		frame.getContentPane().add(comboBoxAccuracy);
		
		JLabel DataType = new JLabel("DataType");
		DataType.setBounds(673, 45, 70, 14);
		frame.getContentPane().add(DataType);
		
		final JComboBox comboBoxDataType = new JComboBox();
		comboBoxDataType.setBounds(663, 61, 70, 36);
		comboBoxDataType.addItem("Categorial");
		comboBoxDataType.addItem("Continue"); 
		frame.getContentPane().add(comboBoxDataType);
		
		JLabel SpeedOfTraining = new JLabel("SpeedOfTraining");
		SpeedOfTraining.setBounds(743, 45, 97, 14);
		frame.getContentPane().add(SpeedOfTraining);
		
		final JComboBox comboBoxSpeedOfTraining = new JComboBox();
		comboBoxSpeedOfTraining.setBounds(743, 61, 97, 36);
		comboBoxSpeedOfTraining.addItem("High");
		comboBoxSpeedOfTraining.addItem("Moderate");
		comboBoxSpeedOfTraining.addItem("Low");
		frame.getContentPane().add(comboBoxSpeedOfTraining);
		
		
		JLabel lblNewLabel = new JLabel("LabeledData");
		lblNewLabel.setBounds(10, 126, 97, 13);
		frame.getContentPane().add(lblNewLabel);
		final JComboBox comboBoxLabeledData = new JComboBox();
		comboBoxLabeledData.setBounds(10, 149, 97, 21);
		comboBoxLabeledData.addItem("No"); 
		comboBoxLabeledData.addItem("Yes"); 
		frame.getContentPane().add(comboBoxLabeledData);
		
		JLabel lblNewLabel_1 = new JLabel("NmberOfLabelsByClasse");
		lblNewLabel_1.setBounds(117, 126, 110, 13);
		frame.getContentPane().add(lblNewLabel_1);
		final JComboBox comboBoxNmberOfLabelsByClasse = new JComboBox();
		comboBoxNmberOfLabelsByClasse.setBounds(117, 149, 110, 21);
		comboBoxNmberOfLabelsByClasse.addItem(">1"); 
		comboBoxNmberOfLabelsByClasse.addItem("==1"); 
		frame.getContentPane().add(comboBoxNmberOfLabelsByClasse);
		
		JLabel lblNewLabel_2 = new JLabel("NumberOfClasses");
		lblNewLabel_2.setBounds(246, 126, 117, 13);
		frame.getContentPane().add(lblNewLabel_2);
		final JComboBox comboBoxNumberOfClasses = new JComboBox();
		comboBoxNumberOfClasses.setBounds(245, 149, 103, 21);
		comboBoxNumberOfClasses.addItem(">2"); 
		comboBoxNumberOfClasses.addItem("==2"); 
		frame.getContentPane().add(comboBoxNumberOfClasses);
		
		JLabel lblNewLabel_3 = new JLabel("SmallDataSet");
		lblNewLabel_3.setBounds(373, 126, 86, 13);
		frame.getContentPane().add(lblNewLabel_3);
		final JComboBox comboBoxSmallDataSet = new JComboBox();
		comboBoxSmallDataSet.addItem("Yes"); 
		comboBoxSmallDataSet.addItem("No"); 
		comboBoxSmallDataSet.setBounds(374, 149, 85, 21);
		frame.getContentPane().add(comboBoxSmallDataSet);
		
		JLabel lblNewLabel_4 = new JLabel("HighTrainingSpeed");
		lblNewLabel_4.setBounds(479, 126, 98, 13);
		frame.getContentPane().add(lblNewLabel_4);
		final JComboBox comboBoxHighTrainingSpeed = new JComboBox();
		comboBoxHighTrainingSpeed.addItem("Yes"); 
		comboBoxHighTrainingSpeed.addItem("No"); 
		comboBoxHighTrainingSpeed.setBounds(478, 149, 89, 21);
		frame.getContentPane().add(comboBoxHighTrainingSpeed);
		
		JLabel lblNewLabel_5 = new JLabel("Explainable");
		lblNewLabel_5.setBounds(605, 126, 110, 13);
		frame.getContentPane().add(lblNewLabel_5);
		final JComboBox comboBoxExplainable = new JComboBox();
		comboBoxExplainable.addItem("Yes"); 
		comboBoxExplainable.addItem("No"); 
		comboBoxExplainable.setBounds(605, 149, 123, 21);
		frame.getContentPane().add(comboBoxExplainable);
 
		
		JButton btnNewButton = new JButton("Creer une nouvelle chaine de traitement");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		    	List<String> listOfCondition = new ArrayList<String>(Arrays.asList("Overfitting==" + comboBoxOverfitting.getSelectedItem().toString(),
																				   "ImbalancedDataSet==" + comboBoxImbalancedDataSet.getSelectedItem().toString(), 
																				   "MinoryClass==" + comboBoxMinoryClass.getSelectedItem().toString(), 
																				   "ProblemType==" + comboBoxProblemType.getSelectedItem().toString(), 
																				   "ConfidentialyDataLableled==" + comboBoxConfidentialyDataLableled.getSelectedItem().toString(), 
																				   "Accuracy==" + comboBoxAccuracy.getSelectedItem().toString(),
																				   "DataType==" + comboBoxDataType.getSelectedItem().toString(), 
																				   "SpeedOfTraining==" + comboBoxSpeedOfTraining.getSelectedItem().toString(),
																				   "LabeledData==" + comboBoxLabeledData.getSelectedItem().toString(),
																				   "NmberOfLabelsByClasse==" + comboBoxNmberOfLabelsByClasse.getSelectedItem().toString(),
																				   "NumberOfClasses==" + comboBoxNumberOfClasses.getSelectedItem().toString(),
																				   "SmallDataSet==" + comboBoxSmallDataSet.getSelectedItem().toString(),
																				   "HighTrainingSpeed==" + comboBoxHighTrainingSpeed.getSelectedItem().toString(),
																				   "Explainable==" + comboBoxExplainable.getSelectedItem().toString()));
		    	
		    	//DataType==Categorial && SpeedOfTraining==High && Accuracy==High
		    	try {
		    		 
					FileWriter fileWriter = new FileWriter(
							"C:\\Users\\lookm\\git\\org.eclipse.bpmn2-modeler\\examples\\plugins\\org.eclipse.bpmn2.modeler.examples.customtask\\src\\org\\eclipse\\bpmn2\\modeler\\examples\\customtask\\MyModel\\util\\Criteria.txt");
					
					String line ="1;";
					for (String el : listOfCondition) {
						line += el.split("==")[1]+";";
					}
			        fileWriter.write(line);
			        fileWriter.close();
					//BPMN2TaskAndSequenceFlowRemover.CreateNewChaineByRemovingUnecessaryComponent(listOfCondition, index++);
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(10, 195, 259, 21);
		frame.getContentPane().add(btnNewButton);
		

//		
//		JButton btnNewButton = new JButton("Select ML Algorithm");
//		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
//		btnNewButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//			}
//		});
//		btnNewButton.setBackground(Color.GREEN);
//		btnNewButton.setBounds(711, 108, 149, 41);
//		frame.getContentPane().add(btnNewButton);
//		
//		JLabel lblNewLabel_3 = new JLabel("AutoDetected Criteria");
//		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
//		lblNewLabel_3.setBounds(10, 121, 112, 14);
//		frame.getContentPane().add(lblNewLabel_3);
//		
//		JLabel lblManualSelectionCriteria = new JLabel("ManualSelection Criteria");
//		lblManualSelectionCriteria.setFont(new Font("Tahoma", Font.PLAIN, 11));
//		lblManualSelectionCriteria.setBounds(10, 11, 141, 14);
//		frame.getContentPane().add(lblManualSelectionCriteria);
//		
//		JComboBox comboBox_7 = new JComboBox();
//		comboBox_7.setBounds(10, 164, 70, 36);
//		frame.getContentPane().add(comboBox_7);
//		
//		JLabel lblLinearModel = new JLabel("Linear model");
//		lblLinearModel.setBounds(10, 148, 70, 14);
//		frame.getContentPane().add(lblLinearModel);
//		
//		JComboBox comboBox_8 = new JComboBox();
//		comboBox_8.setBounds(107, 164, 70, 36);
//		frame.getContentPane().add(comboBox_8);
//		
//		JLabel lblDataSize = new JLabel("Data Size ");
//		lblDataSize.setBounds(107, 148, 70, 14);
//		frame.getContentPane().add(lblDataSize);
//		
//		JComboBox comboBox_9 = new JComboBox();
//		comboBox_9.setBounds(197, 164, 79, 36);
//		frame.getContentPane().add(comboBox_9);
//		
//		JLabel lblDataDimension = new JLabel("Data Dimension");
//		lblDataDimension.setBounds(197, 148, 85, 14);
//		frame.getContentPane().add(lblDataDimension);
//		
//		JComboBox comboBox_10 = new JComboBox();
//		comboBox_10.setBounds(292, 164, 70, 36);
//		frame.getContentPane().add(comboBox_10);
//		
//		JLabel lblHighlyCorrelatedAttr = new JLabel("Highly correlated Attr");
//		lblHighlyCorrelatedAttr.setBounds(292, 148, 70, 14);
//		frame.getContentPane().add(lblHighlyCorrelatedAttr);
//		
//		JComboBox comboBox_11 = new JComboBox();
//		comboBox_11.setBounds(373, 164, 70, 36);
//		frame.getContentPane().add(comboBox_11);
//		
//		JLabel lblMissingValue = new JLabel("Missing value");
//		lblMissingValue.setBounds(373, 148, 70, 14);
//		frame.getContentPane().add(lblMissingValue);
//		
//		JComboBox comboBox_12 = new JComboBox();
//		comboBox_12.setBounds(453, 164, 70, 36);
//		frame.getContentPane().add(comboBox_12);
//		
//		JLabel lblNoise = new JLabel("Noise");
//		lblNoise.setBounds(453, 148, 70, 14);
//		frame.getContentPane().add(lblNoise);
//		
//		JComboBox comboBox_13 = new JComboBox();
//		comboBox_13.setBounds(535, 164, 70, 36);
//		frame.getContentPane().add(comboBox_13);
//		
//		JLabel lblImbalancedData = new JLabel("Imbalanced Data");
//		lblImbalancedData.setBounds(535, 148, 70, 14);
//		frame.getContentPane().add(lblImbalancedData);
		
		frame.setVisible(true);
	}
}
