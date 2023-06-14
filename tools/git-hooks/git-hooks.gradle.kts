tasks {
    register<Copy>("copyGitHooks") {
        description = "Copies the git pre-commit hooks from the /tools/git-hooks directory to the repo's .git/hooks directory."
        group = "git hooks"
        from("$rootDir/tools/git-hooks/") {
            include("**/*.sh")
            rename("(.*).sh", "$1")
        }
        into("$rootDir/.git/hooks")
    }

    register<Exec>("installGitHooks") {
        description = "Installs the git pre-commit hooks from the /tools/git-hooks directory"
        group = "git hooks"
        workingDir(rootDir)
        commandLine("chmod")
        args("-R", "+x", ".git/hooks/")
        dependsOn(named("copyGitHooks"))
        onlyIf { isLinuxOrMacOs() }
        doLast { logger.info("Git hooks installed successfully.") }
    }

    register<Delete>("deleteGitHooks") {
        description = "Delete the pre-commit git hooks."
        group = "git hooks"
        delete(fileTree(".git/hooks/"))
    }
}

fun isLinuxOrMacOs() = System.getProperty("os.name").toLowerCase() in listOf("linux", "mac os", "macos")
