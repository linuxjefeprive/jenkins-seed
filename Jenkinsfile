## This is the seed code, which lets Jenkins search for jobs in this repo, all .groovy files will be processed by JobDSL
pipeline {
    agent any 
    stages {
        stage('Pipeline to seed or update all pipelines') {
            steps {
                jobDsl  targets: ['*.groovy'].join('\n')
            }
        }
    }
}
