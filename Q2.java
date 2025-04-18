import java.util.Objects;
import java.util.Scanner;

class courses{

    String []Cname=new String[5];
    String[]Ccode=new String[5];
    int []Chours=new int[5];
    int TotalChours=0;
    int i=0;
    int NUM_Courses=0,tution_fees=0;
    public void SetCourrse(String c_name,String c_code,int Credit_hours,int t)
    {
        this.tution_fees=t;
        this.Cname[i]=c_name;
        this.Ccode[i]=c_code;
        this.Chours[i]=Credit_hours;
        TotalChours=TotalChours+Chours[i];
        i++;
    }
    public void print(student student)
    {
        student.sem_fees=tution_fees*TotalChours;
        for(i=1;i<=student.Ncourses;i++)
        {
            if(Objects.equals(student.Fees_paid, "yes")) {
                System.out.println("\nCourse Name " + Cname[i] + "Course code " + Ccode[i] + "Crediyt hours " + Chours[i] + "Grade of student " + student.grade[i]);
            }
            else if (Objects.equals(student.Fees_paid, "no"))
            {
                System.out.println("Course "+Cname[i]+"Course code "+Ccode[i]+"Credit hours "+Chours[i]+" \nGRADE LOCKED");
            }
        }
        if(Objects.equals(student.Fees_paid, "no")) {
            System.out.println("\nGrades cant be shown until ("+student.sem_fees+") Semester fees is paid ");
        }
    }
}

class student
{
    String id,Sname;
    String []grade=new String[5];
    int Ncourses;
    int []marks=new int[7];
    float Tmarks=0;
    String Fees_paid;
    int sem_fees;
    int i=0,J=0;
    public student( String Sname,String Sid,String Fees_paid,int Ncourses)
    {
        sem_fees=Ncourses*11000;
        this.Ncourses=Ncourses;
        this.Sname=Sname;
        this.id=Sid;
        this.Fees_paid=Fees_paid;

    }
    double Marks;
    float k=0;
    public void coursemarks(double MARKS)
    {
        this.Marks=MARKS;
        Tmarks+=Marks;
        J++;
    }
    public void setGrade(String grade) {
        this.grade[i] = grade;
        i++;
    }
    float  gpa;
    public void calculateGpa(String fees)
    {
        if (Objects.equals(fees, "yes")){
            gpa=Tmarks/J;
            System.out.println("\nGPA is "+gpa);}
        else {
            System.out.println("\nGPA LOCKED");
        }
    }
    public void GPApercentage(String fees)
    {
        if(Objects.equals(fees, "yes")){
            double percent=gpa*22;
            System.out.println("\nGpa percentage "+percent);}
        else {
            System.out.println("GPA LOCKED");
        }
    }
    public void student_info()
    {
        System.out.println("\nStudent Name: "+Sname+"\nStudent id: "+id+"\nFees payment status "+Fees_paid+"\nCourses enrolled "+Ncourses);
    }
}
public class A2_Q2_22K4029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int n = sc.nextInt();
        student[] s = new student[n];
        int i,j;
        int courses;
        String name,roll_num;
        String Fstatus;
        courses []course=new courses[n];

        for (i = 0; i < n; i++) {
            course[i]=new courses();
            int tutionrate=5;
            System.out.println("Enter name and Roll number ");
            name=sc.next();
            roll_num=sc.next();
            do {
                System.out.println("FEE PAID?");
                Fstatus = sc.nextLine();

            }while(!(Objects.equals(Fstatus, "yes")) &&
                    !(Objects.equals(Fstatus, "no")));

            System.out.println("Enter the number of courses");
            courses=sc.nextInt();
            String []c_name=new String[courses];
            String []c_code=new String[courses];
            String []c_grade=new String[courses];
            int []C_hours=new int[courses];
            s[i]=new student(name,roll_num,Fstatus,courses);
            for(j=1;j<=courses;j++)
            {
                System.out.println("Enter course name,course code,course credit hours and course grade ");
                c_name[j]=sc.next();
                c_code[j]=sc.next();
                C_hours[j]=sc.nextInt();
                c_grade[j]=sc.next();

                if(Objects.equals(c_grade[j], "A")) {

                    s[i].coursemarks(4);
                }
                else if(Objects.equals(c_grade[j], "A-")){

                    s[i].coursemarks(3.67);
                }
                else if(Objects.equals(c_grade[j], "B+")){

                    s[i].coursemarks(3.33);
                }
                else if(Objects.equals(c_grade[j], "B")){

                    s[i].coursemarks(3);
                }
                else if(Objects.equals(c_grade[j], "B-")){

                    s[i].coursemarks(2.67);
                }
                else if(Objects.equals(c_grade[j], "C+")){

                    s[i].coursemarks(2.33);
                }
                else if(Objects.equals(c_grade[j], "C")){

                    s[i].coursemarks(2);
                }
                else if(Objects.equals(c_grade[j], "D")){

                    s[i].coursemarks(1);
                }
                else {
                    s[i].coursemarks(0);
                }

                course[i].SetCourrse(c_name[j],c_code[j],C_hours[j],tutionrate);
                s[i].setGrade(c_grade[j]);
            }
            s[i].student_info();
            System.out.println("\n\nSNO\t\tCourse name  \t\tCredits\t\t GRADE ");
            course[i].print(s[i]);
            System.out.println("\nTotal credit hours %d"+course[i].TotalChours);

            s[i].calculateGpa(Fstatus);
            s[i].GPApercentage(Fstatus);

        }
    }
}

