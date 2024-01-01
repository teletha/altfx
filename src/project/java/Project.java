/*
 * Copyright (C) 2024 The ALTFX Development Team
 *
 * Licensed under the MIT License (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *          https://opensource.org/licenses/MIT
 */
public class Project extends bee.api.Project {
    {
        product("com.github.teletha", "altfx", ref("version.txt"));

        String version = "LATEST";
        require("org.openjfx", "javafx-base", version);
        require("org.openjfx", "javafx-graphics", version);
        require("org.openjfx", "javafx-controls", version);
        require("org.openjfx", "javafx-media", version);
        require("org.openjfx", "javafx-web", version);
        require("org.testfx", "openjfx-monocle", "jdk-12.0.1+2");

        versionControlSystem("https://github.com/teletha/viewtify-cutomfx");
    }
}