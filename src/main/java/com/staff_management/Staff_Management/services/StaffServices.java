package com.staff_management.Staff_Management.services;

import com.staff_management.Staff_Management.models.Staff;
import org.springframework.stereotype.Service;
import com.staff_management.Staff_Management.repositorys.StaffRepository;
import java.util.List;
import java.util.Optional;

@Service
public class StaffServices {

    private final StaffRepository staffRepository;

    public StaffServices(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    // ✅ Create new staff
    public Staff addStaff(Staff staff) {
        return staffRepository.save(staff);
    }

    // ✅ Fetch all staff
    public List<Staff> getAllStaff() {
        return staffRepository.findAll();
    }

    // ✅ Update staff only if it exists
    public Staff updateStaff(Long id, Staff staffDetails) {
        Optional<Staff> existingStaff = staffRepository.findById(id);
        if (existingStaff.isPresent()) {
            Staff staff = existingStaff.get();
            staff.setName(staffDetails.getName());
            staff.setEmail(staffDetails.getEmail());
            staff.setPhone(staffDetails.getPhone());
            return staffRepository.save(staff);
        } else {
            throw new RuntimeException("Staff not found with id: " + id);
        }
    }
}
