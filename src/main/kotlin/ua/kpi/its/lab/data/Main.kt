package ua.kpi.its.lab.data

import org.springframework.context.annotation.AnnotationConfigApplicationContext
import ua.kpi.its.lab.data.entity.Magazine
import ua.kpi.its.lab.data.entity.ScientificArticle
import ua.kpi.its.lab.data.svc.impl.MagazineServiceImpl
import ua.kpi.its.lab.data.svc.impl.ScientificArticleServiceImpl
import java.util.*

fun main() {
    val context = AnnotationConfigApplicationContext("ua.kpi.its.lab.data.config")
    val magazineService = context.getBean(MagazineServiceImpl::class.java)
    val scientificArticleService = context.getBean(ScientificArticleServiceImpl::class.java)

    val magazine1 = Magazine(
        name = "Mag11",
        topic = "Topic11",
        language = "Eng",
        establishDate = Date(),
        issn = "1111-1111",
        priceRecommended = "111 грн",
        periodicity = true
    )
    val magazine2 = Magazine(
        name = "Mag22",
        topic = "Topic22",
        language = "Ukr",
        establishDate = Date(),
        issn = "2222-2222",
        priceRecommended = "222 грн",
        periodicity = true
    )
    val magazine3 = Magazine(
        name = "Mag33",
        topic = "Topic33",
        language = "Esp",
        establishDate = Date(),
        issn = "3333-3333",
        priceRecommended = "333 грн",
        periodicity = true
    )
    val magazine4 = Magazine(
        name = "Mag44",
        topic = "Topic44",
        language = "Ger",
        establishDate = Date(),
        issn = "4444-4444",
        priceRecommended = "444 грн",
        periodicity = true
    )
    val magazine5 = Magazine(
        name = "Mag55",
        topic = "Topic55",
        language = "Fra",
        establishDate = Date(),
        issn = "5555-5555",
        priceRecommended = "555 грн",
        periodicity = true
    )

    val article1 = ScientificArticle(
        name = "Article-11",
        author = "Author-11",
        writingDate = Date(),
        wordCount = "1111",
        numberLinks = 11,
        origLang = true,
        magazine = magazine1
    )

    magazineService.create(magazine1)
    magazineService.create(magazine2)
    magazineService.create(magazine3)
    magazineService.create(magazine4)
    magazineService.create(magazine5)
    scientificArticleService.create(article1)

    println("Retrieved magazine: $magazine3")

    magazineService.delete(4)
}