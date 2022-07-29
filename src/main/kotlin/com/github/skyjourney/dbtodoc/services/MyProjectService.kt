package com.github.skyjourney.dbtodoc.services

import com.intellij.openapi.project.Project
import com.github.skyjourney.dbtodoc.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
