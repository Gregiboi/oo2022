package kodutoo._67;

import org.springframework.stereotype.Service;

@Service
public class DTService {
    public Divisions infantry(){
        return new Divisions(DivisionsEnum.INFANTRY);
    }

}
