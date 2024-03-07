package isis.projet.backend.controller;

import isis.projet.backend.service.SeanceService;
import org.springframework.web.bind.annotation.*;
import lombok.extern.slf4j.Slf4j;
import java.util.Map;

@RestController
@RequestMapping("/rest")
@Slf4j
public class SeanceController {
    private final SeanceService seanceService;

    public SeanceController(SeanceService seanceService){
        this.seanceService = seanceService;
    }

    @PutMapping("/combienDeSeance")
    public Map<String, Long> combienDSeance() {
        log.info("Service combienDeseance");
        // On renverra un objet JSON de la forme {"combien": 123}
        return Map.of("combien", seanceService.combienDeSeance());
    }
}
