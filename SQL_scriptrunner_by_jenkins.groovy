node {
   echo 'SQLPlusRunner running user define script for shandba@client_access'
   step([$class: 'SQLPlusRunnerBuilder',credentialsId:'shandb-priv-id', instance:'client_access',scriptType:'userDefined', script: '',scriptContent: 'select * from v$version'])
   step([$class: 'SQLPlusRunnerBuilder',credentialsId:'shandb-priv-id', instance:'client_access',scriptType:'userDefined', script: '',scriptContent: 'select name from v$database'])
  }
