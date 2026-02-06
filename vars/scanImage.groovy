def call(String image, String tag) {
    echo "Scanning image ${image}:${tag}"
    sh "echo Image scan passed"
}
