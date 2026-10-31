# Gradle

Gradle is a build automation tool. It reads build scripts to compile and test
code, resolve libraries, and package applications. In these sample projects,
the build scripts use the Groovy DSL (`.gradle` files).

## How Gradle is used here

This workspace contains two sample projects: `Gradle-Projects` and
`Gradle-projects-2`. Each has its own Gradle Wrapper, settings, application
module, and build configuration.

- `settings.gradle` names the build and includes the `app` module.
- `app/build.gradle` applies the Java application plugin, uses Maven Central
  for dependencies, selects Java 21, and configures the main class and tests.
- `gradle/libs.versions.toml` is a version catalog: it keeps library
  coordinates and versions in one place. The build script refers to these
  entries as `libs.guava` and `libs.junit.jupiter`.
- `gradle/wrapper/gradle-wrapper.properties` selects Gradle 9.8.2.
  `gradlew.bat` runs that project-specific Gradle version on Windows, so a
  separate system-wide Gradle installation is not needed.
- `gradle.properties` enables Gradle's configuration cache for the build.

## Running a project on Windows

Open a terminal in either project directory, then run:

```powershell
.\gradlew.bat build
```

Other useful commands are:

```powershell
.\gradlew.bat test    # Run tests
.\gradlew.bat run     # Run the application
.\gradlew.bat tasks   # List available tasks
.\gradlew.bat clean   # Remove generated build outputs
```

Gradle runs named tasks; for example, `build` compiles the code, runs checks,
and creates the application's build outputs under `app/build/`.
