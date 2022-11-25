package com.cloud.parking.cloudparking.controller;

import com.cloud.parking.cloudparking.model.Parking;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@Api(tags = "Parking Controller")
public class ParkingController {


    @GetMapping
    @ApiOperation("Find All")
    public List<Parking> findAll() {

        var parking = new Parking();
        parking.setColor("azul");
        parking.setLicense("UTL-1865");
        parking.setState("PB");
        parking.setNome("XRE-300");
        return Arrays.asList(parking, parking);
    }


}
