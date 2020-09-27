package ru.vitalygolikov.mywindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {

    private JButton[] numberButtons;
    private JButton signButton;
    private JButton pointButton;
    private JButton plusButton;
    private JButton minusButton;
    private JButton mulButton;
    private JButton divButton;
    private JButton equalsButton;

    private JLabel resultLabel;
    private JLabel currentLabel;



    private GridBagConstraints constraints;

    public MyWindow()
    {
        //base window init
        setTitle("Test window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 640, 480);
        GridBagLayout layout = new GridBagLayout();
        setLayout(layout);

        //base constraints init
        constraints = new GridBagConstraints();
        constraints.ipady = 60;
        constraints.ipadx = 60;


        initAndAddLabels();
        initButtons();
        setNumListeners();
        addButtons();



        setVisible(true);
    }


    private void addButtons()
    {
        constraints.gridy = 2;
        constraints.gridx = 3;
        add(plusButton, constraints);

        constraints.gridy = 3;
        constraints.gridx = 3;
        add(minusButton, constraints);

        constraints.gridy = 4;
        constraints.gridx = 3;
        add(mulButton, constraints);

        constraints.gridy = 2;
        constraints.gridx = 4;
        add(divButton, constraints);

        constraints.gridy = 3;
        constraints.gridx = 4;
        add(equalsButton, constraints);

    }

    private void initAndAddLabels()
    {
        resultLabel = new JLabel("Result: 0");
        currentLabel = new JLabel("0");

        constraints.gridy = 0;
        add(resultLabel, constraints);
        constraints.gridy = 1;
        add(currentLabel, constraints);
    }


    private void initButtons()
    {
        plusButton = new JButton("+");
        minusButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        equalsButton = new JButton("=");

        initNumberButtons();

    }

    private void initNumberButtons()
    {
        numberButtons = new JButton[10];
        for(int i = 0; i < 10; i++)
        {
            numberButtons[i] = new JButton("" + i );
        }

        for(int i = 0; i < 9; i++)
        {
            constraints.gridy = 2 + i / 3;
            add(numberButtons[9 - i], constraints);
        }

        constraints.gridy = 6;
        signButton = new JButton( "+/-");
        pointButton = new JButton(".");

        add( signButton, constraints );
        add( numberButtons[0], constraints );
        add(pointButton, constraints);

    }

    private void setOperationListeners()
    {

    }

    private void setNumListeners()
    {
        numberButtons[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currentText = currentLabel.getText();
                float currentValue = Float.parseFloat( currentText );
                boolean isPoint = currentText.charAt( currentText.length() - 1 ) == '.';
                if(currentValue != 0 || isPoint)
                {
                    currentLabel.setText(currentText + 0);
                }
            }
        });

        numberButtons[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currentText = currentLabel.getText();
                float currentValue = Float.parseFloat( currentText );
                boolean isPoint = currentText.charAt( currentText.length() - 1 ) == '.';
                if(currentValue == 0 && !isPoint)
                {
                    currentLabel.setText("" + 1);
                }
                else
                {
                    currentLabel.setText(currentText + 1);
                }
            }
        });

        numberButtons[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currentText = currentLabel.getText();
                float currentValue = Float.parseFloat( currentText );
                boolean isPoint = currentText.charAt( currentText.length() - 1 ) == '.';
                if(currentValue == 0 && !isPoint)
                {
                    currentLabel.setText("" + 2);
                }
                else
                {
                    currentLabel.setText(currentText + 2);
                }
            }
        });

        numberButtons[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currentText = currentLabel.getText();
                float currentValue = Float.parseFloat( currentText );
                boolean isPoint = currentText.charAt( currentText.length() - 1 ) == '.';
                if(currentValue == 0 && !isPoint)
                {
                    currentLabel.setText("" + 3);
                }
                else
                {
                    currentLabel.setText(currentText + 3);
                }
            }
        });

        numberButtons[4].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currentText = currentLabel.getText();
                float currentValue = Float.parseFloat( currentText );
                boolean isPoint = currentText.charAt( currentText.length() - 1 ) == '.';
                if(currentValue == 0 && !isPoint)
                {
                    currentLabel.setText("" + 4);
                }
                else
                {
                    currentLabel.setText(currentText + 4);
                }
            }
        });

        numberButtons[5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currentText = currentLabel.getText();
                float currentValue = Float.parseFloat( currentText );
                boolean isPoint = currentText.charAt( currentText.length() - 1 ) == '.';
                if(currentValue == 0 && !isPoint)
                {
                    currentLabel.setText("" + 5);
                }
                else
                {
                    currentLabel.setText(currentText + 5);
                }
            }
        });

        numberButtons[6].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currentText = currentLabel.getText();
                float currentValue = Float.parseFloat( currentText );
                boolean isPoint = currentText.charAt( currentText.length() - 1 ) == '.';
                if(currentValue == 0 && !isPoint)
                {
                    currentLabel.setText("" + 6);
                }
                else
                {
                    currentLabel.setText(currentText + 6);
                }
            }
        });

        numberButtons[7].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currentText = currentLabel.getText();
                float currentValue = Float.parseFloat( currentText );
                boolean isPoint = currentText.charAt( currentText.length() - 1 ) == '.';
                if(currentValue == 0 && !isPoint)
                {
                    currentLabel.setText("" + 7);
                }
                else
                {
                    currentLabel.setText(currentText + 7);
                }
            }
        });

        numberButtons[8].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currentText = currentLabel.getText();
                float currentValue = Float.parseFloat( currentText );
                boolean isPoint = currentText.charAt( currentText.length() - 1 ) == '.';
                if(currentValue == 0 && !isPoint)
                {
                    currentLabel.setText("" + 8);
                }
                else
                {
                    currentLabel.setText(currentText + 8);
                }
            }
        });

        numberButtons[9].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currentText = currentLabel.getText();
                float currentValue = Float.parseFloat( currentText );
                boolean isPoint = currentText.charAt( currentText.length() - 1 ) == '.';
                if(currentValue == 0 && !isPoint)
                {
                    currentLabel.setText("" + 9);
                }
                else
                {
                    currentLabel.setText(currentText + 9);
                }
            }
        });

        signButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currentText = currentLabel.getText();
                float currentValue = Float.parseFloat(currentText);

                if (currentValue - (int) currentValue == 0)
                {
                    currentLabel.setText("" + (int) currentValue * (-1));
                }
                else
                {
                    currentLabel.setText("" + currentValue * (-1));
                }
            }
        });

        pointButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currentText = currentLabel.getText();
                float currentValue = Float.parseFloat(currentText);
                if(currentValue - (int) currentValue == 0)
                {
                    currentLabel.setText("" + (int)currentValue + ".");
                }
            }
        });


    }


    /*
    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        g.drawRect(0, 0, 100, 300);
    }
    */
     
}
