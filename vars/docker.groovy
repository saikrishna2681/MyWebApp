def call(String project, String hubUser) {
	sh "docker image build -t ${hubUser}/${project} ."
	withCredentials([usernamePassword(credentialsId: 'docker', passwordVariable: 'Sai@2681', usernameVariable: '2681')]) {
		// some block
		sh "docker login -u '$USER' -p '$PASS'"
	
	}
}
