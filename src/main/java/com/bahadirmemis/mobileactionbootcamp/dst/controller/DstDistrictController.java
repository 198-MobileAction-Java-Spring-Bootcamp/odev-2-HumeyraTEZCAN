package com.bahadirmemis.mobileactionbootcamp.dst.controller;

import com.bahadirmemis.mobileactionbootcamp.dst.dto.DstDistrictDto;
import com.bahadirmemis.mobileactionbootcamp.dst.dto.DstDistrictSaveRequestDto;
import com.bahadirmemis.mobileactionbootcamp.dst.service.DstDistrictService;
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
@RequestMapping("/api/v1/districts")
@RequiredArgsConstructor
public class DstDistrictController {

    private final DstDistrictService dstDistrictService;


    @Operation(tags = "District Controller")
    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id){

        DstDistrictDto dstDistrictDto = dstDistrictService.findById(id);

        return ResponseEntity.ok(RestResponse.of(dstDistrictDto));
    }

    @Operation(tags = "District Controller")
    @PostMapping
    public ResponseEntity save(@RequestBody DstDistrictSaveRequestDto dstDistrictSaveRequestDto){

        DstDistrictDto dstDistrictDto = dstDistrictService.save(dstDistrictSaveRequestDto);

        return ResponseEntity.ok(RestResponse.of(dstDistrictDto));
    }


}
