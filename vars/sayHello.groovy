import src.World

def call(String name = 'human') {
    // Any valid steps can be called from this code, just like in other
    // Scripted Pipeline
     echo "${env.BRANCH_NAME}"
     echo "${env.BUILD_NUMBER}"
    echo "Hello, ${name}."
    World w= new World(this)
    w.hello()
}
