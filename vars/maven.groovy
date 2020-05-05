def call(def args) {
      
      def mvnhome = tool (name: 'mvn', type: 'maven') + '/bin/mvn'
	sh('${mvn} mvn args.goal')
      
 }
