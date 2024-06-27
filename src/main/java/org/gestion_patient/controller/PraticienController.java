package org.gestion_patient.controller;

import lombok.AllArgsConstructor;
import org.gestion_patient.entityDto.AppUserDto;
import org.gestion_patient.service.AppUserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@CrossOrigin("*")
@AllArgsConstructor
@RequestMapping("/api")
public class PraticienController {
    private AppUserService appUserService;

    @GetMapping(path="/profile")
    public ResponseEntity<AppUserDto> profile(Principal principal) throws Exception {
        AppUserDto appUserDto =  appUserService.loadByEmail(principal.getName());
        return new ResponseEntity<>(appUserDto,HttpStatus.CREATED);
    }

    @PostMapping("/praticien")
    public ResponseEntity<AppUserDto> createNewAppUser(@RequestBody AppUserDto appUserDto) throws Exception {
        AppUserDto appUserDtoSaved = appUserService.create(appUserDto);
        return new ResponseEntity<>(appUserDtoSaved, HttpStatus.CREATED);
    }

    @GetMapping("/praticien/all")
    public ResponseEntity<List<AppUserDto>> getAlAppUser(){
        List<AppUserDto> appUsers = appUserService.findAll();
        return new ResponseEntity<>(appUsers,HttpStatus.OK);
    }

    @GetMapping("/praticien/{id}")
    public ResponseEntity<AppUserDto> getAppUserById(@PathVariable int id) throws Exception {
        AppUserDto appUserDto = appUserService.findById(id);
        return new ResponseEntity<>(appUserDto,HttpStatus.OK);
    }

    @PutMapping("/praticien/{id}")
    public ResponseEntity<AppUserDto> updateAppUser(@PathVariable ("id") int id, @RequestBody AppUserDto appUserDto) throws Exception {
        AppUserDto updatedPraticien = appUserService.update(id,appUserDto);
        return new ResponseEntity<>(updatedPraticien,HttpStatus.OK);
    }



}