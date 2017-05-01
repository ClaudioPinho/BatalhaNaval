package com.FrozenBits;

public class Ship {
	
	private static final char shipSpace = '\u25A0';
	
	public static char[][] DOUBLESHIP_N = {
			{'0','0','0','0','0'},
			{'0','0', shipSpace,'0','0'},
			{'0','0', shipSpace,'0','0'},
			{'0','0','0','0','0'},
			{'0','0','0','0','0'}
	};
	
	public static char[][] DOUBLESHIP_S = {
			{'0','0','0','0','0'},
			{'0','0','0','0','0'},
			{'0','0', shipSpace,'0','0'},
			{'0','0', shipSpace,'0','0'},
			{'0','0','0','0','0'}
	};
	
	public static char[][] DOUBLESHIP_E = {
			{'0','0','0','0','0'},
			{'0','0','0','0','0'},
			{'0','0', shipSpace, shipSpace,'0'},
			{'0','0','0','0','0'},
			{'0','0','0','0','0'}
	};
	
	public static char[][] DOUBLESHIP_W = {
			{'0','0','0','0','0'},
			{'0','0','0','0','0'},
			{'0', shipSpace, shipSpace,'0','0'},
			{'0','0','0','0','0'},
			{'0','0','0','0','0'}
	};
	
	public static char[][] TRIPLE_N = {
			{'0','0','0','0','0'},
			{'0','0', shipSpace,'0','0'},
			{'0','0', shipSpace,'0','0'},
			{'0','0', shipSpace,'0','0'},
			{'0','0','0','0','0'}
	};
	
	public static char[][] TRIPLE_S = TRIPLE_N;
	
	public static char[][] TRIPLE_E = {
			{'0','0','0','0','0'},
			{'0','0','0','0','0'},
			{'0', shipSpace, shipSpace, shipSpace,'0'},
			{'0','0','0','0','0'},
			{'0','0','0','0','0'}
	};
	
	public static char[][] TRIPLE_W = TRIPLE_E;
	
	public static char[][] QUADRUPLE_N = {
			{'0','0','0','0','0'},
			{'0','0',shipSpace,'0','0'},
			{'0',shipSpace,shipSpace,shipSpace,'0'},
			{'0','0','0','0','0'},
			{'0','0','0','0','0'}
	};
	
	public static char[][] QUADRUPLE_S = {
			{'0','0','0','0','0'},
			{'0','0','0','0','0'},
			{'0',shipSpace,shipSpace,shipSpace,'0'},
			{'0','0',shipSpace,'0','0'},
			{'0','0','0','0','0'}
	};
	
	public static char[][] QUADRUPLE_E = {
			{'0','0','0','0','0'},
			{'0','0',shipSpace,'0','0'},
			{'0','0',shipSpace,shipSpace,'0'},
			{'0','0',shipSpace,'0','0'},
			{'0','0','0','0','0'}
	};
	
	public static char[][] QUADRUPLE_W = {
			{'0','0','0','0','0'},
			{'0','0',shipSpace,'0','0'},
			{'0',shipSpace,shipSpace,'0','0'},
			{'0','0',shipSpace,'0','0'},
			{'0','0','0','0','0'}
	};
	
	public static char[][] QUINTUPLE_N = {
			{'0','0',shipSpace,'0','0'},
			{'0','0',shipSpace,'0','0'},
			{'0','0',shipSpace,'0','0'},
			{'0','0',shipSpace,'0','0'},
			{'0','0',shipSpace,'0','0'}
	};
	
	public static char[][] QUINTUPLE_S = QUINTUPLE_N;
	
	public static char[][] QUINTUPLE_E = {
			{'0','0','0','0','0'},
			{'0','0','0','0','0'},
			{shipSpace,shipSpace,shipSpace,shipSpace,shipSpace},
			{'0','0','0','0','0'},
			{'0','0','0','0','0'}
	};
	
	public static char[][] QUINTUPLE_W = QUINTUPLE_E;
	
}
