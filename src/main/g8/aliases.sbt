addCommandAlias(
  "checkUpdates",
  "reload plugins; dependencyUpdates; reload return; dependencyUpdates"
)
addCommandAlias("cd", "project")
addCommandAlias("ls", "projects")
addCommandAlias("ll", "projects")
addCommandAlias("run", "$name;format="norm"$/run")
addCommandAlias("gen", "$name;format="norm"$/g8Scaffold")