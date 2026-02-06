def call(String deploymentFile) {
    withCredentials([
        string(credentialsId: 'API-SERVER', variable: 'API'),
        string(credentialsId: 'Jenkins-Token', variable: 'TOKEN')
    ]) {
        sh script: """
            kubectl --server="\${API}" --token="\${TOKEN}" --insecure-skip-tls-verify apply -f "${deploymentFile}" -n ivolve
            kubectl --server="\${API}" --token="\${TOKEN}" --insecure-skip-tls-verify get pods -n ivolve
        """, returnStdout: false
    }
}