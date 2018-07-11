package com.studiomediatech.rmsg;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestMessageEntityRepository extends JpaRepository<RestMessageEntity, Long> {
	// OK
}
