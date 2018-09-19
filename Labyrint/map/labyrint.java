package map;

import java.io.File;

import blocks.Block;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class labyrint extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		Map map = MapInterpreter.interpretMap(new File("map.txt"));

		Scene scene = new Scene(map, map.getWidth(), map.getHeight());

		primaryStage.setScene(scene);
		MapSolver(map.getStartY(), map.getStartX(), map);
		primaryStage.show();
		
	}


	private void MapSolver(int startY, int startX, Map map) {
		// TODO Auto-generated method stub
		//Temporär tills jag fattar hur jag kopplar Mapsolver till denna ;(
	}


	public static void main(String[] args) {
		launch();
	}

}
