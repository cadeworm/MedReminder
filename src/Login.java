import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Login extends Application
{

	private static String workingDirectory;
	private static String inFolder;
	protected static User currentUser;
	
	public static void main(String[] args)
	{
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception
	{	
		Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
		
		Scene scene = new Scene(root, 800, 600);
		
		stage.setTitle("Medication Reminder");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void setUser(User aUser)
	{
		currentUser = aUser;
	}
	
	public static User getUser()
	{
		return currentUser;
	}
	
	public static void setWorkingDirectory(String dir)
	{
		workingDirectory = dir;
	}
	
	public static void setFolder(String fol)
	{
		inFolder = fol;
	}
	
	public static String getWorkingDirectory()
	{
		return workingDirectory;
	}
	
	public static String getFolder()
	{
		return inFolder;
	}

}
