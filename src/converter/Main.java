package converter;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;

/**
 * a Main class for JavaFX
 * @author Thanaphon Keawjam
 */
public class Main extends Application {
	
	/**
	 * Start Program
	 * @param stage is stage of Application.
	 */
	@Override
	public void start(Stage stage) {
		try {
			Parent root = (Parent)FXMLLoader.load(getClass().getResource("ConverterUI.fxml"));
			Scene scene = new Scene(root);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setTitle("Converter");
			stage.setScene(scene);
			stage.sizeToScene();
			stage.show();
		} catch(Exception e) {
			System.out.println("Exception creating scene: " + e.getMessage());
		}
	}
	
	/**
	 * Initialize.
	 * @param args is use for run Application.
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
