package com.github.burnuts.bewareofsoftwarecracking.services

import com.intellij.openapi.project.Project
import com.github.burnuts.bewareofsoftwarecracking.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
