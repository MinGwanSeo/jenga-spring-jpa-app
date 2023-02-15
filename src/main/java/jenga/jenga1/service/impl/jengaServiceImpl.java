package jenga.jenga1.service.impl;

import jenga.jenga1.model.JengaVO;
import jenga.jenga1.service.jengaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@Service
public class jengaServiceImpl implements jengaService {

    @Override
    public JengaVO getJengaData() {
        JengaVO jengaVO = new JengaVO();

        return jengaVO;
    }
}
