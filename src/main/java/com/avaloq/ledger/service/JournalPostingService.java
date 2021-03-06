package com.avaloq.ledger.service;

import com.avaloq.ledger.domain.enumeration.BalanceDateType;
import com.avaloq.ledger.service.dto.ChartOfAccountsDTO;
import com.avaloq.ledger.service.dto.JournalPostingDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.time.LocalDate;

/**
 * Service Interface for managing JournalPosting.
 */
public interface JournalPostingService {

    /**
     * Save a journalPosting.
     *
     * @param journalPostingDTO the entity to save
     * @return the persisted entity
     */
    JournalPostingDTO save(JournalPostingDTO journalPostingDTO);

    /**
     * Get all the journalPostings.
     *
     * @param pageable the pagination information
     * @return the list of entities
     */
    Page<JournalPostingDTO> findAll(Pageable pageable);

    /**
     * Get the "id" journalPosting.
     *
     * @param id the id of the entity
     * @return the entity
     */
    JournalPostingDTO findOne(Long id);

    /**
     * Delete the "id" journalPosting.
     *
     * @param id the id of the entity
     */
    void delete(Long id);

    /**
     * Generate Journal Postings from Voucher.
     *
     * @param refDate the date per when to create a new balance sheet
     * @param chartOfAccountsDTO DTO of the chart of account
     * @param dateType relevant date type
     * @param legalEntityId legal entity id
     *
     * @return number of created entity
     */
    Long generateFromVoucher(LocalDate refDate, ChartOfAccountsDTO chartOfAccountsDTO, BalanceDateType dateType, String legalEntityId, boolean useRule);
}
