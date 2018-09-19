package map;

import blocks.Block;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class MapSolver extends Block {

	int x;
	int y;
	public boolean MapSolver(int y, int x, Map map, boolean win) {
		int radius = (int) (Block.SIZE/2);
		Circle cir = new Circle(Block.SIZE/2);
		
		cir.setFill(Color.YELLOWGREEN);
		cir.setTranslateX(Block.SIZE*x + radius);
		cir.setTranslateY(Block.SIZE*y - radius);
		
		this.getChildren().add(cir);
		
		/* gör x och y till start blockets koordinater*/
		return false;
	}
}

/*
 * Måste hämta map från mainmetoden.
 * rekursivt genom att returna en metod som sean returnar en så sig själv.
 * 
 *Problem att koppla Mapsolver till application... minns inte alls...
 *
 *ifsatser 
 *
 * if(blocket du är på == goalblock){ return true;}
 * else if(blocket vänster == open){ flytta dit return mapsolver();}
 * else if( blocket upp == open){ flytta dit return mapsolver();}
 * else if(blocket höger == open){flytta dit return mapsolver();}
 * else if(blocket ner == open){flytta dit return mapsolver();}
 * 
 * minnes array
 * 
 * array<block> visited = new array<block>();
 * 
 * När man flyttar till ett nytt block läggs detta till i arrayen. ska förhindra att man fastnar i rum.
 * 
 * 
 * 
 * 
 */