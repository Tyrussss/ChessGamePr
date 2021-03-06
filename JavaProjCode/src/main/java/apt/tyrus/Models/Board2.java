package apt.tyrus.Models;

import apt.tyrus.LogicCheck.Rook;
import apt.tyrus.LogicCheck.Spot;

public class Board2 {
    public class Board {
        Spot[][] boxes;

        public Board() {
            this.resetBoard();
        }

        public Spot getBox(int x, int y) throws Exception {

            if (x < 0 || x > 7 || y < 0 || y > 7) {
                throw new Exception("Index out of bound");
            }

            return boxes[x][y];
        }

        public void resetBoard() {
            boxes[0][0] = new Spot(0, 0, new Rook(true));
        }
    }
}
