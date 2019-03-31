def call(String name = 'human') {
    // Any valid steps can be called from this code, just like in other
    // Scripted Pipeline
    script {
          bat 'mvn -version'
            }
    
    echo "Hello, ${name}."
}
