package kodutoo._67;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="DivisionTemplates")
public class DTController {
    private final DTService dtservice;

    @Autowired
    public DTController(DTService dtservice) {
        this.dtservice = dtservice;
    }

    @GetMapping
    public Divisions infantry(){
        return dtservice.infantry();
    }

}
