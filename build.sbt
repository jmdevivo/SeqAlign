name := "SeqAlign"

version := "0.1"

scalaVersion := "2.11.6"

libraryDependencies ++= Seq("org.apache.ignite" % "ignite-core" % "1.0.0",
  //"log4j" % "log4j" % "1.2.17",
  //"org.biojava" % "biojava3" % "3.0",
  "org.slf4j" % "slf4j-simple" % "1.7.12",
  "org.apache.ignite" % "ignite-spring" % "1.0.0",
  "org.apache.ignite" % "ignite-indexing" % "1.0.0",
  "org.apache.ignite" % "ignite-log4j" % "1.0.0",
  "org.apache.ignite" % "ignite-scalar" % "1.0.0")
    