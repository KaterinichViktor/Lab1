package ua.kpi.its.lab.data

import org.springframework.context.annotation.AnnotationConfigApplicationContext
import ua.kpi.its.lab.data.config.Config
import ua.kpi.its.lab.data.svc.EntityService

fun main() {
    val context = AnnotationConfigApplicationContext(Config::class.java)
    val entityService = context.getBean(EntityService::class.java)

    // Створення різноманітних сутностей Journal
    val journal1 = Journal(
        title = "Science Journal",
        topic = "Science",
        language = "English",
        foundationDate = "2020-01-01",
        issn = "1234-5678",
        recommendedPrice = 10.0,
        periodicity = true
    )

    val journal2 = Journal(
        title = "History Gazette",
        topic = "History",
        language = "English",
        foundationDate = "2015-05-10",
        issn = "5678-1234",
        recommendedPrice = 8.0,
        periodicity = false
    )

    val journal3 = Journal(
        title = "Nature Magazine",
        topic = "Nature",
        language = "English",
        foundationDate = "2018-03-20",
        issn = "9876-5432",
        recommendedPrice = 12.0,
        periodicity = true
    )

    val journal4 = Journal(
        title = "Art Review",
        topic = "Art",
        language = "English",
        foundationDate = "2019-07-15",
        issn = "5432-9876",
        recommendedPrice = 7.5,
        periodicity = false
    )

    val journal5 = Journal(
        title = "Technology Digest",
        topic = "Technology",
        language = "English",
        foundationDate = "2022-09-05",
        issn = "2468-1357",
        recommendedPrice = 9.0,
        periodicity = true
    )

    // Створення різноманітних сутностей ScientificArticle
    val article1 = ScientificArticle(
        title = "The Impact of Climate Change on Biodiversity",
        author = "John Doe",
        writingDate = "2023-02-15",
        wordCount = 1500,
        citationCount = 25,
        originalLanguage = true
    )

    val article2 = ScientificArticle(
        title = "Advancements in Quantum Computing",
        author = "Jane Smith",
        writingDate = "2023-04-20",
        wordCount = 2000,
        citationCount = 30,
        originalLanguage = false
    )

    val article3 = ScientificArticle(
        title = "Applications of Artificial Intelligence in Healthcare",
        author = "David Johnson",
        writingDate = "2022-12-10",
        wordCount = 1800,
        citationCount = 20,
        originalLanguage = true
    )

    val article4 = ScientificArticle(
        title = "Recent Developments in Materials Science",
        author = "Emily Brown",
        writingDate = "2021-08-25",
        wordCount = 1700,
        citationCount = 22,
        originalLanguage = false
    )

    val article5 = ScientificArticle(
        title = "The Role of Robotics in Industry 4.0",
        author = "Michael Clark",
        writingDate = "2024-01-05",
        wordCount = 1900,
        citationCount = 28,
        originalLanguage = true
    )

    // Додавання створених сутностей в базу даних
    entityService.createJournal(journal1)
    entityService.createJournal(journal2)
    entityService.createJournal(journal3)
    entityService.createJournal(journal4)
    entityService.createJournal(journal5)

    entityService.createScientificArticle(article1)
    entityService.createScientificArticle(article2)
    entityService.createScientificArticle(article3)
    entityService.createScientificArticle(article4)
    entityService.createScientificArticle(article5)

    // Отримання сутності з індексом 3 (припустимо, що журнал з id=3 існує)
    val journalFromDb = entityService.getJournalById(3)

    // Видалення сутності з індексом 4 (припустимо, що стаття з id=4 існує)
    entityService.deleteScientificArticle(4)
}