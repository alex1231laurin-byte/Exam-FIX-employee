/**
 * Consider this incomplete Employee class to answer some questions of your exam
 *
 * @author Tassia
 * @version 0.1
 */
public class Employee{
    private String fullname;
    private int yearOfBirth;
    private boolean onLeave;
    private double hourlyWage;
    private double unpaidHours;

    public Employee(String fullname2, int yearOfBirth2, double hourlyWage2){
        fullname = fullname2;
        yearOfBirth = yearOfBirth2;
        hourlyWage = hourlyWage2;
        onLeave = false;
        unpaidHours = 0.0;
    }
    
    public void hoursLeftUnpaid(double hoursUnpaid){
        unpaidHours = hoursUnpaid;
    }
    
    public double getUnpaidHours(){
        return unpaidHours;
    }
    
    /**
     * Returns true is an employee is above 16 years old
     */
    private int calculateAge(int currentYear){
        return (currentYear - yearOfBirth);
    }

    /**
     * Returns true is an employee is above 16 years old
     */
    public boolean canDrive(){
        int age = calculateAge(2025);
        if(age>=16){
            System.out.println(fullname + " can drive!");
        }
        else{
            System.out.println(fullname + " must wait " + (16-age) + "years before they can drive.");
        }
    }

    /*
     * Returns the net pay for the outstanding unpaid hours
     */
    private double calculatePay(){
        double taxes = 0.7;
        totalSalary = unpaidHours * hourlyWage;
        netPay = totalSalary * taxes;
        return netPay;
    }

    /*
     * Output the payment record and resets unpaid hours
     */
    public void paySalary(){
        calculatePay();
        System.out.println(fullname + " has received a wire transfer of " + netPay + " CAD.");
        unpaidHours = 0.0;
    }
}