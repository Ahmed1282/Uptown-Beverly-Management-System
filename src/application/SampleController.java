package application;
import java.awt.Desktop;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import java.util.*;  
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;  
import java.sql.SQLException;



public class SampleController {

	int current_id = 0;
	

    @FXML
    private Button submitbutton;
    
    @FXML
    private Button propertydetailbutton;



    @FXML
    private Button paycommbutton;


    @FXML
    private Button installmentButton;


    @FXML
    private Button feedbackgivebutton;

    @FXML
    private Button givereportButton;


    @FXML
    private Button payPropertybutton;


    @FXML
    private Button gobackbutton;
    
	@FXML
    private Button adminlogin;
    @FXML
    private Button gomainButton;
    
    @FXML
    private Button exitbutton;
    
    @FXML
    private Button contractbutton;
    
    @FXML
    private Button loginButton;

    @FXML
    private Button signupButton;
    
    @FXML
    private TextField cnictext;

    @FXML
    private TextField emailtext;

    @FXML
    private TextField nametext;

    @FXML
    private TextField phonetext;

    @FXML
    private Button signuppageButton;
    
    @FXML
    private TextField usernameetext;
    
    @FXML
    private TextField addresstext;
    
    
    @FXML
    private TextField passtext;
    
    @FXML
    private Button feedbackButton;

    @FXML
    private Button reportbutton;


    @FXML
    public void payProperty (ActionEvent event) throws IOException {
    	Stage stage = (Stage) payPropertybutton.getScene().getWindow();
    	stage.close();
    	Stage primaryStage = new Stage();
    	Parent root = FXMLLoader.load(getClass().getResource("propertyRent.fxml"));
    	primaryStage.setTitle("Pay Property Rent");
    	primaryStage.setScene(new Scene(root));
    	primaryStage.show();    	
    }

    @FXML
    public void giveReport (ActionEvent event) throws IOException {
    	Stage stage = (Stage) givereportButton.getScene().getWindow();
    	stage.close();
    	Stage primaryStage = new Stage();
    	Parent root = FXMLLoader.load(getClass().getResource("ReportProblem.fxml"));
    	primaryStage.setTitle("Report a Problem");
    	primaryStage.setScene(new Scene(root));
    	primaryStage.show();
    }
    @FXML
    public void giveFeedback (ActionEvent event) throws IOException {
    	Stage stage = (Stage) feedbackgivebutton.getScene().getWindow();
    	stage.close();
    	Stage primaryStage = new Stage();
    	Parent root = FXMLLoader.load(getClass().getResource("giveFeedback.fxml"));
    	primaryStage.setTitle("Give Feedback");
    	primaryStage.setScene(new Scene(root));
    	primaryStage.show();
    	
    }
    @FXML
    public void payInstallment (ActionEvent event) throws IOException {
    	Stage stage = (Stage) installmentButton.getScene().getWindow();
    	stage.close();
    	Stage primaryStage = new Stage();
    	Parent root = FXMLLoader.load(getClass().getResource("installments.fxml"));
    	primaryStage.setTitle("Installments");
    	primaryStage.setScene(new Scene(root));
    	primaryStage.show();
    }
    @FXML
    public void payCommercial (ActionEvent event) throws IOException {
    	Stage stage = (Stage) paycommbutton.getScene().getWindow();
    	stage.close();
    	Stage primaryStage = new Stage();
    	Parent root = FXMLLoader.load(getClass().getResource("commercialRent.fxml"));
    	primaryStage.setTitle("Commercial Rent");
    	primaryStage.setScene(new Scene(root));
    	primaryStage.show();
    }
    @FXML
    public void openPropertyDetail (ActionEvent event) throws IOException {
    	Stage stage = (Stage) propertydetailbutton.getScene().getWindow();
    	stage.close();
    	Stage primaryStage = new Stage();
    	Parent root = FXMLLoader.load(getClass().getResource("PropertyDetails.fxml"));
    	primaryStage.setTitle("PropertyDetails");
    	primaryStage.setScene(new Scene(root));
    	primaryStage.show();
    }


