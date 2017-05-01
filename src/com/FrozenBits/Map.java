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
	
	public void addShip(int[] pos, Options type, int owner, char rotation){
		char[][] mapToAdd = (owner == Main.PLAYER1 ? mapPlayer1:mapPlayer2);
		int x = pos[0],
			y = pos[1];
		if(rotation == 'N' || rotation == 'n'){
			if(type == Options.TWOSHIP){
				mapToAdd[0][0] = shipSpace;
					for(int posX = 0; x < 5; x++){
						for(int posY = 0; y < 5; y++){
							try {
								
								if(Ship.DOUBLESHIP_N[posX][posY] != '0')
									mapToAdd[posX - 2][posY - 2] = shipSpace;
								
							} catch (IndexOutOfBoundsException e){
								System.out.println("error!");
							}
						}
					}
				
				/*
				for(int posX = 0; x < 5; x++){
					for(int posY = 0; y < 5; y++){
						if(Ship.DOUBLESHIP_N[posX][posY] != '0'){
							
							try {
								mapToAdd[posX - 2][posY - 2] = shipSpace;
							} catch (IndexOutOfBoundsException e){}
							
						}
					}
				}
				*/
			}
			
		}
		
	}

}
