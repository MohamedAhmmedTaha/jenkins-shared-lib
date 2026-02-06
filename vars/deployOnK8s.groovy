def deployOnK8s(String deploymentFile) {
    steps {
        withCredentials([string(credentialsId: 'API-SERVER', variable: 'API'),
                         string(credentialsId: 'Jenkins-Token', variable: 'TOKEN')]) {
            sh """
            kubectl --server=$API --token=$TOKEN apply -f $deploymentFile
            kubectl --server=$API --token=$TOKEN get pods
            """
        }
    }
}
