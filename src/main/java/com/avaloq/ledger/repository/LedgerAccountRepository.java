package com.avaloq.ledger.repository;

import com.avaloq.ledger.domain.LedgerAccount;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.*;


/**
 * Spring Data JPA repository for the LedgerAccount entity.
 */
@SuppressWarnings("unused")
@Repository
public interface LedgerAccountRepository extends JpaRepository<LedgerAccount, Long> {

}
