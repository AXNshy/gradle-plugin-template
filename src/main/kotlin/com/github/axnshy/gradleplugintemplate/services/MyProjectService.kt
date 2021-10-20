package com.github.axnshy.gradleplugintemplate.services

import com.intellij.openapi.project.Project
import com.github.axnshy.gradleplugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
