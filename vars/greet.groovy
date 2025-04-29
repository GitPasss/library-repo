def greet(Map config = [:]) {
 sh "echo Hello, ${config.name}!"
}
