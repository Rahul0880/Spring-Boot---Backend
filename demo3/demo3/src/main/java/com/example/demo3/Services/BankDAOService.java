package com.example.demo3.Services;

import com.example.demo3.entities.Bank;
import com.example.demo3.entities.Users;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Service //add service annotation
public class BankDAOService {



    private static List<Bank> bank = new ArrayList<>();
    static{
        bank.add(new Bank(11,"myur",200f,1234567890,"123@gmail.com"));
        bank.add(new Bank(12,"sahil",300f,2134567890,"321@gmail.com"));
        bank.add(new Bank(13,"suii",400f,321454980,"333@gmail.com"));

    }
   public List<Bank> getBank()
   {
       return bank;
   }
   /* public Bank getbank(long accno)
    {
        for(Bank Bank:bank)
        {
            if(bank.getACCspecefic()== accno())
            {
                return bank;
            }
        }
        return null;
    }*/

}
