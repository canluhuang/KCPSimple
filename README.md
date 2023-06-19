1. Publish `simple-gradle-plugin` and `simple-compiler-plugin` to local maven

   ```
   ./gradlew publishToMavenLocal
   ```

2. Open the following two comments

   ```
   # build.gradle.kt
   
   buildscript {
       
       dependencies {
       		...
           // open this comment
           //classpath("com.kmm.gradle:simple-gradle-plugin:1.0")
       }
   }
   ```

   ```
   # shared/build.gradle.kt
   
   plugins {
      	...
      	// open this comment
       //id("simple-gradle-plugin")
   }
   
   ```

3. Build the project and view the log

   ```shell
   ./gradlew clean :shared:bundleDebugAar
   ```

   

