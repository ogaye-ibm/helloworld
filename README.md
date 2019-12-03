# hello-world
SpringBoot CF and IBM cloud

#Build:
`./gradlew clean build`

#Deploy
Connect to your CF platform first then run
 * IBM Cloud:
`cf push -f manifest-ibm-cloud.yml`

* PWS PCF:
`cf push -f manifest-pws.yml`
