// vars/deployOnK8s.groovy
def call(String deploymentFile) {     // ← use 'call' as the method name

    withCredentials([
        string(credentialsId: 'API-SERVER', variable: 'API'),
        string(credentialsId: 'Jenkins-Token', variable: 'TOKEN')
    ]) {
        sh """
        kubectl --server=\\${API} --token=\\${TOKEN} apply -f ${deploymentFile}
        kubectl --server=\\${API} --token=\\${TOKEN} get pods
        """
    }
}
