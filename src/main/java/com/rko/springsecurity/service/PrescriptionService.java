package com.rko.springsecurity.service;

import com.rko.springsecurity.repository.PrescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class PrescriptionService {
    @Autowired
    private PrescriptionRepository prescriptionRepository;

    public int countUsersByBrandAndLocation(String brandName, String locationName) {
        return prescriptionRepository.countUsersByBrandAndLocation(brandName, locationName);
    }

}