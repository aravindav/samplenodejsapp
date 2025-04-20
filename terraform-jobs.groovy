pipelineJob('Terraform-Apply-Job') {
    description('Runs Terraform commands on infrastructure repo')

    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/aravindav/samplenodejsapp.git')
                    }
                    branches('main')
                }
            }
            scriptPath('Jenkinsfile')  // the actual pipeline for terraform
        }
    }
}
