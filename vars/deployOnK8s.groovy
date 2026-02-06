// vars/deployOnK8s.groovy
def call(String deploymentFile) {

    withCredentials([
        string(credentialsId: 'API-SERVER', variable: 'API'),
        string(credentialsId: 'Jenkins-Token', variable: 'TOKEN')
    ]) {
        sh '''
            kubectl --server="${API}" --token="${TOKEN}" --insecure-skip-tls-verify apply -f "${deploymentFile}"
            kubectl --server="${API}" --token="${TOKEN}" --insecure-skip-tls-verify get pods
        '''
    }
}