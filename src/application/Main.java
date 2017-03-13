package application;
import org.opencv.core.Core;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class Main extends Application{
	public static final float MIN_TEMP = 26.0f;
	public static final float MAX_TEMP = 36.0f;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("MainLayout.fxml"));
			BorderPane root = (BorderPane) loader.load();
			Scene scene = new Scene(root, 1240, 1080);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("ThesisProject");
			primaryStage.setScene(scene);
			primaryStage.show();			
			MainController controller = loader.getController();
			primaryStage.setOnCloseRequest((new EventHandler<WindowEvent>() {
				public void handle(WindowEvent we)
				{
					controller.setClosed();
				}
			}));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME); //load OpenCV		
		launch(args);
	}
	
	
}
