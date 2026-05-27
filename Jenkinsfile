pipeline{
agent any

tools{

   maven "maven1"
}


    parameters {
        gitParameter name: 'BRANCH',
                type: 'PT_BRANCH_TAG',
                branchFilter: 'origin/(feature|sprint-release|master|develop|hotfix|bugfix|dev|snyk-upgrade)(.*)',
                defaultValue: 'develop',
                selectedValue: 'DEFAULT',
                sortMode: 'DESCENDING_SMART',
                description: 'Select your branch or tag.',
                quickFilterEnabled: true,
                listSize: '15'

        choice(name: 'ENVIRONMENT', choices: [
                'test',
                'dev',
                'dev2'
        ], description: '')

    }
stages{
    stage("clone from Github")
    {
        steps{
git credentialsId: 'gitcred', url: 'https://github.com/srinivasulu762/onlinebookstore.git'       

    			checkout([$class: 'GitSCM', branches: [[name: "${BRANCH}"]], extensions: [], depth: 1, userRemoteConfigs: [[credentialsId: 'gitcred', url: 'https://github.com/srinivasulu762/onlinebookstore.git']]])

}
    }

}

}