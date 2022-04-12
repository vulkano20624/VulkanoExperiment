// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id ("com.android.application") version "7.1.3" apply false
    id ("com.android.library") version "7.1.3" apply false
    id ("org.jetbrains.kotlin.android") version "1.6.20" apply false
}

ext {
    extra["compileSdkVersion"] = 32
    extra["minSdkVersion"] = 26
    extra["targetSdkVersion"] = 32

    extra["versions_compose"] = "1.1.0"
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}