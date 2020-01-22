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
    String fx = "14-ea+2";
    {
        product("com.github.teletha", "altfx", "1.0");

        require("org.openjfx", "javafx-controls", fx);
        require("org.openjfx", "javafx-media", fx);
        require("org.openjfx", "javafx-web", fx);

        versionControlSystem("https://github.com/teletha/viewtify-cutomfx");
    }
}