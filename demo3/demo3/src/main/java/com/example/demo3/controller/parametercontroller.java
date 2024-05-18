package com.example.demo3.controller;

import com.example.demo3.entities.parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Tag(name="parametercontroller")
public class parametercontroller {
    @GetMapping(path="/param/{fname}/{lname}")

        public parameter getparam(@PathVariable String fname,@PathVariable String lname)
        {
           return new parameter(fname, lname);

        }

}
