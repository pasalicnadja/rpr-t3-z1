package ba.unsa.etf.rpr.tutorijal03;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("imenik.fxml"));
		loader.setController(new ImenikController);
		Parent root = loader.load();
		primaryStage.setTitle("Imenik");
		primaryStage.setScene(new Scene(root));
		primaryStage.show();
	}


	public static void main(String[] args) {
launch(args);
	}
}
