pipeline{
     agent any
    stages{
        stage('build'){
			
			steps{
				bat 'mvn -B -DskipTests clean package'
			}
        }
    }
	stage('test')
	{
		steps{
			bat 'mvn test'
		
		}
	}

}