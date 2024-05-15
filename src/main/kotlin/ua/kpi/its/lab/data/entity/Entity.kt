package ua.kpi.its.lab.data.entity

import javax.persistence.*

class ExampleEntity : Comparable<ExampleEntity> {
    override fun compareTo(other: ExampleEntity): Int {
        TODO("Your code in your entity")
    }
}

// Your code here


@Entity
class Journal : Comparable<Journal> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id: Long? = null

    private var name: String = ""
    private var foundingDate: String = ""
    private var ISSN: String = ""

    @OneToMany(mappedBy = "journal", cascade = [CascadeType.ALL])
    private var articles: MutableList<ScientificArticle> = mutableListOf()

    override fun compareTo(other: Journal): Int {
        val nameComparison = this.name.compareTo(other.name)
        return if (nameComparison != 0) {
            nameComparison
        } else {
            this.id?.compareTo(other.id ?: -1) ?: -1
        }
    }

    // Optional: override toString() and hashCode() methods if needed

}

@Entity
class ScientificArticle : Comparable<ScientificArticle> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id: Long? = null

    private var title: String = ""
    private var wordCount: Int = 0

    @ManyToOne
    @JoinColumn(name = "journal_id")
    private var journal: Journal? = null

    override fun compareTo(other: ScientificArticle): Int {
        val wordCountComparison = this.wordCount.compareTo(other.wordCount)
        return if (wordCountComparison != 0) {
            wordCountComparison
        } else {
            this.id?.compareTo(other.id ?: -1) ?: -1
        }
    }

    // Optional: override toString() and hashCode() methods if needed

}