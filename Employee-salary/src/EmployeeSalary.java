import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployeeSalary {
    private JPanel Main;
    private JTextField txtEName;
    private JButton OKButton;
    private JTextField txtSalary;
    private JTextField txtTax;
    private JTextField txtNetSalary;

    public static void main(String[] args) {
        JFrame frame = new JFrame("EmployeeSalary");
        frame.setContentPane(new EmployeeSalary().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public EmployeeSalary() {
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double salary = Double.parseDouble(txtSalary.getText());
                double tax, netSalary;

                if (salary > 50000) {

                    tax = salary * 10 / 100;

                } else if (salary > 35000) {
                    tax = salary * 5 / 100;
                } else {
                    tax = 0.00;
                }

                txtTax.setText(String.valueOf(tax));
                netSalary = salary - tax;
                txtNetSalary.setText(String.valueOf(netSalary));


            }
        });
    }
}
