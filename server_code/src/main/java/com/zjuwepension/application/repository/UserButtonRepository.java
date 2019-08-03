package com.zjuwepension.application.repository;

import com.zjuwepension.application.entity.User;
import com.zjuwepension.application.entity.UserButton;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserButtonRepository extends JpaRepository<UserButton, Long> {
    List<UserButton> findUserButtonsByUserId(Long userId);
    List<UserButton> findUserButtonsByUserIdAndAndButtonId(Long userId, Long buttonId);
    List<UserButton> findUserButtonsByButtonId(Long ButtonId);
}
