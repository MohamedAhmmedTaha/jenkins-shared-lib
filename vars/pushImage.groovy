def call(String image, String tag) {
    echo "Pushing image"
    sh "docker push ${image}:${tag}"
}
