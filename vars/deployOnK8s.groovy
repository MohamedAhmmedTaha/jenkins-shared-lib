def call(String filePath) {
    withCredentials([
        string(credentialsId: tokenCredID, variable: 'Jenkins-Token'),
        string(credentialsId: apiServerCredID, variable: 'API-SERVER')
    ])
    echo "Deploying to Kubernetes"
    sh "kubectl apply -f ${filePath}"
}
