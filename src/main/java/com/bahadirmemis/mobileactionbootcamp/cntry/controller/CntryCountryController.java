package com.bahadirmemis.mobileactionbootcamp.cntry.controller;

import com.bahadirmemis.mobileactionbootcamp.cntry.dto.*;
import io.swagger.v3.oas.annotations.Operation;
import com.bahadirmemis.mobileactionbootcamp.cntry.service.CntryCountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
@RestController
@RequestMapping("/api/v1/countries")
@RequiredArgsConstructor
public class CntryCountryController {

    private final CntryCountryService cntryCountryService;


    @Operation(tags = "Country Controller")
    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id){

        CntryCountryDto cntryCountryDto = cntryCountryService.findById(id);

        return ResponseEntity.ok(RestResponse.of(cntryCountryDto));
    }

    @Operation(tags = "Country Controller")
    @PostMapping
    public ResponseEntity save(@RequestBody CntryCountrySaveRequestDto cntryCountrySaveRequestDto){

        CntryCountryDto cntryCountryDto = cntryCountryService.save(cntryCountrySaveRequestDto);

        return ResponseEntity.ok(RestResponse.of(cntryCountryDto));
    }


}
