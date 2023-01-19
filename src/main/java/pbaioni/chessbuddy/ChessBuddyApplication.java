package pbaioni.chessbuddy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import stockfish4j.service.Stockfish4jProperties;
import stockfish4j.service.StockfishService;

@SpringBootApplication
public class ChessBuddyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChessBuddyApplication.class, args);
		System.out.println("started");
		Stockfish4jProperties props = Stockfish4jProperties.getInstance();
		System.out.println(props.getStockfishInstances());
		StockfishService service = new StockfishService();
		service.submitDepthTask("3k4/3p4/8/K1P4r/8/8/8/8 b - - 0 1", 16);
	}

}
