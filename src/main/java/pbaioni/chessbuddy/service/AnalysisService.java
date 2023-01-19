package pbaioni.chessbuddy.service;

import java.util.concurrent.ExecutionException;

import org.springframework.stereotype.Service;

import stockfish4j.model.EngineEvaluation;
import stockfish4j.service.StockfishService;

@Service
public class AnalysisService {
	StockfishService stockfishService;
	public AnalysisService(StockfishService stockfishService) {
		this.stockfishService = stockfishService;
	}
	
	public EngineEvaluation getDepthAnalysis(String fen, int depth) throws InterruptedException, ExecutionException {
		return stockfishService.submitDepthTask(fen, depth).get();
	}

}
