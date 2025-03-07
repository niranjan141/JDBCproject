import java.sql.*;
import java.util.Scanner;
public class Insertdetails {

		public static void insertUserdata() throws Exception{
			
			String url ="jdbc:mysql://127.0.0.1:3306/userdetails";
			String username = "root";
			String password = "1234";
			String Query = "insert into information (UserId,FullName,Email,Password,Age,Gender,Height,Weight,DateofBirth ,Contactno )VALUES(?,?,?,?,?,?,?,?,?,?)";
			try {
				Connection con = DriverManager.getConnection(url,username,password);
				PreparedStatement pst = con.prepareStatement(Query);
				
				Scanner obj = new Scanner(System.in);
				System.out.println("Enter User ID: ");
				int userId = Integer.parseInt(obj.nextLine());
				
				
				System.out.println("Enter Full Name: ");
				String Fullname = obj.nextLine();
				
				System.out.println("Enter Email: ");
				String Email = obj.nextLine();
				
				System.out.println("Enter Password: ");
				String Password = obj.nextLine();
				
				System.out.println("Enter Age: ");
				int Age = Integer.parseInt(obj.nextLine());
				
				System.out.println("Enter Gender(Male/Female/Other): ");
				String Gender = obj.nextLine();
				
				System.out.println("Enter Height: ");
				double Height =Double.parseDouble (obj.nextLine());
				
				System.out.println("Enter Weight: ");
				double Weight =Double.parseDouble( obj.nextLine());
				
				System.out.println("Enter Date Of Birth(YYYY-MM-DD): ");
				String DateofBirth = obj.nextLine();
				
				System.out.println("Enter Contact  no: ");
				Long Contactno = obj.nextLong();
				
				pst.setInt(1,userId );
				pst.setString(2, Fullname );
				pst.setString(3,Email );
				pst.setString(4, Password  );
				pst.setInt(5, Age );
				pst.setString(6,Gender );
				pst.setDouble(7, Height);
				pst.setDouble(8,Weight);
				pst.setString(9,DateofBirth  );
				pst.setLong(10,Contactno );
				
				pst.executeUpdate();
				
				System.out.println("User Data Update Successfully!");
				
				con.close();
				obj.close();
				
				}catch(SQLException e){
					e.printStackTrace();
				}
			
			
			
			}
			
		public static void main (String[] args) {
			try {
				insertUserdata();
			}catch(Exception e){
				e.printStackTrace();
			}
		
		}

	}


