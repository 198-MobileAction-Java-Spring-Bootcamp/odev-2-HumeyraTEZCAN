package com.bahadirmemis.mobileactionbootcamp.cty.controller;

import com.bahadirmemis.mobileactionbootcamp.cntry.dto.*;
import com.bahadirmemis.mobileactionbootcamp.cntry.service.CntryCountryService;
import com.bahadirmemis.mobileactionbootcamp.cty.dto.CtyCityDto;
import com.bahadirmemis.mobileactionbootcamp.cty.dto.CtyCitySaveRequestDto;
import com.bahadirmemis.mobileactionbootcamp.cty.service.CtyCityService;
import com.bahadirmemis.mobileactionbootcamp.gen.response.RestResponse;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
@RestController
@RequestMapping("/api/v1/cities")
@RequiredArgsConstructor
public class CtyCityController {

    private final CtyCityService ctyCityService;


    @Operation(tags = "City Controller")
    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id){

        CtyCityDto ctyCityDto = ctyCityService.findById(id);

        return ResponseEntity.ok(RestResponse.of(ctyCityDto));
    }

    @Operation(tags = "City Controller")
    @PostMapping
    public ResponseEntity save(@RequestBody CtyCitySaveRequestDto ctyCitySaveRequestDto){

        CtyCityDto ctyCityDto = ctyCityService.save(ctyCitySaveRequestDto);

        return ResponseEntity.ok(RestResponse.of(ctyCityDto));
    }


}
