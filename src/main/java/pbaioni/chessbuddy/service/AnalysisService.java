package pbaioni.chessbuddy.service;

import java.util.concurrent.ExecutionException;

import org.springframework.stereotype.Service;

import pbaioni.chessbuddy.utils.FenHelper;
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

	public String getOnlyPawns(String fen) {
		return FenHelper.cleanPiecesFromFen(fen);
	}

}
