def call(def args) {
      def mvnHome = tool 'mvn'
      //def javaHome = tool 'JDK8'
      withEnv(["PATH+MAVEN=${mvnHome}/bin"]) {
          sh "${mvnHome}/bin/mvn ${args} package"
      }
 }
