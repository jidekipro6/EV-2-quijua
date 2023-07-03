package com.ec.quijua.quijua;
import java.lang.String;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(path="/hola")

public class ControllerCodigo {
      @GetMapping(path="/codigo")
    public String home(){
        return "A18100778  ";
    }
    
}
