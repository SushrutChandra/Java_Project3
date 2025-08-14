import java.awt.Color;
import GridTools.MyGrid;

public class FlagMaker {
	static final int codeIndonesia = 1;
	static final int codeLithuania = 2;
	static final int codeRwanda = 3;
	static final int codeMalta = 4;
	static final int codeAfghanistan = 5;
	static final int codeEritrea = 6;
	static final int codeMacedonia = 7;
	static final int codeBahamas = 8;
	static final int codeZimbabwe = 9;



	public static void drawFlag(MyGrid grid, int countryCode) {

		int height = grid.getHt();
		int width = grid.getWd();

		switch (countryCode) {
		case codeIndonesia: 
			if (height % 2 == 0) {
				for (int row = 0; row < height; row++) {
					for (int col = 0; col < width; col++) {
						if (row < height/2) {
							grid.setColor(row, col, Color.red);
						} else {
							grid.setColor(row, col, Color.white);
						}
					}
				} 
			} else { 
				printErrorFlag(grid);
			}
			break;

		case codeLithuania:
			if (height % 3 == 0) {
				for (int row = 0; row < height; row++) {
					for (int col = 0; col < width; col++) {
						if (row < height/3) {
							grid.setColor(row, col, Color.yellow);
						}  else if (row < 2 * height / 3) {
							grid.setColor(row, col, Color.green);
						}  else {
							grid.setColor(row, col, Color.red);
						} 
					}
				} 
				break;
			} else { 
				printErrorFlag(grid); 
			}
			break;

		case codeRwanda:
			if (height % 4 == 0) {
				for (int row = 0; row < height; row++) {
					for (int col = 0; col < width; col++) {
						if (row < height/2) {
							grid.setColor(row, col, Color.blue);
						}  else if (row < 3 * height / 4) {
							grid.setColor(row, col, Color.yellow);
						}  else {
							grid.setColor(row, col, Color.green);
						} 
					}
				} 
				break;
			} else { 
				printErrorFlag(grid); 
			}
			break;

		case codeMalta:
			for (int row = 0; row < height; row++) {
				for (int col = 0; col < width; col++) { // check
					if (col < width/2) {
						grid.setColor(row, col, Color.white);
					} else {
						grid.setColor(row, col, Color.red);
					}
				}
			} 

			break;
			

		case codeAfghanistan:
			if (height % 3 == 0) {
				for (int row = 0; row < height; row++) {
					for (int col = 0; col < width; col++) { // check
						if (col < width/3) {
							grid.setColor(row, col, Color.black);
						} else if (col < 2* width/3) {
							grid.setColor(row, col, Color.red);
						}
						else {
							grid.setColor(row, col, Color.green);
						}
					}
				}
			} else {
				printErrorFlag(grid);
			}
			break; 

		case codeEritrea:
			for (int row = 0; row < height; row++) {
				for (int col = 0; col < width; col++) { // check
					if (row <= height / 2) { // top half
						if  (col < 4 * (row + 1)) {
							grid.setColor(row, col, Color.red);
						} else {
							grid.setColor(row, col, Color.green);							
						}
					} else { // bottom half
						if  (col < 4 * (height - row)) {
							grid.setColor(row, col, Color.red);
						} else {
							grid.setColor(row, col, Color.blue);							
						}
					}
				} 
			}
			break;

		case codeMacedonia:
			if ((height % 2 == 0) && (height >= 8)) {
				for (int row = 0; row < height; row++) {
					for (int col = 0; col < width; col++) {
						grid.setColor(row, col, Color.red);							

						if ((row == height/2) || (row == height/2 - 1)) {
							grid.setColor(row, col, Color.yellow);							
						} 
						if ((col == width/2) || (col == width/2 - 1)) {
							grid.setColor(row, col, Color.yellow);							
						} 
						if ((col == 2*row) || (col == 2*row + 1)) {
							grid.setColor(row, col, Color.yellow);							
						} 
						if ((col == width - (2*row + 1)) || (col == width - (2*row + 2))) {
							//if ((col == 2*(height - row - 1)) || (col == 2*(height - row -1)+ 1)) {
							grid.setColor(row, col, Color.yellow);							
						} 

						if (((row >= height/2 -2) && (row <= height/2 + 1))
								&& ((col >= width/2 - 4) && (col <= width/2 + 3))) {
							grid.setColor(row, col, Color.yellow);							
						}						
					} 
				}
			} else {
				printErrorFlag(grid);
			}
			break;

		case codeBahamas:
			if (height % 3 == 0 && height % 2 == 1) {
				for (int row = 0; row < height; row++) {
					for (int col = 0; col < width; col++) {
						if (row < height/3) {
							grid.setColor(row, col, Color.blue);
						}  else if (row < 2 * height / 3) {
							grid.setColor(row, col, Color.yellow);
						}  else {
							grid.setColor(row, col, Color.blue);
						}
					}
				}
				for (int row = 0; row < height; row++) {
					for (int col = 0; col < width; col++) {
						if (col <= row   && row <= height/2) {
							grid.setColor(row, col, Color.black);
						}
						if (col < height - row && row > height/2) {
							grid.setColor(row, col, Color.black);
						}
					}
				}
			} else { 
				printErrorFlag(grid); 
			}
			break;

		case codeZimbabwe:
			if (height % 7 == 0) {
				for (int row = 0; row < height; row++) {
					for (int col = 0; col < width; col++) {
						if (row < height/7) {
							grid.setColor(row, col, Color.green);
						}  else if (row < 2 * height / 7) {
							grid.setColor(row, col, Color.yellow);
						} else if (row < 3 * height / 7) {
							grid.setColor(row, col, Color.red);
						} else if (row < 4 * height / 7) {
							grid.setColor(row, col, Color.black);
						} else if (row < 5 * height / 7) {
							grid.setColor(row, col, Color.red);
						} else if (row < 6 * height / 7) {
							grid.setColor(row, col, Color.yellow);
						} else if (row < 7 * height / 7) {
							grid.setColor(row, col, Color.green);
						}
					}
				} 
				if (height % 7 == 0) {
					for (int row = 0; row < height; row++) {
						for (int col = 0; col < width; col++) {
							if (col <= row   && row < height/2) {
								grid.setColor(row, col, Color.white);
							}
							if (col <= height - row - 1 && row > height/2 - 1) {
								grid.setColor(row, col, Color.white);
							}
						}
					} 
				}
				break;
			} else { 
				printErrorFlag(grid); 
			}
			break;

		default:
			printErrorFlag(grid);

		}


	}

	private static void printErrorFlag(MyGrid grid) {
		int height = grid.getHt();
		int width = grid.getWd();

		for (int row = 0; row < height; row++) {
			for (int col = 0; col < width; col++) {
				grid.setColor(row, col, Color.white);
			}
		}
		grid.setColor(0, 0, Color.red);
		grid.setColor(0, width - 1, Color.yellow);
		grid.setColor(height - 1, width - 1, Color.green);
		grid.setColor(height - 1, 0, Color.blue);

	}
}

