podTemplate(containers: [containerTemplate(name: 'maven', image: 'maven:3.6.3-jdk-8', command: 'sleep', args: 'infinity')]) {
    node(POD_LABEL) {
        stage('prep') {
            checkout scm
        }
        stage('build') {
            container('maven') {
                tee('log.txt') {
                    sh 'mvn -B -ntp -Dmaven.test.failure.ignore verify'
                }
            }
        }
        stage('publish') {
            recordIssues(tools: [javaDoc(pattern: 'log.txt')])
            junit '**/target/surefire-reports/TEST-*.xml'
        }
    }
}
