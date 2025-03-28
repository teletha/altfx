/*
 * Copyright (C) 2025 The ALTFX Development Team
 *
 * Licensed under the MIT License (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *          https://opensource.org/licenses/MIT
 */

import javax.lang.model.SourceVersion;

public class Project extends bee.api.Project {
    {
        product("com.github.teletha", "altfx", ref("version.txt"));

        require("org.openjfx", "javafx-base");
        require("org.openjfx", "javafx-graphics");
        require("org.openjfx", "javafx-controls");
        require("org.openjfx", "javafx-media");
        require("org.openjfx", "javafx-web");
        require("org.testfx", "openjfx-monocle", "jdk-12.0.1+2");

        versionControlSystem("https://github.com/teletha/altfx");
    }
}