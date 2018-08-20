# azuredemo

## REST API

- log: /log?message=logMessage
- read drom db: /read
- write to db: /write?firstname=xx&lastname=xx
- shut down: /shut-down
- oom exception: /stack-overflow

## AZURE DEPLOY

in root where is pom.xml type command

mvn azure-webapp:deploy

Attention! You must create technical account or application in azure via CLI

 az ad sp create-for-rbac --name "xxx" --password "xxx"
 
 and then add server to your settings.xml from CLI command response
 
         <server>
           <id>azure-auth</id>
            <configuration>
               <client>${appID}</client>
               <tenant>${tenant}</tenant>
               <key>password</key>
               <environment>AZURE</environment>
            </configuration>
         </server>