    @FXML
    public void viewFeeback(ActionEvent event) throws IOException {
    	Stage stage = (Stage) feedbackButton.getScene().getWindow();
    	stage.close();
    	Stage primaryStage = new Stage();
    	Parent root = FXMLLoader.load(getClass().getResource("viewFeedbacks.fxml"));
    	primaryStage.setTitle("view Feedbacks");
    	primaryStage.setScene(new Scene(root));
    	primaryStage.show();
    }

    @FXML
    public void viewReport(ActionEvent event) throws IOException {
    	Stage stage = (Stage) reportbutton.getScene().getWindow();
    	stage.close();
    	Stage primaryStage = new Stage();
    	Parent root = FXMLLoader.load(getClass().getResource("viewReports.fxml"));
    	primaryStage.setTitle("View Reports");
    	primaryStage.setScene(new Scene(root));
    	primaryStage.show();
    }
    
    @FXML
    public void openSignup(ActionEvent event) throws IOException {
    	Stage stage = (Stage) signupButton.getScene().getWindow();
    	stage.close();
    	Stage primaryStage = new Stage();
    	Parent root = FXMLLoader.load(getClass().getResource("signuppage.fxml"));
    	primaryStage.setTitle("Sign up Page");
    	primaryStage.setScene(new Scene(root));
    	primaryStage.show();
    	
    	
    }
    
    @FXML
    public void signupCheck(ActionEvent event) throws IOException{
    	String username = usernameetext.getText();
    	String password = passtext.getText();
    	String name = nametext.getText();
    	String CNIC = cnictext.getText();
    	String email = emailtext.getText();
    	String phone = phonetext.getText();
    	String address = addresstext.getText();
//    	FXMLLoader loader = new FXMLLoader(getClass().getResource("userView.fxml"));
  //  	Parent root = loader.load();
    	
    	System.out.println("Username: " + username);
    	System.out.println("Password: " + password);
    	System.out.println("Name: " + name);
    	System.out.println("CNIC: " + CNIC);
    	System.out.println("Email: " + email);
    	System.out.println("Phone: " + phone);
    	System.out.println("Address: " + address);
    	
    	Stage stage = (Stage) signuppageButton.getScene().getWindow();
    	stage.close();
    	Stage primaryStage = new Stage();
    	Parent root = FXMLLoader.load(getClass().getResource("Sample.fxml"));
    	primaryStage.setTitle("Start");
    	primaryStage.setScene(new Scene(root));
    	primaryStage.show();
    	
    	//id name username pass address cnic phone
    	try {
			Class.forName("com.mysql.jdbc.Driver");

    	Connection con=DriverManager.getConnection(  
    	"jdbc:mysql://localhost:3306/utp","root","root");

    	Statement stmt=con.createStatement();  
    	
    	//retrieve how many customers already so id can be assigned accordingly
    	ResultSet rs=stmt.executeQuery("SELECT COUNT(*) FROM Customer;");
    	
    	rs.next();
    	int num = rs.getInt(1);
    	num++;
    	System.out.println(num);
    	
    	//Now retrieve the already existing usernames to check for duplicates
    	Statement stmt2=con.createStatement();  
    	
    	ResultSet rs2=stmt2.executeQuery("SELECT username FROM Customer;");
    	while(rs2.next())
    	{
    		System.out.println("Output check: " + rs2.getString(1));
    		if (username.equals(rs2.getString(1)))
    		{
    			System.out.println("Duplicate Found!!!");
    			Alert ab = new Alert(Alert.AlertType.CONFIRMATION);
    			ab.setContentText("Username already exists. Account not created.");
    			Optional<ButtonType> result = ab.showAndWait();
    			ButtonType button = result.orElse(ButtonType.CANCEL);
    			if (button == ButtonType.OK) {
    				return;
    				/*this.logout = signuppageButton;
    				Stage stage2 = (Stage) logout.getScene().getWindow();
    		    	stage2.close();
    		    	Stage primaryStage2 = new Stage();
    		    	Parent root2 = FXMLLoader.load(getClass().getResource("Sample.fxml"));
    		    	primaryStage2.setTitle("Main");
    		    	primaryStage2.setScene(new Scene(root2,400,400));
    		    	primaryStage2.show();*/
    			}
    		}
    		else 
    		{
    	    	String sql = "insert into Customer " + " values (?, ?, ?, ?, ?, ?, ?);";
    	    	PreparedStatement preparedStmt = con.prepareStatement(sql);
    	    	preparedStmt.setInt(1, num);
    	    	preparedStmt.setString (2, name);
    	    	preparedStmt.setString   (3, username);
    	    	preparedStmt.setString   (4, password);
    	    	preparedStmt.setString   (5, address);
    	    	preparedStmt.setString   (6, CNIC);
    	    	preparedStmt.setString   (7, phone);
    	    	
    	    	preparedStmt.execute();
    		}
    	}
    	
    	//SELECT COUNT(*) FROM Customer;



    	con.close();  
		} catch(Exception e){ System.out.println(e);}
    }
    
