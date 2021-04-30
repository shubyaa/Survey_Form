import java.awt.*;
import java.awt.event.*;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.*;

class Survey extends JFrame
{
    Survey()
    {
        JPanel container = new JPanel();
        JScrollPane jsp = new JScrollPane();
        this.add(jsp);

        setLayout(new FlowLayout());
        this.setLayout(null);

        // ALL JLabelS
        JLabel nameJLabel = new JLabel("Name : ",JLabel.LEFT);
        JLabel AddressJLabel = new JLabel("Address : ",JLabel.LEFT);
        JLabel subjectJLabel = new JLabel("Area : ",JLabel.LEFT);
        JLabel explicitSurveyJLabel = new JLabel("EXPLICIT SURVEY",JLabel.LEFT);
        JLabel eJLabel1 = new JLabel("1. Daily garbage collection : ",JLabel.LEFT);
        JLabel eJLabel2 = new JLabel("2. Is Wet and Dry garbage strictly separated ?  : ",JLabel.LEFT);
        JLabel eJLabel3 = new JLabel("3. All the workers wear safety masks, gloves, uniform and other accessories. : ",JLabel.LEFT);
        JLabel eJLabel4 = new JLabel("4. Time to time cleaning of drainage systems : ",JLabel.LEFT);
        JLabel eJLabel5 = new JLabel("5. Time to time cleaning of kitchen waste outlets : ",JLabel.LEFT);
        JLabel eJLabel6 = new JLabel("6. Is daily sweeping of roads done ? : ",JLabel.LEFT);
        JLabel eJLabel7 = new JLabel("7. Is daily sweeping of parks done ? : ",JLabel.LEFT);
        JLabel eJLabel8 = new JLabel("8. Are the street dustbins cleaned daily ? : ",JLabel.LEFT);
        JLabel eJLabel9 = new JLabel("9. You get a very clean supply of water. Do you agree ? : ",JLabel.LEFT);
        JLabel eJLabel10 = new JLabel("10. There is a practice of tree planting frequently held by government ? : ",JLabel.LEFT);
        JLabel eJLabel11 = new JLabel("11. Is unwanted weed grass cleaned frequently ? : ",JLabel.LEFT);
        JLabel eJLabel12 = new JLabel("12. Is regular sanitization done in your area ? : ",JLabel.LEFT);
        JLabel eJLabel13 = new JLabel("13. Is regular mosquito repellent spraying done ? : ",JLabel.LEFT);
        JLabel eJLabel14 = new JLabel("14. Is animal waste cleaned daily ? : ",JLabel.LEFT);

        JLabel implicitSurveyJLabel = new JLabel("IMPLICIT SURVEY",JLabel.LEFT);
        JLabel iJLabel1 = new JLabel("15. Do the residents co-operate by segregating dry and wet waste : ",JLabel.LEFT);
        JLabel iJLabel2 = new JLabel("16. The residents do not throw garbage anywhere on the road : ",JLabel.LEFT);
        JLabel iJLabel3 = new JLabel("17. There is less plastic waste seen on your roads  : ",JLabel.LEFT);
        JLabel iJLabel4 = new JLabel("18. Residents do not spit on roads : ",JLabel.LEFT);
        JLabel iJLabel5 = new JLabel("19. There is more use of eco-friendly goods : ",JLabel.LEFT);
        JLabel iJLabel6 = new JLabel("20. Residents clean their water storages from time to time : ",JLabel.LEFT);
        JLabel iJLabel7 = new JLabel("21. My area's air quality seems healthy and home's ventilation is adequate. : ",JLabel.LEFT);
        JLabel iJLabel8 = new JLabel("22. My area is clean and well maintained.: ",JLabel.LEFT);
        JLabel iJLabel9 = new JLabel("23. I receive adequate notice of changes in the cleaning schedule or of special cleaning: ",JLabel.LEFT);
        JLabel iJLabel10 = new JLabel("24. My requests are handled in a timely manner by waste management team : ",JLabel.LEFT);
        JLabel iJLabel11 = new JLabel("25. All the residents use toilets : ",JLabel.LEFT);
        JLabel iJLabel12 = new JLabel("26. There are public dustbins one at every corner in my area  : ",JLabel.LEFT);
        JLabel iJLabel13 = new JLabel("27. Residents take the responsibility to clean the waste of their pets : ",JLabel.LEFT);
        JLabel iJLabel14 = new JLabel("28. The roads are very clean and well maintained  : ",JLabel.LEFT);

        this.add(nameJLabel);
        this.add(AddressJLabel);
        this.add(subjectJLabel);
        this.add(explicitSurveyJLabel);
        this.add(eJLabel1);
        this.add(eJLabel2);
        this.add(eJLabel3);
        this.add(eJLabel4);
        this.add(eJLabel5);
        this.add(eJLabel6);
        this.add(eJLabel7);
        this.add(eJLabel8);
        this.add(eJLabel9);
        this.add(eJLabel10);
        this.add(eJLabel11);
        this.add(eJLabel12);
        this.add(eJLabel13);
        this.add(eJLabel14);
        this.add(implicitSurveyJLabel);
        this.add(iJLabel1);
        this.add(iJLabel2);
        this.add(iJLabel3);
        this.add(iJLabel4);
        this.add(iJLabel5);
        this.add(iJLabel6);
        this.add(iJLabel7);
        this.add(iJLabel8);
        this.add(iJLabel9);
        this.add(iJLabel10);
        this.add(iJLabel11);
        this.add(iJLabel12);
        this.add(iJLabel13);
        this.add(iJLabel14);

        nameJLabel.setBounds(70,0,350,20);
        AddressJLabel.setBounds(70,20,350,20);
        subjectJLabel.setBounds(70,40,350,20);
        explicitSurveyJLabel.setBounds(70, 60, 350, 20);
        eJLabel1.setBounds(70, 80, 350, 20);
        eJLabel2.setBounds(70, 100, 350, 20);
        eJLabel3.setBounds(70, 120, 350, 20);
        eJLabel4.setBounds(70, 140, 350, 20);
        eJLabel5.setBounds(70, 160, 350, 20);
        eJLabel6.setBounds(70, 180, 350, 20);
        eJLabel7.setBounds(70, 200, 350, 20);
        eJLabel8.setBounds(70, 220, 350, 20);
        eJLabel9.setBounds(70, 240, 350, 20);
        eJLabel10.setBounds(70, 260, 350, 20);
        eJLabel11.setBounds(70, 280, 350, 20);
        eJLabel12.setBounds(70, 300, 350, 20);
        eJLabel13.setBounds(70, 320, 350, 20);
        eJLabel14.setBounds(70, 340, 350, 20);
        implicitSurveyJLabel.setBounds(70, 360, 350, 20);
        iJLabel1.setBounds(70, 380, 350, 20);
        iJLabel2.setBounds(70, 400, 350, 20);
        iJLabel3.setBounds(70, 420, 350, 20);
        iJLabel4.setBounds(70, 440, 350, 20);
        iJLabel5.setBounds(70, 460, 350, 20);
        iJLabel6.setBounds(70, 480, 350, 20);
        iJLabel7.setBounds(70, 500, 350, 20);
        iJLabel8.setBounds(70, 520, 350, 20);
        iJLabel9.setBounds(70, 540, 350, 20);
        iJLabel10.setBounds(70, 560, 350, 20);
        iJLabel11.setBounds(70, 580, 350, 20);
        iJLabel12.setBounds(70, 600, 350, 20);
        iJLabel13.setBounds(70, 620, 350, 20);
        iJLabel14.setBounds(70, 640, 350, 20);



        TextField nameTextField = new TextField(20);
        TextField AddressTextField = new TextField(20);

        this.add(nameTextField);
        this.add(AddressTextField);

        nameTextField.setBounds(430,0,100,20);
        AddressTextField.setBounds(430,20,100,20);

        Choice sub = new Choice();
        Choice ec1 = new Choice();
        Choice ec2 = new Choice();
        Choice ec3 = new Choice();
        Choice ec4 = new Choice();
        Choice ec5 = new Choice();
        Choice ec6 = new Choice();
        Choice ec7 = new Choice();
        Choice ec8 = new Choice();
        Choice ec9 = new Choice();
        Choice ec10 = new Choice();
        Choice ec11 = new Choice();
        Choice ec12 = new Choice();
        Choice ec13 = new Choice();
        Choice ec14 = new Choice();
        Choice ic1 = new Choice();
        Choice ic2 = new Choice();
        Choice ic3 = new Choice();
        Choice ic4 = new Choice();
        Choice ic5 = new Choice();
        Choice ic6 = new Choice();
        Choice ic7 = new Choice();
        Choice ic8 = new Choice();
        Choice ic9 = new Choice();
        Choice ic10 = new Choice();
        Choice ic11 = new Choice();
        Choice ic12 = new Choice();
        Choice ic13 = new Choice();
        Choice ic14 = new Choice();

        sub.add("Andheri"); sub.add("New Panvel"); sub.add("Panvel"); sub.add("Vashi"); sub.add("Belapur"); sub.add("Bandra");
        ec1.add("Strongly Disagree"); ec1.add("Disagree"); ec1.add("Neutral"); ec1.add("Agree"); ec1.add("Strongly Agree");
        ec2.add("Strongly Disagree"); ec2.add("Disagree"); ec2.add("Neutral"); ec2.add("Agree"); ec2.add("Strongly Agree");
        ec3.add("Strongly Disagree"); ec3.add("Disagree"); ec3.add("Neutral"); ec3.add("Agree"); ec3.add("Strongly Agree");
        ec4.add("Strongly Disagree"); ec4.add("Disagree"); ec4.add("Neutral"); ec4.add("Agree"); ec4.add("Strongly Agree");
        ec5.add("Strongly Disagree"); ec5.add("Disagree"); ec5.add("Neutral"); ec5.add("Agree"); ec5.add("Strongly Agree");
        ec6.add("Strongly Disagree"); ec6.add("Disagree"); ec6.add("Neutral"); ec6.add("Agree"); ec6.add("Strongly Agree");
        ec7.add("Strongly Disagree"); ec7.add("Disagree"); ec7.add("Neutral"); ec7.add("Agree"); ec7.add("Strongly Agree");
        ec8.add("Strongly Disagree"); ec8.add("Disagree"); ec8.add("Neutral"); ec8.add("Agree"); ec8.add("Strongly Agree");
        ec9.add("Strongly Disagree"); ec9.add("Disagree"); ec9.add("Neutral"); ec9.add("Agree"); ec9.add("Strongly Agree");
        ec10.add("Strongly Disagree"); ec10.add("Disagree"); ec10.add("Neutral"); ec10.add("Agree"); ec10.add("Strongly Agree");
        ec11.add("Strongly Disagree"); ec11.add("Disagree"); ec11.add("Neutral"); ec11.add("Agree"); ec11.add("Strongly Agree");
        ec12.add("Strongly Disagree"); ec12.add("Disagree"); ec12.add("Neutral"); ec12.add("Agree"); ec12.add("Strongly Agree");
        ec13.add("Strongly Disagree"); ec13.add("Disagree"); ec13.add("Neutral"); ec13.add("Agree"); ec13.add("Strongly Agree");
        ec14.add("Strongly Disagree"); ec14.add("Disagree"); ec14.add("Neutral"); ec14.add("Agree"); ec14.add("Strongly Agree");

        ic1.add("Strongly Disagree"); ic1.add("Disagree"); ic1.add("Neutral"); ic1.add("Agree"); ic1.add("Strongly Agree");
        ic2.add("Strongly Disagree"); ic2.add("Disagree"); ic2.add("Neutral"); ic2.add("Agree"); ic2.add("Strongly Agree");
        ic3.add("Strongly Disagree"); ic3.add("Disagree"); ic3.add("Neutral"); ic3.add("Agree"); ic3.add("Strongly Agree");
        ic4.add("Strongly Disagree"); ic4.add("Disagree"); ic4.add("Neutral"); ic4.add("Agree"); ic4.add("Strongly Agree");
        ic5.add("Strongly Disagree"); ic5.add("Disagree"); ic5.add("Neutral"); ic5.add("Agree"); ic5.add("Strongly Agree");
        ic6.add("Strongly Disagree"); ic6.add("Disagree"); ic6.add("Neutral"); ic6.add("Agree"); ic6.add("Strongly Agree");
        ic7.add("Strongly Disagree"); ic7.add("Disagree"); ic7.add("Neutral"); ic7.add("Agree"); ic7.add("Strongly Agree");
        ic8.add("Strongly Disagree"); ic8.add("Disagree"); ic8.add("Neutral"); ic8.add("Agree"); ic8.add("Strongly Agree");
        ic9.add("Strongly Disagree"); ic9.add("Disagree"); ic9.add("Neutral"); ic9.add("Agree"); ic9.add("Strongly Agree");
        ic10.add("Strongly Disagree"); ic10.add("Disagree"); ic10.add("Neutral"); ic10.add("Agree"); ic10.add("Strongly Agree");
        ic11.add("Strongly Disagree"); ic11.add("Disagree"); ic11.add("Neutral"); ic11.add("Agree"); ic11.add("Strongly Agree");
        ic12.add("Strongly Disagree"); ic12.add("Disagree"); ic12.add("Neutral"); ic12.add("Agree"); ic12.add("Strongly Agree");
        ic13.add("Strongly Disagree"); ic13.add("Disagree"); ic13.add("Neutral"); ic13.add("Agree"); ic13.add("Strongly Agree");
        ic14.add("Strongly Disagree"); ic14.add("Disagree"); ic14.add("Neutral"); ic14.add("Agree"); ic14.add("Strongly Agree");

        sub.setBounds(430, 40, 70, 20);
        ec1.setBounds(430, 80, 125, 20);
        ec2.setBounds(430, 100, 125, 20);
        ec3.setBounds(430, 120, 125, 20);
        ec4.setBounds(430, 140, 125, 20);
        ec5.setBounds(430, 160, 125, 20);
        ec6.setBounds(430, 180, 125, 20);
        ec7.setBounds(430, 200, 125, 20);
        ec8.setBounds(430, 220, 125, 20);
        ec9.setBounds(430, 240, 125, 20);
        ec10.setBounds(430, 260, 125, 20);
        ec11.setBounds(430, 280, 125, 20);
        ec12.setBounds(430, 300, 125, 20);
        ec13.setBounds(430, 320, 125, 20);
        ec14.setBounds(430, 340, 125, 20);
        ic1.setBounds(430, 380, 125, 20);
        ic2.setBounds(430, 400, 125, 20);
        ic3.setBounds(430, 420, 125, 20);
        ic4.setBounds(430, 440, 125, 20);
        ic5.setBounds(430, 460, 125, 20);
        ic6.setBounds(430, 480, 125, 20);
        ic7.setBounds(430, 500, 125, 20);
        ic8.setBounds(430, 520, 125, 20);
        ic9.setBounds(430, 540, 125, 20);
        ic10.setBounds(430, 560, 125, 20);
        ic11.setBounds(430, 580, 125, 20);
        ic12.setBounds(430, 600, 125, 20);
        ic13.setBounds(430, 620, 125, 20);
        ic14.setBounds(430, 640, 125, 20);

        this.add(sub);
        this.add(ec1);
        this.add(ec2);
        this.add(ec3);
        this.add(ec4);
        this.add(ec5);
        this.add(ec6);
        this.add(ec7);
        this.add(ec8);
        this.add(ec9);
        this.add(ec10);
        this.add(ec11);
        this.add(ec12);
        this.add(ec13);
        this.add(ec14);
        this.add(ic1);
        this.add(ic2);
        this.add(ic3);
        this.add(ic4);
        this.add(ic5);
        this.add(ic6);
        this.add(ic7);
        this.add(ic8);
        this.add(ic9);
        this.add(ic10);
        this.add(ic11);
        this.add(ic12);
        this.add(ic13);
        this.add(ic14);


        JButton b1 = new JButton("Submit");
        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    String path = "D:\\Survey\\output.txt";  //Put yor qwn file location path
                    FileOutputStream out = new FileOutputStream(path);
                    out.write("Resident Name : ".getBytes());
                    out.write(nameTextField.getText().getBytes());
                    out.write("\n".getBytes());
                    out.write("Resident Address : ".getBytes());
                    out.write(AddressTextField.getText().getBytes());
                    out.write("\n".getBytes());
                    out.write("Area Selected : ".getBytes());
                    out.write(sub.getItem(sub.getSelectedIndex()).getBytes());
                    out.write("\n".getBytes());

                    float avg = getAvg();
                    out.write("OverAll Cleanliness Rating : ".getBytes());
                    out.write(Float.toString(avg).getBytes());
                    out.write("\n".getBytes());

                    out.write("1. Daily garbage collection : ".getBytes());
                    out.write(ec1.getItem(ec1.getSelectedIndex()).getBytes());
                    out.write("\n".getBytes());

                    out.write("2. Is Wet and Dry garbage strictly separated ? : ".getBytes());
                    out.write(ec2.getItem(ec2.getSelectedIndex()).getBytes());
                    out.write("\n".getBytes());

                    out.write("3. All the workers wear safety masks, gloves, uniform and other accessories. : ".getBytes());
                    out.write(ec3.getItem(ec3.getSelectedIndex()).getBytes());
                    out.write("\n".getBytes());

                    out.write("4. Time to time cleaning of drainage systems : ".getBytes());
                    out.write(ec4.getItem(ec4.getSelectedIndex()).getBytes());
                    out.write("\n".getBytes());

                    out.write("5. Time to time cleaning of kitchen waste outlets : ".getBytes());
                    out.write(ec5.getItem(ec5.getSelectedIndex()).getBytes());
                    out.write("\n".getBytes());

                    out.write("6. Is daily sweeping of roads done ? : ".getBytes());
                    out.write(ec6.getItem(ec6.getSelectedIndex()).getBytes());
                    out.write("\n".getBytes());

                    out.write("7. Is daily sweeping of parks done ? : ".getBytes());
                    out.write(ec7.getItem(ec7.getSelectedIndex()).getBytes());
                    out.write("\n".getBytes());

                    out.write("8. Are the street dustbins cleaned daily ? : ".getBytes());
                    out.write(ec8.getItem(ec8.getSelectedIndex()).getBytes());
                    out.write("\n".getBytes());

                    out.write("9. You get a very clean supply of water. Do you agree ? : ".getBytes());
                    out.write(ec9.getItem(ec9.getSelectedIndex()).getBytes());
                    out.write("\n".getBytes());

                    out.write("10. There is a practice of tree planting frequently held by government ? : ".getBytes());
                    out.write(ec10.getItem(ec10.getSelectedIndex()).getBytes());
                    out.write("\n".getBytes());

                    out.write("11. Is unwanted weed grass cleaned frequently ? : ".getBytes());
                    out.write(ec11.getItem(ec11.getSelectedIndex()).getBytes());
                    out.write("\n".getBytes());

                    out.write("12. Is regular sanitization done in your area ? : ".getBytes());
                    out.write(ec12.getItem(ec12.getSelectedIndex()).getBytes());
                    out.write("\n".getBytes());

                    out.write("13. Is regular mosquito repellent spraying done ? : ".getBytes());
                    out.write(ec13.getItem(ec13.getSelectedIndex()).getBytes());
                    out.write("\n".getBytes());

                    out.write("14. Is animal waste cleaned daily ? : ".getBytes());
                    out.write(ec14.getItem(ec14.getSelectedIndex()).getBytes());
                    out.write("\n".getBytes());

                    out.write("15. Do the residents co-operate by segregating dry and wet waste : ".getBytes());
                    out.write(ic1.getItem(ic1.getSelectedIndex()).getBytes());
                    out.write("\n".getBytes());

                    out.write("16. The residents do not throw garbage anywhere on the road : ".getBytes());
                    out.write(ic2.getItem(ic2.getSelectedIndex()).getBytes());
                    out.write("\n".getBytes());

                    out.write("17. There is less plastic waste seen on your roads : ".getBytes());
                    out.write(ic3.getItem(ic3.getSelectedIndex()).getBytes());
                    out.write("\n".getBytes());

                    out.write("18. Residents do not spit on roads : ".getBytes());
                    out.write(ic4.getItem(ic4.getSelectedIndex()).getBytes());
                    out.write("\n".getBytes());

                    out.write("19. There is more use of eco-friendly goods : ".getBytes());
                    out.write(ic5.getItem(ic5.getSelectedIndex()).getBytes());
                    out.write("\n".getBytes());

                    out.write("20. Residents clean their water storages from time to time : ".getBytes());
                    out.write(ic6.getItem(ic6.getSelectedIndex()).getBytes());
                    out.write("\n".getBytes());

                    out.write("21. My area's air quality seems healthy and home's ventilation is adequate. : ".getBytes());
                    out.write(ic7.getItem(ic7.getSelectedIndex()).getBytes());
                    out.write("\n".getBytes());

                    out.write("22. My area is clean and well maintained. : ".getBytes());
                    out.write(ic8.getItem(ic8.getSelectedIndex()).getBytes());
                    out.write("\n".getBytes());

                    out.write("23. I receive adequate notice of changes in the cleaning schedule or of special cleaning : ".getBytes());
                    out.write(ic9.getItem(ic9.getSelectedIndex()).getBytes());
                    out.write("\n".getBytes());

                    out.write("24. My requests are handled in a timely manner by waste management team : ".getBytes());
                    out.write(ic10.getItem(ic10.getSelectedIndex()).getBytes());
                    out.write("\n".getBytes());

                    out.write("25. All the residents use toilets : ".getBytes());
                    out.write(ic11.getItem(ic11.getSelectedIndex()).getBytes());
                    out.write("\n".getBytes());out.write("25. Teacher is consistent and fair in discipline : ".getBytes());

                    out.write("26. There are public dustbins one at every corner in my area : ".getBytes());
                    out.write(ic12.getItem(ic12.getSelectedIndex()).getBytes());
                    out.write("\n".getBytes());

                    out.write("27. Residents take the responsibility to clean the waste of their pets : ".getBytes());
                    out.write(ic13.getItem(ic13.getSelectedIndex()).getBytes());
                    out.write("\n".getBytes());

                    out.write("28. The roads are very clean and well maintained : ".getBytes());
                    out.write(ic14.getItem(ic14.getSelectedIndex()).getBytes());
                    out.write("\n".getBytes());

                    out.close();
                } catch (IOException e1)
                {
                    e1.printStackTrace();
                }
                System.exit(0);
            }

//A function to calculate and return the average ratings or points as per survey form
            public float getAvg()
            {
                float avg = 0;

                Object o[] = {ec1, ec2, ec3, ec4, ec5, ec6, ec7, ec8, ec9, ec10, ec11, ec12, ec13,
                        ec14, ic1, ic2, ic3, ic4, ic5, ic6, ic7, ic8, ic9, ic10, ic11, ic12,
                        ic13, ic14};

                for(int i=0; i<28; i++)
                {
                    String s = ((Choice) o[i]).getItem(((Choice) o[i]).getSelectedIndex());
                    if(s.equals("Strongly Agree")) avg += 5;
                    else if(s.equals("Agree")) avg += 4;
                    else if(s.equals("Neutral")) avg += 3;
                    else if(s.equals("Disagree")) avg += 2;
                    else avg += 1;
                }

                return avg/28;
            }
        });

        this.add(b1);
        b1.setBounds(270,660,100,40);
    }

    public static void main(String[] args)
    {
        Survey ml=new Survey();
        ml.setVisible(true);
        ml.setSize(600,800);
        ml.setTitle("Cleanliness Survey");
    }
}