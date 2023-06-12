import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;

public class BirthdaySelection {
    private static JComboBox<String> monthComboBox;
    private static JList<String> dayList;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Java Programming");

        JLabel yearLabel = new JLabel("Year:");
        JLabel monthLabel = new JLabel("Month:");
        JLabel dayLabel = new JLabel("Day:");

        Integer[] years = generateYearArray();
        JComboBox<Integer> yearComboBox = new JComboBox<>(years);

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        monthComboBox = new JComboBox<>(months);

        String[] days = generateDayArray(31);
        dayList = new JList<>(days);
        dayList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        frame.getContentPane().setLayout(new GridLayout(3, 2));
        frame.getContentPane().add(yearLabel);
        frame.getContentPane().add(yearComboBox);
        frame.getContentPane().add(monthLabel);
        frame.getContentPane().add(monthComboBox);
        frame.getContentPane().add(dayLabel);
        frame.getContentPane().add(new JScrollPane(dayList));

        yearComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedYear = (int) yearComboBox.getSelectedItem();
                updateDays(selectedYear, dayList);
            }
        });

        monthComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedYear = (int) yearComboBox.getSelectedItem();
                updateDays(selectedYear, dayList);
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private static Integer[] generateYearArray() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        Integer[] years = new Integer[100];
        for (int i = 0; i < 100; i++) {
            years[i] = currentYear - i;
        }
        return years;
    }

    private static String[] generateDayArray(int daysInMonth) {
        String[] days = new String[daysInMonth];
        for (int i = 0; i < daysInMonth; i++) {
            days[i] = Integer.toString(i + 1);
        }
        return days;
    }

    private static void updateDays(int selectedYear, JList<String> dayList) {
        int selectedMonth = monthComboBox.getSelectedIndex();
        int daysInMonth = getDaysInMonth(selectedYear, selectedMonth);
        String[] days = generateDayArray(daysInMonth);
        dayList.setListData(days);
    }

    private static int getDaysInMonth(int year, int month) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, 1);
        return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    }
}