    @FXML
    private Button loginConfirm;

    @FXML
    private TextField passwordtext;

    @FXML
    private TextField usernametext;

    @FXML
    private Button logout;

    @FXML
    void gotoSample(ActionEvent event) throws IOException {
    	
    	Stage stage = (Stage) logout.getScene().getWindow();
    	stage.close();
    	Stage primaryStage = new Stage();
    	Parent root = FXMLLoader.load(getClass().getResource("Sample.fxml"));
    	primaryStage.setTitle("Main");
    	primaryStage.setScene(new Scene(root));
    	primaryStage.show();

    }
    
    @FXML
    public void loginCheck(ActionEvent event) throws IOException {
    	
    	String username = usernametext.getText();
    	String password = passwordtext.getText();
    	
//    	FXMLLoader loader = new FXMLLoader(getClass().getResource("userView.fxml"));
  //  	Parent root = loader.load();
    	
    	System.out.println(username);
    	System.out.println(password);
    	
    	
    	
    	try {
			Class.forName("com.mysql.jdbc.Driver");

    	Connection con=DriverManager.getConnection(  
    	"jdbc:mysql://localhost:3306/utp","root","root");
    	
    	Statement stmt2=con.createStatement();     	
    	ResultSet rs2=stmt2.executeQuery("SELECT id FROM Customer where username = '" + username + "';");
    	
    	rs2.next();
    	current_id = rs2.getInt(1);
    	
    	System.out.println("CURRENT IDDD:   " + rs2.getInt(1));
    	
    	if (current_id == 0)
    	{
			Alert ab = new Alert(Alert.AlertType.CONFIRMATION);
			ab.setContentText("Wrong username or password!");
			Optional<ButtonType> result = ab.showAndWait();
			ButtonType button = result.orElse(ButtonType.CANCEL);
			if (button == ButtonType.OK) {
				return;
			}
    	}

    	Statement stmt3=con.createStatement();     	
    	ResultSet rs3=stmt3.executeQuery("SELECT pass FROM Customer where id = '" + current_id + "';");
    	rs3.next();
//    	current_id = rs2.getInt(1);

    	
    	if (password.equals(rs3.getString(1)))
    	{
    		Stage stage = (Stage) loginConfirm.getScene().getWindow();
        	stage.close();
        	Stage primaryStage = new Stage();
        	Parent root = FXMLLoader.load(getClass().getResource("userView.fxml"));
        	primaryStage.setTitle("Home");
        	primaryStage.setScene(new Scene(root));
        	primaryStage.show();
        	
    	}
    	else
    	{
			Alert ab = new Alert(Alert.AlertType.CONFIRMATION);
			ab.setContentText("Wrong username or password!");
			Optional<ButtonType> result = ab.showAndWait();
			ButtonType button = result.orElse(ButtonType.CANCEL);
			if (button == ButtonType.OK) {
				return;
			}
    	}

//    	Statement stmt=con.createStatement();  
    	
  //  	ResultSet rs=stmt.executeQuery("select * from Customer");
    //	while(rs.next())  
    	//System.out.println(rs.getInt(1) + "\t\t" + rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getString(4) + "\t\t"+rs.getString(5) + "\t\t"+rs.getString(6));  
    	
    	
    	

    	con.close();  
		} catch(Exception e){ System.out.println(e);}
    	
    }
    
