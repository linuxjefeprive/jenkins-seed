// This is where we put the job we want auto-insterted into Jenkins, We can build as much groovy jobs as we want to insert any job automatically. In this case it's just Hello World.
def githubUrl = "https://github.com/linuxjefeprive/Hello-World-Code.git"

pipelineJob("DevOps WAR File Project") {
definition {
    cpsScm {
        scm {
            git{
              remote {
                url("${githubUrl}")
              }
              branch("*/master")
            }
        }
    }
  }
}
