package csci6534;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class KACPanel {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JToggleButton toggleButton_2;
	private JToggleButton toggleButton_3;
	private JToggleButton toggleButton_4;
	private JToggleButton toggleButton_5;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_63;
	private JTextField textField_64;
	private JTextField textField_65;
	private JTextField textField_66;
	private JTextField textField_67;
	private JTextField textField_68;
	private JTextField textField_69;
	private JLabel lblIndexRegister;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JLabel lblIndexRegister_1;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JLabel lblIndexRegister_2;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_49;
	private JTextField textField_50;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_53;
	private JTextField textField_54;
	private JTextField textField_55;
	private JTextField textField_56;
	private JLabel lblGpRegister;
	private JTextField gpr_1_16;
	private JTextField gpr_1_15;
	private JTextField gpr_1_14;
	private JTextField gpr_1_13;
	private JTextField textField_61;
	private JTextField textField_62;
	private JTextField textField_70;
	private JTextField textField_71;
	private JTextField textField_72;
	private JTextField textField_73;
	private JTextField textField_74;
	private JTextField textField_75;
	private JTextField textField_76;
	private JTextField textField_77;
	private JTextField textField_78;
	private JTextField textField_79;
	private JLabel lblGpRegister_1;
	private JTextField textField_80;
	private JTextField textField_81;
	private JTextField textField_82;
	private JTextField textField_83;
	private JTextField textField_84;
	private JTextField textField_85;
	private JTextField textField_86;
	private JTextField textField_87;
	private JTextField textField_88;
	private JTextField textField_89;
	private JTextField textField_90;
	private JTextField textField_91;
	private JTextField textField_92;
	private JTextField textField_93;
	private JTextField textField_94;
	private JTextField textField_95;
	private JLabel lblGpRegister_2;
	private JTextField gpr_3_16;
	private JTextField gpr_3_15;
	private JTextField gpr_3_14;
	private JTextField gpr_3_13;
	private JTextField gpr_3_12;
	private JTextField gpr_3_11;
	private JTextField gpr_3_10;
	private JTextField gpr_3_9;
	private JTextField gpr_3_8;
	private JTextField gpr_3_7;
	private JTextField gpr_3_6;
	private JTextField gpr_3_5;
	private JTextField gpr_3_4;
	private JTextField gpr_3_3;
	private JTextField gpr_3_2;
	private JTextField gpr_3_1;
	private JLabel lblGpRegister_3;
	private JTextField textField_112;
	private JTextField textField_113;
	private JTextField textField_114;
	private JTextField textField_115;
	private JTextField textField_116;
	private JTextField textField_117;
	private JTextField textField_118;
	private JTextField textField_119;
	private JTextField textField_120;
	private JTextField textField_121;
	private JTextField textField_122;
	private JTextField textField_123;
	private JTextField textField_124;
	private JTextField textField_125;
	private JTextField textField_126;
	private JTextField textField_127;

	// An array of pointers to all of the toggle buttons
	private JToggleButton[] toggleButtons = new JToggleButton[16];

	// An array of pointers to the 3rd general purpose register text fields
	private JTextField[] gpr_3 = new JTextField[16];

	private JButton btnRomLoad;

	// Initializing my PC back end representation class
	private KAC kacPC = new KAC();
	private JButton btnRun;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KACPanel window = new KACPanel();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * My own helper classes.
	 */
	public int getToggleValues() {
		int howMuchToAdd = 1;
		int runningTotal = 0;

		for (int i = toggleButtons.length - 1; i >= 0; i--) {
			if (toggleButtons[i].isSelected()) {
				runningTotal += howMuchToAdd;
			}

			howMuchToAdd *= 2;
		}

		return runningTotal;
	}

	/**
	 * Create the application.
	 */
	public KACPanel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 833, 471);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);

		JLabel lblNewLabel = new JLabel("Program Counter");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);

		toggleButton_2 = new JToggleButton("");
		toggleButtons[0] = toggleButton_2;

		toggleButton_3 = new JToggleButton("");
		toggleButtons[1] = toggleButton_3;

		toggleButton_4 = new JToggleButton("");
		toggleButtons[2] = toggleButton_4;

		toggleButton_5 = new JToggleButton("");
		toggleButtons[3] = toggleButton_5;

		JToggleButton toggleButton_6 = new JToggleButton("");
		toggleButtons[4] = toggleButton_6;

		JToggleButton toggleButton_7 = new JToggleButton("");
		toggleButtons[5] = toggleButton_7;

		JToggleButton toggleButton_8 = new JToggleButton("");
		toggleButtons[6] = toggleButton_8;

		JToggleButton toggleButton_9 = new JToggleButton("");
		toggleButtons[7] = toggleButton_9;

		JToggleButton toggleButton_10 = new JToggleButton("");
		toggleButtons[8] = toggleButton_10;

		JToggleButton toggleButton_11 = new JToggleButton("");
		toggleButtons[9] = toggleButton_11;

		JToggleButton toggleButton_12 = new JToggleButton("");
		toggleButtons[10] = toggleButton_12;

		JToggleButton toggleButton_13 = new JToggleButton("");
		toggleButtons[11] = toggleButton_13;

		JToggleButton toggleButton_14 = new JToggleButton("");
		toggleButtons[12] = toggleButton_14;

		JToggleButton toggleButton_15 = new JToggleButton("");
		toggleButtons[13] = toggleButton_15;

		JToggleButton toggleButton_16 = new JToggleButton("");
		toggleButtons[14] = toggleButton_16;

		JToggleButton toggleButton_17 = new JToggleButton("");
		toggleButtons[15] = toggleButton_17;

		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);

		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);

		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setColumns(10);

		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setColumns(10);

		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setColumns(10);

		textField_63 = new JTextField();
		textField_63.setEditable(false);
		textField_63.setColumns(10);

		textField_64 = new JTextField();
		textField_64.setEditable(false);
		textField_64.setColumns(10);

		textField_65 = new JTextField();
		textField_65.setEditable(false);
		textField_65.setColumns(10);

		textField_66 = new JTextField();
		textField_66.setEditable(false);
		textField_66.setColumns(10);

		textField_67 = new JTextField();
		textField_67.setEditable(false);
		textField_67.setColumns(10);

		textField_68 = new JTextField();
		textField_68.setEditable(false);
		textField_68.setColumns(10);

		textField_69 = new JTextField();
		textField_69.setEditable(false);
		textField_69.setColumns(10);

		lblIndexRegister = new JLabel("Index Register 1");
		lblIndexRegister.setHorizontalAlignment(SwingConstants.CENTER);

		textField_9 = new JTextField();
		textField_9.setEditable(false);
		textField_9.setColumns(10);

		textField_10 = new JTextField();
		textField_10.setEditable(false);
		textField_10.setColumns(10);

		textField_11 = new JTextField();
		textField_11.setEditable(false);
		textField_11.setColumns(10);

		textField_12 = new JTextField();
		textField_12.setEditable(false);
		textField_12.setColumns(10);

		textField_13 = new JTextField();
		textField_13.setEditable(false);
		textField_13.setColumns(10);

		textField_14 = new JTextField();
		textField_14.setEditable(false);
		textField_14.setColumns(10);

		textField_15 = new JTextField();
		textField_15.setEditable(false);
		textField_15.setColumns(10);

		textField_16 = new JTextField();
		textField_16.setEditable(false);
		textField_16.setColumns(10);

		textField_17 = new JTextField();
		textField_17.setEditable(false);
		textField_17.setColumns(10);

		textField_18 = new JTextField();
		textField_18.setEditable(false);
		textField_18.setColumns(10);

		textField_19 = new JTextField();
		textField_19.setEditable(false);
		textField_19.setColumns(10);

		textField_20 = new JTextField();
		textField_20.setEditable(false);
		textField_20.setColumns(10);

		textField_21 = new JTextField();
		textField_21.setEditable(false);
		textField_21.setColumns(10);

		textField_22 = new JTextField();
		textField_22.setEditable(false);
		textField_22.setColumns(10);

		textField_23 = new JTextField();
		textField_23.setEditable(false);
		textField_23.setColumns(10);

		textField_24 = new JTextField();
		textField_24.setEditable(false);
		textField_24.setColumns(10);

		lblIndexRegister_1 = new JLabel("Index Register 2");
		lblIndexRegister_1.setHorizontalAlignment(SwingConstants.CENTER);

		textField_25 = new JTextField();
		textField_25.setEditable(false);
		textField_25.setColumns(10);

		textField_26 = new JTextField();
		textField_26.setEditable(false);
		textField_26.setColumns(10);

		textField_27 = new JTextField();
		textField_27.setEditable(false);
		textField_27.setColumns(10);

		textField_28 = new JTextField();
		textField_28.setEditable(false);
		textField_28.setColumns(10);

		textField_29 = new JTextField();
		textField_29.setEditable(false);
		textField_29.setColumns(10);

		textField_30 = new JTextField();
		textField_30.setEditable(false);
		textField_30.setColumns(10);

		textField_31 = new JTextField();
		textField_31.setEditable(false);
		textField_31.setColumns(10);

		textField_32 = new JTextField();
		textField_32.setEditable(false);
		textField_32.setColumns(10);

		textField_33 = new JTextField();
		textField_33.setEditable(false);
		textField_33.setColumns(10);

		textField_34 = new JTextField();
		textField_34.setEditable(false);
		textField_34.setColumns(10);

		textField_35 = new JTextField();
		textField_35.setEditable(false);
		textField_35.setColumns(10);

		textField_36 = new JTextField();
		textField_36.setEditable(false);
		textField_36.setColumns(10);

		textField_37 = new JTextField();
		textField_37.setEditable(false);
		textField_37.setColumns(10);

		textField_38 = new JTextField();
		textField_38.setEditable(false);
		textField_38.setColumns(10);

		textField_39 = new JTextField();
		textField_39.setEditable(false);
		textField_39.setColumns(10);

		textField_40 = new JTextField();
		textField_40.setEditable(false);
		textField_40.setColumns(10);

		lblIndexRegister_2 = new JLabel("Index Register 3");
		lblIndexRegister_2.setHorizontalAlignment(SwingConstants.CENTER);

		textField_41 = new JTextField();
		textField_41.setEditable(false);
		textField_41.setColumns(10);

		textField_42 = new JTextField();
		textField_42.setEditable(false);
		textField_42.setColumns(10);

		textField_43 = new JTextField();
		textField_43.setEditable(false);
		textField_43.setColumns(10);

		textField_44 = new JTextField();
		textField_44.setEditable(false);
		textField_44.setColumns(10);

		textField_45 = new JTextField();
		textField_45.setEditable(false);
		textField_45.setColumns(10);

		textField_46 = new JTextField();
		textField_46.setEditable(false);
		textField_46.setColumns(10);

		textField_47 = new JTextField();
		textField_47.setEditable(false);
		textField_47.setColumns(10);

		textField_48 = new JTextField();
		textField_48.setEditable(false);
		textField_48.setColumns(10);

		textField_49 = new JTextField();
		textField_49.setEditable(false);
		textField_49.setColumns(10);

		textField_50 = new JTextField();
		textField_50.setEditable(false);
		textField_50.setColumns(10);

		textField_51 = new JTextField();
		textField_51.setEditable(false);
		textField_51.setColumns(10);

		textField_52 = new JTextField();
		textField_52.setEditable(false);
		textField_52.setColumns(10);

		textField_53 = new JTextField();
		textField_53.setEditable(false);
		textField_53.setColumns(10);

		textField_54 = new JTextField();
		textField_54.setEditable(false);
		textField_54.setColumns(10);

		textField_55 = new JTextField();
		textField_55.setEditable(false);
		textField_55.setColumns(10);

		textField_56 = new JTextField();
		textField_56.setEditable(false);
		textField_56.setColumns(10);

		lblGpRegister = new JLabel("GP Register 1");
		lblGpRegister.setHorizontalAlignment(SwingConstants.CENTER);

		gpr_1_16 = new JTextField();
		gpr_1_16.setEditable(false);
		gpr_1_16.setColumns(10);

		gpr_1_15 = new JTextField();
		gpr_1_15.setEditable(false);
		gpr_1_15.setColumns(10);

		gpr_1_14 = new JTextField();
		gpr_1_14.setEditable(false);
		gpr_1_14.setColumns(10);

		gpr_1_13 = new JTextField();
		gpr_1_13.setEditable(false);
		gpr_1_13.setColumns(10);

		textField_61 = new JTextField();
		textField_61.setEditable(false);
		textField_61.setColumns(10);

		textField_62 = new JTextField();
		textField_62.setEditable(false);
		textField_62.setColumns(10);

		textField_70 = new JTextField();
		textField_70.setEditable(false);
		textField_70.setColumns(10);

		textField_71 = new JTextField();
		textField_71.setEditable(false);
		textField_71.setColumns(10);

		textField_72 = new JTextField();
		textField_72.setEditable(false);
		textField_72.setColumns(10);

		textField_73 = new JTextField();
		textField_73.setEditable(false);
		textField_73.setColumns(10);

		textField_74 = new JTextField();
		textField_74.setEditable(false);
		textField_74.setColumns(10);

		textField_75 = new JTextField();
		textField_75.setEditable(false);
		textField_75.setColumns(10);

		textField_76 = new JTextField();
		textField_76.setEditable(false);
		textField_76.setColumns(10);

		textField_77 = new JTextField();
		textField_77.setEditable(false);
		textField_77.setColumns(10);

		textField_78 = new JTextField();
		textField_78.setEditable(false);
		textField_78.setColumns(10);

		textField_79 = new JTextField();
		textField_79.setEditable(false);
		textField_79.setColumns(10);

		lblGpRegister_1 = new JLabel("GP Register 2");
		lblGpRegister_1.setHorizontalAlignment(SwingConstants.CENTER);

		textField_80 = new JTextField();
		textField_80.setEditable(false);
		textField_80.setColumns(10);

		textField_81 = new JTextField();
		textField_81.setEditable(false);
		textField_81.setColumns(10);

		textField_82 = new JTextField();
		textField_82.setEditable(false);
		textField_82.setColumns(10);

		textField_83 = new JTextField();
		textField_83.setEditable(false);
		textField_83.setColumns(10);

		textField_84 = new JTextField();
		textField_84.setEditable(false);
		textField_84.setColumns(10);

		textField_85 = new JTextField();
		textField_85.setEditable(false);
		textField_85.setColumns(10);

		textField_86 = new JTextField();
		textField_86.setEditable(false);
		textField_86.setColumns(10);

		textField_87 = new JTextField();
		textField_87.setEditable(false);
		textField_87.setColumns(10);

		textField_88 = new JTextField();
		textField_88.setEditable(false);
		textField_88.setColumns(10);

		textField_89 = new JTextField();
		textField_89.setEditable(false);
		textField_89.setColumns(10);

		textField_90 = new JTextField();
		textField_90.setEditable(false);
		textField_90.setColumns(10);

		textField_91 = new JTextField();
		textField_91.setEditable(false);
		textField_91.setColumns(10);

		textField_92 = new JTextField();
		textField_92.setEditable(false);
		textField_92.setColumns(10);

		textField_93 = new JTextField();
		textField_93.setEditable(false);
		textField_93.setColumns(10);

		textField_94 = new JTextField();
		textField_94.setEditable(false);
		textField_94.setColumns(10);

		textField_95 = new JTextField();
		textField_95.setEditable(false);
		textField_95.setColumns(10);

		lblGpRegister_2 = new JLabel("GP Register 3");
		lblGpRegister_2.setHorizontalAlignment(SwingConstants.CENTER);

		gpr_3_16 = new JTextField();
		gpr_3_16.setEditable(false);
		gpr_3_16.setColumns(10);
		gpr_3[15] = gpr_3_16;

		gpr_3_15 = new JTextField();
		gpr_3_15.setEditable(false);
		gpr_3_15.setColumns(10);
		gpr_3[14] = gpr_3_15;

		gpr_3_14 = new JTextField();
		gpr_3_14.setEditable(false);
		gpr_3_14.setColumns(10);
		gpr_3[13] = gpr_3_14;

		gpr_3_13 = new JTextField();
		gpr_3_13.setEditable(false);
		gpr_3_13.setColumns(10);
		gpr_3[12] = gpr_3_13;

		gpr_3_12 = new JTextField();
		gpr_3_12.setEditable(false);
		gpr_3_12.setColumns(10);
		gpr_3[11] = gpr_3_12;

		gpr_3_11 = new JTextField();
		gpr_3_11.setEditable(false);
		gpr_3_11.setColumns(10);
		gpr_3[10] = gpr_3_11;

		gpr_3_10 = new JTextField();
		gpr_3_10.setEditable(false);
		gpr_3_10.setColumns(10);
		gpr_3[9] = gpr_3_10;

		gpr_3_9 = new JTextField();
		gpr_3_9.setEditable(false);
		gpr_3_9.setColumns(10);
		gpr_3[8] = gpr_3_9;

		gpr_3_8 = new JTextField();
		gpr_3_8.setEditable(false);
		gpr_3_8.setColumns(10);
		gpr_3[7] = gpr_3_8;

		gpr_3_7 = new JTextField();
		gpr_3_7.setEditable(false);
		gpr_3_7.setColumns(10);
		gpr_3[6] = gpr_3_7;

		gpr_3_6 = new JTextField();
		gpr_3_6.setEditable(false);
		gpr_3_6.setColumns(10);
		gpr_3[5] = gpr_3_6;

		gpr_3_5 = new JTextField();
		gpr_3_5.setEditable(false);
		gpr_3_5.setColumns(10);
		gpr_3[4] = gpr_3_5;

		gpr_3_4 = new JTextField();
		gpr_3_4.setEditable(false);
		gpr_3_4.setColumns(10);
		gpr_3[3] = gpr_3_4;

		gpr_3_3 = new JTextField();
		gpr_3_3.setEditable(false);
		gpr_3_3.setColumns(10);
		gpr_3[2] = gpr_3_3;

		gpr_3_2 = new JTextField();
		gpr_3_2.setEditable(false);
		gpr_3_2.setColumns(10);
		gpr_3[1] = gpr_3_2;

		gpr_3_1 = new JTextField();
		gpr_3_1.setEditable(false);
		gpr_3_1.setColumns(10);
		gpr_3[0] = gpr_3_1;

		lblGpRegister_3 = new JLabel("GP Register 4");
		lblGpRegister_3.setHorizontalAlignment(SwingConstants.CENTER);

		textField_112 = new JTextField();
		textField_112.setEditable(false);
		textField_112.setColumns(10);

		textField_113 = new JTextField();
		textField_113.setEditable(false);
		textField_113.setColumns(10);

		textField_114 = new JTextField();
		textField_114.setEditable(false);
		textField_114.setColumns(10);

		textField_115 = new JTextField();
		textField_115.setEditable(false);
		textField_115.setColumns(10);

		textField_116 = new JTextField();
		textField_116.setEditable(false);
		textField_116.setColumns(10);

		textField_117 = new JTextField();
		textField_117.setEditable(false);
		textField_117.setColumns(10);

		textField_118 = new JTextField();
		textField_118.setEditable(false);
		textField_118.setColumns(10);

		textField_119 = new JTextField();
		textField_119.setEditable(false);
		textField_119.setColumns(10);

		textField_120 = new JTextField();
		textField_120.setEditable(false);
		textField_120.setColumns(10);

		textField_121 = new JTextField();
		textField_121.setEditable(false);
		textField_121.setColumns(10);

		textField_122 = new JTextField();
		textField_122.setEditable(false);
		textField_122.setColumns(10);

		textField_123 = new JTextField();
		textField_123.setEditable(false);
		textField_123.setColumns(10);

		textField_124 = new JTextField();
		textField_124.setEditable(false);
		textField_124.setColumns(10);

		textField_125 = new JTextField();
		textField_125.setEditable(false);
		textField_125.setColumns(10);

		textField_126 = new JTextField();
		textField_126.setEditable(false);
		textField_126.setColumns(10);

		textField_127 = new JTextField();
		textField_127.setEditable(false);
		textField_127.setColumns(10);

		JButton btnNewButton = new JButton("Deposit Instruction");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Get value represented by the toggles
				int toggleValue = getToggleValues();
				kacPC.depositInstruction(toggleValue);
			}
		});

		btnRomLoad = new JButton("ROM Load");
		btnRomLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kacPC.loadROM();
			}
		});

		btnRun = new JButton("Run");
		btnRun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterTransfer registerValues = kacPC.executeProgram();

				// Set register values
				for (int i = 0; i < registerValues.generalPurposeRegisters.length; i++) {
					if (registerValues.generalPurposeRegisters[i] != 0) {
						String binary = Integer.toBinaryString(registerValues.generalPurposeRegisters[i]);
						for (int j = binary.length() - 1; j >= 0; j--) {
							if (binary.charAt(j) == '1') {
								gpr_3[binary.length() - (j + 1)].setBackground(Color.GREEN);
							}
						}
					}
				}
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.TRAILING).addGroup(groupLayout
				.createSequentialGroup().addContainerGap().addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout
								.createSequentialGroup().addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
												.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE,
														GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addGroup(groupLayout.createSequentialGroup()
														.addComponent(textField, GroupLayout.PREFERRED_SIZE, 15,
																GroupLayout.PREFERRED_SIZE)
														.addGap(7)
														.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 15,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 15,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 15,
																GroupLayout.PREFERRED_SIZE)
														.addGap(15)
														.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 15,
																GroupLayout.PREFERRED_SIZE)
														.addGap(7)
														.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 15,
																GroupLayout.PREFERRED_SIZE)
														.addGap(6)
														.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 15,
																GroupLayout.PREFERRED_SIZE)
														.addGap(6)
														.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 15,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.UNRELATED)
														.addComponent(textField_63, GroupLayout.PREFERRED_SIZE, 15,
																GroupLayout.PREFERRED_SIZE)
														.addGap(7)
														.addComponent(textField_64, GroupLayout.PREFERRED_SIZE, 15,
																GroupLayout.PREFERRED_SIZE)
														.addGap(6)
														.addComponent(textField_65, GroupLayout.PREFERRED_SIZE, 15,
																GroupLayout.PREFERRED_SIZE)
														.addGap(6)
														.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, 15,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.UNRELATED)
														.addComponent(textField_67, GroupLayout.PREFERRED_SIZE, 15,
																GroupLayout.PREFERRED_SIZE)
														.addGap(7)
														.addComponent(textField_68, GroupLayout.PREFERRED_SIZE, 15,
																GroupLayout.PREFERRED_SIZE)
														.addGap(6)
														.addComponent(textField_69, GroupLayout.PREFERRED_SIZE, 15,
																GroupLayout.PREFERRED_SIZE)
														.addGap(6).addComponent(textField_66,
																GroupLayout.PREFERRED_SIZE, 15,
																GroupLayout.PREFERRED_SIZE)))
										.addGroup(groupLayout.createSequentialGroup()
												.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, 15,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, 15,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, 15,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, 15,
														GroupLayout.PREFERRED_SIZE)
												.addGap(14)
												.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, 15,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(textField_14, GroupLayout.PREFERRED_SIZE, 15,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(textField_15, GroupLayout.PREFERRED_SIZE, 15,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(textField_16, GroupLayout.PREFERRED_SIZE, 15,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(textField_17, GroupLayout.PREFERRED_SIZE, 15,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(textField_18, GroupLayout.PREFERRED_SIZE, 15,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(textField_19, GroupLayout.PREFERRED_SIZE, 15,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(textField_20, GroupLayout.PREFERRED_SIZE, 15,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(textField_21, GroupLayout.PREFERRED_SIZE, 15,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(textField_22, GroupLayout.PREFERRED_SIZE, 15,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(textField_23, GroupLayout.PREFERRED_SIZE, 15,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(textField_24, GroupLayout.PREFERRED_SIZE, 15,
														GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
														.addComponent(lblIndexRegister, GroupLayout.PREFERRED_SIZE, 351,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(lblIndexRegister_1, GroupLayout.PREFERRED_SIZE,
																351, GroupLayout.PREFERRED_SIZE)
														.addGroup(groupLayout.createSequentialGroup()
																.addComponent(textField_25, GroupLayout.PREFERRED_SIZE,
																		15, GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(textField_26, GroupLayout.PREFERRED_SIZE,
																		15, GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(textField_27, GroupLayout.PREFERRED_SIZE,
																		15, GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(textField_28, GroupLayout.PREFERRED_SIZE,
																		15, GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.UNRELATED)
																.addComponent(textField_29, GroupLayout.PREFERRED_SIZE,
																		15, GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(textField_30, GroupLayout.PREFERRED_SIZE,
																		15, GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(textField_31, GroupLayout.PREFERRED_SIZE,
																		15, GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(textField_32, GroupLayout.PREFERRED_SIZE,
																		15, GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.UNRELATED)
																.addComponent(textField_33, GroupLayout.PREFERRED_SIZE,
																		15, GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(textField_34, GroupLayout.PREFERRED_SIZE,
																		15, GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(textField_35, GroupLayout.PREFERRED_SIZE,
																		15, GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(textField_36, GroupLayout.PREFERRED_SIZE,
																		15, GroupLayout.PREFERRED_SIZE)
																.addGap(14)
																.addComponent(textField_37, GroupLayout.PREFERRED_SIZE,
																		15, GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(textField_38, GroupLayout.PREFERRED_SIZE,
																		15, GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(textField_39, GroupLayout.PREFERRED_SIZE,
																		15, GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(textField_40, GroupLayout.PREFERRED_SIZE,
																		15, GroupLayout.PREFERRED_SIZE))
														.addComponent(lblIndexRegister_2, GroupLayout.PREFERRED_SIZE,
																351, GroupLayout.PREFERRED_SIZE)
														.addGroup(groupLayout.createSequentialGroup()
																.addComponent(textField_41, GroupLayout.PREFERRED_SIZE,
																		15, GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(textField_42, GroupLayout.PREFERRED_SIZE,
																		15, GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(textField_43, GroupLayout.PREFERRED_SIZE,
																		15, GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(textField_44, GroupLayout.PREFERRED_SIZE,
																		15, GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.UNRELATED)
																.addComponent(textField_45, GroupLayout.PREFERRED_SIZE,
																		15, GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(textField_46, GroupLayout.PREFERRED_SIZE,
																		15, GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(textField_47, GroupLayout.PREFERRED_SIZE,
																		15, GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(textField_48, GroupLayout.PREFERRED_SIZE,
																		15, GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.UNRELATED)
																.addComponent(textField_49, GroupLayout.PREFERRED_SIZE,
																		15, GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(textField_50, GroupLayout.PREFERRED_SIZE,
																		15, GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(textField_51, GroupLayout.PREFERRED_SIZE,
																		15, GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(textField_52, GroupLayout.PREFERRED_SIZE,
																		15, GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.UNRELATED)
																.addComponent(textField_53, GroupLayout.PREFERRED_SIZE,
																		15, GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(textField_54, GroupLayout.PREFERRED_SIZE,
																		15, GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(textField_55, GroupLayout.PREFERRED_SIZE,
																		15, GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(textField_56, GroupLayout.PREFERRED_SIZE,
																		15, GroupLayout.PREFERRED_SIZE)))
												.addGap(60)
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
														.addComponent(lblGpRegister_2, GroupLayout.PREFERRED_SIZE, 351,
																GroupLayout.PREFERRED_SIZE)
														.addGroup(groupLayout.createSequentialGroup()
																.addComponent(gpr_3_16, GroupLayout.PREFERRED_SIZE, 15,
																		GroupLayout.PREFERRED_SIZE)
																.addGap(6)
																.addComponent(gpr_3_15, GroupLayout.PREFERRED_SIZE, 15,
																		GroupLayout.PREFERRED_SIZE)
																.addGap(6)
																.addComponent(gpr_3_14, GroupLayout.PREFERRED_SIZE, 15,
																		GroupLayout.PREFERRED_SIZE)
																.addGap(6)
																.addComponent(gpr_3_13, GroupLayout.PREFERRED_SIZE, 15,
																		GroupLayout.PREFERRED_SIZE)
																.addGap(10)
																.addComponent(gpr_3_12, GroupLayout.PREFERRED_SIZE, 15,
																		GroupLayout.PREFERRED_SIZE)
																.addGap(6)
																.addComponent(gpr_3_11, GroupLayout.PREFERRED_SIZE, 15,
																		GroupLayout.PREFERRED_SIZE)
																.addGap(6)
																.addComponent(gpr_3_10, GroupLayout.PREFERRED_SIZE, 15,
																		GroupLayout.PREFERRED_SIZE)
																.addGap(6)
																.addComponent(gpr_3_9, GroupLayout.PREFERRED_SIZE, 15,
																		GroupLayout.PREFERRED_SIZE)
																.addGap(10)
																.addComponent(gpr_3_8, GroupLayout.PREFERRED_SIZE, 15,
																		GroupLayout.PREFERRED_SIZE)
																.addGap(6)
																.addComponent(gpr_3_7, GroupLayout.PREFERRED_SIZE, 15,
																		GroupLayout.PREFERRED_SIZE)
																.addGap(6)
																.addComponent(gpr_3_6, GroupLayout.PREFERRED_SIZE, 15,
																		GroupLayout.PREFERRED_SIZE)
																.addGap(6)
																.addComponent(gpr_3_5, GroupLayout.PREFERRED_SIZE, 15,
																		GroupLayout.PREFERRED_SIZE)
																.addGap(10)
																.addComponent(gpr_3_4, GroupLayout.PREFERRED_SIZE, 15,
																		GroupLayout.PREFERRED_SIZE)
																.addGap(6)
																.addComponent(gpr_3_3, GroupLayout.PREFERRED_SIZE, 15,
																		GroupLayout.PREFERRED_SIZE)
																.addGap(6)
																.addComponent(gpr_3_2, GroupLayout.PREFERRED_SIZE, 15,
																		GroupLayout.PREFERRED_SIZE)
																.addGap(6).addComponent(gpr_3_1,
																		GroupLayout.PREFERRED_SIZE, 15,
																		GroupLayout.PREFERRED_SIZE))
														.addComponent(lblGpRegister_1, GroupLayout.PREFERRED_SIZE, 351,
																GroupLayout.PREFERRED_SIZE)
														.addGroup(groupLayout.createSequentialGroup()
																.addComponent(textField_80, GroupLayout.PREFERRED_SIZE,
																		15, GroupLayout.PREFERRED_SIZE)
																.addGap(6)
																.addComponent(textField_81, GroupLayout.PREFERRED_SIZE,
																		15, GroupLayout.PREFERRED_SIZE)
																.addGap(6)
																.addComponent(textField_82, GroupLayout.PREFERRED_SIZE,
																		15, GroupLayout.PREFERRED_SIZE)
																.addGap(6)
																.addComponent(textField_83, GroupLayout.PREFERRED_SIZE,
																		15, GroupLayout.PREFERRED_SIZE)
																.addGap(10)
																.addComponent(textField_84, GroupLayout.PREFERRED_SIZE,
																		15, GroupLayout.PREFERRED_SIZE)
																.addGap(6)
																.addComponent(textField_85, GroupLayout.PREFERRED_SIZE,
																		15, GroupLayout.PREFERRED_SIZE)
																.addGap(6)
																.addComponent(textField_86, GroupLayout.PREFERRED_SIZE,
																		15, GroupLayout.PREFERRED_SIZE)
																.addGap(6)
																.addComponent(textField_87, GroupLayout.PREFERRED_SIZE,
																		15, GroupLayout.PREFERRED_SIZE)
																.addGap(10)
																.addComponent(textField_88, GroupLayout.PREFERRED_SIZE,
																		15, GroupLayout.PREFERRED_SIZE)
																.addGap(6)
																.addComponent(textField_89, GroupLayout.PREFERRED_SIZE,
																		15, GroupLayout.PREFERRED_SIZE)
																.addGap(6)
																.addComponent(textField_90, GroupLayout.PREFERRED_SIZE,
																		15, GroupLayout.PREFERRED_SIZE)
																.addGap(6)
																.addComponent(textField_91, GroupLayout.PREFERRED_SIZE,
																		15, GroupLayout.PREFERRED_SIZE)
																.addGap(10)
																.addComponent(textField_92, GroupLayout.PREFERRED_SIZE,
																		15, GroupLayout.PREFERRED_SIZE)
																.addGap(6)
																.addComponent(textField_93, GroupLayout.PREFERRED_SIZE,
																		15, GroupLayout.PREFERRED_SIZE)
																.addGap(6)
																.addComponent(textField_94, GroupLayout.PREFERRED_SIZE,
																		15, GroupLayout.PREFERRED_SIZE)
																.addGap(6).addComponent(textField_95,
																		GroupLayout.PREFERRED_SIZE, 15,
																		GroupLayout.PREFERRED_SIZE))
														.addComponent(lblGpRegister, GroupLayout.PREFERRED_SIZE, 351,
																GroupLayout.PREFERRED_SIZE)
														.addGroup(groupLayout.createSequentialGroup()
																.addComponent(gpr_1_16, GroupLayout.PREFERRED_SIZE, 15,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(gpr_1_15, GroupLayout.PREFERRED_SIZE, 15,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(gpr_1_14, GroupLayout.PREFERRED_SIZE, 15,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(gpr_1_13, GroupLayout.PREFERRED_SIZE, 15,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.UNRELATED)
																.addComponent(textField_61, GroupLayout.PREFERRED_SIZE,
																		15, GroupLayout.PREFERRED_SIZE)
																.addGap(6)
																.addComponent(textField_62, GroupLayout.PREFERRED_SIZE,
																		15, GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(textField_70, GroupLayout.PREFERRED_SIZE,
																		15, GroupLayout.PREFERRED_SIZE)
																.addGap(6)
																.addComponent(textField_71, GroupLayout.PREFERRED_SIZE,
																		15, GroupLayout.PREFERRED_SIZE)
																.addGap(10)
																.addComponent(textField_72, GroupLayout.PREFERRED_SIZE,
																		15, GroupLayout.PREFERRED_SIZE)
																.addGap(6)
																.addComponent(textField_73, GroupLayout.PREFERRED_SIZE,
																		15, GroupLayout.PREFERRED_SIZE)
																.addGap(6)
																.addComponent(textField_74, GroupLayout.PREFERRED_SIZE,
																		15, GroupLayout.PREFERRED_SIZE)
																.addGap(6)
																.addComponent(textField_75, GroupLayout.PREFERRED_SIZE,
																		15, GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.UNRELATED)
																.addComponent(textField_76, GroupLayout.PREFERRED_SIZE,
																		15, GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(textField_77, GroupLayout.PREFERRED_SIZE,
																		15, GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(textField_78, GroupLayout.PREFERRED_SIZE,
																		15, GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(textField_79, GroupLayout.PREFERRED_SIZE,
																		15, GroupLayout.PREFERRED_SIZE))
														.addComponent(lblGpRegister_3, GroupLayout.PREFERRED_SIZE, 351,
																GroupLayout.PREFERRED_SIZE)
														.addGroup(groupLayout.createSequentialGroup()
																.addComponent(textField_112, GroupLayout.PREFERRED_SIZE,
																		15, GroupLayout.PREFERRED_SIZE)
																.addGap(6)
																.addComponent(textField_113, GroupLayout.PREFERRED_SIZE,
																		15, GroupLayout.PREFERRED_SIZE)
																.addGap(6)
																.addComponent(textField_114, GroupLayout.PREFERRED_SIZE,
																		15, GroupLayout.PREFERRED_SIZE)
																.addGap(6)
																.addGroup(groupLayout
																		.createParallelGroup(Alignment.LEADING, false)
																		.addComponent(btnNewButton,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addGroup(groupLayout.createSequentialGroup()
																				.addComponent(textField_115,
																						GroupLayout.PREFERRED_SIZE, 15,
																						GroupLayout.PREFERRED_SIZE)
																				.addGap(10)
																				.addComponent(textField_116,
																						GroupLayout.PREFERRED_SIZE, 15,
																						GroupLayout.PREFERRED_SIZE)
																				.addGap(6)
																				.addComponent(textField_117,
																						GroupLayout.PREFERRED_SIZE, 15,
																						GroupLayout.PREFERRED_SIZE)
																				.addGap(6)
																				.addComponent(textField_118,
																						GroupLayout.PREFERRED_SIZE, 15,
																						GroupLayout.PREFERRED_SIZE)
																				.addGap(6)
																				.addComponent(textField_119,
																						GroupLayout.PREFERRED_SIZE, 15,
																						GroupLayout.PREFERRED_SIZE)
																				.addGap(10).addComponent(textField_120,
																						GroupLayout.PREFERRED_SIZE, 15,
																						GroupLayout.PREFERRED_SIZE)))
																.addPreferredGap(ComponentPlacement.RELATED)
																.addGroup(groupLayout
																		.createParallelGroup(Alignment.TRAILING)
																		.addGroup(groupLayout.createSequentialGroup()
																				.addComponent(textField_121,
																						GroupLayout.PREFERRED_SIZE, 15,
																						GroupLayout.PREFERRED_SIZE)
																				.addGap(6)
																				.addComponent(textField_122,
																						GroupLayout.PREFERRED_SIZE, 15,
																						GroupLayout.PREFERRED_SIZE)
																				.addGap(6)
																				.addComponent(textField_123,
																						GroupLayout.PREFERRED_SIZE, 15,
																						GroupLayout.PREFERRED_SIZE)
																				.addGap(10)
																				.addComponent(textField_124,
																						GroupLayout.PREFERRED_SIZE, 15,
																						GroupLayout.PREFERRED_SIZE)
																				.addGap(6)
																				.addComponent(textField_125,
																						GroupLayout.PREFERRED_SIZE, 15,
																						GroupLayout.PREFERRED_SIZE)
																				.addGap(6).addComponent(textField_126,
																						GroupLayout.PREFERRED_SIZE, 15,
																						GroupLayout.PREFERRED_SIZE))
																		.addComponent(btnRomLoad,
																				GroupLayout.PREFERRED_SIZE, 128,
																				GroupLayout.PREFERRED_SIZE))
																.addGap(6).addComponent(textField_127,
																		GroupLayout.PREFERRED_SIZE, 15,
																		GroupLayout.PREFERRED_SIZE)))))
								.addContainerGap(49, Short.MAX_VALUE))
						.addGroup(
								groupLayout.createSequentialGroup()
										.addComponent(toggleButton_2, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(toggleButton_3, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(toggleButton_4, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(toggleButton_5, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(toggleButton_6, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(toggleButton_7, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(toggleButton_8, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(toggleButton_9, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(toggleButton_10, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(toggleButton_11, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(toggleButton_12, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(toggleButton_13, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(toggleButton_14, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(toggleButton_15, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(toggleButton_16, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(toggleButton_17, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
										.addComponent(btnRun, GroupLayout.PREFERRED_SIZE, 128,
												GroupLayout.PREFERRED_SIZE)
										.addGap(140)))));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup().addGap(13).addComponent(lblNewLabel)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_63, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_64, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_65, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_67, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_68, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_69, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_66, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
				.addGap(17).addComponent(lblGpRegister).addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
						.createParallelGroup(Alignment.BASELINE).addComponent(lblIndexRegister)
						.addComponent(gpr_1_15, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(gpr_1_16, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(gpr_1_14, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(gpr_1_13, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_61, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_62, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_70, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_71, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_72, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_73, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_74, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_75, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_76, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_77, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_78, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
								.addComponent(
										textField_79, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING).addGroup(groupLayout
						.createSequentialGroup()
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(textField_14, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE))
								.addComponent(textField_15, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(textField_16, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_17, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE))
								.addComponent(textField_18, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_19, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_20, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_21, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_22, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_23, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_24, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(lblIndexRegister_1)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_25, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_26, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_27, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(textField_28, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_29, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE))
								.addComponent(textField_30, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_31, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(textField_32, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_33, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(textField_34, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_37, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_35, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_36, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE))
								.addComponent(textField_38, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_39, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_40, GroupLayout.PREFERRED_SIZE, 15,
										GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup().addComponent(lblGpRegister_1).addGap(11)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(textField_80, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_81, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_82, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_83, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_84, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_85, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_86, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_87, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_88, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_89, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_90, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_91, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_92, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_93, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_94, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_95, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE))))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
						.createSequentialGroup().addComponent(lblIndexRegister_2)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_41, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_42, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_43, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_44, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_45, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_46, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_47, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(textField_48, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_49, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE))
								.addComponent(textField_50, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_51, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_52, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_53, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_54, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_55, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_56, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
						.addGap(152)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(toggleButton_12, GroupLayout.PREFERRED_SIZE, 15,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(toggleButton_13, GroupLayout.PREFERRED_SIZE, 15,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(toggleButton_14, GroupLayout.PREFERRED_SIZE, 15,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(toggleButton_15, GroupLayout.PREFERRED_SIZE, 15,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(toggleButton_16, GroupLayout.PREFERRED_SIZE, 15,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(toggleButton_7, GroupLayout.PREFERRED_SIZE, 15,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(toggleButton_6, GroupLayout.PREFERRED_SIZE, 15,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(toggleButton_11, GroupLayout.PREFERRED_SIZE, 15,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(toggleButton_10, GroupLayout.PREFERRED_SIZE, 15,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(toggleButton_9, GroupLayout.PREFERRED_SIZE, 15,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(toggleButton_8, GroupLayout.PREFERRED_SIZE, 15,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(toggleButton_2, GroupLayout.PREFERRED_SIZE, 15,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(toggleButton_3, GroupLayout.PREFERRED_SIZE, 15,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(toggleButton_4, GroupLayout.PREFERRED_SIZE, 15,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(toggleButton_5, GroupLayout.PREFERRED_SIZE, 15,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(toggleButton_17, GroupLayout.PREFERRED_SIZE, 15,
										GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup().addComponent(lblGpRegister_2).addGap(11)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(gpr_3_16, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(gpr_3_15, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(gpr_3_14, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(gpr_3_13, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(gpr_3_12, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(gpr_3_11, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(gpr_3_10, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(gpr_3_9, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(gpr_3_8, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(gpr_3_7, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(gpr_3_6, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(gpr_3_5, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(gpr_3_4, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(gpr_3_3, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(gpr_3_2, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(gpr_3_1, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE))
								.addGap(18).addComponent(lblGpRegister_3).addGap(11)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(textField_112, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_113, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_114, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_115, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_116, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_117, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_118, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_119, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_120, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_121, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_122, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_123, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_124, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_125, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_126, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_127, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE))
								.addGap(58)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(btnNewButton)
										.addComponent(btnRomLoad))
								.addPreferredGap(ComponentPlacement.RELATED).addComponent(btnRun)))
				.addGap(45)));
		frame.getContentPane().setLayout(groupLayout);
	}
}
