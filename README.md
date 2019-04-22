# fabric-language-groovy
A Fabric Language module for the Apache Groovy programming language.

### Usage:

Add it as a dependency:
```
dependencies {
	compile "net.fabricmc:fabric-language-groovy:1.0.1.+"
}
```
Set the language adapter for your mod to use by setting the languageAdapter property in the mod.json file:
```
{
  "languageAdapter": "net.fabricmc.language.groovy.GroovyLanguageAdapter"
}
```
Add a dependency entry to your mod.json file:
```
{
  "requires": {
    "fabric-language-groovy": "*"
  }
}
```

### Apache License v2.0:

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
