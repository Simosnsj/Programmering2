package v36;



import java.util.ArrayList;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Upg8 extends Application {


	public static final double WIDTH = 600;
	public static final double HEIGHT = 600;

	private ArrayList<KeyCode> keysPressed = new ArrayList<KeyCode>();
	private AnimationTimer gameLoop;
	private Group root = new Group();

	public void start(Stage primaryStage) throws Exception {

		Ring();

		primaryStage.setScene(new Scene(root, WIDTH, HEIGHT));
		primaryStage.show();

	}


	private void Ring(){

		int rings = 10;

		for (int i = rings; i >= 0; i--) {

			double radius = 20;

			Circle cir = new Circle(radius);

			int r = (int) (Math.random() * 255);
			int g = (int) (Math.random() * 255);
			int b = (int) (Math.random() * 255);
			cir.setFill(Color.rgb(r, g, b));

			cir.setTranslateX((WIDTH-radius)*Math.random());


			cir.setTranslateY((HEIGHT-radius)*Math.random());

			root.getChildren().add(cir);


		}
	}





	public static void main(String[] args) {
		launch(args);
	}


}

