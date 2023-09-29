package chess;

import java.util.ArrayList;

class ReturnPiece {
	static enum PieceType {WP, WR, WN, WB, WQ, WK, 
		            BP, BR, BN, BB, BK, BQ};
	static enum PieceFile {a, b, c, d, e, f, g, h};
	
	PieceType pieceType;
	PieceFile pieceFile;
	int pieceRank;  // 1..8
	public String toString() {
		return ""+pieceFile+pieceRank+":"+pieceType;
	}
	public boolean equals(Object other) {
		if (other == null || !(other instanceof ReturnPiece)) {
			return false;
		}
		ReturnPiece otherPiece = (ReturnPiece)other;
		return pieceType == otherPiece.pieceType &&
				pieceFile == otherPiece.pieceFile &&
				pieceRank == otherPiece.pieceRank;
	}
}

class ReturnPlay {
	enum Message {ILLEGAL_MOVE, DRAW, 
				  RESIGN_BLACK_WINS, RESIGN_WHITE_WINS, 
				  CHECK, CHECKMATE_BLACK_WINS,	CHECKMATE_WHITE_WINS, 
				  STALEMATE};
	
	ArrayList<ReturnPiece> piecesOnBoard;
	Message message;
}

public class Chess {

	static ArrayList<ReturnPiece> pieces = new ArrayList<>();
	
	enum Player { white, black }
	
