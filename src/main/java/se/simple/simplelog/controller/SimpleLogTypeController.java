package se.simple.simplelog.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import se.simple.simplelog.service.LogService;

import java.util.List;

@RestController
@RequestMapping("/api/types")
@Tag(name = "Simple log types")
public class SimpleLogTypeController {

    private final LogService logService;

    @Autowired
    public SimpleLogTypeController(LogService logService) {
        this.logService = logService;
    }

    @Operation(summary = "Endpoint for getting all log types")
    @PostMapping(value = "")
    public List<String> logTypes() {
        return logService.getLogTypes();
    }

}
