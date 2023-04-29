group = "mx.com.inftel.sat"
version = "2023.04.28"

plugins {
   `java-library`
   `maven-publish`
   signing
}

dependencies {
   api("jakarta.xml.bind:jakarta.xml.bind-api:4.0.0")
}

java {
   toolchain {
      languageVersion.set(JavaLanguageVersion.of(17))
   }
   withSourcesJar()
   withJavadocJar()
}

tasks.withType<JavaCompile>().configureEach {
   options.encoding = "UTF-8"
}

tasks.withType<Javadoc>().configureEach {
   options.encoding = "UTF-8"
}

tasks.jar.configure {
   archiveBaseName.set("sat-cfdi")
}

publishing {
   repositories {
      maven {
         setUrl(file("$projectDir/build/repo"))
         //setUrl("https://oss.sonatype.org/service/local/staging/deploy/maven2/")
      }
   }

   publications {
      create<MavenPublication>("cfdi") {
         from(components["java"])
         pom {
            name.set("SAT CFDI")
            description.set("Java classes and resources for SAT's CFDI. Clases Java y archivos para CFDI del SAT.")
            url.set("https://github.com/santoszv/sat-cfdi")
            inceptionYear.set("2022")
            licenses {
               license {
                  name.set("Public domain")
                  url.set("https://en.wikipedia.org/wiki/Public_domain")
               }
            }
            developers {
               developer {
                  id.set("santoszv")
                  name.set("Santos Zatarain Vera")
                  email.set("santoszv@inftel.com.mx")
                  url.set("https://www.inftel.com.mx")
               }
            }
            scm {
               connection.set("scm:git:https://github.com/santoszv/sat-cfdi")
               developerConnection.set("scm:git:https://github.com/santoszv/sat-cfdi")
               url.set("https://github.com/santoszv/sat-cfdi")
            }
         }
         signing.sign(this)
      }
   }
}

signing {
   useGpgCmd()
}