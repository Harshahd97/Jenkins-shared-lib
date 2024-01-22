def call() {
    stage('SonarQube Analysis') {
        script {
            // Configure SonarQube properties
            def sonarProperties = [
                '-Dsonar.projectKey=sonar-token',
                '-Dsonar.sources=.',
                // Add more SonarQube properties as needed
            ].join(' ')

            // Run SonarQube analysis
            sh "mvn sonar:sonar ${sonarProperties}"
        }
    }
}
