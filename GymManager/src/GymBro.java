import java.sql.*;

public class GymBro {
    static String     driverClassName = "org.postgresql.Driver" ;
    static String     url = "jdbc:postgresql://dblabs.iee.ihu.gr:5432/it175008" ;
    static Connection dbConnection = null;
    static String     username = "it175008";
    static String     passwd = "#Mementomori199";
    static Statement  statement=null;
    static ResultSet  rs=null; //diaxeirish pollon apotelesmaton #dromeas
    
    
    public void createmember(){
        int memberid;
        String name;
        String phone;
        String gender;
        int age;
        int membershipid;
        int planid;
        System.out.println("Give me the unique ID of the member");
        memberid=In.Int();
        System.out.println("Give me the name of the new member");
        name=In.String();
        System.out.println("Give me the phone of the member");
        phone=In.String();
        System.out.println("Give me the gender of the member");
        gender=In.String();
        System.out.println("Give me the age of the member");
        age=In.Int();
        System.out.println("Give me the type of membership");
        membershipid=In.Int();
        System.out.println("Give me the workout plan");
        planid=In.Int();
        try{
        statement.executeQuery("select newmember("+memberid+",'"+name+"','"+phone+"','"+gender+"',"+age+","+membershipid+","+planid+");");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        System.out.println("   Done.");
    }
    public void deletemember(){
        String name;
        System.out.println("Give me the name of the member you want to delete");
        name=In.String();
        try{
        statement.executeQuery("select deletemember('"+name+"');");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        System.out.println("   Done.");
    }
    public void altermember(){
        int memberid;
        String name;
        String phone;
        String gender;
        int age;
        int membershipid;
        int planid;
        System.out.println("Give me the unique ID of the member");
        memberid=In.Int();
        System.out.println("Give me the new name of the new member");
        name=In.String();
        System.out.println("Give me the new phone of the member");
        phone=In.String();
        System.out.println("Give me the new gender of the member");
        gender=In.String();
        System.out.println("Give me the new age of the member");
        age=In.Int();
        System.out.println("Give me the new type of membership");
        membershipid=In.Int();
        System.out.println("Give me the new workout plan");
        planid=In.Int();
        try{
        statement.executeQuery("select altermember("+memberid+",'"+name+"','"+phone+"','"+gender+"',"+age+","+membershipid+","+planid+");");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        System.out.println("   Done.");
    }
    public void hardreset(){
        String sure;
        System.out.println("Are you sure you want to reset whole the database Y/N?");
        sure=In.String();
        if (sure.equals("Y")){
            try{
                statement.executeQuery("select hardreset();");
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println("Done.");
        }else{
            System.out.println("   Didn't reset");
        }
    }
    public void getmemberinfo(){
        int memberid;
        System.out.println("Give me the unique id of the member you want to know the name of");
        memberid=In.Int();
        try{
            rs=statement.executeQuery("select * from getmemberinfo("+memberid+") as ANSWER;");
            while(rs.next()){//prints results saved in rs and uses its alias as pointer(sort of)
                String name=rs.getString("name");
                String phone=rs.getString("phone");
                String gender=rs.getString("gender");
                String age=rs.getString("age");
                String membershipid=rs.getString("membershipid");
                String planid=rs.getString("planid");
                System.out.println("Name: "+name+" Phone: "+phone+" Gender: "+gender+" Age: "+age+" Membership Type: "+membershipid+" Workout ID: "+planid);
            }
        } catch (SQLException e) {
                e.printStackTrace();
            }
    }
    public void getworkoutinfo(){
        int workoutid;
        System.out.println("Give me the unique id of the workout you want to know more about");
        workoutid=In.Int();
        try{
            rs=statement.executeQuery("select * from getworkoutinfo("+workoutid+") as ANSWER;");
            while(rs.next()){//prints results saved in rs and uses its alias as pointer(sort of)
                String name=rs.getString("name");
                String description=rs.getString("description");
                System.out.println("Name: "+name+" Description: "+description);
            }
        } catch (SQLException e) {
                e.printStackTrace();
            }
    }
    public void defaultdata(){
        String sure;
        System.out.println("Are you sure you want to fill the database with test data Y/N?");
        sure=In.String();
        if (sure.equals("Y")){
            try{
                statement.executeQuery("select defaultdata();");
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println("Done.");
        }else{
            System.out.println("   Didn't fill with data");
        }
    }
    public void altermembershiptype(){
        int typeid;
        String name;
        int price;
        int duration;
        int signupfee;
        
        
        System.out.println("Give me the unique ID of the membership");
        typeid=In.Int();
        System.out.println("Give me the new name of the new membership");
        name=In.String();
        System.out.println("Give me the new price of the membership");
        price=In.Int();
        System.out.println("Give me the new duration of the membership");
        duration=In.Int();
        System.out.println("Give me the new signupfee of the member");
        signupfee=In.Int();
        
        try{
        statement.executeQuery("select altermembershiptype("+typeid+",'"+name+"','"+price+"','"+duration+"',"+signupfee+");");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        System.out.println("   Done.");
    }
    public void showlog(){
            try{
            rs=statement.executeQuery("select showlog() as ANSWER;");
            while(rs.next()){//prints results saved in rs and uses its alias as pointer(sort of)
                String log=rs.getString("ANSWER");
                
                System.out.println(log);
            }
        } catch (SQLException e) {
                e.printStackTrace();
            }
            
    }
    public void createinstructor(){
        int instructorid;
        String name;
        String email;
        String phone;
        
        System.out.println("Give me the unique ID of the new instructor");
        instructorid=In.Int();
        System.out.println("Give me the name of the new instructor");
        name=In.String();
        System.out.println("Give me the email of the instructor");
        email=In.String();
        System.out.println("Give me the phone of the instructor");
        phone=In.String();
        
        try{
        statement.executeQuery("select newinstructor("+instructorid+",'"+name+"','"+phone+"','"+email+"',"+phone+");");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        System.out.println("   Done.");
    }
    public static void main (String[] argv) throws Exception
    {
        Class.forName (driverClassName);
        dbConnection = DriverManager.getConnection (url, username, passwd);
        statement=dbConnection.createStatement();
        statement.executeUpdate("set search_path = 'HAB'");//HAB=onoma toy schema
        //-----------------------------------------------
        GymBro gymbro=new GymBro();
        
        
        
        int choice=0;
        while (choice!=-1){
            System.out.println(" Type\n 1 if you want to create a member,"
                    + " 2 if you want to update a member's data "
                    + "\n 3 to delete a member"
                    + " 4 to reset the database"
                    + "\n 5 to fill the database with default testing data"
                    + " 6 to search for a specific member's info"
                    + "\n 7 to search for a specific workout's info"
                    + " 8 to update a membership"
                    + "\n 9 to add an instructor"
                    + " 10 to show the log file"
                    + " -1 to exit");
            choice=In.Int();
            if(choice==1){
                gymbro.createmember();
            }else if (choice==2){
                gymbro.altermember();
            }else if (choice==3){
                gymbro.deletemember();
            }else if (choice==4){
                gymbro.hardreset();
            }else if (choice==5){
                gymbro.defaultdata();
            }else if (choice==6){
                gymbro.getmemberinfo();
            }else if (choice==7){
                gymbro.getworkoutinfo();
            }else if (choice==8){
                gymbro.altermembershiptype();
            }else if (choice==9){
                gymbro.createinstructor();
            }else if (choice==10){
                gymbro.showlog();
            }else if (choice==-1){
                System.out.println("Exiting now...");
            }else {
                System.out.println("You have given wrong input");
            }        
        }
        
        
        
        
        
        
      
        statement.close();
        dbConnection.close();
    }
}


