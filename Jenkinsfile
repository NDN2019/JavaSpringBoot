pipeline{
     agent any
    stages{
        stage('build'){
			
			steps{
				bat 'mvn -B -DskipTests clean package'
			}
        }
    }
	stages('test'){
		steps{
			bat 'mvn test'
		}
	}

}