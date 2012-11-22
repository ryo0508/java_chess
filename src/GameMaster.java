import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameMaster {

	private Board board;
	private Player playerA;
	private Player playerB;

	public GameMaster() {

	}

	public void startGame() {
		board = new Board();
		playerA = new Player(false);
		playerB = new Player(true);

		// 駒の配置
		playerA.setPiecesInPlace();
		playerB.setPiecesInPlace();

		// ボードに情報を持たせる
		board.addPiece(playerA.returnPieces());
		board.addPiece(playerB.returnPieces());
	}
	
	public void movePiece() {
		Piece targetPiece = askWhichPieceToMove();
		askWhereToMove(targetPiece);
	}

	public static void main_kari() {
		GameMaster gm = new GameMaster();
		gm.startGame();
	}

	public Piece askWhichPieceToMove() {
		// ボードを描写
		board.renderBoard();
		System.out.print("Which Piece to move(row, column): ");
		String pieceLocation;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			pieceLocation = br.readLine();
		} catch (IOException ioe) {
			pieceLocation = null;
			System.out.println("IOerror trying to read the location");
			System.exit(1);
		}

		Piece p = board.checkLocation(Integer.parseInt(pieceLocation
				.split(",")[0]), Integer.parseInt(pieceLocation.split(",")[1]));
		
		return p;
	}

	public void askWhereToMove(Piece p) {
		board.renderPossibleMoves(p);
		System.out.print("Where to move: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			int targetLocationIndex = Integer.parseInt(br.readLine());
			p.move(targetLocationIndex);
		} catch (IOException ioe) {
			System.out.println("IOerror trying to read the location");
			System.exit(1);
		}
	}
	
	public void ClearConsole() {
		Console console = System.console();
		if (console == null) {
			System.out.println("Couldn't get Console object!");
		} else {
			console.flush();
		}
	}
}
