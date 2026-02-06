def call(String image, String tag) {
    echo "Building Docker image"
    sh "docker build -t ${image}:${tag} ."
}
