package dad.javafx.bf;



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
	private View root;
	private Scene scene;
	@Override
	public void start(Stage primaryStage) throws Exception {
		root = new View();

		scene = new Scene(root, 600, 300);

		primaryStage.setTitle("Buscar y remplazar");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);	
	}

}
