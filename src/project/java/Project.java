/*
 * Copyright (C) 2019 apocryphal-viewtify Development Team
 *
 * Licensed under the MIT License (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *          https://opensource.org/licenses/MIT
 */
public class Project extends bee.api.Project {
    {
        product("com.github.teletha", "altfx", "1.0");

        require("org.openjfx", "javafx-controls");
        require("org.openjfx", "javafx-media");
        require("org.openjfx", "javafx-web");

        versionControlSystem("https://github.com/teletha/viewtify-cutomfx");
    }
}