 def call() {
       // Your SonarQube scan steps go here
       sh 'mvn sonar:sonar -Dsonar.projectKey=sonar-token -Dsonar.host.url=http://100.24.22.248:9000 -Dsonar.java.binaries=target/classes'
   }
