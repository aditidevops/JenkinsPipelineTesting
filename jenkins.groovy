job('DSL-Tutorial-1-Test') {
   scm {
       git('https://github.com/aditidevops/JenkinsPipelineTesting.git')
   }
   triggers {
       scm('H/15 * * * *')
   }
   steps {
       shell('echo Hello World!')
   }
}
