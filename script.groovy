def git_clone(){
    git "https://github.com/Hamza-t/Devops"
}

def sonarqube_scan(){
    sh "mvn sonar:sonar -Dsonar.projectKey=devops-project -Dsonar.login=admin -Dsonar.password=admin"
}

def run_unit_tests(){
    sh "mvn clean"
    sh "mvn test"
}


return this
