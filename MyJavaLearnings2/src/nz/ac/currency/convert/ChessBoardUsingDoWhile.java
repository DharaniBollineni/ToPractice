package nz.ac.currency.convert;

import ecs100.UI;

public class ChessBoardUsingDoWhile {

	public ChessBoardUsingDoWhile() {
		UI.initialise();
		UI.addButton("ChessBord", this::drawCBordUsingDo);
	}

	public void drawCBordUsingDo() {
		UI.clearGraphics();
		int rows = UI.askInt("Enter no of rows");
		int cols = UI.askInt("Enter no of colums");

		if (rows == 0 || cols == 0) {
			UI.println("Number of rows and coloms should not be zero");
		} else {
			int diam = 20;
			int row = 0;

			do {
				int col = 0;
				do {
					int x = 20 + col * diam;
					int y = 50 + row * diam;
					if ((row + col) % 2 == 0) {
						UI.fillRect(x, y, diam, diam);

					} else {
						UI.drawRect(x, y, diam, diam);

					}
					col++;

				} while (col < cols);
				row++;
			} while (row < rows);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ChessBoardUsingDoWhile();
	}
}
