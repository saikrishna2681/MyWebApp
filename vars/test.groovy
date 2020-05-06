def call(String name, String value, String project) {
    // Any valid steps can be called from this code, just like in other
    // Scripted Pipeline
    echo "Project Name : ${project}"
	sh "docker image build -t 2681/${project} ."
    echo "Hello, ${name}."
    echo "Hi, ${value}."
}
