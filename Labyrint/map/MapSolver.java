package map;

import java.util.ArrayList;

import blocks.Block;
import blocks.ClosedBlock;
import blocks.GoalBlock;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class MapSolver extends Block {
	static int x;
	static int y;
	static int steps;
	static Map map;
	static boolean win = false;
	static ArrayList<Block> visitedblocks = new ArrayList<Block>();
	static ArrayList<Node> path = new ArrayList<Node>();

	public static void MapSolver(Map map) {

		MapSolver.map = map;
		x = map.getStartX();
		y = map.getStartY();

		solve (x,y,1);
		solve (x,y,2);
		solve (x,y,3);
		solve (x,y,4);


	}
	static int p = 0;	
	public static void showNextPath() {
		
		if(p<path.size()) {
			
			
			map.getChildren().add(path.get(p));
			p += 1;
		}
	}
	
	public static void solve(int x, int y, int dir){
		Block b = map.getBlock(x, y);
		if(visitedblocks.contains(b)){
			return;}
		visitedblocks.add(b);
		if(win) return;
		if(b instanceof ClosedBlock || b == null || win ) {
			return;
		}
		if(b instanceof GoalBlock) {
			win = true;
			System.out.println("win!");
			System.out.println(steps);;
			return;
		}
		steps++;
		
		int radius = (int) (Block.SIZE/2);
		Circle cir = new Circle(Block.SIZE/2);
		cir.setFill(Color.YELLOWGREEN);
		cir.setTranslateX(Block.SIZE*x + radius);
		cir.setTranslateY(Block.SIZE*y + radius);
		path.add(cir);
		
		if(dir ==1) { // upp
			solve(x, y-1, 1); //upp
			solve(x+1, y, 2); //höger
			solve(x-1, y, 4); //vänster


		}
		if(dir ==2) { // höger
			solve(x+1, y, 2); //höger
			solve(x, y-1, 1); //upp
			solve(x, y+1, 3); //ner

		}
		if(dir ==3) { // ner
			solve(x, y+1, 3); //ner
			solve(x+1, y, 2); //höger
			solve(x-1, y, 4); //vänster

		}
		if(dir ==4) { // vänster
			solve(x-1, y, 4); //vänster
			solve(x, y-1, 1); //upp
			solve(x, y+1, 3); //ner
		}

		if(!win) {
			steps--;
			path.remove(cir); // ta bort om man vill se exakt hur den rör sig.
		}

	}
}
