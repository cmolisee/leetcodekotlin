/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package cmolisee.leetcodekotlin

class App {
    val notes: String
        get() {
            return """
            ${"=".repeat(64)}
             > ./gradlew run -Pmain=class.pathKt < to run a single class
             > ./gradlew runall < to run all the classes
            ${"=".repeat(64)}
            """
        }
}

fun main() {
    println(App().notes)
}
