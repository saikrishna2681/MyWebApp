def call(def args) {
      
     // def mvnhome = tool (name: 'mvn', type: 'maven') + '/bin/mvn'
//	sh('${mvn} mvn args.goal')
	def mvn(args) {
    		script.sh "${script.tool 'mvn'}/bin/mvn -o ${args}"
  	}
      
 }
