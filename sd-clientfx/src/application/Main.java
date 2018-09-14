package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


public class Main extends Application {
	private Label nomeLabel = new Label();
	private TextField nome = new TextField();
	private Button enviar = new Button("Enviar");
	private OkHttpClient client = new OkHttpClient();
	private Label idadeLabel = new Label();
	
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			
			VBox box = new VBox();

			nomeLabel.setText("Nome:");
			
			enviar.setOnAction(new EventHandler<ActionEvent>() {
				
				public void handle(ActionEvent event) {
					Request request = new Request.Builder().url("http://localhost:8080/cliente?value=" + nome.getText()).build();
					
					Call call = client.newCall(request);
				    try {
						Response response = call.execute();
						idadeLabel.setText("A idade de " + nome.getText() + " é: " + response.body().string());
					} catch (IOException e) {
						e.printStackTrace();
					}
					
				}
			});
			
			box.getChildren().add(nomeLabel);
			box.getChildren().add(nome);
			box.getChildren().add(enviar);
			box.getChildren().add(idadeLabel);
			
			root.setCenter(box);
			
			Scene scene = new Scene(root,400,400);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
