plugins {
    id("org.jetbrains.kotlin.jvm") version "1.7.10"

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

application {
    val main: String = (project.findProperty("main") ?: "cmolisee.leetcodekotlin.AppKt").toString()
    mainClass.set(main)
}

tasks.register<Exec>("runall") {
    // commandLine("chmod", "+x", "runAll.sh")
    // commandLine("chmod", "+x", "gradlew")
    commandLine("./runAll.sh")
}
