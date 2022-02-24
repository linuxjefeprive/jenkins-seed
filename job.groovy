def githubUrl = "https://github.com/linuxjefeprive/devops2.git"

pipelineJob("DevOps WAR File Project") {
definition {
    cpsScm {
        scm {
            git{
              remote {
                url("${githubUrl}")
              }
              branch("*/main")
            }
        }
    }
  }
}
