pipeline{
	agent any
	stages{
		stage('build'){
			steps{
				echo 'build 테스트'
			}
		}
	}
}
