package ua.kpi.its.lab.data.svc.impl

import org.springframework.stereotype.Service
import ua.kpi.its.lab.data.entity.Journal
import ua.kpi.its.lab.data.entity.ScientificArticle
import ua.kpi.its.lab.data.repo.JournalRepository
import ua.kpi.its.lab.data.repo.ScientificArticleRepository
import ua.kpi.its.lab.data.svc.EntityService

@Service
class EntityServiceImpl(
    private val journalRepository: JournalRepository,
    private val scientificArticleRepository: ScientificArticleRepository
) : EntityService {

    override fun createJournal(journal: Journal): Journal {
        return journalRepository.save(journal)
    }

    override fun getJournalById(id: Long): Journal? {
        return journalRepository.findById(id).orElse(null)
    }

    override fun updateJournal(journal: Journal): Journal {
        return journalRepository.save(journal)
    }

    override fun deleteJournal(id: Long) {
        journalRepository.deleteById(id)
    }

    override fun createScientificArticle(article: ScientificArticle): ScientificArticle {
        return scientificArticleRepository.save(article)
    }

    override fun getScientificArticleById(id: Long): ScientificArticle? {
        return scientificArticleRepository.findById(id).orElse(null)
    }

    override fun updateScientificArticle(article: ScientificArticle): ScientificArticle {
        return scientificArticleRepository.save(article)
    }

    override fun deleteScientificArticle(id: Long) {
        scientificArticleRepository.deleteById(id)
    }
}
