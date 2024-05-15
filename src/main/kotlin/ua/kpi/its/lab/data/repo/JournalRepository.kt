package ua.kpi.its.lab.data.repo

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import ua.kpi.its.lab.data.entity.Journal

@Repository
interface JournalRepository : JpaRepository<Journal, Long> {
    // Можна додати додаткові методи, якщо необхідно
}
