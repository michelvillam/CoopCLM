def call() {

    checkout([
            $class           : 'GitSCM',
            branches         : [[name: '*/master']],
            userRemoteConfigs: [[url: 'https://github.com/michelvillam/CoopCLM.git']]
    ])
}
