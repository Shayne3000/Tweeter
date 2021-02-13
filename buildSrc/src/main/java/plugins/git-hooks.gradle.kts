package plugins

tasks {
    register<Copy>("copyGitHooks") {
        description = "Copies the git hooks from the /git-hooks folder to the .git/hooks folder."
        group = AndroidBuildPlugin.gradleTaskGroup
        from("$rootDir/git-hooks/") {
            include("**/*.sh")
            rename("(.*).sh", "$1")
        }
        into("$rootDir/.git/hooks")
    }

    register<Exec>("installGitHooks") {
        description = "Installs the pre-commit git hooks from the /git-hooks"
        group = AndroidBuildPlugin.gradleTaskGroup
        workingDir(rootDir)
        commandLine("cmd", "755", ".git/hooks/")
        dependsOn(named("copyGitHooks"))

        doLast {
            logger.info("Git hooks installed successfully.")
        }
    }

    register<Delete>("deleteGitHooks") {
        description = "Delete the git pre-commit hooks"
        group = AndroidBuildPlugin.gradleTaskGroup
        delete(fileTree(".git/hooks"))
    }

    afterEvaluate {
        tasks["clean"].dependsOn(tasks.named("installGitHooks"))
    }
}
