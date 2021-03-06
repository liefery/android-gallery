import sbt._

object Dependencies {
    val easyImage = ( "com.github.jkwiecien" % "EasyImage" % "2.1.0" )
        .exclude( "com.android.support", "appcompat-v7" )

    val flexbox = ( "com.google.android" % "flexbox" % "1.0.0" )
        .exclude( "com.android.support", "recyclerview-v7" )
        .exclude( "com.android.support", "support-compat" )

    val glide = ( "com.github.bumptech.glide" % "glide" % "4.7.1" )
        .exclude( "com.android.support", "support-annotations" )

    val photoView = ( "com.github.chrisbanes" % "PhotoView" % "2.1.4" )
        .exclude( "com.android.support", "support-core-utils" )

    val supportAppcompat = "com.android.support" % "appcompat-v7" % "27.1.1"
}