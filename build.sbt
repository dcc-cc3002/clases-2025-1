ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.5"

lazy val root = (project in file("."))
  .settings(
    name := "clases-2025-1"
  )

libraryDependencies += "org.scalameta" %% "munit" % "1.1.0" % Test
// Solo para ilustrar JUnit, no es necesario para munit
libraryDependencies += "org.junit.jupiter" % "junit-jupiter-api" % "5.12.1" % Test
