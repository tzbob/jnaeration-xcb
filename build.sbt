name := "jnaeration-Xcb"

crossPaths := false

autoScalaLibrary := false

version := "0.1"

libraryDependencies += "net.java.dev.jna" % "jna" % "4.1.0"

javacOptions in (Compile,doc) ++= Seq("-Xdoclint:none")
