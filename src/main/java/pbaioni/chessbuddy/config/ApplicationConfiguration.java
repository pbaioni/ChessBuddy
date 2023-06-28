package pbaioni.chessbuddy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import stockfish4j.service.Stockfish4jProperties;
import stockfish4j.service.StockfishService;

@Configuration
public class ApplicationConfiguration {
	
	@Bean
	public StockfishService getStockfishService() {
		return new StockfishService(Stockfish4jProperties.getInstance());
	}
	
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins("*");
            }
        };
    }
}
