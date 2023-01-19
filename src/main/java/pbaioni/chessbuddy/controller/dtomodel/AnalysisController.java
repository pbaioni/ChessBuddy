package pbaioni.chessbuddy.controller.dtomodel;

import java.util.concurrent.ExecutionException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import pbaioni.chessbuddy.service.AnalysisService;
import stockfish4j.model.EngineEvaluation;

@RestController
@RequestMapping("/analysis")
public class AnalysisController {
	AnalysisService analysisService;

	public AnalysisController(AnalysisService analysisService) {
		this.analysisService = analysisService;
	}

	@GetMapping()
	public @ResponseBody String checkHealth() {
		return "Analysis service is up";
	}

	@GetMapping("/depth")
	public ResponseEntity<EngineEvaluation> depthAnalysis(@RequestParam String fen, @RequestParam int depth) throws InterruptedException, ExecutionException {
		return new ResponseEntity<EngineEvaluation>(analysisService.getDepthAnalysis(fen, depth), HttpStatus.OK);
	}

}
