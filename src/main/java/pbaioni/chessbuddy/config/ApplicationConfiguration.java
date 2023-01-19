package pbaioni.chessbuddy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import stockfish4j.service.StockfishService;

@Configuration
public class ApplicationConfiguration {
	
	@Bean
	public StockfishService getStockfishService() {
		return new StockfishService();
	}

}
