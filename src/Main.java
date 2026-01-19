import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        while (true) {
            JOptionPane.showMessageDialog(null, "Welcome to SAP Subsidiary Program");

            String[] columnHeads = {"Number ID", "Region", "Daily Min. Wage in Peso", "Subsidy Amount per Month (FOR 4Ps)", "ESP Given to 4Ps Families"};

            Object[][] SAP = {

                    {"1", "Region NCR", 537.00, 8000.00, 6650.00},
                    {"2", "Region CAR", 350.00, 5500.00, 4150.00},
                    {"3", "Region I", 340.00, 5500.00, 4150.00},
                    {"4", "Region II", 370.00, 5500.00, 4150.00},
                    {"5", "Region III", 420.00, 6500.00, 5150.00},
                    {"6", "Region IV-A", 400.00, 6500.00, 5150.00},
                    {"7", "Region IV-B", 320.00, 5000.00, 3650.00},
                    {"8", "Region V", 310.00, 5000.00, 3650.00},
                    {"9", "Region VI", 395.00, 6000.00, 4650.00},
                    {"10", "Region VII", 404.00, 6000.00, 4650.00},
                    {"11", "Region VIII", 315.00, 5000.00, 3650.00},
                    {"12", "Region IX", 316.00, 5000.00, 3650.00},
                    {"13", "Region X", 365.00, 6000.00, 4650.00},
                    {"14", "Region XI", 396.00, 6000.00, 4650.00},
                    {"15", "Region XII", 326.00, 5000.00, 3650.00},
                    {"16", "Region CARAGA", 320.00, 5000.00, 3650.00},
                    {"17", "Region BARMM", 325.00, 5000.00, 3650.00}
            };

            JTable table = new JTable(SAP, columnHeads);
            JScrollPane scrollPane = new JScrollPane(table);
            JOptionPane.showMessageDialog(null, scrollPane, "SAP Program Chart", JOptionPane.INFORMATION_MESSAGE);

            String start = JOptionPane.showInputDialog("Do you want to join? \nYes or No");

            if (start != null && start.equalsIgnoreCase("Yes")) {
                String name = JOptionPane.showInputDialog("Enter Name:");

                String[] regions = {
                        "Region NCR", "Region CAR", "Region I", "Region II", "Region III",
                        "Region IV-A", "Region IV-B", "Region V", "Region VI", "Region VII",
                        "Region VIII", "Region IX", "Region X", "Region XI", "Region XII",
                        "Region CARAGA", "Region BARMM"
                };

                String selectedRegion = (String) JOptionPane.showInputDialog(
                        null,
                        "Select your region:",
                        "Region Selection",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        regions,
                        regions[0]
                );

                if (selectedRegion != null) {
                    for (Object[] row : SAP) {
                        if (selectedRegion.equals(row[1])) {
                            String fourPs = JOptionPane.showInputDialog("Are you a 4Ps? \n Yes or No");
                            if (fourPs.equalsIgnoreCase("Yes")) {
                                JOptionPane.showMessageDialog(null, "Hi " + name +
                                        "\nYou are a 4Ps from " + row[1] +
                                        "\nWith a Minimum Wage of " + row[2] +
                                        "\nYour Subsidiary is " + row[3]);
                            } else if (fourPs.equalsIgnoreCase("No")) {
                                JOptionPane.showMessageDialog(null, "Hi " + name +
                                        "\nYou are from " + row[1] +
                                        "\nWith a Minimum Salary of " + row[2] +
                                        "\nYour Subsidy is " + row[4]);
                            } else {
                                JOptionPane.showMessageDialog(null, "Invalid choice for 4Ps.");
                            }
                            break; // Exit the loop once a match is found
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Region selection canceled.");
                }
            } else if (start != null && start.equalsIgnoreCase("No")) {
                JOptionPane.showMessageDialog(null, "Okay, have a great day!");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Invalid input or canceled.");
                break;
            }

            String rejoin = JOptionPane.showInputDialog("Join again? \nYes or No");
            if (rejoin == null || !rejoin.equalsIgnoreCase("Yes")) {
                JOptionPane.showMessageDialog(null, "Thank you for participating. Have a great day!");
                break;
            }
        }
    }
}


