/*
 * Copyright 2010-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * @author Andres.Almiray
 */
class SpockGriffonPlugin {
    // the plugin version
    String version = '0.7'
    // the version or versions of Griffon the plugin is designed for
    String griffonVersion = '1.2.0 > *'
    // the other plugins this plugin depends on
    Map dependsOn = [:]
    // resources that are included in plugin packaging
    List pluginIncludes = []
    // the plugin license
    String license = 'Apache Software License 2.0'
    // Toolkit compatibility. No value means compatible with all
    // Valid values are: swing, javafx, swt, pivot, gtk
    List toolkits = []
    // Platform compatibility. No value means compatible with all
    // Valid values are:
    // linux, linux64, windows, windows64, macosx, macosx64, solaris
    List platforms = []
    // URL where documentation can be found
    String documentation = ''
    // URL where source can be found
    String source = 'https://github.com/griffon/griffon-spock-plugin'

    List authors = [
            [
                    name: 'Andres Almiray',
                    email: 'aalmiray@yahoo.com'
            ]
    ]
    String title = 'Enables Spock for testing Griffon projects'
    // accepts Markdown syntax. See http://daringfireball.net/projects/markdown/ for details
    String description = '''
[Spock][1] is a testing and specification framework for Java and Groovy applications. What makes it stand out
from the crowd is its beautiful and highly expressive specification language. This plugin brings the power of
Spock to Griffon. It is a direct port of the [Grails Spock plugin][2] originally made by Luke Daley.

Usage
-----

The [Spock][1] project has [excellent documentation][3] to get you started writing specifications.

### Running Tests

Tests are run just like normal Griffon tests via grails `test-app`. A new _spock_ test type is added to the unit,
integration and functional phases. You can use the Griffon 0.9 test type targeting feature to run only your Spock tests…

        griffon test-app :spock
	
Class names of Spock tests must end in either *Spec* or *Specification*; otherwise the Griffon test runner won't find them. 

Scripts
-------

 * **create-unit-spec** - creates a new Unit specification. Mimics GriffonUnitTestCase
 * **create-integration-spec** - creates a new Integration specification. Mimics a regular JUnit integration test

The [FEST plugin][4] provides an additional spec script.

[1]: http://spockframework.org
[2]: http://grails.org/plugin/spock
[3]: http://code.google.com/p/spock/wiki/SpockBasics
[4]: /plugin/fest
'''
}
