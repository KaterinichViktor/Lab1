package ua.kpi.its.lab.data.svc

import ua.kpi.its.lab.data.entity.Journal
import ua.kpi.its.lab.data.entity.ScientificArticle

interface EntityService {
    // CRUD операції для сутності Journal
    fun createJournal(journal: Journal): Journal
    fun getJournalById(id: Long): Journal?
    fun updateJournal(journal: Journal): Journal
    fun deleteJournal(id: Long)

    // CRUD операції для сутності ScientificArticle
    fun createScientificArticle(article: ScientificArticle): ScientificArticle
    fun getScientificArticleById(id: Long): ScientificArticle?
    fun updateScientificArticle(article: ScientificArticle): ScientificArticle
    fun deleteScientificArticle(id: Long)
}
