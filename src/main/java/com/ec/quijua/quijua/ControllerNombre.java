package com.ec.quijua.quijua;
import java.lang.String;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(path="/hola")

public class ControllerNombre {
      @GetMapping(path="/nombre")
    public String home(){
        return "Raul Quijua Brrera ";
    }
    
}
