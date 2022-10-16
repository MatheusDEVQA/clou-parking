package com.cloud.parking.cloudparking.controller;

import com.cloud.parking.cloudparking.model.Parking;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ParkingController {


    @GetMapping
    public List<Parking> findAll() {

        var parking = new Parking();
        parking.setColor("azul");
        parking.setLicense("UTL-1865");
        parking.setState("PB");
        parking.setNome("XRE-300");
        return Arrays.asList(parking, parking);
    }
}
