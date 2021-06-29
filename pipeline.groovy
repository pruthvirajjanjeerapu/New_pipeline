
pipeline{
    agent any

        stages{
            stage ('SCM checkout'){
                steps {
                    git url 'https://github.com/pruthvirajjanjeerapu/jenkins_1st.git'
                }

            }
            stage('depoloyment') {
                steps {
                    scp /var/lib/jenkins/workspace/Freestyle-1 pruthvi@172.31.20.102:/var/www/html
                }
            }
        }
}
    