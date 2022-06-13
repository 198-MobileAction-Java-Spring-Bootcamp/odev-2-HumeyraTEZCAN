package com.bahadirmemis.mobileactionbootcamp.str.controller;

import com.bahadirmemis.mobileactionbootcamp.gen.response.RestResponse;
import com.bahadirmemis.mobileactionbootcamp.ngh.dto.NghNeighbourhoodDto;
import com.bahadirmemis.mobileactionbootcamp.ngh.dto.NghNeighbourhoodSaveRequestDto;
import com.bahadirmemis.mobileactionbootcamp.ngh.service.NghNeighbourhoodService;
import com.bahadirmemis.mobileactionbootcamp.str.dto.StrStreetDto;
import com.bahadirmemis.mobileactionbootcamp.str.dto.StrStreetSaveRequestDto;
import com.bahadirmemis.mobileactionbootcamp.str.service.StrStreetService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
@RestController
@RequestMapping("/api/v1/streets")
@RequiredArgsConstructor
public class StrStreetController {

    private final StrStreetService strStreetService;


    @Operation(tags = "Street Controller")
    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id){

        StrStreetDto strStreetDto = strStreetService.findById(id);

        return ResponseEntity.ok(RestResponse.of(strStreetDto));
    }

    @Operation(tags = "Street Controller")
    @PostMapping
    public ResponseEntity save(@RequestBody StrStreetSaveRequestDto strStreetSaveRequestDto){

        StrStreetDto strStreetDto = strStreetService.save(strStreetSaveRequestDto);

        return ResponseEntity.ok(RestResponse.of(strStreetDto));
    }


}
