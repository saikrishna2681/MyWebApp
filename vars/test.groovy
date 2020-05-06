def call(String name, String value, String project) {
    // Any valid steps can be called from this code, just like in other
    // Scripted Pipeline
    echo "Project Name : ${project}"
    sh "docker image build -t 2681/${project} ."
    withCredentials([usernamePassword(credentialsId: 'docker', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
		// some block
     	sh "docker login -u '$USER' -p '$PASS'"
	echo "USER $USER "
	    echo "USER ${PASS}"
    }
    echo "Hello, ${name}."
    echo "Hi, ${value}."
}
