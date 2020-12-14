addCommandAlias(
  "checkUpdates",
  "reload plugins; dependencyUpdates; reload return; dependencyUpdates"
)
addCommandAlias("cd", "project")
addCommandAlias("ls", "projects")
addCommandAlias("run", "main/run")
addCommandAlias("gen", "$name;format="norm"$/g8Scaffold")