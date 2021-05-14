package javafxpratico;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class JavaFXProjeto extends Application {
public static void main(String[] args) {
launch(); 
}
@Override
public void start(Stage palco) throws Exception { 
	FXMLLoader loader = new FXMLLoader();
	 loader.setLocation(getClass().getResource("/javafxml/Telaimovel_usado.fxml"));
	 Pane root=new Pane();
	 root=loader.load();
	Scene scene= new Scene(root);
	palco.setScene(scene);
	palco.show();
}
}