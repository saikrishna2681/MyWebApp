def call(String name, String value, String project, String tag) {
    // Any valid steps can be called from this code, just like in other
    // Scripted Pipeline
    	echo "Project Name : ${project}"
	echo "TAG : ${tag}"
    	//sh "docker image build -t 2681/${project} ."
   	 //withCredentials([usernamePassword(credentialsId: 'docker', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
		// some block
     		//sh "docker login -u '$USER' -p '$PASS'"
		//echo "USER $USER "
	  	//  echo "USER ${PASS}"
    	//}
	sh "docker build . -t ${project} "
	sh "docker tag ${project} saikrishna2681-sai2681.jfrog.io/${project}:${tag} "
	withCredentials([usernamePassword(credentialsId: 'jfrog', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
    		sh "docker login -u '$USER' -p '$PASS' saikrishna2681-sai2681.jfrog.io"
	}
	sh "docker push saikrishna2681-sai2681.jfrog.io/${project}:${tag}"
    	echo "Hello, ${name}."
    	echo "Hi, ${value}."
}
