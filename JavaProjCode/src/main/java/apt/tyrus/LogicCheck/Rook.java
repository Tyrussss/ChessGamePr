package apt.tyrus.LogicCheck;

public class Rook extends Piece {
    public Rook(boolean white) {
        super(white);
    }

    //
    @Override
    public boolean canMove(Board board, Spot start, Spot end) {
        // we can't move the piece to a spot that has
        // a piece of the same colour
        if (end.getPiece().isWhite() == this.isWhite()) {
            return false;
        }

        //all possible moves in the up
        for (int i = 7 - start.getX(); i <= 7 ; i++) {
            Spot[] validSpot = new Spot[0];
            if (end.getPiece() == null) {
                return true;
            } else if (end.getPiece() != null){
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public void movingList(Board board, Spot start, Spot end){
        if (end.getPiece().isWhite() == this.isWhite()) {
            System.out.println("Invalid Move!!!");
        }

        //all possible moves in the up
        for (int i = 7 - start.getX(); i <= 7 ; i++) {

            if (end.getPiece() == null) {
                //i = end.getX();

                return Spot (end);
            } else if (end.getPiece() != null){
                return validSpot();
            } else {
                System.out.println("Invalid Move!!!");
            }
        }
        System.out.println("Invalid Move!!!");
    }
}
