package com.staff_management.Staff_Management.controllers;

import com.staff_management.Staff_Management.models.Staff;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.staff_management.Staff_Management.services.StaffServices;
import java.util.List;

@RestController
@RequestMapping("/api/staff")
public class StaffController {

    private final StaffServices staffServices;

    public StaffController(StaffServices staffServices) {
        this.staffServices = staffServices;
    }

    // ✅ Create a new Staff
    @PostMapping
    public ResponseEntity<Staff> addStaff(@RequestBody Staff staff) {
        return ResponseEntity.ok(staffServices.addStaff(staff));
    }

    // ✅ Update existing Staff
    @PutMapping("/{id}")
    public ResponseEntity<Staff> updateStaff(@PathVariable Long id, @RequestBody Staff staff) {
        return ResponseEntity.ok(staffServices.updateStaff(id, staff));
    }

    // ✅ Get all Staff members
    @GetMapping
    public ResponseEntity<List<Staff>> getAllStaff() {
        return ResponseEntity.ok(staffServices.getAllStaff());
    }
}
