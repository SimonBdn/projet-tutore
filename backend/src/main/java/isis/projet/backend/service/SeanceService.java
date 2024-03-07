package isis.projet.backend.service;

import isis.projet.backend.dao.CountryRepository;
import isis.projet.backend.dao.SeanceRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class SeanceService {

    private final SeanceRepository seanceDao;

    public SeanceService(SeanceRepository seanceDao){
        this.seanceDao = seanceDao;
    }

    @Transactional
    public long combienDeSeance() {
        return seanceDao.count();
    }
}
