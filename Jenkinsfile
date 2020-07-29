podTemplate(containers: [containerTemplate(name: 'maven', image: 'maven:3.6.3-jdk-8', command: 'sleep', args: 'infinity')]) {
    node(POD_LABEL) {
        checkout scm
        container('maven') {
            sh 'mvn -B -ntp -Dmaven.test.failure.ignore verify'
        }
        recordIssues(tools: [javaDoc()])
        junit '**/target/surefire-reports/TEST-*.xml'
    }
}