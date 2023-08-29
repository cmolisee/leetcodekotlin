# Leetcode Kotlin Project
### commands

| command 	| action 	|
|---	|---	|
| ./gradlew ktlintFormat 	| Invokes the ktlint task to format code. 	|
| ./gradlew clean build 	| Invokes the clean and build task. This will run all the ktlint tasks and it will run the tests. 	|
| ./gradlew clean check 	| Invokes the check tasks (including tests). In order to get the test output you must use 'clean'. 	|
| ./gradlew run 	| Invokes the run command with the default mainClass (i.e. cmolisee.leetcodekotlin.AppKt). 	|
| ./gradlew run -Pmain=<package-name>.<class-name>Kt 	| Invokes the run command for the specified mainClass. 	|
| ./gradlew runall 	| Invokes the custom runAll shell script to run ALL files with a main() class. 	|