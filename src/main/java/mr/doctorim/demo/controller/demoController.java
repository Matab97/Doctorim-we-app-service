package mr.doctorim.demo.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("demo")
public class demoController {

    @GetMapping
    public ResponseEntity<List<String>> findAllDemo(){
        return ResponseEntity.ok(Collections.singletonList("it works!!"));
    }

}