	/**
	 * Plays the next move for whichever player has the turn.
	 * 
	 * @param move String for next move, e.g. "a2 a3"
	 * 
	 * @return A ReturnPlay instance that contains the result of the move.
	 *         See the section "The Chess class" in the assignment description for details of
	 *         the contents of the returned ReturnPlay instance.
	 */
	
	
	/**
	 * This method should reset the game, and start from scratch.
	 */
	public static void start() {
		/* FILL IN THIS METHOD */
		pieces.clear();

		for (ReturnPiece.PieceFile pieceFile : ReturnPiece.PieceFile.values()){
            ReturnPiece whiteP = new ReturnPiece();
            whiteP.pieceFile = pieceFile;
            whiteP.pieceRank = 2;
            whiteP.pieceType = ReturnPiece.PieceType.WP;
            pieces.add(whiteP);

            ReturnPiece blackP = new ReturnPiece();
            blackP.pieceFile = pieceFile;
            blackP.pieceRank = 7;
            blackP.pieceType = ReturnPiece.PieceType.BP;
            pieces.add(blackP);

			if(pieceFile.equals(ReturnPiece.PieceFile.a)){
				ReturnPiece whiteRook1 = new ReturnPiece();
				whiteRook1.pieceFile = ReturnPiece.PieceFile.a;
				whiteRook1.pieceRank = 1;
				whiteRook1.pieceType = ReturnPiece.PieceType.WR;
				pieces.add(whiteRook1);
				
				ReturnPiece blackRook1 = new ReturnPiece();
				blackRook1.pieceFile = ReturnPiece.PieceFile.a;
				blackRook1.pieceRank = 8;
				blackRook1.pieceType = ReturnPiece.PieceType.BR;
				pieces.add(blackRook1);
			}
			if(pieceFile.equals(ReturnPiece.PieceFile.b)){
				ReturnPiece whiteNight1 = new ReturnPiece();
				whiteNight1.pieceFile = ReturnPiece.PieceFile.b;
				whiteNight1.pieceRank = 1;
				whiteNight1.pieceType = ReturnPiece.PieceType.WN;
				pieces.add(whiteNight1);

				ReturnPiece blackNight1 = new ReturnPiece();
				blackNight1.pieceFile = ReturnPiece.PieceFile.b;
				blackNight1.pieceRank = 8;
				blackNight1.pieceType = ReturnPiece.PieceType.BN;
				pieces.add(blackNight1);
			}
			if(pieceFile.equals(ReturnPiece.PieceFile.c)){
				ReturnPiece whiteBishop1 = new ReturnPiece();
				whiteBishop1.pieceFile = ReturnPiece.PieceFile.c;
				whiteBishop1.pieceRank = 1;
				whiteBishop1.pieceType = ReturnPiece.PieceType.WB;
				pieces.add(whiteBishop1);

				ReturnPiece blackBishop1 = new ReturnPiece();
				blackBishop1.pieceFile = ReturnPiece.PieceFile.c;
				blackBishop1.pieceRank = 8;
				blackBishop1.pieceType = ReturnPiece.PieceType.BB;
				pieces.add(blackBishop1);
			}
			if(pieceFile.equals(ReturnPiece.PieceFile.d)){
				ReturnPiece whiteQueen1 = new ReturnPiece();
				whiteQueen1.pieceFile = ReturnPiece.PieceFile.d;
				whiteQueen1.pieceRank = 1;
				whiteQueen1.pieceType = ReturnPiece.PieceType.WQ;
				pieces.add(whiteQueen1);

				ReturnPiece blackQueen1 = new ReturnPiece();
				blackQueen1.pieceFile = ReturnPiece.PieceFile.d;
				blackQueen1.pieceRank = 8;
				blackQueen1.pieceType = ReturnPiece.PieceType.BQ;
				pieces.add(blackQueen1);
			}
			if(pieceFile.equals(ReturnPiece.PieceFile.e)){
				ReturnPiece whiteKing1 = new ReturnPiece();
				whiteKing1.pieceFile = ReturnPiece.PieceFile.e;
				whiteKing1.pieceRank = 1;
				whiteKing1.pieceType = ReturnPiece.PieceType.WK;
				pieces.add(whiteKing1);

				ReturnPiece blackKing1 = new ReturnPiece();
				blackKing1.pieceFile = ReturnPiece.PieceFile.e;
				blackKing1.pieceRank = 8;
				blackKing1.pieceType = ReturnPiece.PieceType.BK;
				pieces.add(blackKing1);
			}
			if(pieceFile.equals(ReturnPiece.PieceFile.f)){
				ReturnPiece whiteBishop2 = new ReturnPiece();
				whiteBishop2.pieceFile = ReturnPiece.PieceFile.f;
				whiteBishop2.pieceRank = 1;
				whiteBishop2.pieceType = ReturnPiece.PieceType.WB;
				pieces.add(whiteBishop2);

				ReturnPiece blackBishop2 = new ReturnPiece();
				blackBishop2.pieceFile = ReturnPiece.PieceFile.f;
				blackBishop2.pieceRank = 8;
				blackBishop2.pieceType = ReturnPiece.PieceType.BB;
				pieces.add(blackBishop2);
			}
			if(pieceFile.equals(ReturnPiece.PieceFile.g)){
				ReturnPiece whiteNight2 = new ReturnPiece();
				whiteNight2.pieceFile = ReturnPiece.PieceFile.g;
				whiteNight2.pieceRank = 1;
				whiteNight2.pieceType = ReturnPiece.PieceType.WN;
				pieces.add(whiteNight2);

				ReturnPiece blackNight2 = new ReturnPiece();
				blackNight2.pieceFile = ReturnPiece.PieceFile.g;
				blackNight2.pieceRank = 8;
				blackNight2.pieceType = ReturnPiece.PieceType.BN;
				pieces.add(blackNight2);
			}
			if(pieceFile.equals(ReturnPiece.PieceFile.h)){
				ReturnPiece whiteRook2 = new ReturnPiece();
				whiteRook2.pieceFile = ReturnPiece.PieceFile.h;
				whiteRook2.pieceRank = 1;
				whiteRook2.pieceType = ReturnPiece.PieceType.WR;
				pieces.add(whiteRook2);

				ReturnPiece blackRook1 = new ReturnPiece();
				blackRook1.pieceFile = ReturnPiece.PieceFile.h;
				blackRook1.pieceRank = 8;
				blackRook1.pieceType = ReturnPiece.PieceType.BR;
				pieces.add(blackRook1);
			}
        }
		
	}





	public static ReturnPlay play(String move) {

		/* FILL IN THIS METHOD */
		ReturnPlay response = new ReturnPlay();
        response.piecesOnBoard = Chess.pieces;
        return response;
		/* FOLLOWING LINE IS A PLACEHOLDER TO MAKE COMPILER HAPPY */
		/* WHEN YOU FILL IN THIS METHOD, YOU NEED TO RETURN A ReturnPlay OBJECT */
		//return null;
	}
}
