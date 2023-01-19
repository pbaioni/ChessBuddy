package pbaioni.chessbuddy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import stockfish4j.service.Stockfish4jProperties;
import stockfish4j.service.StockfishService;

@SpringBootApplication
public class ChessBuddyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChessBuddyApplication.class, args);
	}

}
