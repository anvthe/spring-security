package com.rko.springsecurity.controller;

import com.rko.springsecurity.dto.DrugDTO;
import com.rko.springsecurity.dto.DrugDetailsDTO;
import com.rko.springsecurity.service.DrugService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/drug")
public class DrugController {
    private final DrugService drugService;

    @GetMapping("/list/{name}")
    public ResponseEntity<?> getAllDrugs(@PathVariable String name) {
        List<DrugDTO> drugs = drugService.getAllDrugs(name);
        return new ResponseEntity<>(drugs, HttpStatus.OK);
    }

    @GetMapping("/info/{drugName}")
    public ResponseEntity<DrugDetailsDTO> getDrugByName(@PathVariable String drugName) {
        DrugDetailsDTO drug = drugService.fetchDrugInfoByName(drugName);
        return ResponseEntity.ok(drug);
    }
}