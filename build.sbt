lazy val gallery = project.in( file( "." ) )
    .enablePlugins( AndroidLib )
    .settings( Settings.common )
    .settings(
        libraryDependencies ++=
            "com.android.support" % "appcompat-v7" % "25.0.1" ::
            "com.github.chrisbanes" % "PhotoView" % "1.3.1" ::
            "com.github.google" % "flexbox-layout" % "0.2.3" ::
            "com.github.jkwiecien" % "EasyImage" % "1.3.1" ::
            "com.github.square.picasso" % "picasso" % "059993e3cc" ::
            Nil,
        name := "gallery",
        publishArtifact in ( Compile, packageDoc ) := false
    )

lazy val sample = project
    .enablePlugins( AndroidApp )
    .settings( Settings.common )
    .settings(
        organization := organization.value + ".gallery.sample",
        run := ( run in Android ).evaluated
    )
    .dependsOn( gallery )