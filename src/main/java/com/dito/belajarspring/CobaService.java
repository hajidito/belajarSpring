package com.dito.belajarspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/belajar")

public class CobaService {
    @RequestMapping("/halo")
    public String HaloDunia(){
        return "halo dunia";
    }

    @GetMapping("/halo2")
    public String HaloKamu(){
        return "halo kamu";
    }

    @RequestMapping("/halo3/{namaorang}/ambil/{namabarang}")
    public String ambil(@PathVariable String namaorang, @PathVariable String namabarang ){
        return "si" + namaorang + "mengambil" + namabarang;
    }

    @RequestMapping("/calculator/{firstNumber}/minus/{secondNumber}")
    public String minus(@PathVariable Integer firstNumber, @PathVariable Integer secondNumber) {
        return firstNumber + " - " + secondNumber + " = " + (firstNumber-secondNumber);
    }
    @RequestMapping("/calculator/{firstNumber}/plus/{secondNumber}")
    public String plus(@PathVariable Integer firstNumber, @PathVariable Integer secondNumber) {
        return firstNumber + " + " + secondNumber + " = " + (firstNumber+secondNumber);
    }
    @RequestMapping("/calculator/{firstNumber}/time/{secondNumber}")
    public String time(@PathVariable Integer firstNumber, @PathVariable Integer secondNumber) {
        return firstNumber + " * " + secondNumber + " = " + (firstNumber*secondNumber);
    }
    @RequestMapping("/calculator/{firstNumber}/divide/{secondNumber}")
    public String divide(@PathVariable Integer firstNumber, @PathVariable Integer secondNumber) {
        return firstNumber + " : " + secondNumber + " = " + (firstNumber/secondNumber);
    }
}