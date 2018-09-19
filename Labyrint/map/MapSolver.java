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
		
		/* g�r x och y till start blockets koordinater*/
		return false;
	}
}

/*
 * M�ste h�mta map fr�n mainmetoden.
 * rekursivt genom att returna en metod som sean returnar en s� sig sj�lv.
 * 
 *Problem att koppla Mapsolver till application... minns inte alls...
 *
 *ifsatser 
 *
 * if(blocket du �r p� == goalblock){ return true;}
 * else if(blocket v�nster == open){ flytta dit return mapsolver();}
 * else if( blocket upp == open){ flytta dit return mapsolver();}
 * else if(blocket h�ger == open){flytta dit return mapsolver();}
 * else if(blocket ner == open){flytta dit return mapsolver();}
 * 
 * minnes array
 * 
 * array<block> visited = new array<block>();
 * 
 * N�r man flyttar till ett nytt block l�ggs detta till i arrayen. ska f�rhindra att man fastnar i rum.
 * 
 * 
 * 
 * 
 */