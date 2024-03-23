package com.cghue.projecthousemaidwebapp.repository;

import com.cghue.projecthousemaidwebapp.domain.UserRole;
import com.cghue.projecthousemaidwebapp.domain.dto.res.user.UserRoleResDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IUserRoleRepository extends JpaRepository<UserRole, Long> {
    @Query("SELECT ur " +
            "FROM user_roles ur WHERE ur.user.id = :id")
    List<UserRole> findAllByUserId(@Param("id") Long idUser);
}
