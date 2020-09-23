package studentdatabaseapp;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private String gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance= 0;
    private static int costOfCourse = 600;
    private static int id = 1000;


    //Constructor: prompt user to enter students name and year
    public Student(){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter students first name: ");
        this.firstName =in.nextLine();
        System.out.println("Enter students last name: ");
        this.lastName =in.nextLine();
        System.out.println("Class level:\n1-Freshmen\n2-Sophmore\n3-Junior\n4-Senior\nEnter students class level: ");
        this.gradeYear = String.valueOf(in.nextInt());
        setStudentID();

    }

    //Generate an ID
    private void setStudentID(){
        //Grade level + ID
        id++;
        this.studentID = gradeYear + "" + id;
    }



    //Enroll in courses
    public void enroll() {
        //Get inside a loop, user hits 0
        int i = 0;
        boolean check=true;

        while (check){
            System.out.println("Enter course to enroll(Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if(course.equals("Q") || course.equals("q")){
                break;
            }
            courses += "\n  " + course;
            tuitionBalance = tuitionBalance + costOfCourse;
            i++;

        }

    }


    //View balance and pay tuition
    public void viewBalance(){
        System.out.println("Your balance is: -$" + tuitionBalance);
}

    //Pay tuition
    public void payTuition(){
        viewBalance();
        System.out.print("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance-= payment;
        System.out.println("Thank you for your payment of $" +payment);

}



    //Show status
    public String toString(){
    return "Name: " +firstName + " " + lastName + "\nGrade level: " + gradeYear + "\nStudent ID: " + studentID + "\nCourses Enrolled:" +courses + "\nBalance: -$" +tuitionBalance;
    }
    }
