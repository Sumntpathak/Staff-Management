package com.staff_management.Staff_Management.repositorys;

import com.staff_management.Staff_Management.models.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StaffRepository extends JpaRepository<Staff,Long> {



}
