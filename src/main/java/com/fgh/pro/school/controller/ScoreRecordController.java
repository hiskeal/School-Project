package com.fgh.pro.school.controller;

import com.fgh.pro.school.dto.ResponseDto;
import com.fgh.pro.school.dto.ScoreRecordRequestDto;
import com.fgh.pro.school.service.ScoreRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
@RequestMapping("/api")
public class ScoreRecordController {

    @Autowired
    private ScoreRecordService scoreRecordService;

    @PostMapping("/saveScoreRecord")
    public ResponseDto saveScore(@RequestBody ScoreRecordRequestDto scoreRecordRequestDto) {

        return scoreRecordService.saveScoreRecord(scoreRecordRequestDto);
    }

    @PutMapping("/scoreRecord/{id}")
    public ResponseDto updateScore(@RequestBody ScoreRecordRequestDto scoreRecordRequestDto, @PathVariable Long id) {

        return scoreRecordService.updateScoreRecord(scoreRecordRequestDto, id);
    }
}
