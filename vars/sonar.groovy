#!/usr/bin/env groovy

   def runSonarQubeScan() {
       // Your SonarQube scan steps go here
       sh 'mvn sonar:sonar -Dsonar.projectKey=sonartoken -Dsonar.host.url=http://3.84.2.147:9000'
   }

   return this
