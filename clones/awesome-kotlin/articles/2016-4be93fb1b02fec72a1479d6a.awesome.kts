
import link.kotlin.scripts.dsl.Article
import link.kotlin.scripts.dsl.LanguageCodes.RU
import link.kotlin.scripts.dsl.LinkType.article
import java.time.LocalDate

// language=Markdown
val body = """
Уже не мало нашумел Kotlin в мире программирования, не мало профессиональных инженеров уже обратил на него внимание, но также есть и те кому он не симпатизирует.

![Kotlin](https://habrastorage.org/files/a52/453/729/a52453729bd64cb3b5ca8a4892e45cc1.png)

В данном топике я бы хотел обратить внимание тех начинающих программистов которые возможно только делают свой выбор языка программирования, которому бы хотели посвятить свою жизнь так сказать.

Я сам Java Developer и для меня наступил тот период я когда хотелось посмотреть на другие языки, взять какие-то практики для себя с них.

И однажды примерно в 2013 году я услышал что та прекрасная компания делающая такие крутые продукты как **Intellij IDEA**, **Youtrack** а именно [JetBrains](https://www.jetbrains.com/), анонсировала о новом языке [Kotlin](https://kotlinlang.org/), который на то время был в активной стадии разработки.

И в этом году а именно 15 февраля 2016 года был выпушен релиз **Kotlin 1.0**. С этого момента я начал уже более активней его изучать и пытаться применять в небольших свои проектах.

## Kotlin для начинающих

И этим постом я бы хотел поделится серией видео в которой я начал делится всем тем что я изучил за это время касаемо Kotlin.

**Урок 0. Введение и знакомство**
https://www.youtube.com/watch?v=L9k_NdTaMeI


**Урок 1. String Templates**
https://www.youtube.com/watch?v=frw1DpNm_ms

Пока планирую выкладывать два видео в неделю, весь список будет [тут](https://goo.gl/yegW0d).
Спасибо за ваше внимание, и надеюсь, данная информация кому-то будет полезно!

"""

Article(
  title = "Kotlin для начинающих",
  url = "https://habrahabr.ru/post/278277/",
  categories = listOf(
    "Kotlin"
  ),
  type = article,
  lang = RU,
  author = "@Devcolibri",
  date = LocalDate.of(2016, 3, 2),
  body = body
)
