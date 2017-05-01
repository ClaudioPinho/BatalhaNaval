package com.FrozenBits;

public class Ship {
	
	public static final char SHIPSPACE = '\u25A0';
	public static final char OCCUPIEDSPACE = '\u2592';
	//private static final char shipSpace = 'S';
	
	/*	Orientação
	 * 		 O
	 * 		/\
	 * 	 	 |
	 * 		 |
	 *  N<--- --->S
	 *  	 |
	 *		 | 
	 * 		\/
	 * 		 E
	 */
	
	public static char[][] SINGLESHIP = {
			{'0','0','0','0','0'},
			{'0',OCCUPIEDSPACE, OCCUPIEDSPACE,OCCUPIEDSPACE,'0'},
			{'0', OCCUPIEDSPACE, SHIPSPACE, OCCUPIEDSPACE,'0'},
			{'0',OCCUPIEDSPACE,OCCUPIEDSPACE,OCCUPIEDSPACE,'0'},
			{'0','0','0','0','0'}
	};
	
	public static char[][] DOUBLESHIP_N = {
			{'0','0','0','0','0'},
			{OCCUPIEDSPACE,OCCUPIEDSPACE,OCCUPIEDSPACE,OCCUPIEDSPACE,'0'},
			{OCCUPIEDSPACE, SHIPSPACE, SHIPSPACE, OCCUPIEDSPACE,'0'},
			{OCCUPIEDSPACE,OCCUPIEDSPACE,OCCUPIEDSPACE,OCCUPIEDSPACE,'0'},
			{'0','0','0','0','0'}
	};
	
	public static char[][] DOUBLESHIP_S = {
			{'0','0','0','0','0'},
			{'0',OCCUPIEDSPACE,OCCUPIEDSPACE,OCCUPIEDSPACE,OCCUPIEDSPACE},
			{'0',OCCUPIEDSPACE, SHIPSPACE, SHIPSPACE,OCCUPIEDSPACE},
			{'0',OCCUPIEDSPACE, OCCUPIEDSPACE,OCCUPIEDSPACE,OCCUPIEDSPACE},
			{'0','0','0','0','0'}
	};
	
	public static char[][] DOUBLESHIP_E = {
			{'0','0','0','0','0'},
			{'0',OCCUPIEDSPACE,OCCUPIEDSPACE,OCCUPIEDSPACE,'0'},
			{'0',OCCUPIEDSPACE,SHIPSPACE,OCCUPIEDSPACE,'0'},
			{'0',OCCUPIEDSPACE,SHIPSPACE,OCCUPIEDSPACE,'0'},
			{'0',OCCUPIEDSPACE,OCCUPIEDSPACE,OCCUPIEDSPACE,'0'}
	};
	
	public static char[][] DOUBLESHIP_W = {
			{'0',OCCUPIEDSPACE,OCCUPIEDSPACE,OCCUPIEDSPACE,'0'},
			{'0',OCCUPIEDSPACE,SHIPSPACE,OCCUPIEDSPACE,'0'},
			{'0',OCCUPIEDSPACE,SHIPSPACE,OCCUPIEDSPACE,'0'},
			{'0',OCCUPIEDSPACE,OCCUPIEDSPACE,OCCUPIEDSPACE,'0'},
			{'0','0','0','0','0'}
	};
	
	public static char[][] TRIPLE_N = {
			{'0',OCCUPIEDSPACE,OCCUPIEDSPACE,OCCUPIEDSPACE,'0'},
			{'0',OCCUPIEDSPACE, SHIPSPACE,OCCUPIEDSPACE,'0'},
			{'0',OCCUPIEDSPACE, SHIPSPACE,OCCUPIEDSPACE,'0'},
			{'0',OCCUPIEDSPACE, SHIPSPACE,OCCUPIEDSPACE,'0'},
			{'0',OCCUPIEDSPACE,OCCUPIEDSPACE,OCCUPIEDSPACE,'0'}
	};
	
	public static char[][] TRIPLE_S = TRIPLE_N;
	
	public static char[][] TRIPLE_E = {
			{'0','0','0','0','0'},
			{OCCUPIEDSPACE,OCCUPIEDSPACE,OCCUPIEDSPACE,OCCUPIEDSPACE,OCCUPIEDSPACE},
			{OCCUPIEDSPACE, SHIPSPACE, SHIPSPACE, SHIPSPACE,OCCUPIEDSPACE},
			{OCCUPIEDSPACE,OCCUPIEDSPACE,OCCUPIEDSPACE,OCCUPIEDSPACE,OCCUPIEDSPACE},
			{'0','0','0','0','0'}
	};
	
	public static char[][] TRIPLE_W = TRIPLE_E;
	
