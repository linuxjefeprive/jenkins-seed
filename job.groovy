def githubUrl = "https://github.com/linuxjefeprive/Hello-World-Code.git"

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
