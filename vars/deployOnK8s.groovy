def call(String filePath) {
    echo "Deploying to Kubernetes"
    sh "kubectl apply -f ${filePath}"
}
