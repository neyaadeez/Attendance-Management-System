/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Mustafa Mokashi
 */

//import java.sql.*;
//import java.util.Date;
//import java.util.Scanner;
public class attendancemanagementsystem {
public static void main(String[] args) {
try {
    
    login log=new login();
    log.show();
/*Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/attendance_management","-","-");
System.out.println("Connection to the database");
Statement sm=con.createStatement();
int ch;
Scanner s=new Scanner(System.in);
do
{
System.out.println("\nMenu: \n1. Insert \n2. Select \n3. Update \n4. Delete \n5. Exit \n Enter Your Choice: ");
ch=s.nextInt();
switch(ch)
{
case 1:
String sql="INSERT INTO student" + "(s_id, f_name, l_name, dob, gender, phone)"+" values (1032191370, 'Raghu', 'B', '2000-01-01', 'M', '8884466622')";
sm.executeUpdate(sql);
System.out.println("Record Inserted Successfully");
break;
case 2:
String sql1= "SELECT * FROM Student";
ResultSet rs=sm.executeQuery(sql1);
while(rs.next())
{
int id=rs.getInt("s_id");
String name1=rs.getString("f_name");
String name2=rs.getString("l_name");
Date dob=rs.getDate("dob");
String gender=rs.getString("gender");
long phone=rs.getLong("phone");
System.out.println("Student ID: "+ id);
System.out.println("First Name: "+ name1);
System.out.println("Last Name: "+ name2);
System.out.println("Date Of Birth: "+ dob);
System.out.println("Gender: "+ gender);
System.out.println("Phone: "+ phone);
System.out.println("\n");
}
break;
case 3:
String sql2="UPDATE student set l_name='Biradar' where s_id=1032191370";
sm.executeUpdate(sql2);
System.out.println("Record Updated Successfully");
break;
case 4:
String sql3="DELETE from student where s_id=1032191370";
sm.executeUpdate(sql3);
System.out.println("Record id deleted");
}
}while(ch<5);
con.close();
s.close();
}*/
}catch(Exception e)
{
e.printStackTrace();
}
}
}