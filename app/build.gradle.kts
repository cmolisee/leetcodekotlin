import com.adarshr.gradle.testlogger.TestLoggerExtension
import com.adarshr.gradle.testlogger.theme.ThemeType

plugins {
    id("org.jetbrains.kotlin.jvm") version "1.7.10"
    id("com.adarshr.test-logger") version "3.2.0"

    application
    java
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.guava:guava:31.1-jre")
}

testing {
    suites {
        val test by getting(JvmTestSuite::class) {
            useKotlinTest("1.7.10")

            dependencies {
                implementation("org.junit.jupiter:junit-jupiter-engine:5.9.1")
            }
        }
    }
}

configure<TestLoggerExtension> {
    theme = ThemeType.MOCHA
    showExceptions = true
    showStackTraces = true
    showFullStackTraces = false
    showCauses = true
    slowThreshold = 2000
    showSummary = true
    showSimpleNames = false
    showPassed = true
    showSkipped = true
    showFailed = true
    showOnlySlow = false
    showStandardStreams = false
    showPassedStandardStreams = true
    showSkippedStandardStreams = true
    showFailedStandardStreams = true
}

application {
    val main: String = (project.findProperty("main") ?: "cmolisee.leetcodekotlin.AppKt").toString()
    mainClass.set(main)
}

tasks.register<Exec>("runall") {
    commandLine("chmod", "+x", "gradlew")
    commandLine("./runAll.sh")
}