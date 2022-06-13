package com.bahadirmemis.mobileactionbootcamp.ngh.controller;

import com.bahadirmemis.mobileactionbootcamp.dst.dto.DstDistrictDto;
import com.bahadirmemis.mobileactionbootcamp.dst.dto.DstDistrictSaveRequestDto;
import com.bahadirmemis.mobileactionbootcamp.dst.service.DstDistrictService;
import com.bahadirmemis.mobileactionbootcamp.gen.response.RestResponse;
import com.bahadirmemis.mobileactionbootcamp.ngh.dto.NghNeighbourhoodDto;
import com.bahadirmemis.mobileactionbootcamp.ngh.dto.NghNeighbourhoodSaveRequestDto;
import com.bahadirmemis.mobileactionbootcamp.ngh.service.NghNeighbourhoodService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
@RestController
@RequestMapping("/api/v1/neighbourhoods")
@RequiredArgsConstructor
public class NghNeighbourhoodContoller {

    private final NghNeighbourhoodService nghNeighbourhoodService;


    @Operation(tags = "Neighbourhood Controller")
    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id){

        NghNeighbourhoodDto nghNeighbourhoodDto = nghNeighbourhoodService.findById(id);

        return ResponseEntity.ok(RestResponse.of(nghNeighbourhoodDto));
    }

    @Operation(tags = "Neighbourhood Controller")
    @PostMapping
    public ResponseEntity save(@RequestBody NghNeighbourhoodSaveRequestDto nghNeighbourhoodSaveRequestDto){

        NghNeighbourhoodDto nghNeighbourhoodDto = nghNeighbourhoodService.save(nghNeighbourhoodSaveRequestDto);

        return ResponseEntity.ok(RestResponse.of(nghNeighbourhoodDto));
    }


}
