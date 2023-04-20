package com.meva.finance.Controlle;


import com.meva.finance.leituraEescrita.file.ManipuladorArquivo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/exemplo")
public class ServiceController {
    @Autowired
    ManipuladorArquivo manipuladorArquivo;


    @PostMapping({"/{URL}"})
    public ResponseEntity<ManipuladorArquivo> manipular(@PathVariable String URL){
        Optional<ManipuladorArquivo> manipulador =
    }


}