    @FXML
    private Button adminloginConfirm;

    @FXML
    private TextField Apasswordtext;

    @FXML
    public void adminloginCheck(ActionEvent event)  throws IOException{
    	
    	String passw = "admin";
    	String userpass = Apasswordtext.getText();
    	
    	if (passw.equals(userpass))
    	{
        	Stage stage = (Stage) adminloginConfirm.getScene().getWindow();
        	stage.close();
        	Stage primaryStage = new Stage();
        	Parent root = FXMLLoader.load(getClass().getResource("adminview.fxml"));
        	primaryStage.setTitle("admin menu");
        	primaryStage.setScene(new Scene(root));
        	primaryStage.show();
    	}
    	
    	else
    	{
    		Alert ab = new Alert(Alert.AlertType.CONFIRMATION);
			ab.setContentText("Wrong password!");
			Optional<ButtonType> result = ab.showAndWait();
			ButtonType button = result.orElse(ButtonType.CANCEL);
			if (button == ButtonType.OK) {
				return;
			}
    	}

    }




    @FXML
    public void gotoMain(ActionEvent event) throws IOException {
    	Stage stage = (Stage) gomainButton.getScene().getWindow();
    	stage.close();
    	Stage primaryStage = new Stage();
    	Parent root = FXMLLoader.load(getClass().getResource("Sample.fxml"));
    	primaryStage.setTitle("Main");
    	primaryStage.setScene(new Scene(root));
    	primaryStage.show();
    }

    @FXML
    public void openLogin(ActionEvent event) throws IOException {
    	Stage stage = (Stage) loginButton.getScene().getWindow();
    	stage.close();
    	Stage primaryStage = new Stage();
    	Parent root = FXMLLoader.load(getClass().getResource("loginpage.fxml"));
    	primaryStage.setTitle("Login Page");
    	primaryStage.setScene(new Scene(root));
    	primaryStage.show();
    }
    

    @FXML
    public void gotoContractor(ActionEvent event) throws IOException {
    	Stage stage = (Stage) contractbutton.getScene().getWindow();
    	stage.close();
    	Stage primaryStage = new Stage();
    	Parent root = FXMLLoader.load(getClass().getResource("ContractorPage.fxml"));
    	primaryStage.setTitle("Contractor Page");
    	primaryStage.setScene(new Scene(root));
    	primaryStage.show();
    }

    
    @FXML
    void exitMenu(ActionEvent event) {
    	Stage stage = (Stage) exitbutton.getScene().getWindow();
    	stage.close();
    }

    @FXML
    public void openAdmin(ActionEvent event) throws IOException {
    	Stage stage = (Stage) adminlogin.getScene().getWindow();
    	stage.close();
    	Stage primaryStage = new Stage();
    	Parent root = FXMLLoader.load(getClass().getResource("adminloginpage.fxml"));
    	primaryStage.setTitle("Admin Login Page");
    	primaryStage.setScene(new Scene(root));
    	primaryStage.show();
    }

    @FXML
    public void loggedIn(ActionEvent event) throws IOException {
    	Stage stage = (Stage) gobackbutton.getScene().getWindow();
    	stage.close();
    	Stage primaryStage = new Stage();
    	Parent root = FXMLLoader.load(getClass().getResource("userView.fxml"));
    	primaryStage.setTitle("Home");
    	primaryStage.setScene(new Scene(root));
    	primaryStage.show();
    }
    

}
