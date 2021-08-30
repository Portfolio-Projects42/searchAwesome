
import link.kotlin.scripts.dsl.Article
import link.kotlin.scripts.dsl.LinkType.*
import link.kotlin.scripts.dsl.LanguageCodes.*
import java.time.LocalDate

// language=Markdown
val body = """

<iframe width="960" height="480" src="https://www.youtube.com/embed/UTN2_YXEzL4" frameborder="0" allowfullscreen></iframe>

code_swarm visualization for kotlin (https://github.com/JetBrains/kotlin). The Kotlin Programming Language

This visualization was generated by following this tutorial:
http://derwiki.tumblr.com/post/43181171352/creating-a-codeswarm-for-your-git-repository

More information:
http://vis.cs.ucdavis.edu/~ogawa/codeswarm/
https://github.com/rictic/code_swarm

Why make this visualization?
- I'm studying how popular projects evolve

"""

Article(
  title = "Code Swarm for Kotlin",
  url = "https://www.youtube.com/watch?v=UTN2_YXEzL4",
  categories = listOf(
    "Kotlin"
  ),
  type = video,
  lang = EN,
  author = "Landon Wilkins",
  date = LocalDate.of(2016, 11, 24),
  body = body
)
