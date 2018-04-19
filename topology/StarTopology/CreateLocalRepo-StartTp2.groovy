repokey = userInput (
    type : "STRING", // "BOOLEAN", "INTEGER", "INSTANCE", "REPOSITORY"
    description : "Repository Key",
    validations : (["cron"])
  )

artifactory('Artifactory-01'){
  localRepository(repokey) {
    description "Public Description"
    notes "Some internal notes"
    includesPattern "**/*" // default
    excludesPattern "" // default
    repoLayoutRef "nuget-default"
    packageType "nuget" 
    debianTrivialLayout false
    checksumPolicyType "client-checksums" // default | "server-generated-checksums"
    handleReleases true // default
    handleSnapshots true // default
    maxUniqueSnapshots  0 // default
    snapshotVersionBehavior "unique" // "non-unique" default | "deployer"
    blackedOut false // default
    archiveBrowsingEnabled true

  }
}
