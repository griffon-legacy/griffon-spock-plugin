
Enables Spock for testing Griffon projects
------------------------------------------

Plugin page: [http://artifacts.griffon-framework.org/plugin/spock](http://artifacts.griffon-framework.org/plugin/spock)


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

