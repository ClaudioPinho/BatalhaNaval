package com.FrozenBits;

public class Map {
	
	private char[][] mapPlayer1, mapPlayer2;
	
	private char waterTile = '\u2591';
//	private char waterTile = '~';
//	private char shipSpace = '-';
	private char shipSpace = '\u25A0';
	
	
	public Map(){
		
		mapPlayer1 = new char[10][10];
		mapPlayer2 = new char[10][10];
		fillMaps();
		
	}
	
	//Prints the entire map
	public void drawMap(boolean isP1){
	    char[][] mapToDraw = isP1 ? mapPlayer1 : mapPlayer2;
	    for (int y = 0; y < 10; y++){
	    	if (y == 0) System.out.println("   A  B  C  D  E  F  G  H  I  J ");
	    	for (int x = 0; x < 10; x++){
	    		if (x == 0) System.out.printf("%2d",y+1);
	    		System.out.printf(" %c ", mapToDraw[x][y]);
	    	}
	        System.out.printf("\n");
	    }
	}
	

	
	//Fills maps with water
	public void fillMaps(){
		for (int x = 0; x < 10; x++){
			for (int y = 0; y < 10; y++){
				mapPlayer1[x][y] = waterTile;
				mapPlayer2[x][y] = waterTile;
			}
		}				
	}
	
	public void addShip(int[] pos, Ship type, Ship owner){
		
		
		
	}
	
	public boolean addShip(int[] pos, Options type, int owner, char rotation){
		char[][] mapToAdd = (owner == Main.PLAYER1 ? mapPlayer1:mapPlayer2);
		int x = pos[0],
			y = pos[1];
		boolean success = false;
		
		if(rotation == '\0')
			success = addToArray(mapToAdd, x, y, Ship.SINGLESHIP);
			
		if(rotation == 'N' || rotation == 'n'){
			if(type == Options.TWOSHIP)
				success = addToArray(mapToAdd, x, y, Ship.DOUBLESHIP_N);
			if(type == Options.THREESHIP)
				success = addToArray(mapToAdd, x, y, Ship.TRIPLE_N);
			if(type == Options.FOURTHSHIP)
				success = addToArray(mapToAdd, x, y, Ship.QUADRUPLE_N);
			if(type == Options.FITHSHIP)
				success = addToArray(mapToAdd, x, y, Ship.QUINTUPLE_N);
		}
		if(rotation == 'S' || rotation == 's'){
			if(type == Options.TWOSHIP)
				success = addToArray(mapToAdd, x, y, Ship.DOUBLESHIP_S);
			if(type == Options.THREESHIP)
				success = addToArray(mapToAdd, x, y, Ship.TRIPLE_S);
			if(type == Options.FOURTHSHIP)
				success = addToArray(mapToAdd, x, y, Ship.QUADRUPLE_S);
			if(type == Options.FITHSHIP)
				success = addToArray(mapToAdd, x, y, Ship.QUINTUPLE_S);
		}
		if(rotation == 'E' || rotation == 'e'){
			if(type == Options.TWOSHIP)
				success = addToArray(mapToAdd, x, y, Ship.DOUBLESHIP_E);
			if(type == Options.THREESHIP)
				success = addToArray(mapToAdd, x, y, Ship.TRIPLE_E);
			if(type == Options.FOURTHSHIP)
				success = addToArray(mapToAdd, x, y, Ship.QUADRUPLE_E);
			if(type == Options.FITHSHIP)
				success = addToArray(mapToAdd, x, y, Ship.QUINTUPLE_E);
		}
		if(rotation == 'O' || rotation == 'o'){
			if(type == Options.TWOSHIP)
				success = addToArray(mapToAdd, x, y, Ship.DOUBLESHIP_W);
			if(type == Options.THREESHIP)
				success = addToArray(mapToAdd, x, y, Ship.TRIPLE_W);
			if(type == Options.FOURTHSHIP)
				success = addToArray(mapToAdd, x, y, Ship.QUADRUPLE_W);
			if(type == Options.FITHSHIP)
				success = addToArray(mapToAdd, x, y, Ship.QUINTUPLE_W);
		}
		
		return success;
	}
	
	//Creates a temporary array to verify if ship can fit on it if yes then return confirmation
	public boolean addToArray(char[][] array, int x, int y, char[][] ship){
		boolean success = true;
		char[][] tempArray = array;
		System.out.printf("%c in %d,%d \n",tempArray[x][y-1], x, y-1);
		//Verify if a ship or any of it's space is being overwritten
		if(tempArray[x][y-1] != Ship.OCCUPIEDSPACE && tempArray[x][y-1] != Ship.SHIPSPACE){
			for(int y2 = 0; y2 < 7; y2++){
				for(int x2 = 0; x2 < 7; x2++){
					try{
						if(ship[x2][y2] != '0'){
							char toCheck = tempArray[(x + x2)-2][(y + y2)-3];
							//If its not a ship
							if(toCheck != shipSpace){
								//If space is not being ocuppied by other ship
								if(toCheck != Ship.OCCUPIEDSPACE){
									tempArray[(x + x2)-2][(y + y2)-3] = ship[x2][y2];
								} else {
									if(ship[x2][y2] == Ship.OCCUPIEDSPACE){
										tempArray[(x + x2)-2][(y + y2)-3] = ship[x2][y2];
									} else {
										System.out.println("Espaço já ocupado por outro navio!");
										success = !success;
										break;
									}
								}
							}
						}
					} catch (IndexOutOfBoundsException e){}
				}
			}
			if(success)array = tempArray;
		}else {
			System.out.println("Posição Ocupada!");
			success = !success;
		}
		return success;
	}

}
