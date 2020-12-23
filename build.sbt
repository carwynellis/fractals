name := "fractals"
version := "0.1"
scalaVersion := "2.13.4"

val parallelCollectionsVersion = "1.0.0"
val scalaTestVersion = "3.2.2"

libraryDependencies ++= Seq(
  "org.scala-lang.modules" %% "scala-parallel-collections" % parallelCollectionsVersion,
  "org.scalatest"          %% "scalatest"                  % scalaTestVersion % "test"
)
