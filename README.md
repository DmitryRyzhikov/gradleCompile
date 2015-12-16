Problem description:

1. We have additional configuration in gradle.build with name "additional".
2. We have commons-lang lib mapped to this configuration.
3. We have extended task "compileJava" in build.gradle that adds to classpath libs mapped to configuration additional.
 compileJava {
     classpath += configurations.additional
 }
4. If we will build project with "gradle build" or run Main.main() via "gradle runExample" we will not get any errors
5. But if we open Main class we will find error - IDEA can't resolve import and do not see "commons-lang" jar on CLASSPATH.


