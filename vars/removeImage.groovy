def call(String image, String tag) {
    echo "Removing local image"
    sh "docker rmi ${image}:${tag} || true"
}
