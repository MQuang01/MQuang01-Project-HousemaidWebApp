package com.cghue.projecthousemaidwebapp.repository;

import com.cghue.projecthousemaidwebapp.domain.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IJobRepository extends JpaRepository<Job, Long> {

}
