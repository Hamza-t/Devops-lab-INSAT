def gv

pipeline {
    agent any
    stages {
        stage("initialize") {
            steps {
                script {
                    gv = load "script.groovy"
                }
            }
        }
        stage("cloning git") {
            steps {
                script { 
                    gv.git_clone()
                }
            }
        }
        
        stage("Sonarqube Scan") {
            steps {
                script {
                    gv.sonarqube_scan()
                }
            }
        }


    }
}