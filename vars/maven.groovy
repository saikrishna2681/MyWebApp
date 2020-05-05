def call(def args) {
      def mvnHome = tool 'mvn'
      //def javaHome = tool 'JDK8'
      
          sh "${mvnHome}/bin/mvn mvn package"
      
 }
