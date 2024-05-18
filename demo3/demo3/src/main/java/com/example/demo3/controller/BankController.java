package com.example.demo3.controller;

import com.example.demo3.Services.BankDAOService;
import com.example.demo3.entities.Bank;
import com.example.demo3.entities.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@RestController
@Tag(name="BankController")
public class BankController {
    @Autowired(required = true)
    private BankDAOService dao;

    @GetMapping(path="BankUser")
    public List<Bank> getbank()
    {
        return dao.getBank();
    }
  //  @GetMapping(path="ListBank/{id}")
   // public Bank getACCSpecefic(@PathVariable long accno)
   // {
      //  return dao.getBank(accno);
    ///}

}
