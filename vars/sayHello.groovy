def call(String name = 'human') {
    // Any valid steps can be called from this code, just like in other
    // Scripted Pipeline
     echo "${env.BRANCH_NAME}"
     echo "${env.BUILD_NUMBER}"
    echo "Hello, ${name}."
    World k= new World()
    k.hello()
}
