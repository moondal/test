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
[출처] CloudBees Flow 릴리즈/파이프라인 (2) - Jenkins 파이프라인 예제 2:GitHub 연동|작성자 한컴MDS

