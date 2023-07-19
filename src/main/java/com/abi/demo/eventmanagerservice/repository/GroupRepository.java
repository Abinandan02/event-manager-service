package com.abi.demo.eventmanagerservice.repository;

import com.abi.demo.eventmanagerservice.model.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Group, Long> {

    Group findByName(String name);
}
