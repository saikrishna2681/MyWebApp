def call(String project) {
	sh "docker image build -t 2681/${project} ."
	withCredentials([usernamePassword(credentialsId: 'docker', passwordVariable: 'Sai@2681', usernameVariable: '2681')]) {
		// some block
		sh "docker login -u '$USER' -p '$PASS'"
	
	}
}