	public static char[][] QUADRUPLE_N = {
			{'0',OCCUPIEDSPACE,OCCUPIEDSPACE,OCCUPIEDSPACE,'0'},
			{'0',OCCUPIEDSPACE,SHIPSPACE,OCCUPIEDSPACE,'0'},
			{OCCUPIEDSPACE,SHIPSPACE,SHIPSPACE,OCCUPIEDSPACE,'0'},
			{'0',OCCUPIEDSPACE,SHIPSPACE,OCCUPIEDSPACE,'0'},
			{'0',OCCUPIEDSPACE,OCCUPIEDSPACE,OCCUPIEDSPACE,'0'}
	};
	
	public static char[][] QUADRUPLE_S = {
			{'0',OCCUPIEDSPACE,OCCUPIEDSPACE,OCCUPIEDSPACE,'0'},
			{'0',OCCUPIEDSPACE,SHIPSPACE,OCCUPIEDSPACE,'0'},
			{'0',OCCUPIEDSPACE,SHIPSPACE,SHIPSPACE,OCCUPIEDSPACE},
			{'0',OCCUPIEDSPACE,SHIPSPACE,OCCUPIEDSPACE,'0'},
			{'0',OCCUPIEDSPACE,OCCUPIEDSPACE,OCCUPIEDSPACE,'0'}
	};
	
	public static char[][] QUADRUPLE_E = {
			{'0','0','0','0','0'},
			{OCCUPIEDSPACE,OCCUPIEDSPACE,OCCUPIEDSPACE,OCCUPIEDSPACE,OCCUPIEDSPACE},
			{OCCUPIEDSPACE,SHIPSPACE,SHIPSPACE,SHIPSPACE,OCCUPIEDSPACE},
			{'0',OCCUPIEDSPACE,SHIPSPACE,OCCUPIEDSPACE,'0'},
			{'0',OCCUPIEDSPACE,OCCUPIEDSPACE,OCCUPIEDSPACE,'0'}
	};
	
	public static char[][] QUADRUPLE_W = {
			{'0',OCCUPIEDSPACE,OCCUPIEDSPACE,OCCUPIEDSPACE,'0'},
			{'0',OCCUPIEDSPACE,SHIPSPACE,OCCUPIEDSPACE,'0'},
			{OCCUPIEDSPACE,SHIPSPACE,SHIPSPACE,SHIPSPACE,OCCUPIEDSPACE},
			{OCCUPIEDSPACE,OCCUPIEDSPACE,OCCUPIEDSPACE,OCCUPIEDSPACE,OCCUPIEDSPACE},
			{'0','0','0','0','0'}
	};
	
	public static char[][] QUINTUPLE_N = {
			{'0','0','0','0','0','0','0'},
			{'0','0','0','0','0','0','0'},
			{OCCUPIEDSPACE,OCCUPIEDSPACE,OCCUPIEDSPACE,OCCUPIEDSPACE,OCCUPIEDSPACE,OCCUPIEDSPACE,OCCUPIEDSPACE},
			{OCCUPIEDSPACE,SHIPSPACE,SHIPSPACE,SHIPSPACE,SHIPSPACE,SHIPSPACE,OCCUPIEDSPACE},
			{OCCUPIEDSPACE,OCCUPIEDSPACE,OCCUPIEDSPACE,OCCUPIEDSPACE,OCCUPIEDSPACE,OCCUPIEDSPACE,OCCUPIEDSPACE},
			{'0','0','0','0','0','0','0'},
			{'0','0','0','0','0','0','0'}
	};
	
	public static char[][] QUINTUPLE_S = QUINTUPLE_N;
	
	public static char[][] QUINTUPLE_E = {
			{'0','0',OCCUPIEDSPACE,OCCUPIEDSPACE,OCCUPIEDSPACE,'0','0'},
			{'0','0',OCCUPIEDSPACE,SHIPSPACE,OCCUPIEDSPACE,'0','0'},
			{'0','0',OCCUPIEDSPACE,SHIPSPACE,OCCUPIEDSPACE,'0','0'},
			{'0','0',OCCUPIEDSPACE,SHIPSPACE,OCCUPIEDSPACE,'0','0'},
			{'0','0',OCCUPIEDSPACE,SHIPSPACE,OCCUPIEDSPACE,'0','0'},
			{'0','0',OCCUPIEDSPACE,SHIPSPACE,OCCUPIEDSPACE,'0','0'},
			{'0','0',OCCUPIEDSPACE,OCCUPIEDSPACE,OCCUPIEDSPACE,'0','0'}
	};
	
	public static char[][] QUINTUPLE_W = QUINTUPLE_E;
	
}
