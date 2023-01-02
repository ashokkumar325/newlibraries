def newGit(repo)
{
  git "${repo}"
}

def newMaven()
{
  sh 'mvn package'
}

def newDeploy(jobname,ip,contextpath)
{
  sh "scp /home/ubuntu/.jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${contextpath}.war"
}
